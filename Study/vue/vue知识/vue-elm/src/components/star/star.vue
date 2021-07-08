<template>
  <div class="star">
    <li v-for="(item, index) in group" :key="index">
      <span class="star-pic" :class="item"></span>
    </li>
  </div>
</template>

<script>
export default {
  props: {
    seller: {
      type: Object,
      default() {
        return {};
      },
    },
  },
  data() {
    return {
      num: 0,
      group: []
    };
  },
  created() {
    setTimeout(() => {
      this.showStar();
    }, 1000);
  },
  methods: {
    showStar() {
      //   console.log(this.seller)
      this.num = Math.floor(this.seller.score);
      // console.log(this.num);
      for(let i = 0; i < this.num; i++){
          this.group.push('starOn')
      }
      for(let i = 0; i < 5 - this.num; i++){
          this.group.push('starOff')
      }
    },
  },
};
</script>
    
<style lang='stylus' scoped>
@import '../../common/stylus/mixin.styl';
.star
    display flex
    margin 0 115px
.star-pic 
    width 20px
    height 20px
    display inline-block
    margin-right 22px
.starOn
    width 20px
    height 20px
    background-size contain
    bg-image('star24_on')
.starOff
    width 20px
    height 20px
    background-size contain
    bg-image('star24_off')
</style>