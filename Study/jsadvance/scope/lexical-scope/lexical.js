//欺骗词法作用域

function foo(str, a) {
    'use strict'
    eval(str)
    console.log(b, a)
}
var b = 2 
foo('var b = 3', 1)






var obj = {
    a: 1,
    b: 2,
    c: 3
}

// with (obj) {
//     a = 100
//     b = 200
//     c = 300
// }
console.log('==========> obj')
console.log(obj)


// with 的缺点
    function foo2(obj) {
        // obj.a = 2
        with (obj) {
            a = 2
        }
    }

    var o1 = {
        a: 3
    }

    foo2(o1)
    console.log('============> o1对象')
    console.log(o1.a)

    var o2 = {
        b: 3
    }
    foo2(o2)
    console.log('==================> o2对象')
    console.log(o2.a)
    console.log(a)