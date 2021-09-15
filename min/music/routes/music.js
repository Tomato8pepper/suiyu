const Router = require('koa-router')
const musicController = require('../controllers/music')

let musicRouter = new Router()

musicRouter
//添加的请求行为在restful中，更好的请求规则要求添加 => post
.post('/music/add-music', musicController.addMusic)
.put('/music/update-music', musicController.updateMusic)
.delete('/music/del-music', musicController.deleteMusic)
.get('/music/index', musicController.showIndex)
// .get('/music/index', async ctx =>{
//     ctx.render('index')
// })
.get('/music/add', async ctx =>{
    ctx.render('add')
})
.get('/music/edit-music', musicController.showEdit)
.get('/music/musicDel', musicController.showDel)

module.exports = musicRouter


