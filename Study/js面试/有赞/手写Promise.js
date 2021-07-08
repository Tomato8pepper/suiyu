function MyPromise (fn) {
    this.value = undefined
    let self = this
    this.status = 'PENGING'
    function onResolve(value) {
        // console.log(value);
        self.status = 'FULFILLED'
        self.value = value
        self.onFulFilled && self.onFulFilled(value)
    }
    function onReject(reason) {
        
    }
    fn(onResolve, onReject)
}

MyPromise.prototype.then = function (fn) {
    if (this.status === 'FULFILLED') {
        fn(this.value)
    }else if( this.status === 'PENDING' ) {
        this.onFulFilled = fn
    }
}

new MyPromise ((resolve, reject) => {
    setTimeout(() => {
        resolve(123)
    }, 2000);
    // resolve(123);
})
.then((r) => {
    console.log(r);
})



//  ------
export default {
    data () {
        return {
            a: 123
        }
    },
    mounted () {
        for (let i = 0; i < 1000; i++) {
            this.a = 1   //渲染一次
        }
        Promise.resolve.then(() => render()) 
    }
}
function render () {}
//微任务(nextTick)里面