import React from 'react';
import ReactDOM from 'react-dom';
import * as serviceWorker from './serviceWorker';
import router from './routers';  // 默认查找index.js
import modelIndex from './models';
import teacherModel from './models/teacher.js';
import createHistory from 'history/createBrowserHistory'
import createLoading from 'dva-loading';

import 'bootstrap/dist/css/bootstrap.min.css';
import 'font-awesome/css/font-awesome.css';
import './assets/css/index.css';



// 1: 引入dva
import dva from 'dva';
// 2: 创建dva的实例app对象
let app = new dva({
    history:createHistory()
});
// 3: 配置路由 app.router(fn);
app.router(router);
// 4: app.use();  //安装插件
app.use(createLoading({
    namespace:'myloading', //默认是loading没有啥用
}));
// 5: 注册模块app.model({});  {state,effects,reducers}
app.model(modelIndex);
app.model(teacherModel);
// 5.5: 卸载模块 app.unmodel();
// 6: app.start('#root')  
app.start('#root');

// vue的结构{ data:{} ,xxx:fn,xxx:fn }
// 

// ReactDOM.render(<App />, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: http://bit.ly/CRA-PWA
serviceWorker.unregister();
