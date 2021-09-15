const Koa = require('koa')
const fs = require('fs')
const path = require('path')
const app = new Koa()

const serve = require('koa-static')


let myPath = path.join(__dirname)
// const main = ctx =>{
//     ctx.response.body = myPath              //D:\github\JS_fullstack_study\node\koa-demo\demos
// }

const main = serve('myPathdemo12.js')

app.use(main)
app.listen(3000, ()=>{
    console.log("serving")
})
