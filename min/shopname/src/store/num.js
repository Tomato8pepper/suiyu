export default {
    state: {
        num: 0
    },
    getters: {
        getNum (state) {
            return state.num
        }
    },
    mutations: {
        addNum (state, num) {
            state.num += num
        },
        changeNum (state, num) {
            state.num = num
        }
    },
    actions: {
        addNumByAc({commit}, num) {
            commit('addNum', num)
        },
        changeNumByAc({commit}, num) {
            commit('changeNum', num)
        }
    }
}