<template>
  <div id="app"> 
    <mt-header fixed title="购物商城App"></mt-header>   
    <router-view class="tmpl"/>
    <mt-tabbar v-model="selected">
        <mt-tab-item id="Home">
          <img slot="icon" src="./static/imgs/index.png" />
          首页
        </mt-tab-item>
      <mt-tab-item id="Member">
        <img slot="icon" src="./static/imgs/vip.png" />
        会员
      </mt-tab-item>
      <mt-tab-item id="Shop">
        <img slot="icon" src="./static/imgs/shopcart.png" />
        购物车
      </mt-tab-item>
      <mt-tab-item id="Search">
        <img slot="icon" src="./static/imgs/search.png" />
        查找
      </mt-tab-item>
    </mt-tabbar>
  </div>
</template>

<script>
  export default {
    data () {
      return {
        selected: ''
      }
    },
    methods: {
      change (val) {
        console.log(val);
      }
    },
    watch: {
      selected: function (newV) {
        // console.log(newV)
        this.$router.push({ name: newV})
      }
    }
  }
</script>
<style scoped>

</style>