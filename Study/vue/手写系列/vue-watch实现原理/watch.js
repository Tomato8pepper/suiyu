//能独立监听某个数据的变化
// 提供可执行函数的场所
class watcher {
    constructor (opts) {
        this.$data = this.getBaseType(opts.data) === 'Object' ? opts.data : {}
        this.$watch = this.getBaseType(opts.watch) === 'Object' ? opts.watch : {}
        for(let key in opts.data) {
            this.setData(key)
        }
    }

    getBaseType(target) {
        const typeStr = Object.prototype.toString.call(target)
        return typeStr.slice(8, -1)      //从1开始   开区间     从-1开始
    }
    setData(_key) {
        //第一个参数是this 相当于this.$data = this
        Object.defineProperty(this, _key, {             //Object.defineProperty(this)把上下文指向当前对象
            get: function(){
                return this.$data[_key]
            },
            set: function(newVal){
                const oldVal = this.$data[_key]
                if(oldVal === newVal){
                    return newVal
                }
                this.$data[_key] = newVal
                this.$watch[_key] && this.getBaseType(this.$watch[_key]) === 'Function' && (
                    this.$watch[_key].call(this, newVal, oldVal)
                )
                return newVal
            }
        })
    }
}

let vm = new watcher({
    data: {
        a: 0,
        b: 'hello'
    },
    watch: {
        a(newVal, oldVal) {
            console.log(newVal, oldVal);
        }
    }
})

setTimeout(() => {
    vm.a = 1
}, 1000);




// cli  router  v-model  watch   vuex