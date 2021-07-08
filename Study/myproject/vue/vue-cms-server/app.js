// koa引入
const koa = require('koa')
const app = new koa()


// 路由中间件
const userRoute = require('./router/userRoute')
const homeRoute = require('./router/homeRoute')
app.use(userRoute.routes())
app.use(homeRoute.routes())

// 跨域中间件
const koaCors2 = require('koa-cors2')
app.use(koaCors2)



app.listen(3000, () => {
    console.log('信息管理系统服务启动！');
})