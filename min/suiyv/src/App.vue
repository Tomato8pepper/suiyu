<template>
  <div id="app">
    <mt-header title="商城购物系统"></mt-header>

    <transition name='fade' mode='out-in'>
      <router-view class="tmpl" />
    </transition>

    <mt-tabbar v-model="selected">
      <mt-tab-item id="Home">
        <img slot="icon" src="../static/img/index.png" />
        首页
      </mt-tab-item>
      <mt-tab-item id="Member">
        <img slot="icon" src="../static/img/vip.png" />
        会员
      </mt-tab-item>
      <mt-tab-item id="ShopCart">
        <img slot="icon" src="../static/img/shopcart.png" />
        购物车
      </mt-tab-item>
      <mt-tab-item id="Find">
        <img slot="icon" src="../static/img/find.png" />
        查找
      </mt-tab-item>
    </mt-tabbar>
  </div>
</template>

<script>
export default {
  name: "App",
  data () {
    return {
      selected: '',
    }
  },
  components: {},
};
</script>

<style scoped>
.fade-enter-active, .fade-leave-active {
  transition: opacity 1s;
}
.fade-enter, .fade-leave{
  opacity: 0;
}
</style>
