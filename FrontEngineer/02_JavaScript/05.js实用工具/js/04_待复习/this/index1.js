//显示绑定 call apply bind
//b.call(null)      b.apply(null)   ==> window

var a = {
    user: 'wn',
    fn: function (e, d, f) {
        console.log(this.user)
        console.log(e, d, f)
    }
}
var b = a.fn
var c = b.bind(a, 10)
c(1, 2, 3)


console.log('=================================================================================>')
let a1 = {
    name: 'wn',
    age: 18,
    sex: 'men',
    hobby: 'play basketball'
}
let str = 'aaaadfdsfsdfsef'
let map = new Map()
console.log(map.set(a1, 'a1'))
let s = new Set(str)





















function fn() {
    return new Promise(resolve => {

        console.log('first')
        resolve()

    })
}
fn().then(() => {
    console.log('second')
}).catch((e) => {
    console.log(e)
})