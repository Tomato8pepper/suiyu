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




## Node基础

### 为什么学习Node?

* IO优势
  * 对于文件读写,Node采用的是非阻塞IO
  * __传统IO在读写文件的时候CPU来处理,而代码执行也处于等待中,浪费性能__
  * __非阻塞IO将读写操作交给CPU,而代码正常执行,减少等待浪费的性能__
* 应用场景
  * 实际应用: webpack/gulp/npm/http-server/json-server
  * 服务器中负责IO读写的中间层服务器(天猫中间层IO服务器)



### NodeJS特点

* 其移植了chrome V8 引擎,解析和执行代码机制和浏览器js相同
* 其沿用了JavaScript语法、另外扩展了自己需要的功能
* 总结: nodejs  是一个后端语言 ,  其具备操作文件的能力,  可以具备服务器的创建和操作能力
  * 其语法是JavaScript语法,代码运行在chrome V8 引擎之上




#### 基本使用

* 官网上下载 node-v-xx.msi 傻瓜式的安装包  一路下一步,就ok
* 检测是否安装成功 node -v
* 运行程序   node ./xxx.js


### 内置对象介绍

---

#### 分类

* 全局对象:  何时何处都能访问
* 核心对象:  向系统索要,引入即可使用
* 自定义对象:  按路径引入即可

#### process（全局对象）

* 每个系统的环境变量几乎都不一样，可以利用环境变量中的具体某个特定的值来区分不同的机器

* process.env 是一个对象，我们可以通过其.属性名来获取具体的环境变量值
    - 设置一个特定的环境变量,以达到简单区分不同的机器,从而针对生产/开发环境运行不同的效果
* process.argv 获取命令行参数

#### filename/dirname（全局对象）
* __filename 获取当前运行文件的目录,绝对路径
* __dirname 当前运行文件的绝对路径

#### nodejs实现规范

* CommonJS   :  规范JavaScript语言作为后端语言运行的标准
  * 具备什么能力,该怎么做 ,比如: 具备服务器的功能/  可以操作文件 .....
  * 模块应该怎么写: Module :     
    * 1:依赖一个模块   require('模块名(id)')
    * 2: 需要被模块依赖   module.exports = 给外部的数据
    * 3:一个文件是一个模块

#### 核心对象path
* 1:`const path = require('path');`
* 路径 -> 在处理路径的时候很擅长,但是,其不负责判断路径是否存在文件
* 拼接并修正路径 `path.join(__dirname,'a','b');` 以当前目录/a/b
* ```path.resovle('./xxx') 相对转绝对```
* 接收一个合法的路径字符串，转换成一个对象
    - `let pathObj = path.parse(mypath);`
* 接收一个路径对象，转换成一个字符串路径
    - `let str = path.format(pathObj);`

```javascript
{ root: 'C:\\',
  dir: 'C:\\Users\\孙悟空',
  base: '金箍棒.txt',   // 该属性可以用于修改文件名和后缀
  ext: '.txt',
  name: '金箍棒' }

```
* __注意:path对象是方便我们操作路径的,对于获取来讲: parse解析成对象,format转换成字符串.join拼接并修正.... 对于修改路径对象来讲,可以用base属性更改,不能用name,ext更改__

#### 模块

* 弊端
    - 在js中要涉及到逻辑,还要在html中，为逻辑对象考虑引用顺序
    - 所有对象默认都是全局对象，命名冲突
    - commonjs规范
    - 一个文件就是一个模块
        + 导入用require('./xxx.js');
        + 导出用module.exports = xxx;
        + 在每一个模块内声明的变量属于模块内的作用域

### fs文件模块

- 文件读写
- 其他功能
- 扩展介绍

#### 操作文件对象

* IO

  * I :input输入
  * O:output 输出
  * 文件的操作就是IO

* 复制文件的过程,  I: 通过计算机,存储文件到剪切板

  * 粘贴到指定目录:   O: 通过计算机,将剪切板上的数据,写出到 指定目录

* node中有两种IO的操作

  * 同步IO

    * 一行代码(读文件)不执行完毕...后续代码不能执行

  * 异步IO (建议)

    * 一行代码(读写文件) 不执行完毕(正在读写中) ... 后续代码也可以执行

  * 代码体验:

    * 读写文件  

    * ```js
      const fs = require('fs'); //必须这个名称
      //读 fs.readFile(路径,回调函数);
      //写 fs.writeFile(路径,数据,回调函数);
      ```

    * 总结: 异步的读/写文件  参数1:都是路径,可以相对可以绝对,最后一个参数都是回调函数,回调函数的参数中错误对象优先



* 同步和异步IO的区别: 同步IO会阻塞后续代码执行,异步IO不会阻塞后续代码执行



#### nginx负载均衡

* ![1531408911142](assets/1531408911142.png)

#### 包（文件夹）

* 多个文件，有效的被组织与管理的一个单位
* 留一个入口

#### npm
* 自己先有一个包描述文件
* 创建一个包描述文件 `npm init`
* 下载一个包 `npm install art-template jquery@1.5.1 --save`
    - 记录依赖`--save`
* 根据package.json文件中的`dependencies`属性恢复依赖
    - 恢复包 `npm install`
* 卸载一个包 `npm uninstall jquery@1.5.1 --save`
* 查看包的信息
    - `npm info jquery`
* 查看包的信息中的某个字段(版本)
    - `npm info jquery versions`
* 查看包的文档
    - `npm docs jquery`
* 安装全局命令行工具
    - `npm install -g http-server`
* 卸载全局命令行工具
    - `npm uninstall -g http-server`
* 查看全局包的下载路径
    - `npm root -g`

#### nrm是npm的镜像源管理工具
* 1:全局安装 `npm install -g nrm`
* 2:查看当前可选的镜像源 `nrm ls`
* 3:切换镜像源 `nrm use taobao`

#### 包的加载机制
* 我们未来可能需要辨识一个包中，入口是否是我们想要的启动程序
* 1:查找node_modules下的包名文件夹中的main属性(常用)
* 2:不常用:查找node_modules下的包名.js
* 3:查找node_modules下的包名文件夹中的index.js(常用)



### http核心模块
---
#### http超文本传输协议
* 协议至少双方 -> http双方！！
* 客户端(浏览器)    -> 服务器
    - 原生应用(QQ)  -> 服务器

