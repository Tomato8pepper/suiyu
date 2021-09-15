// let a = 2
// let b = 2
// let c = 3
// let [a, b, c] = [2, 2, 3]

// let [bar1, [[bar2], bar3]] = [1, [[2], 3]]

// let [ , , sy] = ['a', 'b', c]

// let [head, ...tail] = [1, 2, 3, 4]

//结构符 ...tail = []
// let [head, body, ...tail] = [1]

// let [a] = []          //undefined

// let [foo = true] = []

// let [a, b = 2] = [1, undefined]     //1 , 2
// let [a, b] = [str, null]        //str, null




//对象的解析
// let {obj1, obj2} = {obj1:'aaa', obj2:'bbb'}
// let obj = {
    // name: '老街',
    // age: 18
// }
// let{name, age} = obj
// console.log(name, age)

//foo是匹配模式， baz才是变量。
// let{foo: baz} = {foo: 'aaa', bar: 'bbb'}
// console.log(baz) //aaa

// let obj = {
//     name:'laojie',
//     desc: {
//         alone: false,
//         age: 20,
//         sanwei: [20, 30, 40]
//     }
// }
// let {name,desc:{alone, age},desc:{sanwei:[x, y, z]}} = obj
// console.log(name, alone, age, x, y, z)

let{x = 3} = {x: null}
console.log(x)  // null

// care
let y
({y} = {y : 1} )     //{x}代码块
console.log(y)

// 字符串的解构
let [a, b, c, d, e] = 'hello'
console.log(a, b, c, d, e)
let {length: len} = 'hello'
console.log(len)


//数值和布尔值的解构赋值
let{toString: s} = 123
console.log(s === Number.prototype.toString)
console.log(s)

let {toString: b1} = true
console.log(b1 === Boolean.prototype.toString)