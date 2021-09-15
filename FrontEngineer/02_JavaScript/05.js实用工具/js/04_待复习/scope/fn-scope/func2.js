var a = 2
function foo() {
    console.log(a)
    var a = 3
    console.log(a)
}
foo()
console.log(a)


//自执行函数
var a1 = 2;
    (function foo1() {     //函数表达式
        var a1 = 3
        console.log(a1)
    })()

console.log(a1)

// 自执行函数很好的隐藏作用域