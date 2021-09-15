const Koa = require("koa")
const app = new Koa()

const handle = async (ctx, next) =>{
    // 捕捉错误，如果出错，我们直接输出一个错误页面,
    // 用 p标签 装 内容 something error， you should concat administer
    try{
        await next()
    }catch(err){
        ctx.response.status = err.statusCode | err.status | 500
        ctx.response.type = 'html'
        ctx.response.body = '<p>something error， you should concat administer</p>'
        ctx.app.emit('error',err, ctx)
    }
}

const main = ctx =>{
    ctx.throw(500)
}

app.on('error', error =>{
    console.log(error)
    console.log('================================>')
    console.log('错误信息: ', error.message)
    console.log('================================>')
})

app.use(handle)
app.use(main)
app.listen(3000, ()=>{
    console.log("serving")
})