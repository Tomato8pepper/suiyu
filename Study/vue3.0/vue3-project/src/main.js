import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

// ant-design 引入
import Antd from 'ant-design-vue'
import 'ant-design-vue/dist/antd.css'

createApp(App).use(store).use(router).use(Antd).mount('#app')
