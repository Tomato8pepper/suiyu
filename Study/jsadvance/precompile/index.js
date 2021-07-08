//声明提升
// var b = 123
// console.log(b)

//函数整体声明提升
// test()
// function test() {
//     var a = 111
//     console.log('hello', a)
// }


// var a = 1
// function fn(a) {
//     var a = 2
//     function a() { }
//     console.log(a)

// }
// fn(3)


// var a1 = 123
// console.log(window.a1)













// AO1: {
//     a2: undefined 1 123,
//     b: undefined function () {},
//     d: undefined function d() {...} 123,
//     d1: function d1() {...}
// }

// AO2: {
//     d: undefined 123
// }





function fn1(a2) {
    console.log(a2) // 1

    var a2 = 123
    console.log(a2) // 123

    function a2() { }
    console.log(a2) // 123

    var b = function () { }
    console.log(b) // function () { }

    function d() { }
    var d = a2
    console.log(d) // 123

    function d1() {
        var d = a2
        console.log(d) //123
    }
    d1()
}



fn1(1)









// AO: {
//     a: undefined 1 3
//     b: undefined function(){} 2
//     c: undefined 0 
//     d: function(){}
// }



// function test(a, b) {
//     console.log(a)
//     c = 0
//     var c
//     a = 3
//     b = 2
//     console.log(b)
//     function b() {}
//     function d() {}
//     console.log(b)

// }
// test(1)





// 全局
// 预编译
// GO: {
//     global: undefined  100
//     fn: function() {}
// }

// AO: {

// }

// var global = 100
// function fn() {
//     console.log(global)
// }
// fn()




// GO: {
//     global: undefined 100
//     fn: function(){}
// }
// AO: {
//     global: undefined 200 300
// }


// global = 100
// function fn() {
//     // 如局部未定义则值为100
//     console.log(global)    //undefined
//     global = 200
//     console.log(global)    //200
//     var global = 300 
// }
// fn ()
// var global;

