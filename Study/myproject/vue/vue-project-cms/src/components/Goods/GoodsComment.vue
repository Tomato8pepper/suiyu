<template>
  <div>
    <nav-bar></nav-bar>
    <comment :cid="$route.query.id"></comment>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  },
};
</script>

<style>
</style>