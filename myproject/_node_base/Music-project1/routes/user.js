//引入路由中间件
const Router = require('koa-router')
let userRouter = new Router()

let userController = require('../controllers/user')

userRouter
.get('/user/register',  userController.showRegister)
.post('/user/check-username', userController.checkUsername)
.post('/user/do-register',userController.doRegister)
.post('/user/do-login', userController.doLogin)
.get('/user/get-pic', userController.getPic)
.get('/user/logout', userController.logout)
.get('/user/login', async ctx =>{
    // 获取谁在访问我
    // let { req } = ctx
    // req.connection.remoteAddress || // 判断 connection 的远程 IP
    // req.socket.remoteAddress || // 判断后端的 socket 的 IP
    // req.connection.socket.remoteAddress;

    ctx.render('login', {
        host: '127.0.0.1:3000'
    })
})

module.exports = userRouter
// 引入路由中间件 结束
