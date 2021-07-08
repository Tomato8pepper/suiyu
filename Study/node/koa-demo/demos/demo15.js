const Koa = require("koa")
const app = new Koa()

const main = ctx =>{
    // throw(400)
    ctx.response.status = 404
    ctx.response.body = '404 Not Found'
}

app.use(main)
app.listen(3000, ()=>{
    console.log('serving')
})