#### 请求与响应交互的过程
* 见图

#### 主体对象
* 服务器对象
* 客户端对象
* 请求报文对象(对于服务器来说，是可读)
* 响应报文对象(对于服务器来说，是可写)

#### 创建服务器步骤
* 1:引入http核心对象
* 2:利用http核心对象的.createServer(callback); 创建服务器对象
* 3:使用服务器对象.listen(端口,ip地址) 开启服务器
* 4:callback(req,res) 根据请求处理响应

#### 请求对象
* 请求首行中的url `req.url ` 
* 请求首行中的请求方式 `req.method`
* 请求头中的数据`req.headers`  是一个对象
* 头信息中，也可以作为与服务器交互的一种途径

#### 获取请求体数据

* 代码对比


* 浏览器:  $('#xx').on('submit',function(e){    })
* 服务器:  req.on('data',function(d){ d.toString(); })

#### querystring核心对象
* querystring.parse(formStr)
* username=jack&password=123转换成如下
* { username: 'jack', password: '123' }

#### 响应对象
* 响应首行 `res.writeHead(状态码)`
* 写响应头 
    - 一次性写回头信息
        + `res.writeHead(200,headers)`
    - 多次设置头信息
        + `res.setHeader(key,value);`
* 写响应体
    - 一次性写回响应体
        + `res.end();`
    - 多次写回响应体
        + `res.write();`

#### 请求与响应
* 头行体
* content-type是对请求或者响应体数据，做出的说明

#### 响应体数据
* res.write('字符串'||读出文件的二进制数据)
* res.end('字符串'||读出文件的二进制数)

#### 回写页面
* 英雄列表
* art-template http 
* 只能是访问 get请求   url: /hero-list  才返回该数据
* 其他请求返回ok



## Node基础

#### 复习(遍历文件夹下的文件)

* 读取文件夹,获取其中所有文件的资源


* stat 获取文件状态
* readdir 读取文件夹数据
* access 判断文件或文件夹是否存在

![52656207375](assets/1526562073755.png)

![1531572185329](assets/1531572185329.png)

![1531573934913](assets/1531573934913.png)



#### 包（文件夹）

* 多个文件，有效的被组织与管理的一个单位
* 留一个入口
* __包就是一个:文件夹__

#### npm|| yarn
* 自己先有一个包描述文件（__package.json__)
* 创建一个包描述文件 `npm init [-y]`
    * 会根据当前的文件夹来自动生成包名（__不允许中文，不允许大写英文字母__)
    * 默认生成```npm init [-y]```
* 下载一个包 `npm install art-template jquery@1.5.1 --save`
    - 记录依赖`--save`
* 根据package.json文件中的`dependencies`属性恢复依赖
    - 恢复包 `npm install`   简单: ```npm i ```
* 卸载一个包 `npm uninstall jquery@1.5.1 --save`
* 简写```npm un jquery@1.5.1 --S`
    * 下载简单些:```npm i 包名```
* __小结:以上简写:  uninstall -> un ,install -> i , --save -> -S__
* 查看包的信息
    - `npm info jquery`
* 查看包的信息中的某个字段(版本)(掌握)
    - `npm info jquery versions`
* 查看包的文档
    - `npm docs jquery`
* 安装全局命令行工具
    - `npm install -g http-server`
* 卸载全局命令行工具
    - `npm uninstall -g http-server`
* 查看全局包的下载路径
    - `npm root -g`
* 修改存储目录
    * ```npm config set prefix "D:\xxx"```
    * 不要node_modules
    * 接着，修改环境变量中的path属性
      * 添加或改为```D:\xxx```
      * 目的就是为了在任意目录启动 xxx.cmd
    * 重启命令行



#### 包的区别

* 凡是我们下载到项目的node_modules中的包，基本都是拿来做require('xxx') 调用其函数和属性
* ![1531575011479](assets/1531575011479.png)
* 还有一类属于工具性的包（全局命令行工具)
  * 在命令行直接使用的
* 全局工具 和项目包的区别
  * __全局工具哪个目录都可以通过命令行启动，通过任意目录启动该工具，给相对路径传递任意目录的文件给该工具__
  * __项目中的包，部分具备命令行工具的能力，需要命令行环境变量的支持__

#### nrm是npm的镜像源管理工具
* 1:全局安装 `npm install -g nrm`
* 2:查看当前可选的镜像源 `nrm ls`
* 3:切换镜像源 `nrm use taobao`
* 选修: 添加自己公司私有源 ```nrm add name http://www.xxx.xxx/```

#### 包的加载机制
* 我们未来可能需要辨识一个包中，入口是否是我们想要的启动程序
* 逐级向上查找node_module,直到盘符根目录
* 1:查找node_modules下的包名文件夹中的main属性(常用)
* 2:不常用:查找node_modules下的包名.js
* 3:查找node_modules下的包名文件夹中的index.js(常用)
* __逐级向上,node_modules,要么main属性,要么index.js__

### http核心模块
---
#### http超文本传输协议
* 协议至少双方 -> http双方！！
    * 客户端(浏览器)    -> 服务器  BS
    - 原生应用(QQ)  -> 服务器 CS

* 就是数据如何传输

* 特点:

    * 一问一答（先有请求，后有响应）
    * 5大特点：
        * 轻便/    简单快速       支持客户/服务器模式 
        * 无连接（不为每一个请求保持住链接）
        * 无状态( 服务器不记得客户端是谁 ) -> cookie

#### 请求与响应交互的过程
* 见图

#### 主体对象（核心对象http)
* 服务器对象 ```http.createServer();```
* 客户端对象```http.request({host:'www.baidu.com'});```
* 请求报文对象(对于服务器来说，是可读)  req
* 响应报文对象(对于服务器来说，是可写) res



#### 状态码分类

* 1开头，正在进行中
* 2开头，完成
* 3开头 ，重定向
* 4开头 ， 客户端异常
* 5开头， 服务器异常

#### 创建服务器步骤
* 1:引入http核心对象
* 2:利用http核心对象的.createServer(callback); 创建服务器对象
* 3:使用服务器对象.listen(端口,ip地址) 开启服务器
* 4:callback(req,res) 根据请求处理响应

