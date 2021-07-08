// 项目的初始化

// 安装依赖  创建入口文件

//#### koa

//页面渲染  

//路由导入

// 静态资源的引入
// 重写url

// 中间件的使用 app.use()



//路由的封装
// html页面的封装

// 数据模型models sql连接池的封装

// mvc   router =>  c(controller) => v(ctx.render)  => (model)

// 导入模块bodyParser 处理请求体数据  ctx.request.body调用

// post  => checkUserName



// 连接池导出config.js


// 注册 post => doRegister


// 抛出异常，app处理异常


// 登录 post => doLogin


// music  add


















// 添加音乐的逻辑     音乐表：title, singer, time, filelrc, file
// 1.导入koa-formidable中间件   app.use({ 1.设置上传目录。 2.设置显示后缀名})
const formidable = require('koa-formidable')
const db = require('./Self_taught/AvaScript/_node/Music-project1/models/db')
const bodyParser = require('body-parser')
app.use(formidable({
    uploadDir: path.resolve('/public/files'),
    keepExtensions: true
}))

    // 2.路由设置引入controllers    设置路由
    .post('/music/add-music', controllers.addMusic)

// 3.controllers引入models     做与客户端之间的交互  addMusic(ctx, next){}
// 接收请求数据
ctx.request.body   //接受字符串类型
ctx.request.files  //接收客户端传过来的文件类型


// 1.获取字符串数据.
let { title, singer, time } = ctx.request.body


// 2.获取文件 ->  保存文件的网络路径 （方便/public请求返回）
let { file, filelrc } = ctx.request.files
let saveSingObj = { title, singer, time }


// 2.5： 歌词可选
saveSingObj.filelrc = 'no filelrc'
if (!filelrc) {
    saveSingObj.filelrc = '/public/files' + path.parse(filelrc.path).base
}
// 2.7处理歌曲路径  歌曲非空
if (!file) {
    ctx.throw('歌曲不能为空！！！')
    return
}
saveSingObj.file = '/public/files' + path.parse(file.path).base
saveSingObj.uid = 1
// 3.插入数据到数据库
let result = modelMusic.addMusicObj(saveSingObj)



// 4.响应结果给用户
ctx.body = {
    code: '001',
    msg: result.message
}





// 4.controllers做与数据库的交互
//xxx: () => db.q('xxx')
module.exports = {
    addMusicObj: async (saveSingObj) => {
        let result = await db.q('insert into music (title, singer, time, filelrc, file, uid) values (?, ?, ?, ?, ?, ?)', saveSingObj)
        return result
    }
}