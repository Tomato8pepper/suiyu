const Router = require('koa-router')
const exampleRouter = new Router()
const exampleController = require('../app/controllers/exampleController')

exampleRouter
.get('/example/get', exampleController.getExample)
.post('/example/post', exampleController.postExample)

module.exports = exampleRouter