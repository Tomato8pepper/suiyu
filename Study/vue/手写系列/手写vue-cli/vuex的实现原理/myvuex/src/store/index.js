import Vue from 'vue'
import Vuex from './myVuex.js'

// vuex = {
//   Store: function() {}
// }

Vue.use(Vuex)
// Vue.use(Object || Function)

export default new Vuex.Store({
  state: {
    count: 333
  },
  mutations: {
    addCount(state, num) {
      state.count += num
    },
    reduceCount(state, num) {
      state.count -= num
    }
  },
  actions: {
    getReduceCount(context, num) {
      context.commit('reduceCount', num)
    }
  },
  modules: {
    
  },
  getters: {
    getCount: state =>{
      return state.count * 100
    }
  }
})