#### 请求报文对象(只读)
* 请求首行中的url `req.url ` 
* 请求首行中的请求方式 `req.method`
* 请求头中的数据`req.headers`  是一个对象
* 头信息中，也可以作为与服务器交互的一种途径

#### 响应对象

* 响应首行 `res.writeHead(状态码)`
* 写响应头 
  * 一次性写回头信息
    * `res.writeHead(200,headers)`
  * 多次设置头信息
    * `res.setHeader(key,value);`
* 写响应体
  * 一次性写回响应体
    * `res.end();`
  * 多次写回响应体
    * `res.write();`

#### 请求与响应

* 头行体
* content-type是对请求或者响应体数据，做出的说明

#### 响应体数据

* res.write('字符串'||读出文件的二进制数据)

* res.end('字符串'||读出文件的二进制数)

  ​

#### 获取请求体数据

* 代码对比


* 浏览器:  $('#xx').on('submit',function(e){    })
* 服务器:  req.on('data',function(d){ d.toString(); })



#### 总结梳理

* http故事剧情中的主角 :  服务器（女）（响应报文） 客户端（男）（请求报文）
  * 因为都是男人主动找女人
  * 服务器:http.createServer创建服务器，监听端口listen，处理响应on('request',(req,res)=> { })
  * 请求报文： 由于我们是服务端代码，所以该报文是浏览器发的，我们看就行了
    * 头行体（异步）
  * 响应报文：由于我们是服务端代码，所以响应报文，我们写就行了
    * 头行体
      * 头设置1次，和多次
      * 体写1次和多次 







#### querystring核心对象

* querystring.parse(formStr)
* username=jack&password=123转换成如下
* { username: 'jack', password: '123' }

#### 回写页面
* 做一个简单的查询功能,查询后,页面跳转,显示查询结果
* 数据关系是英雄名称
* 请求方式必须是get请求

#### 跨域问题

* 传统开发方式:前端代码及请求数据接口都在同一个服务器上,前端代码测试依赖服务器
* 前后端分离:
  * 静态服务器: 运行前端代码
  * 后台服务器: 运行数据接口服务器
  * __互不影响,浏览器向其他服务器发送ajax请求,会产生跨域__





#### jsonp

* 知识点补充

* url核心对象

  * ```js
    const url = require('url');
    url.parse('http://xxx.com?id=1',true); // 第二个参数是将id=1转换成对象
    // output:  { protocal:'http',..省略..query:{id:1}   }
    ```

  * ​

#### CORS

* ```
  Access-Control-Allow-Origin: 'http://xxx.com'  //允许哪个域在跨域的时候访问,*代表所有
  // 告诉浏览器,跨域时允许有cookie,同时客户端也要设置withCredentials:true + Origin不能是*
  Access-Control-Allow-Credentials: true  
  Access-Control-Allow-Methods: 'GET,POST,PUT,DELETE';   // 默认允许get/post
  Access-Control-Allow-Headers:'xxx';   // 允许你自己加的头来通信
  ```

* 浏览器在非简单请求(get/post)||包含自定义头||content-type非键值对的时候,会先请示服务器,来一个OPTIONS请求,如果不满足,拒绝发送ajax请求

#### 代理

* 下载依赖包便于请求操作 ```npm i request -S```

#### nginx代理

* __操作最好在管理员权限下进行__
* nginx -s [opt]  opt:stop, quit, reopen, reload


* 启动nginx: 命令行进入到解压目录 ```start nginx ```
* 查看nginx启动进程 ```tasklist /fi "imagename eq nginx.exe"```
* 关闭进程 ```nginx -s stop```



### 准备开始

------

#### 启程helloworld

- 安装`npm i express -S`
- 1:引入express第三方对象
- 2:构建一个服务器对象
- 3:开启服务器监听端口
- 4:处理响应
- 在express中，保留了原生http的相关属性和函数

#### app.use(虚拟目录,fn)

- 小练习
  - 选择性荤菜素菜
- 用户/abc/def的请求
  - 选择性调用app.use('/abc',fn)的中间件
  - 但是内部req.url则去除了/abc这个暗号
- app.use(fn)是任何请求都会触发执行的

#### 中间件类别(了解)

- 应用级中间件 `app.use(事fn)`
- 路由级中间件 
  - 1:获取路径级中间件
  - 2:配置路由
  - 3:加入到应用程序控制中`app.use(router);`
- 内置中间件
  - 处理一些静态资源文件的返回(设置将某个目录下的资源文件向外暴露)  
    - 当url匹配上我设置的目录下的子文件后，自动返回该文件
    - 加入到应用程序控制中`app.use(内置中间件);`
- 第三方中间件
  - 更方便的处理cookie/session,简易的解析post请求体数据
  - 在npm上下载并使用
  - 加入到应用程序控制中`app.use(第三方中间件);`
- 错误处理中间件
  - 在express中统一处理错误```next(err)```

#### 路由中间件

- 一个请求进来(总网线),分发到各自不同的处理(分多根网线给其他人)
  - __分流__
- 后端路由
  - (请求方式 + URL = 判断依据)(分流的判断依据) -> 做不同的处理(分流后的行为)
- 使用步骤
  - 1:获取路由中间件对象 `let router = express.Router();`
  - 2:配置路由规则 `router.请求方式(URL,fn事)`
    - fn中参数有req,res,next
  - 3:将router加入到应用`app.use(router)`



#### 路由

* ![1531832873008](assets/1531832873008.png)

#### res扩展函数

```javascript
res.download('./xxx.txt') // 下载文件
res.json({})  // 响应json对象
res.jsonp(数据) // 配合jsonp   要求客户端请求的时候也是jsonp的方式,  并且callback=xxx
res.redirect()  //  重定向 301是永久重定向, 302临时重定向
res.send()    // 发送字符串数据自动加content-type
res.sendFile() // 显示一个文件
res.sendStatus() // 响应状态码
```

- 总结
  - res.json() 响应数据,最常用 , 返回ajax数据
  - redirect() 重定向
  - download() 下载
  - ![1531833969870](assets/1531833969870.png)
  - jsonp() 跨域处理

### 模板渲染

------

#### 使用art-template模板引擎

