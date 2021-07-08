const Koa = require('koa')
const app = new Koa()

const logger = (ctx, next) =>{
    console.log(`${ctx.request.url}-${ctx.request.method}-${Date.now()}`)
    next()
}

const main = ctx =>{
    console.log('123')
    ctx.response.body = 'database-data'
}

app.use(logger)
app.use(main)
app.listen(8080,()=>{
    console.log('serving')
})