const Router = require('koa-router')
const schoolRouter = new Router()
const schoolController = require('../app/controllers/schoolController.js')

schoolRouter
.post('/school', schoolController.searchSchoolByName)

module.exports = schoolRouter