- 下载express-art-template art-template
- app.js中配置
  - 注册一个模板引擎
    - `app.engine('.html',express-art-template);`
      - 设置默认渲染引擎```app.set('view engine','.html');```
  - res.render(文件名,数据对象);
  - express这套使用，默认在当前app.js同级的views目录查找

#### 内置中间件(处理静态资源)

- 1: 创建对象 ```let static = express.static('./public');```
- 2: 配置到中间件中 ```app.use(static);```

#### 第三方中间件(post请求体的获取)

- 原生的:`req.on('data',data=>{ data.toString();})`

```javascript
const bodyParser = require('body-parser');
// 解析键值对application/x-www-form-urlencoded
app.use(bodyParser.urlencoded({ extended: false })); 
// 不用扩展的库来解析键值对，而使用node内置核心对象querystring来解析键值对
// 解析application/json
app.use(bodyParser.json());

```

#### 服务端处理错误和404页面找不到

- 404页面响应```router.all('*',()=>{} )```
- 触发错误
  - next(err);
  - 处理错误  app.use( 4参数函数 )

#### nodemon

- 修改代码自动重启
- 安装全局命令行工具 `npm i -g nodemon`
- 进入到指定目录命令行 `nodemon ./xxx.js`
- 手动触发重启，在命令行输入 rs回车





#### 案例

* 展示一个用户列表页面（页面中也请求js）



![1531837416808](assets/1531837416808.png)



------



#### MongoDB

- 一个数据库对应多个集合
  - 一个集合对应多个文档对象
  - 在mongo中不论是db还是集合，你都无需去创建他
  - 直接就当他已经存在，直接Use来使用
    - use db名称;
      - 接着会被切换到该db中
      - `db.要创建的集合名称.save({})`;这样集合就被创建了
- 1:启动服务器
  - `mongod --dbpath "D:/mongodb/db"` // 目录一定要存在自己创建随便名称‘
    - 尽量设置在非系统盘 `C盘生成目录是需要权限的`
  - 如果看到`waiting for connections on port 27017`说明服务已经启动
- 客户端连接服务器**另开一个命令行**
  - `mongo` 默认连接的是test数据库
- 查询有哪些数据库  
  - 查询数据库：`show dbs;`
  - 切换数据库: `use 数据库名;`
- 查询当前db下有哪些集合
  - `show collections;`
- 查询数据：
  - `db.集合名.find();`  //查询出来的是文档对象 document
  - `db.users.find();`
- 添加数据:
  - `db.集合名.save(对象)` //mongo默认会给我们加入_id作为该文档对象的唯一标识
  - `db.users.save({contry:'中国',name:'小明',score:77});`
- 删除数据:
  - `db.集合名.remove(条件对象);`//条件匹配就会被删除
  - `db.users.remove({name:'小明'});`
  - 如果给定一个空对像，会匹配全部
- 更新数据:
  - `db.集合名.update({匹配条件对象},{$set:{修改后的对象}});`
  - `db.users.update({name:'小明'},{$set:{contry:'印度'}});;`

#### 条件查询

```
练习：
  查询姓名为小明的学生
        db.users.find({name:'小明'});;   查询英语成绩大于90分的同学
        db.users.find({score:{$gt:90}}); //查找成绩大于90分$gt
        //$lt小于
 查询数学成绩不等于88的同学
        db.users.find({score:{$ne:88}});   查询总分大于200分的所有同学
        db.users.find({score:{$gt:200}});
```

#### 分页

- `db.users.find().skip(3).limit(3);`
- db.集合名称.find().跳到3.显示3条
      + limit 0,3

#### 排序

- `db.users.find().sort({key:排序方式});`
- `db.users.find().sort({'score':1});` //正数代表升序，负数代表降序

#### 模糊匹配

- `db.users.find({name:{$regex:'小'}});`
- `db.users.find({name:{$regex:'明'}});`

#### 聚合函数

- 需要求当前集合的记录数：
- `db.users.find().count();`
- 求最大值
  -求整个集合的总成绩
      + db.集合名.聚合({ 组的划分规则{_id:'1',显示内容:{$sum:'$score'}} })
  - 求所有人的平均分
    - `db.users.aggregate({$group:{_id:'1',sumscore:{$avg:'$score' } }});`
  - 求按国家分组，求所有国家的总分
    - `db.users.aggregate({$group:{_id:'$contry',sumScore:{$sum:'$score'}}});`
- 添加基础数据:
  db.users.save({contry:'中国',name:'小明',score:77});
  db.users.save({contry:'中国',name:'小红',score:88});
  db.users.save({contry:'中国',name:'小张',score:99});
  db.users.save({contry:'美国',name:'jack',score:45});
  db.users.save({contry:'美国',name:'rose',score:67});
  db.users.save({contry:'美国',name:'mick',score:89});

解决32位异常
mongod --dbpath="路径" --journal --storageEngine=mmapv1



#### 配置https

- 公钥  公开的加密方式
- 私钥  存在服务器的唯一解公钥加密的方式
- 签名  确保数据的一致性
- 证书  确保当前发送数据单位可信




### 准备开始

------

#### MongoDB

- 一个数据库对应多个集合
  - 一个集合对应多个文档对象
  - 在mongo中不论是db还是集合，你都无需去创建他
  - 直接就当他已经存在，直接Use来使用
    - use db名称;
      - 接着会被切换到该db中
      - `db.要创建的集合名称.save({})`;这样集合就被创建了

- __解决32位异常__
  mongod --dbpath="路径" --journal --storageEngine=mmapv1

  

- 1:启动服务器
  - `mongod --dbpath "D:/mongodb/db"` // 目录一定要存在自己创建随便名称‘
    - 尽量设置在非系统盘 `C盘生成目录是需要权限的`
  - 如果看到`waiting for connections on port 27017`说明服务已经启动
- 客户端连接服务器**另开一个命令行**
  - `mongo` 默认连接的是test数据库
- 查询有哪些数据库  
  - 查询数据库：`show dbs;`
  - 切换数据库: `use 数据库名;`
- 查询当前db下有哪些集合
  - `show collections;`
- 查询数据：
  - `db.集合名.find();`  //查询出来的是文档对象 document
  - `db.users.find();`
