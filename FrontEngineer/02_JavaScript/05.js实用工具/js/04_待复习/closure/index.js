console.log('1==============================================1')
// function test() {
//     var arr = []
//     for (var i = 0; i < 10; i++) {
//         (function (j) {
//             arr[j] = function () {
//                 console.log(j)
//             }
//         })(i)
       
//     }
//     return arr
// }

// var myArr = test()
// for (var j = 0; j < 10; j++) {
//     myArr[j]()
// }









// 闭包: 当内部函数被保存到了外部时，将会产生闭包
// 缺点：会造成内存泄漏: 会导致原有的作用域链不释放、
// 作用: (1)实现公有变量   (2)做缓存   (3)可以实现封装，属性的私有化   (4)模块化开发，防止污染全局变量






console.log('闭包======================================')
// GO: {
// glob: undefined 100
// demo: function(){}
// a: function(){}
// }
// aAO: {
// aaa:undefined  123
// b: function(){}
// }
// bAO: {
// bbb: undefined  234    
// }

// function a() {
//     function b() {
//         var bbb = 234
//         console.log(aaa)      //这就是closure(闭包)
//     }
//     var aaa = 123
//     return b
// }
// var glob = 100
// var demo = a()
// demo()






console.log('公有变量============================')
//实现一个函数执行出来的结果都是累加的
// function test() {
//     var count = 0
//     return function a (){
//         count++
//         console.log(count)
//     }
// }
// let fn = test()
// fn()
// fn()
// fn()


// let fn1 = test()
// fn1()
// let fn2 = test()
// fn2()
// let fn3 = test()
// fn3()




// console.log('做缓存==========================')
// function test() {
//     var food = 'apple'
//     function a() {
//         console.log(food)
//         var food = 'banana'
//     }
//     a()
//     function b() {
//         console.log(food)
//     }
//     b()
// }
// test()






//想一个办法把这两个函数返回出来
//由于fruit中返回了obj对象，所以函数eatFood函数和pushFood与fruit函数形成了闭包
// eatFood的执行产生了eAO，pushFood产生了PAO，fruit的执行产生了fAO，而eatfoo和pushFood共享fAO里面的food
function fruit () {
    var food = 'apple'
    var obj = {
        eatFood: function () {
            if(food != ''){
                console.log(`I am eating ${food}`)
                food = ''
            }
            else{
                console.log('There is nothing!')
            }
        },
        pushFood: function (myfood) {
            food = myfood
        }
    }
    return obj
}
var person = fruit()
person.eatFood()
person.eatFood()
person.pushFood('banana')
person.eatFood()