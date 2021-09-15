// 函数中的作用域  气泡模式
function foo(a) {
    var b = 2 
    function bar () {
        console.log(4)
    }
    var c = 3
}

console.log(foo(1))
// console.log(a, b, c)
// console.log(bar())
// foo的作用域具备 a b c bar 这些标识符
// foo外部是访问不到这些标识符的