- 添加数据:
  - `db.集合名.save(对象)` //mongo默认会给我们加入_id作为该文档对象的唯一标识
  - `db.users.save({contry:'中国',name:'小明',score:77});`
- 删除数据:
  - `db.集合名.remove(条件对象);`//条件匹配就会被删除
  - `db.users.remove({name:'小明'});`
  - 如果给定一个空对像，会匹配全部
- 更新数据:
  - `db.集合名.update({匹配条件对象},{$set:{修改后的对象}});`
  - `db.users.update({name:'小明'},{$set:{contry:'印度'}});;`

#### 条件查询

```
练习：
  查询姓名为小明的学生
        db.users.find({name:'小明'});;   //名称叫小明的
        db.users.find({score:{$gt:90}}); //查找成绩大于90分$gt
        //$lt小于
 查询数学成绩不等于88的同学
        db.users.find({score:{$ne:88}});   查询总分大于200分的所有同学
        db.users.find({score:{$gt:200}});
```

#### 分页

- `db.users.find().skip(3).limit(3);`
- db.集合名称.find().跳到3.显示3条
      + limit 0,3

#### 排序

- `db.users.find().sort({key:排序方式});`
- `db.users.find().sort({'score':1});` //正数代表升序，负数代表降序

#### 模糊匹配

- `db.users.find({name:/^小/});`
- `db.users.find({name:/^正则/});`
- 中间包含红： `db.users.find({name:/^.+红.+$/});`

#### 聚合函数

- 需要求当前集合的记录数：
- `db.users.find().count();`
- 求最大值
  -求整个集合的总成绩
      + db.集合名.聚合({ 组的划分规则{_id:'1',显示内容:{$sum:'$score'}} })
  - 求所有人的平均分
    - `db.users.aggregate({$group:{_id:'1',sumscore:{$avg:'$score' } }});`
  - 求按国家分组，求所有国家的总分
    - `db.users.aggregate({$group:{_id:'$contry',sumScore:{$sum:'$score'}}});`
- 添加基础数据:
  db.users.save({contry:'中国',name:'小明',score:77});
  db.users.save({contry:'中国',name:'小红',score:88});
  db.users.save({contry:'中国',name:'小张',score:99});
  db.users.save({contry:'美国',name:'jack',score:45});
  db.users.save({contry:'美国',name:'rose',score:67});
  db.users.save({contry:'美国',name:'mick',score:89});



#### 联合查询

```js
db.orders.insert([
   { "_id" : 1, "item" : "almonds", "price" : 12, "quantity" : 2 },
   { "_id" : 2, "item" : "pecans", "price" : 20, "quantity" : 1 },
   { "_id" : 3  }
]);
db.taring.insert([
  {"id": 1, "item1":"almonds", rate: "A" },
  { "id": 2, "item1": "pecans", rate: "B" }
])
db.inventory.insert([
   { "_id" : 1, "sku" : "almonds", description: "product 1", "instock" : 120 },
   { "_id" : 2, "sku" : "bread", description: "product 2", "instock" : 80 },
   { "_id" : 3, "sku" : "cashews", description: "product 3", "instock" : 60 },
   { "_id" : 4, "sku" : "pecans", description: "product 4", "instock" : 70 },
   { "_id" : 5, "sku": null, description: "Incomplete" },
   { "_id" : 6 }
]);
db.orders.aggregate([
   {
     $lookup:    //管道中加入一次查找操作
       {
         from: "inventory",  //从那个集合产生关联
         localField: "item", //自己的字段
         foreignField: "sku", //别的表的字段
        //  当orders.item === inventory.sku 就合起来展示数据
         as: "inventory_docs" //别的表的数据的别名
       }
  }
]);
```
```js
// 三集合查询
db.orders.aggregate([
  {
    $lookup:
    {
      from: "inventory",
      localField: "item",
      foreignField: "sku",
      as: "inventory_docs"
    }
  },
  {
    $lookup:
    {
      from: "taring",
      localField: "item",
      foreignField: "item1",
      as: "rating_obj"
    }
  }
]);
```



#### 操作符

* https://docs.mongodb.com/manual/reference/operator/



#### 配置https

- 公钥  公开的加密方式
- 私钥  存在服务器的唯一解公钥加密的方式
- 签名  确保数据的一致性
- 证书  确保当前发送数据单位可信



#### 扩展知识（使用mongodb实现附近的人）

* ![location](assets/location.jpg)



```js
// 创建索引
 db.test.createIndex({"sp":"2dsphere"});

 db.test.insert({name:"A",sp:{type:"Point",coordinates:[105.754,41.689]} });
 db.test.insert({name:"B",sp:{type:"Point",coordinates:[105.304,41.783]} });
 db.test.insert({name:"C",sp:{type:"Point",coordinates:[105.084,41.389]} });
 db.test.insert({name:"D",sp:{type:"Point",coordinates:[105.831,41.285]} });
 db.test.insert({name:"E",sp:{type:"Point",coordinates:[106.128,42.086]} });
 db.test.insert({name:"F",sp:{type:"Point",coordinates:[105.431,42.009]} });
 db.test.insert({name:"G",sp:{type:"Point",coordinates:[104.705,41.921]} });
```



#### 查找附近的人

* ```js
    db.test.find(
      {
       sp:
         {
          $nearSphere :
            {
              $geometry: { 
                type: "Point",  
                coordinates:[105.304,41.783]
              },
              $minDistance: 25000,
              $maxDistance: 40000
            }
         }
     }
  )
  ```

#### 离我最近

* ```js
  db.test.aggregate({
        $geoNear: {
          near: { type: "Point", coordinates:[105.304,41.783]},
          distanceField: "dist.calculated",
          spherical:true,
          maxDistance: 40000
        }
     })
  ```

* 经纬度查询网站 

  * http://www.gpsspg.com/maps.htm





#### promise



### koa

- 代码编写上避免了多层的嵌套异步函数调用 async await来解决异步
  - async  await 需要依赖于promise
- 更轻...  减少了内置的中间件  express.static处理静态资源的内置中间件  express.Router() 路由
- 启动步骤
  1. 引入Koa构造函数对象 ```const Koa = require('koa')```
  2. 创建服务器示例对象 ```const app = new Koa();```
  3. 配置中间件 ```app.use(做什么?)```
  4. 监听端口启动服务器 ```app.listen(8888);```
