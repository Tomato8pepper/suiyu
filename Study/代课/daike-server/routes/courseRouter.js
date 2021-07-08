const Router = require('koa-router')
const courseRouter = new Router()
const courseController = require('../app/controllers/courseController.js')

courseRouter
.post('/course', courseController.getCourse)
.post('/publish', courseController.publishCourse)
.post('/substitute', courseController.substitute)
.post('/collect', courseController.collectCourse)
.post('/course/type', courseController.getCourseByType)


module.exports = courseRouter