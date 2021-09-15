<template>
  <div class>
    <p>首页的子组件！！</p>
    <hr/>
    <h3>{{count}}</h3>
    <h2>{{countSum}}</h2>
    <h1>{{countReduce}}</h1>
    <div class="btn">
      <button @click="addAction">+</button>
      <button @click="reduceAction">-</button>
    </div>
  </div>
</template>

<script>
import store from "@/vuex/store.js";
import {mapMutations, mapState, mapGetters, mapActions} from "vuex"
export default {
  data() {
    return {
      msg: "hello world!",
    };
  },
//   methods: {
//       add(){
//           this.$store.commit('add', {num:10, num2:20})
//       },
//       reduce() {
//           this.$store.commit('reduce')
//       }
//   },
  methods: {
      /* vuex中可以直接修改state中的数据，vue则不能 */
      ...mapMutations(['add', 'reduce']),
      ...mapActions(['addAction', 'reduceAction']),
      
  },
  store,
//   computed: {
//       count() {
//           return this.$store.state.count
//       }

//   }
//   computed: mapState({
//       count: state => state.count
//   })
  computed: {
      ...mapState(['count']),
      ...mapGetters(['countSum', 'countReduce']),
  }
};
</script>

<style scoped>
.btn {
  padding: 10px;
}
</style>