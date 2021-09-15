import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

const state = {
    count: 1
}
const getters = { 
    countSum: (state)=> {
        return state.count += 100
    },
    countReduce: (state)=> {
        return state.count -= 100
    }

}
// 同步
const mutations = {
    add(state) {
        state.count++
    },
    reduce(state) {
        state.count--
    }
}
// 异步
const actions = {
    // 提交mutation中的方法
    addAction(context) {
        context.commit('add')
    },
    reduceAction(context){
        context.commit('reduce')
    }

}
const moduleA = {
    state,
    mutations,
    getters,
    actions
}

export default new Vuex.Store({
    modules: {
        a: moduleA,
    }
})




