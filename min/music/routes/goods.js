const Router = require('koa-router')
const goodsController = require('../controllers/goods')

let goodsRouter = new Router()

goodsRouter
.get('/api/getlunbo', goodsController.getlunbo)
.get('/api/getnewslist', goodsController.getnewslist)
.get('/api/getnew/:newid', goodsController.getnew)
.get('/api/getimages/:cateid', goodsController.getimages)
.get('/api/getimgcategory', goodsController.getimgcategory)
.get('/api/getthumimages/:imgid', goodsController.getthumimages)
.get('/api/getimageInfo/:imgid', goodsController.getimageInfo)
.get('/api/getgoods/:pageindex', goodsController.getgoods)
module.exports = goodsRouter