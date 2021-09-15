<template>
  <div>
      <img src="../../assets/2.jpg" alt="">
  </div>
</template>
<script>
import MintUI from 'mint-ui'
export default {
  data() {
    return {};
  },
  watch: {
    $route(to, from) {
      console.log("kk", to);
      console.log("kk1", from);
    },
  },
  created() {
    MintUI.Indicator.open({
      text: "小猿正在加班加点开发，敬请期待...",
      spinnerType: "fading-circle",
    });
    setTimeout (() => {
        MintUI.Indicator.close()
        this.$router.push('/')
    }, 3000)
  },
};
</script>
<style scoped>
img{
    width: 100%;
    height: 600px;
}
</style>