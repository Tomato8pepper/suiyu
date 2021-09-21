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
.get('/api/getimageInfo/:imgid1', goodsController.getimageInfo)
.post('/api/postcomment/:cid', goodsController.postcomment)
.get('/api/getgoods', goodsController.getgoods)
.get('/api/goods/getinfo/:imgid', goodsController.getinfo)
.get('/api/goods/getshopcarlist/:str', goodsController.getshopcarlist)

module.exports = goodsRouter