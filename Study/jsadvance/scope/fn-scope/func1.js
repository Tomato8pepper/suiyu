// 隐藏内部实现
// var b
// function foo(a) {
//     b = a + bar(a * 2)
//     console.log(b * 3)
// }

// function bar(a) {
//     return a - 1
// }
// console.log(foo(2))


function foo(a) {
    var b
    function bar(a) {
        return a - 1
    }
    b = a + bar(a * 2)
    console.log(b * 3)
}
foo(2)

// 规避冲突
console.log('=========================>>>')
function foo1() {
    function bar(a) {
        //全局变量
        // i = 3 

        var i = 3
        
        console.log(a + 1)
    }
    for (var i = 0; i < 10; i++) {
        bar(i * 2)
        
    }
}

foo1()
