const Koa = require('koa')
let app = new Koa()

// ctx.request.accepts检查http请求的accept的内容的
// Accept属于请求头，代表客户端希望接受的数据类型，与content-Type一样
const main = ctx =>{
    if(ctx.request.accepts('xml')){
        ctx.response.type = 'xml'
        ctx.response.body = '<data>database-data</data>'

    }else if(ctx.request.accepts('html')){
        ctx.response.type = 'html'
        ctx.response.body = '<p>database-data1</p>'
    }else if(ctx.request.accepts('json')){
        //默认格式
        ctx.response.type = 'json'
        ctx.response.body = '{data: database-data2}'
    }else{
        ctx.response.type = 'text'
        ctx.response.body = 'database-data3'
    }
}
app.use(main)
app.listen(1000, ()=>{

})