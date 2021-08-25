const Koa = require('koa')
const path = require('path')  //核心对象

// 引入两个router
const musicRouter = require('./routes/music')
const userRouter = require('./routes/user')

//创建服务器
let app = new Koa()

// 开启服务器
app.listen(3000, ()=>{
    console.log('服务器启动在3000端口')
})

// 模板渲染
const render = require('koa-art-template')
render(app, {
    // 开发的配置 debug: true   不压缩混淆
    // 实时读取文件（静态内容即使得到更新） 
    root: path.join(__dirname, 'views'),
    extname: '.html',
    debug: process.env.NODE_ENV !== 'production'
})




//中间件使用列表app.use


// 为了给static重写URL
app.use(async (ctx, next) =>{

    if(ctx.url.startsWith('/public')){
        //重写url
        ctx.url = ctx.url.replace('/public', '')
    }
    
    //放行
    await next()
})


// 处理静态资源
app.use(require('koa-static')(path.resolve('./public')))


app.use(musicRouter.routes())
app.use(userRouter.routes())
//处理405 方法未实现  和501 方法不支持

//
//中间件使用列表结束



