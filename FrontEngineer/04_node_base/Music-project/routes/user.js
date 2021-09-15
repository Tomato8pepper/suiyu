//引入路由中间件
const Router = require('koa-router')
let userRouter = new Router()

let userController = require('../controllers/user.js')

userRouter
.get('/user/register',  userController.showRegister)
.get('/user/login', async ctx =>{
    ctx.render('login')
})

module.exports = userRouter
// 引入路由中间件 结束