const Vue = require('vue');
const express = require('express');
const server = express();
const Render = require('vue-server-renderer');
const fs = require('fs');



//渲染器
const render = Render.createRenderer({
    template: fs.readFileSync('./src/index.template.html'),
})
// export default
const createApp = require('./dist/server.bundle.js').default;
//createApp 指向 entry-server 导出的函数， 被webpack打包成commonJS;


server.get('*', (req, res) => {
    //每一次访问，生成一次
    const app = createApp();
    let context = {};
    //渲染成字符串
    render.renderToString(app, context, (err, html) =>{
        if(err) {
            console.log(err);
        }
        res.setHeader('Content-Type', 'text/html;charset=utf-8')
        // 返回字符串
        // 对于事件，需要addEventListener node环境下没有，需要再浏览器端进行处理。
        res.end(html);
    })
    res.send(`  <h2>服务端渲染</h2> `)
})
server.listen(8080, () => {
    console.log('server is running in 8080');
})