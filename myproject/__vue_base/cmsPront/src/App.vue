<template>
  <div>
    <!-- 头部 -->
    <mt-header title="信息管理系统"></mt-header>
    <router-view class="tmpl"/>
    <!-- 底部 -->
    <mt-tabbar v-model="selected">
      <mt-tab-item id="Home" >
        <img slot="icon" src="@/assets/index.png" />
        首页
      </mt-tab-item>
      <mt-tab-item id="Member">
        <img slot="icon" src="@/assets/vip.png" />
        会员
      </mt-tab-item>
      <mt-tab-item id="Shop">
        <img slot="icon" src="@/assets/shopcart.png" />
        购物车<mt-badge size="small" type="error">{{totalNum}}</mt-badge>
      </mt-tab-item>
      <mt-tab-item id="Search">
        <img slot="icon" src="@/assets/find.png" />
        我的
      </mt-tab-item>
    </mt-tabbar>
  </div>
</template>

<script>
import myBus from './myBus'
export default {
  name: "App",
  data () {
    return {
      selected: '',
      totalNum: 0,
    }
  },
  watch: {
    // 不能使用箭头函数，因为this会向上绑定
  selected: function (newVal, oldVal) {
      console.log(newVal);
      // console.log(this);
      this.$router.push({name: newVal})
    }
  },
  created() {
    myBus.$on('addShopcart',(num)=>{
      this.totalNum += num;
    }); 
    myBus.$on('shopcartNum',(num)=>{
      this.totalNum = num;
    });
  },
}
</script>

<style scoped>
.mint-tabbar{
  position: fixed;
  bottom: 0;
  z-index: 999;
}
</style>
