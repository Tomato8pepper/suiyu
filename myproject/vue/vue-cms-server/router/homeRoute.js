const Router = require('koa-router')
const homeRoute = new Router()
const homeControll = require('../controllers/homeController.js')


homeRoute.get('/getlunbo', homeControll.getLunbo)