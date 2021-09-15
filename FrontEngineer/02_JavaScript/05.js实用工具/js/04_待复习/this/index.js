// function identify(context) {
//     return context.toUpperCase()
// }

// function speak(context) {
//     let greeting = "Hello, I'm" + identify(context)
//     console.log(greeting)
// }

// speak('me')







// let me = {
//     name: 'wn'
// }

// function identify() {
//     console.log(this)          //this====>me
//     return this.name.toUpperCase()      //this====>me
// }

// function speak() {
//     console.log(this)        //this====>me
//     let greeting = "Hello, I'm" + identify.call(this) //this====>me
//     console.log(greeting)
// }
// speak.call(me)




// //this所处的词法作用域在哪里生效了，this作用域就指向哪里
// function foo() {
//     let person  = {
//         name: 'wn',
//         age: 18
//     }
//     // console.log(this.person.age)
//     console.log(this)   //window
// }
// function bar() {
//     let person  = {
//         name: 'wn',
//         age: 18
//     }
//     foo()
// }
// function bar1() {
//     let person  = {
//         name: 'wn',
//         age: 18
//     }
//     bar()
// }
// bar1()




// function foo() {
//     console.log(this.a)    // 2

// }
// var a = 2
// // window = {
// //     a: 2
// // }
// foo()


// function foo() {
//     'use strict'             //严格模式下，全局对象无法进行默认绑定，所以this指向了undefined
//     console.log(this.a)    // undefined
// }
// var a = 2
// foo()




// function foo() {             
//     console.log(this.a)    
// }
// (function () {
//     'use strict'
//     foo()             //严格模式下的foo的调用与位置无关
// })()
// var a = 2


// 隐式绑定
// 当函数引用在有上下文对象时，隐式绑定的规则就会把函数中的调用的this绑定到这个上下文对象
// function foo() {
//     console.log(this.a)

// }
// var obj = {
//     a: 2,
//     foo: foo
// }
// obj.foo()      //foo此刻被obj所用有


//隐式丢失
// 隐式绑定的函数会丢失绑定对象，他会应用默认绑定
// obj2.foo()是执行
// function foo() {
//     console.log(this.a)
// }
// var obj2 = {
//     a: 3,
//     foo: foo
// }
// var obj1 = {
//     a: 2,
//     obj2: obj2
// }
// obj1.obj2.foo()




//foo在obj里面并没有生效，在引用给全局变量bar时，进行了调用
// function foo() {
//     console.log(this.a)
// }
// var obj = {
//     a: 2,
//     foo: foo
// }
// var bar = obj.foo
// var a = 'hello'
// bar()



// 还是引用
// function foo() {
//     console.log(this.a)
// }
// function doFoo(fn) {   //参数传递其实是隐式赋值
//     fn()
// }
// var obj = {
//     a: 2,
//     foo: foo
// }
// // var bar = obj.foo
// var a = 'hello'
// doFoo(obj.foo)






function foo() {
    console.log(this.a)
}
var obj = {
    a: 2,
    foo1: foo
}
var bar = obj.foo1()
var a = 'hello'
console.log(bar)



