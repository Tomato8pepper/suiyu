<template>
  <ul>
      <slot></slot>
  </ul>
</template>

<script>
export default {
    name: 'my-ul'
}
</script>

<style scoped>
ul{
    padding: 0;
    margin: 0;
    overflow: hidden;
}
</style>