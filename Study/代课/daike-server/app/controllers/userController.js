const userModel = require('../models/user.js');
const pwModel = require('../models/password.js')
const dealPassword = require('../../utils/dealPassword.js')
const { v4: uuidv4 } = require('uuid')
const config = require('../../config')


module.exports = {
    get: async (ctx, next) => {
        ctx.status = 200;
        ctx.body = {
            msg: 'get request',
            data: ctx.request.query
        }
    },
    post: async (ctx, next) => {
        ctx.status = 200;
        ctx.body = {
            msg: 'post request',
            data: ctx.request.body
        }
    },
    login: async (ctx, next) => {
        let req = ctx.request.body
        console.log(req);
        // 查找用户
        const user = await userModel.findOne({
                account: req.account
            },
            {
                __v: 0,
                _id: 0
            })
        if (!user) {
            ctx.status = 200
            ctx.body = {
                code: 0,
                msg: '用户名或者密码错误！'
            }
            return
        }
        console.log(user);
        const userId = user.userId
        const pass = await pwModel.findOne({
                userId
            },
            {
                hash: 1
            })
            console.log(pass);
        const match = await dealPassword.validate(req.password, pass.hash)
        ctx.status = 200
        if (match) {
            ctx.body = {
                code: 1,
                msg: 'login sucess!',
                data: user
            }
            return
        }
        ctx.body = {
            code: 0,
            msg: 'login fail'
        }
    },
    register: async (ctx, next) => {
        let req = ctx.request.body
        const user = await userModel.findOne(
            {
                account: req.account
            },
            {
                __v: 0,
                _id: 0
            }
        )
        if(user) {
            ctx.status = 200;
            ctx.body = {
                code: 0,
                msg: '用户名重复！'
            }
            return
        }
        const userId = uuidv4()
        const newUser = await userModel.create({
            userId,
            account: req.account
        })
        if(newUser) {
            const hash = await dealPassword.encrypt(req.password, config.saltTimes)
            const result = await pwModel.create({
                userId,
                hash
            })
            if(result) {
                // console.log(newUser);
                // console.log(result);
                ctx.body = {
                    code: 1,
                    msg: '注册成功！',
                    data: {
                        userId: newUser.userId,
                        account: newUser.account
                    }
                }
            }else{
                ctx.body = {
                    code: 0,
                    msg: '注册失败！'
                }
            }
        }
    },
    updateUserInfo: async (ctx, next) => {
        let req = ctx.request.body
        let result = await userModel.updateOne(
            {
                userId: req.userId
            }, req
        )
        console.log(result);
        ctx.body = 200
        if(result.nModified == 1) {
            ctx.body = {
                code: 1,
                msg: 'save successful'
            }
        }else{
            ctx.body = {
                code: 0,
                msg: 'save failed!'
            }
        }
    }
}