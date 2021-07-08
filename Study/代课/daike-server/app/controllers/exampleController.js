const exampleModel = require('../models/example.js')
module.exports = {
    getExample: async (ctx, next) => {
        const req = ctx.request.query;

        const examples = await exampleModel.find({}, { _id: 0 });

        ctx.status = 200;
        ctx.body = {
            msg: 'get request!!',
            data: {
                data: req,
                examples,
            }
        }
    },
    postExample: async (ctx, next) => {
        const req = ctx.request.body;

        ctx.status = 200;
        if (!req.msg || typeof req.msg != 'string') {
            ctx.status = 401;
            ctx.body = {
                msg: 'post request!!',
                desc: `parameter error！！msg: ${req.msg}`,
                data: req
            }
            return;
        }

        const result = await exampleModel.create({ msg: req.msg });

        ctx.body = {
            msg: 'post request!!',
            desc: 'insert success!',
            data: result
        }
    }
}