// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router/index'


// mintui引入
import MintUI from 'mint-ui'
import 'mint-ui/lib/style.css'
  //里面做的是注册所有的全局组件和给Vue.prototype挂载一些对象，方便你使用，，组件内的this.xxx可以用了
Vue.use(MintUI);


// vue-preview 开始
import VuePreview from 'vue-preview'
// defalut install
Vue.use(VuePreview);


//引入全局样式
import '../static/css/global.css'

//引入axios
import axios from 'axios'
   //给vue原型挂载axios
Vue.prototype.$axios = axios;
axios.defaults.BaseURL = 'http://localhost:3000/'
// 定义拦截器
// 1: 请求发起前显示loading open();
// Axios.interceptors.request.use(function(config) {
//   // 不变配置:  可变，可以设置公共的请求头操作
//   MintUI.Indicator.open({
//     text: '玩儿命加载中...',
//     spinnerType: 'fading-circle'
//   });
//   // console.log(config);
//   return config;  // config:{ headers}
// })
// // 2: 响应回来后关闭loading close()
// Axios.interceptors.response.use(function(response) {
//   //reponse: { config:{ },data:{} ,headers }
//   // 接收响应头或者响应体中的数据，保存起来，供请求的拦截器中使用头信息操作
//   MintUI.Indicator.close();
//   // console.log(response);
//   return response;
// })




//注册全局组件
import MyUl from './components/common/MyUl';
import MyLi from './components/common/MyLi';
import NavBar from './components/common/NavBar';
import Comment from './components/common/Comment';
import Swipe from './components/common/swipe';
Vue.component(MyUl.name, MyUl)
Vue.component(MyLi.name, MyLi)
Vue.component(NavBar.name, NavBar)
Vue.component(Comment.name, Comment)
Vue.component(Swipe.name, Swipe)

// 定义全局过滤器
import Moment from 'moment'
Vue.filter('converTime', function(data, formatStr){
  return Moment(data).format(formatStr)
})
// 相对时间过滤器
Vue.filter('relTime',function(time){
  // 2015-04-16T03:50:28.000Z
  return Moment(time).fromNow();
});
// 控制字数显示的过滤器
Vue.filter('controllShow',function(str,num) {
// 佳能（Canon） EOS 700D 单反套机
  // 如果当前字符串小于num,返回原值
  if (str.length <= num ) {
    return str;
  }
  // 如果当前字符串大于num,截取0-num-1位
  if (str.length > num) {
    return str.substr(0,num-1) + '...';
  }
});


Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
