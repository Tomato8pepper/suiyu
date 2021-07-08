const Koa = require('koa')
const cors = require('koa2-cors')  //跨域处理
const bodyParser = require('koa-bodyparser') //解析参数
const mongoose = require('mongoose')
const config = require('./config.js')

const app = new Koa()


// mongodb建立连接
mongoose.connect(config.db, {useNewUrlParser: true}, (err) => {
    if(err) {
        console.log("failed to connect to dabase");
    }else{
        console.log('connecte successful');
    }
})

app.use(cors());
app.use(bodyParser());

const user_router = require('./routers/api/user_router')
app.use(user_router.routes()).use(user_router.allowedMethods())

app.listen(config.port)
