const Koa = require('koa')

// 引入两个router
const musicRouter = require('./routes/music')
const userRouter = require('./routes/user')

// const bodyParser = require('koa-bodyparser')
const formidable = require('koa-formidable')

const session = require('koa-session')
const checkLogin = require('./middleware/checkLogin')


//创建服务器
let app = new Koa()
let { appPort, viewDir, staticDir, uploadDir } = require('./config')
// 开启服务器
app.listen(appPort, () => {
    console.log(`服务器启动在${appPort}端口`)
})

// 模板渲染
const render = require('koa-art-template')
render(app, {
    // 开发的配置 debug: true   不压缩混淆
    // 实时读取文件(静态内容即使得到更新)
    root: viewDir,
    extname: '.html',
    debug: process.env.NODE_ENV !== 'production'
})




//中间件使用列表app.use

// 优雅的处理异常 
let error = require('./middleware/error')
let rewriteUrl = require('./middleware/rewrite')
app.use(error())

// 为了给static重写URL
app.use(rewriteUrl(require('./rewriteUrlConfig')))


// 处理静态资源
app.use(require('koa-static')(staticDir))

let store = {
    storage: {},
    set(key, session) {
        this.storage[key] = session
    },
    get(key) {
        return this.storage[key]
    },
    destroy(key) {
        delete this.storage[key]
    }
}
//基于test字符串进行签名的运算，为的是保证数据不背篡改
app.keys = ['test']

//处理session
app.use(session({ store: store }, app))

// 判断某些页面url的时候是否有session上的url(登录)
app.use(checkLogin)


// 必须在每次请求挂载新的数据与视图的桥梁 (在session之后)
    //express app.locals 视图与数据的桥梁
app.use(async (ctx, next) =>{
    // 最终都放行
    ctx.state.user = ctx.session.user
    await next();
})

//处理请求体数据ctx.request.body获取
// app.use(bodyParser())

/*
    carefull: 1.最初使用formidable接收文件，但是头是键值对的头，
    所以formidable帮我们将数据解析键值对了，打印出来的数据非常多
    2.所以使用bodyParser的时候，仍然是键值对的头，它解析的时候，里面包含文件，所以报错too large， 请求体太大
*/

// 处理文件及字符串
app.use(formidable({
    //设置上传目录，否则在用户的temp目录下
    // 默认根据文件算法生成hash字符串(文件名)，无后缀
    uploadDir: uploadDir,
    keepExtensions: true
}))

app.use(musicRouter.routes())
app.use(userRouter.routes())
//处理405 方法未实现  和501 方法不支持
app.use(userRouter.allowedMethods())
//
//中间件使用列表结束



