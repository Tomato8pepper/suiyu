//Vuex本质上是对象
//Vuex对象有两个属性，一个是install方法，一个是Store这个类。
//install方法的作用是将store这个实例挂载到所有的组件上
//Store这个类拥有commit，dispatch这些方法， Store类里面将传入的state包装成data， 作为new Vue的参数
import Vue from 'vue'
class Store {
    constructor(options){
        // state
        this.vm = new Vue({
            data: {
                state: options.state
            }
        })
        // this.state = options.state || {}

        // getters
        let getters = options.getters || {}
        this.getters = {}
        Object.keys(getters).forEach(getterName => {
            Object.defineProperty(this.getters, getterName, {
                get: () =>{
                    return getters[getterName](this.state)
                }
            })
        })

        // mutations
        let mutations = options.mutations || {}
        this.mutations = {}
        Object.keys(mutations).forEach(mutationName => {
            this.mutations[mutationName] = (args) => {
                mutations[mutationName](this.state, args)
            }
        })

        // actions
        let actions = options.actions || {}
        this.actions = {}
        Object.keys(actions).forEach(actionName =>{
            this.actions[actionName] = (args) => {
                actions[actionName](this, args)
            }
        })
    }
    dispatch(method, args) {
        this.actions[method](args)
    }
    commit(method, arg) {
        this.mutations[method](arg)
    }
    get state() { //属性自动触发
        return this.vm.state
    }
}

let install = function (Vue) {
    Vue.mixin({
        beforeCreate() {
            if(this.$options && this.$options.store) { //如果是根组件
                this.$store = this.$options.store
            }else{ // 如果是子组件
                this.$store = this.$parent && this.$parent.$store
            }
        }
    })
}

let Vuex = {
    Store,
    install
}

export default Vuex