- 做什么? (函数参数说明)
  - context上下文对象: 该对象类似原生http中的 req + res
    - 该对象的req,res属性也存在，就是原生没有包装过的req,res
    - 简单说:  context 对象就是从请求到响应 过程中的一个描述对象
  - next函数:调用下一个中间件
- request(请求对象):  其中包含客户端请求的相关信息
- response(响应对象): 包含响应数据的具体操作



#### request常用属性

- ctx.request.url(ctx.url)
- ctx.request.method(ctx.method)
- ctx.request.headers(ctx.headers)



#### response常用属性

- ctx.response.set(ctx.set)  __函数:参数key,val__
- ctx.response.status(ctx.status)

- ctx.response.body(ctx.body)  



#### 小结

- 以上所有使用的属性,都可以简写 ctx.xxx
- 使用async await的应用场景,如果你出现了异步操作,使用其,  后一个中间件使用了async,前后都使用
- 三主角: __函数前面 async, 内部才能await,要想await能有用,就用promise包裹他__



#### 第三方中间件

- 处理请求体 __koa-bodyparser__
  - 非GET请求，比如说post请求 ，包括表单提交的form内的数据，都能轻松获取
  - ctx.request.body 获取form中的数据

- 处理路由 __koa-router__
  - 获取查询字符串 ctx.query
  - 获取/xxx/:id      ctx.params.id
  - ![52733885202](../../../%E6%A1%8C%E9%9D%A2/NodeJs/06-NodeJS%E8%BF%9B%E9%98%B6-%E7%AC%AC6%E5%A4%A9-%7B%20%E8%81%8A%E5%A4%A9%E5%AE%A4%E6%A1%88%E4%BE%8B%E3%80%81socket.io%20%7D/4-%E6%BA%90%E4%BB%A3%E7%A0%81/assets/1527338852020.png)
- koa-bodyparser是解析请求体数据的，koa-router中可以通过ctx.query||ctx.params获取url上的参数



- 处理静态资源 __koa-static__
- 渲染页面 __koa-art-template__
  - koa与视图通信的对象 __ctx.state__
- session中间件 __koa_session__
  - sign：true   会生成一个关于cookie数据保障不被修改的签名，如果数据改了，但是签名还是之前的状态，就说明数据不安全
  - app.keys 必须要，内部通过该值进行标识或者说计算
  - 操作session   __ctx.session.xxx__

#### 聊天室练习

### koa-socket

#### 核心思想socket-io

- 轮询ajax   __缺点:不停询问服务器，浪费性能__
- 服务器不关闭连接，一次响应，一直保持连接 __缺点:只有服务器向客户端不断输出__
- html5中出来了一个websocket   他是在原来http协议的基础上，去升级当前协议为websocket升级
  - 将原本  先有请求才有响应的机制，更改成了，服务端也可以主动发请求给客户端
  - HTTP 一问一答，  TCP协议，客户端与服务器建立连接以后，就可以自由的通信了
  - 缺点:__有兼容性问题__（IE11）
- socket.io交互方式可能通过websocket/轮询ajax/服务器响应流(保持连接)
  - 1. 服务器可主动发数据到客户端
    2. 客户端向客户端发数据通过服务器

#### 下载包

- 客户端：socket.io-client
- 服务器：koa-socket

#### 操作步骤

- 服务器广播   ```io.broadcast('事件名',{ 数据} );```
- 服务器向客户端||客户端向服务器  ``` socket.emit('事件名',{数据});```
- 客户端接收  ```socket.on('事件名',data=>{} )```
- 服务器接收  ```io.on('事件名',data=>{});```

#### 进阶学习

- 私聊
  - 1. 客户端告诉服务器to谁,及内容
    2. 服务器通过io.to(socket.id)找到目标客户端,再通过emit通信
