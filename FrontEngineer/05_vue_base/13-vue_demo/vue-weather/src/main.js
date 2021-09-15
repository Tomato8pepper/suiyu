import Vue from 'vue'
import App from './App.vue'
import router from './router'
import vueAMap from 'vue-amap'
Vue.config.productionTip = false

Vue.use(vueAMap)
vueAMap.initAMapApiLoader({
  key: '11fabb9c64bb025fb04a82cc41f5127e',
  plugin: ['AMap.Autocomplete', 'AMap.PlaceSearch', 'AMap.Scale', 'AMap.OverView', 'AMap.ToolBar', 'AMap.MapType',

    'AMap.PolyEditor',

    'AMap.CircleEditor',

    'AMap.Geolocation', // 定位

    'AMap.Weather', // 天气 

    'AMap.CitySearch'],
  v: '1.4.4'
})

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
