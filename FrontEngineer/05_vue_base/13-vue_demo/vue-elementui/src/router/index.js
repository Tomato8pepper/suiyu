import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '@/views/Login.vue'
import Home from '@/views/Home.vue'


Vue.use(VueRouter)

  const routes = [
    {
      path: '/',
      name: 'Login',
      component: Login
    },
    {
      path: '/home',
      name: 'Home',
      component: Home,
      children: [
        {
          path: 'yanse',
          component: () => import('@/views/User.vue')
        },
        {
          path: 'tubiao',
          component: () => import('@/views/User2.vue')
        },
        {
          path: 'shurk',
          component: () => import('@/components/shurk.vue')
        }
      ]

    },
  ]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
