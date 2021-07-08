const User_col = require('../models/user')
const Password_col = require('../models/password')
const password = require('../utils/password')
module.exports = {
    get: async (ctx, next) =>{
        ctx.status = 200;
        ctx.body = {
            msg: 'get request',
            data: {
                msg: 'hello world'
            },
        }
    },
    // 登录
    login: async (ctx, next) => {
        const req = ctx.request.body

        // 首先获取用户userID
        const user = await User_col.findOne({
            account: req.account
        },
        {
            __v: 0,
            _id: 0
        })
        if(!user) {
            ctx.status = 200;
            ctx.body = {
                code: 0,
                msg: '账号不存在！'
            }
            return
        }
        const userId = user.userId
        // 获取数据库中的hash
        const pass = await Password_col.findOne({
            userId
        },
        {
            hash: 1
        })
        // bcrypt用作密码加密解密
        const match = await password.validate(req.password, pass.hash)  //返回Boolean值
        ctx.status = 200;
        if(match) {
            ctx.body = {
                code: 1,
                msg: '登陆成功！',
                data: user
            }
            return
        }
        ctx.body = {
            code: 0,
            msg: '密码错误！'
        }
    }
}