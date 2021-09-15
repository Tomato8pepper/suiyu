const Koa = require("koa")
const app = new Koa()


const main = ctx =>{
    ctx.throw(500)
}


//监听error, 可以再控制台看见server error
app.on('error', function(error){
    console.log('================================>')
    console.log('错误信息', error.message)
    console.log('================================>')
})

app.use(main)
app.listen(3000)