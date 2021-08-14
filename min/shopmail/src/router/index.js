import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component:  () => import ('../views/Home/Home')
  },
  {
    path: '/member',
    name: 'Member',
    component: () => import ('../views/Member/Member')
  },
  {
    path: '/Shop',
    name: 'Shop',
    component: () => import ('../views/Shop/Shop')
  },
  {
    path: '/Search',
    name: 'Search',
    component: () => import ('../views/Search/Search')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
