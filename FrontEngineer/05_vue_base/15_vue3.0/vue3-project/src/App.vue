<template>
  <a-layout id="components-layout-demo-fixed">
    <a-layout-header :style="{ position: 'fixed', zIndex: 1, width: '100%' }">
      <div class="logo" />
      <a-menu
        theme="dark"
        mode="horizontal"
        v-model:selectedKeys="selectedKeys"
        :style="{ lineHeight: '64px' }"
      >
        <a-menu-item key="/">
          <router-link to="/">首页</router-link>
        </a-menu-item>
        <a-menu-item key="/plan">
          <router-link to="/plan">计划</router-link>
        </a-menu-item>
      </a-menu>
    </a-layout-header>
    <a-layout-content :style="{ padding: '0 50px', marginTop: '64px' }">
      <a-breadcrumb :style="{ margin: '16px 0' }">
        <a-breadcrumb-item>Home</a-breadcrumb-item>
        <a-breadcrumb-item>List</a-breadcrumb-item>
        <a-breadcrumb-item>App</a-breadcrumb-item>
      </a-breadcrumb>
      <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

        <router-view></router-view>
      </div>
    </a-layout-content>
    <a-layout-footer :style="{ textAlign: 'center' }">
      Ant Design ©2018 Created by Ant UED
    </a-layout-footer>
  </a-layout>
</template>
<script>
//composition api
import { reactive, toRefs, watch, computed } from 'vue'
import { useRoute } from 'vue-router'
export default {
  // 入口函数，默认执行一次， 里面没有this拿不到vue的实例。 优先级高于create生命周期
  // props：父组件传过来的。  context：代表当前的上下文
  setup () {
    const route = useRoute()
    // console.log('setup'); 
    const state = reactive ({
      selectedKeys: ['/'],
      count: 0
    })

    const selectedKeys = computed ( () => {
      return [route.path]
    })

  //两个函数参数   第三个参数是对象，属性immediate为ture时
    watch (() => route.path, (newVal) => {
      state.selectedKeys = [newVal]
    }, { immediate: true }) 

    return {
      ...toRefs(state),
      selectedKeys
    }

  }
}
</script>
<style lang="less">
#components-layout-demo-fixed .logo {
  width: 120px;
  height: 31px;
  background: rgba(255, 255, 255, 0.2);
  margin: 16px 24px 16px 0;
  float: left;
}
</style>
