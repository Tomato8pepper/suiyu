内置对象：
全局：
    require、module.exports
    process.env是一个对象可以获取该电脑的用户以及环境变量、process.argv是一个数组[node的绝对路径, 文件的绝对路径, p1(命令行传入的参数), p2, ...]、    __dirname当前运行文件的绝对目录、__filename当前运行文件的绝对路径、
核心对象：
    path.join(__dirname, a, b)当前绝对路径添加以下目录、 path.resolve('./b/c.js')相对路径获取绝对路径、path.parse('path')一个对象传入绝对路径修改文件名
    同步：fs.readFileSync('path', 'utf8')
    异步：
    fs.readFile('./a.txt', 'utf8', (err, data) =>{
        if (err) throw err; //抛出到控制台输出
        console.log(data) //十六进制数据
        data.toString('utf8')
    })
    I/O?
    同步阻塞：fs.writeFileSync('path', data)
    异步非阻塞：
    fs.writeFile('./a.txt', data||String, {
        flag: 'a'
    }, (err, data) => {})

    // 接收命令行参数，根据该目录，读取目录下的所有文件并输出（遍历文件夹）
    const path = require('path');
    const fs = require('fs');
    //引入别人包的入口的文件

    // 1: 接收命令行参数  node ./01_read_dir_files.js .//xxx//xxx//xx
    // 2: 修正该路径 path.resolve(process.agrv[2]);
    let inputPath = path.resolve(process.argv[2]);
    // 3: 判断该路径是否存在 fs.access(fs.constants.F_OK)
    function testReadFiles(dir) {   
        try {
            fs.accessSync(dir, fs.constants.F_OK);
            let state = fs.statSync(dir); 
            if (state.isFile()) {
                console.log(dir);
            } else if (state.isDirectory()) {         
                let files = fs.readdirSync(dir);              
                files.forEach( file => {     
                    testReadFiles(path.join(dir,file)); 
                });
            }
        } catch (e) {
            console.log(e);
            console.log('该文件或文件夹不存在!');
        }
    }
    // 只判断一次
    // fs.accessSync(dir, fs.constants.F_OK);
    testReadFiles(inputPath);

    http: 请求头行体，响应头行体
        let server = http.createServer()
        server.on('request', (req, res) => {
            // 请求报文req只读， res只写
            req.headers

            req.url
            req.method
             
            req.on('data', (data) => {
                data.toString()
            })
            
            //写头， 一次性写一定在多次性写后面
            res.setHeader('a','a')
            res.setHeader('b','b')

            res.writeHead(200, {'content-type':'text/html;charset=utf-8'})

            res.write('xxx')
            res.write('yyy')
            res.end('zzz')
        })
        server.listen(8888, () => {
            console.log('start on 8888 duankou')
        })
        
        // 告知客户端，可以一点一点的显示
        res.writeHead(200,{'content-type':'application/octet-stream'});
自定义：
node.js实现规范： 
    commonJs(requrie('文件名')、 module.exports = 给外部的数据)
官网(node.js)上可以查看一些其他核心对象

nrm是npm的镜像源管理工具
    nrm ls
    nrm use

Express框架
const express = require('express'); // 自动逐级向上查找node_modules/express的文件夹-> package.json(main属性) || express的文件夹/index.js
let server = express();
server.listen(8888);
server.use('/sucai', (req,res,next)=> {  // 使用（请求与响应的过程中）
  res.end('萝卜!!'); // 原生API
  next() //放行到下一件事的开关
});
server.use('/牛肉', (req,res,next)=> {  // 使用（请求与响应的过程中）
  res.end('hello world!!'); // 原生API
  next() //放行到下一件事的开关
});

let router = express.Router();
router.get('/login',(req,res) => {
  res.end('login page');
})
.get('/register',(req,res) => {
  res.end('register page');
})
server.use(router);

res.json([{name:'jack'}]);  // res.end只能响应string||读文件中的data Buffer
res.redirect('http://www.baidu.com');
res.jsonp('jack love rose');
res.download('./app.js');  // 注意文件是如何被下载成功的
// 基于服务器回写的content-type。等头信息

art-template、express-art-template  中间件的使用

暴露静态资源、服务端错误处理、404页面找不到

文件上传 formidable中间件
var form = new formidable.IncomingForm();
form.uploadDir = path.join(__dirname,'public','imgs');
form.keepExtensions = true;
form.parse(req, function(err, fields, files)

koa框架：
1.引入对象 const Koa = require('koa')
2.创建服务器对象 let server = new Koa
3.处理响应 server.use(function (context) {
    context.body = 'koa ok'
})
4.监听端口 server.listen(9999)
ctx.url.method.headers
ctx.set.status.body
只要有异步的操作就要用async await promise
中间件koa-bodyparser处理请求体数据
中间件koa-router
中间件koa-static处理静态资源
中间件koa-art-template
中间件koa-session

socketIo









