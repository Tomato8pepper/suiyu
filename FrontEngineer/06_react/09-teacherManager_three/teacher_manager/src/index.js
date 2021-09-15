import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import * as serviceWorker from './serviceWorker';
import router from './routers';  // Ĭ�ϲ���index.js
import modelIndex from './models';
import teacherModel from './models/teacher.js';
import createHistory from 'history/createBrowserHistory'

import 'bootstrap/dist/css/bootstrap.min.css';
import 'font-awesome/css/font-awesome.css';
import './assets/css/index.css';
import Loading from 'dva-loading';


// 1: ����dva
import dva from 'dva';
// 2: ����dva��ʵ��app����
let app = new dva({
    history:createHistory()
});
// 3: ����·�� app.router(fn);
app.router(router);
app.use(Loading({
    namespace:'myloading'
}));  //��װ���
// 5: ע��ģ��app.model({});  {state,effects,reducers}
app.model(modelIndex);
app.model(teacherModel);
// 5.5: ж��ģ�� app.unmodel();
// 6: app.start('#root')  
app.start('#root');




// ReactDOM.render(<App />, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: http://bit.ly/CRA-PWA
serviceWorker.unregister();
