const Koa = require('koa')
const app = new Koa()
const route = require('koa-route')

const main = ctx =>{
    console.log(ctx)
    ctx.response.body = `${ctx.request.url}-${ctx.request.method}-${Date.now()}`
}

app.use(main)
app.listen(3000,()=>{
    console.log('servering')
})