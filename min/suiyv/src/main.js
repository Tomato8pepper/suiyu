import Vue from 'vue'
import App from './App.vue'

// 引入全局样式
import '../static/css/global.css'

// mintui start
import mintui from 'mint-ui'
import 'mint-ui/lib/style.css'
Vue.use(mintui)
// mintui end


Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')
