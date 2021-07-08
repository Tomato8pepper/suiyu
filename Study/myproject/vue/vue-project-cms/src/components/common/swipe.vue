<template>
  <mt-swipe :auto="4000">
    <mt-swipe-item v-for="(item, index) in imgs || myImgs" :key="index">
      <img :src="item.url || item.src" alt="" />
    </mt-swipe-item>
  </mt-swipe>
</template>

<script>
export default {
  name: "my-swipe",
  props: ["url", "imgs"],
  data() {
    return {
      // myimgs:this.imgs
      // myimgs的修改不会影响外部的this.imgs的重新渲染
      // 子接收父的属性再去做显示，也不能显示成功，内部执行时机问题
      // 总结: 暂且不把父子属性混为一谈，可能造成不显示或更新失败的问题
      myImgs: [
        {
          url: "https://scpic2.chinaz.net/Files/pic/pic9/202011/hpic3155_s.jpg",
          name: "title",
        },
        {
          url: "https://scpic.chinaz.net/Files/pic/pic9/202011/bpic21740_s.jpg",
        },
        {
          url:
            "https://scpic2.chinaz.net/Files/pic/pic9/202011/apic28944_s.jpg",
        },
      ],
    };
  },
  created() {
    // 父传递给子的组件，子在接收成为自己的属性后，发生改变的话，不会触发视图更新
    // if (this.url) {
    //   this.$axios
    //     .get(this.url)
    //     .then((res) => {
    //       console.log(res);
    //       this.myImgs = res.data.message;
    //     })
    //     .catch((err) => console.log(err));
    // }
  },
};
</script>

<style scoped>
.mint-swipe {
  width: 100%;
  height: 200px;
  margin-bottom: 30px;
}
.mint-swipe img {
  width: 100%;
}
</style>