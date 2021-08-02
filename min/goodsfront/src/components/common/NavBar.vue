<template>
  <div id="tmpl">
    <mt-header :title="title">
      <div @click="goback" slot="left">
        <mt-button icon="back">返回</mt-button>
      </div>
      <mt-button icon="more" slot="right"></mt-button>
    </mt-header>
  </div>
</template>

<script>
export default {
    name: 'nav-bar',
    props: ['title'],  //props属性在template中可以直接用
    data () {
        return {

        }
    },
    methods: {
        goback () {
            //根据历史记录返回
            this.$router.go(-1)
        }
    },
    created () {
        //这里使用this.title
    }
};
</script>

<style scoped>
#tmpl .mint-header{
    background-color:yellowgreen;
}
</style>