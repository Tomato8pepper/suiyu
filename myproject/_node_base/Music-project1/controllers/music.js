const musicModel = require('../models/music')
const path = require('path')
// const music = require('../models/music')


// 无id函数
function optUpload(ctx) {
    // 接收请求数据
    // console.log(ctx.request.files)
    // console.log('============================>')
    // console.log(ctx.request.body)
    // 1.获取字符串数据.
    let { title, singer, time } = ctx.request.body
    // 2.获取文件 ->  保存文件的网络路径 （方便/public请求返回）
    let { file, filelrc } = ctx.request.files
    console.log(filelrc)
    // 保存文件的绝对路径也可以，但是麻烦
    let saveSingObj = { title, singer, time }

    //为了微信小程序，也能调用这个接口
    saveSingObj.filelrc = 'no upload filelrc'

    // 2.5： 歌词可选
    if (filelrc) {
        //文件路径   文件名+后缀
        saveSingObj.filelrc = '/public/files/' + path.parse(filelrc.path).base
    }

    if (!file) {
        ctx.throw('歌曲必须上传！')
        return;
    }
    // 2.7处理歌曲路径
    saveSingObj.file = '/public/files/' + path.parse(file.path).base

    //加入用户id  未来用session
    saveSingObj.uid = ctx.session.user.id
    return saveSingObj
}

module.exports = {
    // 添加音乐
    async addMusic(ctx, next) {
        let saveSingObj = optUpload(ctx)

        // 3.插入数据到数据库
        let result = musicModel.addMusicByObj(saveSingObj)
        // 4.响应结果给用户
        ctx.body = {
            // ajax接受到的状态消息
            code: '001',
            msg: result.message
        }
    },
    async updateMusic(ctx, next) {
        let saveSingObj = optUpload(ctx)

        let { id } = ctx.request.body   

        Object.assign(saveSingObj, {id})
        // 更新数据
        let result = await musicModel.updateMusic(saveSingObj)
        console.log(result)
        if(result.affectedRows !== 1){
            // 没有成功 throw是针对页面的操作， ajax请求， code：002
            // ctx.throw('更新失败')
            ctx.body = {
                code: '002',
                msg: '更新失败'
            }
            return
        }
        ctx.body = {
            code: '001', 
            msg: '更新成功！！'
        }


        // update music set title=?, singer=?....where id =?
    },
    async deleteMusic(ctx, next) {
        // 接收请求URL中的查询字符串
        let { id } = ctx.request.body  
        console.log(id);
        // 删除音乐
        let result =await musicModel.deleteMusicById(id)
        console.log(result)
        // 后续行为
        if(result.affectedRows === 0){
            ctx.throw('删除失败'+ result.message)
            return
        }
        ctx.body = {
            code: '001',
            msg: '删除成功！！！'
        }
    },
    async showEdit(ctx, next){
        // 通过路由查询字符串参数
        let id = ctx.query.id
        // 通过id查询音乐
        let musics = await musicModel.findMusicById(id)
        // 判断是否有该歌曲
        if(musics.length ===0){
            // 甩异常错误页面
            ctx.throw('歌曲不存在！！！')
            return
        }
        let music = musics[0]
        // 渲染edit页面
        ctx.render('edit', {  music: music })
    },
    async showIndex(ctx, next) {
        // 根据用户的session中的id来查询数据======未完成
        let uid = ctx.session.user.id
        // 根据id查询歌曲
        let musics = await musicModel.findMusicByUid(uid)
        // console.log(musics)
        // 展示给用户
        ctx.render('index', { musics })
    },
    async showDel(ctx, next) {
        // 通过路由查询字符串参数
        let id = ctx.query.id
        // 通过id查询音乐
        let musics = await musicModel.findMusicById(id)
        // 判断是否有该歌曲
        if(musics.length ===0){
            // 甩异常错误页面
            ctx.throw('歌曲不存在！！！')
            return
        }
        let music = musics[0]
        // 渲染delete页面
        ctx.render('delete', {  music: music })
    }
}