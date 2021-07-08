const Koa = require ('koa')
const bodyParase = require('koa-bodyparser')
const cors = require('koa2-cors')
const mongoose = require('mongoose')
const config = require('./config.js')


let app = new Koa()
mongoose.connect(config.db, {useNewUrlParser: true}, (err) => {
    if(err) {
        console.error('fail to connect to database');
    }else{
        console.log('connection successfully!');
    }
})
app.use(bodyParase())
app.use(cors())


const userRouter = require('./routes/userRouter.js')
const courseRouter = require('./routes/courseRouter.js')
const exampleRouter = require('./routes/exampleRouter.js')
const schoolRouter = require('./routes/schoolRouter.js')
app.use(userRouter.routes()).use(userRouter.allowedMethods())
app.use(courseRouter.routes()).use(courseRouter.allowedMethods())
app.use(exampleRouter.routes()).use(exampleRouter.allowedMethods())
app.use(schoolRouter.routes()).use(schoolRouter.allowedMethods())

app.listen(config.port)