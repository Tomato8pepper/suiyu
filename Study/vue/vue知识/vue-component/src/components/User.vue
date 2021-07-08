<template>
  <div class="user">
    <p>{{userName}}</p>
    <button @click="toParent">向父组件传值</button>
    <button @click="toBrother">向兄弟组件传值</button>
  </div>
</template>

<script>
export default {
  props: ["userName", "username"],
  data() {
    return {
      name: "小颖",
    };
  },
  methods: {
    toParent: function () {
      this.$emit("event1", this.name);
    },
    toBrother: function () {
      this.$emit("event2", this.name);
    },
  },
};
</script>

<style>
</style>