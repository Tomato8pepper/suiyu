const fs = require('fs')
const Koa = require('koa')
const app = new Koa()
const route = require('koa-route')
const about = ctx =>{
    ctx.response.type = 'html'
    ctx.response.body = '<a href="/">about</a>'
}
const connect = ctx => {
    ctx.response.type = 'html'
    ctx.response.body = '<a href="/about">about</a>'
}
const main = ctx =>{
    // if(ctx.request.url == '/about'){
    //     ctx.response.type = 'html'
    //     ctx.response.body = '<a href="/">about</a>'
    // }else{
    //     ctx.response.body = 'database-data'
    // }
    ctx.response.body = 'database-data'
    
}
app.use(route.get('/about', about))
app.use(route.get('/about/abc', connect))
app.use(route.get('/', main))
// app.use(main)
app.listen(3000,()=>{
    console.log('服务启动中！')
})