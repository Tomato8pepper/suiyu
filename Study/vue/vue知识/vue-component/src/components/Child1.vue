<template>
  <div class="child">
      <p>child1</p>
      <button @click="sendMsg">传值给2号</button>
  </div>
</template>

<script>
import bus from '@/utils/bus.js'
export default {
    data(){
        return{
            msg: '我是第一个里面的数据。'
        }
    },
    methods: {
        sendMsg() {
            bus.$emit('info', this.msg)
        }
    }
}
</script>

<style>

</style>