- 群组聊天
  - 加入群组 ```ctx.socket.join(groupid);```
  - 向群里通信```ctx.socket.broadcast 
  - .to(groupId).emit('xxxx',data)
  - 后续接收还是对应on('xxxx')



#### 总结

- 第三方包的用途  koa-static 处理静态资源
- koa-router  query获取查询字符串  params 获取 /xxx/:id 中的id
- koa-session app.keys必须要写上作为其内部运算的标识
  - 两次setcookie其中一个是cookie标识
  - 一个是数据签名， 保证数据不被修改
- koa-art-template 按文档配置引擎
- koa-bodyparser 解析请求体   ctx.request.body获取数据
- socket.io
  - 客户端需要引入  socket.io-client
  - 服务器： koa-socket
  - 对象之间的关系和结构，都是写多就熟，也并不用很熟，看着文档，会来就行
  - 客户端端与服务器之间都是  on('xxx')  emit('xxx')去对应
    - join加入组
    - to 私聊
    - 事件名,数据    数据可以是对象，如果仅仅是字符串，  ctx.data拿就可以了，是对象ctx.data.xxxx







#### session store

* 客户端cookie长度有限

* 客户端保存cookie信息不安全

* __客户端保存钥匙，服务器存储数据__

* ```js
  let store = {
    storage: {},
    get (key) {
      return this.storage[key]
    },
    set (key, sess) {
      this.storage[key] = sess
    },
    destroy (key) {
      delete this.storage[key]
    }
  } 
  
  app.use(session({store},app));
  ```

#### 聊天室练习

* 异步ajax聊天

* 功能扩展
  * 1. 即时聊天
    2. 统计在线人数
    3. 显示在线列表
    4. 私聊
    5. 群组聊天

#### 核心思想socket.io

- 轮询ajax(setInterval(发ajax))   __缺点:不停询问服务器，浪费性能__
- 服务器不关闭连接，一次响应，一直保持连接 __缺点:只有服务器向客户端不断输出__
- html5中出来了一个websocket   他是在原来http协议的基础上，去升级当前协议为websocket升级
  - 将原本  先有请求才有响应的机制，更改成了，服务端也可以主动发请求给客户端
  - HTTP 一问一答，  TCP协议，客户端与服务器建立连接以后，就可以自由的通信了
  - 缺点:__有兼容性问题__（IE11）



* 总结: 
  * 长轮询 : 客户端不停问，服务器不停回
  * 长连接: 客户端一次，服务器多次（服务器向客户端单向输出）
  * ws（握手） WebSocket
    * 全双工（双向工作（客户端和服务器））通信



- socket.io交互方式可能通过websocket/轮询ajax/服务器响应流(保持连接)
  - 1. 服务器可主动发数据到客户端
    2. 客户端向客户端发数据通过服务器

#### 下载包

- 客户端：socket.io-client
- 服务器：koa-socket

#### 操作步骤

- 服务器广播   ```io.broadcast('事件名',{ 数据} );```
- 服务器向客户端||客户端向服务器  ``` socket.emit('事件名',{数据});```
- 客户端接收  ```socket.on('事件名',data=>{} )```
- 服务器接收  ```io.on('事件名',data=>{});```

#### 进阶学习

- 私聊
  - 1. 客户端告诉服务器to谁,及内容
    2. 服务器通过io.to(socket.id)找到目标客户端,再通过emit通信
- 群组聊天
  - 加入群组 ```ctx.socket.join(groupid);```
  - 向群里通信```ctx.socket.broadcast.to(groupid).emit```
  - .to(groupId).emit('xxxx',data)
  - 后续接收还是对应on('xxxx')

#### excel操作

- node-xlsx 

#### 总结

- 第三方包的用途  koa-static 处理静态资源
- koa-router  query获取查询字符串  params 获取 /xxx/:id 中的id
- koa-session app.keys必须要写上作为其内部运算的标识
  - 两次setcookie其中一个是cookie标识
  - 一个是数据签名， 保证数据不被修改
- koa-art-template 按文档配置引擎
- koa-bodyparser 解析请求体   ctx.request.body获取数据
- socket.io
  - 客户端需要引入  socket.io-client
  - 服务器： koa-socket
  - 对象之间的关系和结构，都是写多就熟，也并不用很熟，看着文档，会来就行
  - 客户端端与服务器之间都是  on('xxx')  emit('xxx')去对应
    - join加入组
    - to 私聊
    - 事件名,数据    数据可以是对象，如果仅仅是字符串，  ctx.data拿就可以了，是对象ctx.data.xxxx









#### 聊天室练习

* 功能扩展
  * 1. 即时聊天
    2. 统计在线人数
    3. 显示在线列表
    4. 私聊
    5. 群组聊天

#### 核心思想socket.io

- 轮询ajax(setInterval(发ajax))   __缺点:不停询问服务器，浪费性能__
- 服务器不关闭连接，一次响应，一直保持连接 __缺点:只有服务器向客户端不断输出__
- html5中出来了一个websocket   他是在原来http协议的基础上，去升级当前协议为websocket升级
  - 将原本  先有请求才有响应的机制，更改成了，服务端也可以主动发请求给客户端
  - HTTP 一问一答，  TCP协议，客户端与服务器建立连接以后，就可以自由的通信了
  - 缺点:__有兼容性问题__（IE11）



* 总结: 
  * 长轮询 : 客户端不停问，服务器不停回
  * 长连接: 客户端一次，服务器多次（服务器向客户端单向输出）
  * ws（握手） WebSocket
    * 全双工（双向工作（客户端和服务器））通信



- socket.io交互方式可能通过websocket/轮询ajax/服务器响应流(保持连接)
  - 1. 服务器可主动发数据到客户端
    2. 客户端向客户端发数据通过服务器

#### 下载包

- 客户端：socket.io-client
- 服务器：koa-socket

#### 操作步骤

- 服务器广播   ```io.broadcast('事件名',{ 数据} );```
- 服务器向客户端||客户端向服务器  ``` socket.emit('事件名',{数据});```
- 客户端接收  ```socket.on('事件名',data=>{} )```
- 服务器接收  ```io.on('事件名',data=>{});```

#### 进阶学习

- 私聊
  - 1. 客户端告诉服务器to谁,及内容
    2. 服务器通过app._io.to(socket.id)找到目标客户端,再通过emit通信
- 群组聊天
  - 加入群组 ```ctx.socket.socket.join(groupid);```
    - 离开群 ```ctx.socket.socket.leave('字符串标识')```
  - 向群里通信```app._io.to(groupid).emit```
  - 后续接收还是对应on('xxxx')

#### mysql

* 安装依赖包```npm i mysql -S```
* 查看文档



#### excel操作

- node-xlsx  读取excel，xlsx 和xls

#### 总结

- 第三方包的用途  koa-static 处理静态资源
- koa-router  query获取查询字符串  params 获取 /xxx/:id 中的id
- koa-session app.keys必须要写上作为其内部运算的标识
  - 两次setcookie其中一个是cookie标识
  - 一个是数据签名， 保证数据不被修改
- koa-art-template 按文档配置引擎
- koa-bodyparser 解析请求体   ctx.request.body获取数据
- socket.io
  - 客户端需要引入  socket.io-client
  - 服务器： koa-socket
  - 对象之间的关系和结构，都是写多就熟，也并不用很熟，看着文档，会来就行
  - 客户端端与服务器之间都是  on('xxx')  emit('xxx')去对应
    - join加入组
    - to 私聊
    - 事件名,数据    数据可以是对象，如果仅仅是字符串，  ctx.data拿就可以了，是对象ctx.data.xxxx





### mysql数据库
* 创建表
    - 数据类型
        + 整数类型 int
        + 浮点类型 double
        + 日期类型 date/timestamp
        + 字符串类型 char varchar
            * 可变varchar 不可变是char
            * 空间换时间
    - 首先足够用，其次尽量小
```
    create table 表名(
        id int,
        name varchar(20)
    );
