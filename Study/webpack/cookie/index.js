const koa = require('koa')
const app = new koa()
app.use((ctx, next) => {
    ctx.set('set-cookie', 'name=zhamingguo;')
})
app.listen(3000)


