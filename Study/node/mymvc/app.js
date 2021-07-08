// //koa引入
// const koa = require('koa')
// const app = new koa()

// //路由加载器
// const { initRouter } = require('./lm-loader')
// app.use(initRouter().routes())



// app.listen(3000)

const lm = require('./lm')
const app = new lm()

app.start(3000)