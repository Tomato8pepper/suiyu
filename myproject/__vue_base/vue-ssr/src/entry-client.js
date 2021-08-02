import {createApp} from './app.js'

let {app} = createApp()
app.$mount('#app')            //渲染在 浏览器上面

// (server rander)同构 一份代码  既在服务端运行，也在客户端运行
