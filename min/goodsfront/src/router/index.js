import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/home'
import Member from '@/components/Member/Member'
import Shop from '@/components/Shop/Shop'
import Search from '@/components/Search/Search'
import newsList from '@/components/News/newsList'
import NewsDetail from '@/components/News/newsDetail'
import PhotoList from '@/components/Photo/PhotoList'
import PhotoDetail from '@/components/Photo/PhotoDetail'
import GoodShow from '@/components/Goods/GoodShow'
import GoodsDetail from '@/components/Goods/GoodsDetail'
import GoodsComment from '@/components/Goods/GoodsComment'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/Member',
      name: 'Member',
      component: Member
    },
    {
      path: '/Shop',
      name: 'Shop',
      component: Shop
    },
    {
      path: '/Search',
      name: 'Search',
      component: Search
    },
    {
      path: '/news/list',
      name: 'newsList',
      component: newsList
    },
    {
      path: '/news/detail/:id',
      name: 'NewsDetail',
      component: NewsDetail
    },
    {
      path: '/photo/list',
      name: 'PhotoList',
      component: PhotoList
    },
    {
      path: '/photo/detail/:id',
      name: 'PhotoDetail',
      component: PhotoDetail
    },
    {
      path: '/Good/list/:page',
      name: 'GoodShow',
      component: GoodShow,
    },
    {
      path: 'Good/detail',
      name: 'GoodsDetail',
      component: GoodsDetail
    },
    {
      path: 'Good/comment',
      name: 'GoodsComment',
      component: GoodsComment
    }
  ]
})
