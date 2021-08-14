const goodsModel = require('../models/goods')

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
        let newid = ctx.params.newid
        let message = goodsModel.getimages()
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
        let message = goodsModel.getthumimages()
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
        let message = goodsModel.getimageInfo()
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
    async getgoods (ctx, next) {
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
    }
}