const goodsModel = require('../models/goods')
const fs = require('fs')

module.exports = {
    async getlunbo (ctx, next) {
        let message = goodsModel.getlunbo()
        // console.log(message)
        if (message) {
            ctx.body = {
                code: '200',
                message: message

            }
        } else {
            ctx.body = {
                code: '500',
                message: '请求出问题了'
            }
        }
        
    }, 
    async getnewslist (ctx, next) {
        let message = goodsModel.getnewslist()
        if (message) {
            ctx.body = {
                code: '200',
                message: message

            }
        } else {
            ctx.body = {
                code: '500',
                message: '请求出问题了'
            }
        }
    },
    async getnew (ctx, next) {
        // console.log(ctx.params)
        let newid = ctx.params.newid
        // console.log(newid);
        let message = goodsModel.getnew(newid)
        // console.log(message);
        if (message) {
            ctx.body = {
                code: '200',
                message: message

            }
        } else {
            ctx.body = {
                code: '500',
                message: '请求出问题了'
            }
        }
    },
    async getimages (ctx, next) {
        let cateid = ctx.params.cateid
        console.log(cateid);
        let message = goodsModel.getimages(cateid)
        if (message) {
            ctx.body = {
                code: '200',
                message: message

            }
        } else {
            ctx.body = {
                code: '500',
                message: '请求出问题了'
            }
        }
    },
    async getimgcategory (ctx, next) {
        let message = goodsModel.getimgcategory()
        if (message) {
            ctx.body = {
                code: '200',
                message: message

            }
        } else {
            ctx.body = {
                code: '500',
                message: '请求出问题了'
            }
        }
    },
    async getthumimages (ctx, next) {
        let imgid = ctx.params.imgid
        // console.log(imgid);
        let message = goodsModel.getthumimages(imgid)
        if (message) {
            ctx.body = {
                code: '200',
                message: message

            }
        } else {
            ctx.body = {
                code: '500',
                message: '请求出问题了'
            }
        }
    },
    async getimageInfo (ctx,next) {
        let imgid1 = ctx.params.imgid1
        console.log('======imgid1',imgid1);
        let message = goodsModel.getimageInfo(imgid)
        if (message) {
            ctx.body = {
                code: '200',
                message: message

            }
        } else {
            ctx.body = {
                code: '500',
                message: '请求出问题了'
            }
        }
    },
    async postcomment (ctx, next) {
        let cid = ctx.params.cid
        console.log('====cid',  cid);
        let { content } = ctx.request.body
        console.log(ctx.request.body.content);
        // fs.writeFileSync('./comment.txt', content)
    },
    async getgoods (ctx, next) {
        let pageindex = ctx.query.pageindex
        console.log('pageindex', pageindex);
        let message = goodsModel.getgoods()
        if (message) {
            ctx.body = {
                code: '200',
                message: message

            }
        } else {
            ctx.body = {
                code: '500',
                message: '请求出问题了'
            }
        }
    },
    async getinfo (ctx, next) {
        let imgid = ctx.params.imgid
        let message = goodsModel.getinfo(imgid)
        console.log('======imgid', imgid);
        if (message) {
            ctx.body = {
                code: '200',
                message: message

            }
        } else {
            ctx.body = {
                code: '500',
                message: '请求出问题了'
            }
        }
    },
    async getshopcarlist (ctx, next) {
        let str = ctx.params.str
        // console.log('====str', str);
        let idArr = str.split(',')
        console.log(idArr);
        let message = goodsModel.getshopcarlist(idArr)
        if (message) {
            ctx.body = {
                code: '200',
                message: message

            }
        } else {
            ctx.body = {
                code: '500',
                message: '请求出问题了'
            }
        }
    },
}