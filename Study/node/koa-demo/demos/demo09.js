//引入依赖  commonJS
const Koa = require('koa')

//得到一个koa实例
let app = new Koa()

const one = (ctx, next) =>{
    console.log('<<one')
    next()
    console.log('one>>')
}
const two = (ctx, next)=>{
    console.log('<<two')
    next()
    console.log('two>>')

}
const three = (ctx, next) =>{
    console.log('<<three')
    next()
    console.log('three>>')

}



app.use(one)
app.use(two)
app.use(three)
// 启动服务
app.listen(8080, ()=>{
    console.log('服务已启动')
})