//引入依赖  commonJS
const Koa = require('koa')

//得到一个koa实例
let app = new Koa()


// 启动服务
app.listen(3000, ()=>{
    console.log('服务已启动')
})

