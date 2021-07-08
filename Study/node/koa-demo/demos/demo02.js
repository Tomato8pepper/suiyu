//从后端获取数据
const Koa = require('koa')
let app = new Koa()
// 自定义函数
const main = ctx =>{
    // ctx代表koa上下文
    ctx.response.body = 'database-data'

}
// 使用定义的一个函数
app.use(main)
app.listen(3000, ()=>{
    
})