```

    - 查看创建表的语句
        + show create table 表名
    - 查看表的明细
        + desc 表名
* 删除表
    - drop table 表名
* 插入数据
    - 第一种：全表字段插入
        + `insert into 表名 values (val1,val2...)`
        + 插入的字段类型和*顺序必须*与表的字段*类型*与顺序保持一致,个数是针对全表字段的插入
    - 指定表字段的插入
        + `insert into 表名 (字段1,字段2...) values (val1,val2...)`
        + 插入的数据的顺序要与声明的字段名的顺序一致
        + 类型也要一致，个数也要一致
* 总结
* 1: 登录：
    - mysql -uroot -p
    - 密码
* 2: 查看有哪些数据库
    - show databases;
* 3: 切换数据库
    - use 数据库名;
* 4: show tables;
* 5: 查看表字段明细
    - desc 表名;
* 6: 插入数据
    - `insert into 表名 (字段1,..) values (值1...)`

* 更新操作
    - `UPDATE 表名 SET 字段1 = 表达式,[,字段2 = 表达式] [WHERE express布尔值]`
    - ` update student set tmp = 20+1,sex = sex where 1=1;`
* 删除操作
    - `DELETE FROM 表名 [,WHERE exr布尔值]`
    - `delete from student where name = '马蓉';`
* truncate和delete的区别
    - `truncate table 表名`
    delete会一条一条的删 自增id保留
    truncate先摧毁整张表，再创建一张和原来的表结构一模一样的表
    truncate在效率上比delete高
    truncate只能删除整表的数据，也就是格式化。
    truncate会把自增id截断恢复为1

### 查询语句
* DISTINCT 去重，尽量不要根据* 来去重
    - `select distinct name,age from student;`
* 查询语句可以指定多个字段查询，也可以使用* 查询
    - 在企业中，使用SQL查询* 是会拉低查询效率的 ，建议少用* 查询 
#### 条件查询
* `select * from student where math > 66.6 or math < 66.6;`

```
> < <= >= = <>    大于、小于、大于(小于等于)、不等于
BETWEEN…AND 显示在某一区间的值
IN(set) 显示在in列表中的值，例：in(100,200)
LIKE ‘张pattern’ 模糊查询%
IS NULL 判断是否为空
AND 多个条件同时成立
OR  多个条件任一成立
NOT 不成立，例：WHERE NOT(salary>100)
```

* 模糊查询
    - 包含关`select * from student where name like '%关%';` 
    - 以关开头`select * from student where name like '关%';` 
    - 以关结尾`select * from student where name like '%关';` 
* 判断为空
    - `select * from student where sex is not null;`

#### 聚合函数
* 统计数量 
    - count(星号)
* 求和
    - sum(math+english+chinese)
* 平均值
    - avg(math+english+chinese)
* 找最值
    - max(列)/min(列)/max(math+english+chinese)

#### 排序(order by)
* `select * from student where 1= 1 order by chinese desc,math desc,english desc;`

#### 分组(group by)
* 如果聚合函数只有一行，需要对于不同的集合做聚合运算就加上分组
    - `select zu,count(*) from student group by zu;`

#### 分页(limit)
```
    - `select * from student limit 10,5;`
    - limit offset(起始位置) count(显示多少个)
    - limit 使用的时候，offset从0开始
    - 豆瓣： offset （当前页-1）* 页显示数
        + count ： 页显示数
```

#### 默认端口
* oracle：1521
* sqlserver ：1433
* mysql ：3306
* mongodb ：27017
* DB2 ： 50000

#### mongoDB
* 关系是数据库对应多个集合
    - 集合对应多个文档对象
    - 在mongo中不论是db还是集合，你都无需去创建他
    - 直接就当他已经存在，直接Use来使用
        + use db名称;
            * 接着会被切换到该db中
            * `db.要创建的集合名称.save({})`;这样集合就被创建了
* 1:启动服务器
    - `mongod --dbpath "D:/mongodb/db"` // 目录一定要存在自己创建随便名称‘
        + 尽量设置在非系统盘 `C盘生成目录是需要权限的`
    - 如果看到`waiting for connections on port 27017`说明服务已经启动
* 客户端连接服务器**另开一个命令行**
    - `mongo` 默认连接的是test数据库
* 查询有哪些数据库  
    - 查询数据库：`show dbs;`
    - 切换数据库: `use 数据库名;`
* 查询当前db下有哪些集合
    - `show collections;`
* 查询数据：
    - `db.集合名.find();`  //查询出来的是文档对象 document
    - `db.users.find();`
* 添加数据:
    - `db.集合名.save(对象)` //mongo默认会给我们加入_id作为该文档对象的唯一标识
    - `db.users.save({contry:'中国',name:'小明',score:77});`
* 删除数据:
    - `db.集合名.remove(条件对象);`//条件匹配就会被删除
    - `db.users.remove({name:'小明'});`
    - 如果给定一个空对像，会匹配全部
* 更新数据:
    - `db.集合名.update({匹配条件对象},{$set:{修改后的对象}});`
    - `db.users.update({name:'小明'},{$set:{contry:'印度'}});;`

#### 条件查询

```
练习：
   查询姓名为小明的学生
        db.users.find({name:'小明'});;
   查询英语成绩大于90分的同学
        db.users.find({score:{$gt:90}}); //查找成绩大于90分$gt
        //$lt小于
   查询数学成绩不等于88的同学
        db.users.find({score:{$ne:88}});
   查询总分大于200分的所有同学
        db.users.find({score:{$gt:200}});
```


#### 分页
* `db.users.find().skip(3).limit(3);`
* db.集合名称.find().跳到3.显示3条
                    + limit 0,3
    
#### 排序
* `db.users.find().sort({key:排序方式});`
* `db.users.find().sort({'score':1});` //正数代表升序，负数代表降序
#### 模糊匹配
* `db.users.find({name:{$regex:'小'}});`
* `db.users.find({name:{$regex:'明'}});`

#### 聚合函数
* 需要求当前集合的记录数：
* `db.users.find().count();`
* 求最大值
    -求整个集合的总成绩
        + db.集合名.聚合({ 组的划分规则{_id:'1',显示内容:{$sum:'$score'}} })
    - 求所有人的平均分
        + `db.users.aggregate({$group:{_id:'1',sumscore:{$avg:'$score' } }});`
    - 求按国家分组，求所有国家的总分
        + `db.users.aggregate({$group:{_id:'$contry',sumScore:{$sum:'$score'}}});`

* 添加基础数据:
    db.users.save({contry:'中国',name:'小明',score:77});
    db.users.save({contry:'中国',name:'小红',score:88});
    db.users.save({contry:'中国',name:'小张',score:99});
    db.users.save({contry:'美国',name:'jack',score:45});
    db.users.save({contry:'美国',name:'rose',score:67});
    db.users.save({contry:'美国',name:'mick',score:89});

解决32位异常
mongod --dbpath="路径" --journal --storageEngine=mmapv1






