function test() {
    
}
//函数也是对象，也能拥有属性。
//test.[[scope]] 隐式属性，不能拿出来用。
//作用域: 每个js函数都是一个对象，有些属性只能提供给js引擎存取。
//[[scope]]: 指的就是作用域，其中存储了运行期上下文的集合。
// 作用域链: [[scope]]中所存储的执行期上下文对象的集合，这个集合呈现出来的链式链接。






// Go: {
//     glob: undefined 100
//     a: function(){}
// }
// aAO: {
//     a: undefined 111
//     b: function(){}
// }
// bAO: {
//     b: undefined 222
// }






function a() {
    function b() {
        var b = 222
    }
    var a = 111
    b()
    console.log(a)  // 111
}
var glob = 100
a()

//a 定义 a.[[scope]]       ---> 0: GO:{}
//a 执行 a.[[scope]]       ---> 0: aAO:{}      1: GO:{}
//b 定义 a.[[scope]]       ---> 0: aAO:{}      1: GO:{}
//b 执行 a.[[scope]]       ---> 0: bAO:{}      1: aAO:{}      2: GO{} 
//b 执行完了，指向bAO的指针与a函数断开
//a 执行完了，aAO失效和bAO就都销毁了





