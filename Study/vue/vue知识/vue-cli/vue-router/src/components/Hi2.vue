<template>
  <div class="h2">
      <p>我是hi2页面</p>
      <button @click="goBack">返回上一个页面</button>
  </div>
</template>

<script>
export default {
  methods: {
    goBack(){
      this.$router.push({path:'/hi', query:{name: 'mr'}})
    }
  }
}
</script>

<style>

</style>