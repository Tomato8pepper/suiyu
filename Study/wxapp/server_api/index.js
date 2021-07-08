// console.log('ni hao')
const express = require('express');  //引入后端开发框架

const apiMocker = require('mocker-api')  //

const fs = require ('fs')   // 引入文件系统  node内置

const path = require('path')

const app = express()   // 初始化得到应用

// localhost 127.0.0.1:8080
// 阿里云 IP  :3306 =>访问 mysql         :27017 =>访问  mongodb
app.get('/',(req, res)=>{                           //get访问响应
    fs.createReadStream('./home.html').pipe(res)    //创建一个可读流         
    // res.end('hello, world')
}) 


apiMocker(app, path.resolve('./mocker/mocker.js'))   //可以给小程序提供数据  path系统核心模块

app.listen(1314)    //监听web端口

