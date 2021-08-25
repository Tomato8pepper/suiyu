import vuex from 'vuex'
import num from './num'
import Vue from 'vue'

Vue.use(vuex)

export default new vuex.Store({
    modules: {
        num
    }
})