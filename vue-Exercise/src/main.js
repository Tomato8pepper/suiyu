import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

Vue.config.productionTip = false

// 引入mintui
import MINTUI from 'mint-ui'
// 安装插件
Vue.use(MINTUI)
// 引入css
import 'mint-ui/lib/style.css'







new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
