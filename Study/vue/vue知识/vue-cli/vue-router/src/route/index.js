import Router from 'vue-router'
import hello from '../components/HelloWorld.vue'
import Vue from 'vue'
import Hi from '@/components/Hi.vue'
// import Hi1 from '../components/Hi1.vue'
import Hi2 from '../components/Hi2.vue'
import error from '@/components/error.vue'

Vue.use(Router)

export default new Router({
    routes: [
      {
        path: '/',
        name: 'Hello',
        component: hello
      },
      {
        path: '*',
        component: error
      },
      {
          path: '/hi',
          name: 'Hi',
          component: Hi,
          children: [
            {
                path: 'hi1',
                name: 'hi1',
                // component: Hi1
                redirect: '/', 
            },
            {
                path: 'hi2',
                // name: 'Hi2',
                component: Hi2,
                // 重命名
                alias: 'mr'
            }
          ]
      },
      {
        path: '/abc',
        component: error,
        beforeEnter: (to, from, next)=>{
          console.log('我进入了错误页面！！！')
          console.log(to)
          console.log(from)
          next()
        }
      }
    ]
  })