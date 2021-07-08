const Koa = require('koa')
const route = require('koa-route')
let app = new Koa()
const redirect = ctx =>{
    ctx.response.redirect('/')
    ctx.response.body = '<a href ="/">Index Page</a>'
}

const main = ctx =>{
    ctx.response.body = 'database-data'
}

app.use(route.get('/', main))
app.use(route.get('/redirect', redirect))
app.listen(3000, ()=>{
    console.log('服务已启动')
})