<template>
  <div id="app">
      <Com1></Com1>
  </div>
</template>

<script>
import Com1 from './com.vue'
export default {
components: {
    Com1,
},
beforeCreate () {
  console.log('在node环境控制台输出的');
},
mounted () {
  console.log('在前端环境控制台输出。');
}
}
</script>

<style>

</style>