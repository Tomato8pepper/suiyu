const Router = require('koa-router')
let userRouter = new Router()
const userController = require('../app/controllers/userController.js')


userRouter
.get('/get', userController.get)
.post('/post', userController.post)
.post('/login', userController.login)
.post('/register', userController.register)
.post('/update/user', userController.updateUserInfo)
module.exports = userRouter