import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

// lib-flexible 移动端适配
import 'lib-flexible/flexible';
// lib-glexible移动适配结束

// vant组件
import vant from 'vant'
import 'vant/lib/index.css';
// vant组件结束



createApp(App).use(store).use(router).use(vant).mount('#app')
