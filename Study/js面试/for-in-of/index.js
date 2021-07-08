// const obj = {
//     a: 1,
//     b: 2
// }

// for(let i in obj) {
//     console.log(i);
// }

// const arr = ['12', '12', '213']
// for(let i of arr){
//     console.log(i);
// }

//in遍历的是key值
const ar = ['a', 'b']
ar.name = 'wn'

for(let i in ar) {
    console.log(i);
}


// 对象原型
let obj = {
    a: 1,
    b: 2
}
Object.prototype.c = 3
for(let i in obj) {
    console.log(i);
}
//报错
// for(let i of obj) {
//     console.log(i);
// }

// 数组原型 
let arr = ['11', '22', '33']
Array.prototype.c = 44
for(let i in arr) {
    console.log(i)
}
for(let i of arr){
    console.log('===',i)
}
/*
for in 和 for of的区别：
 1.for...in 循环返回的都是数据结构的键名，当数据结构是数组的话，key值就是下标
 2.不仅可以遍历数字键名，还会遍历原型上的值和手动添加的其他键
 特殊情况下for in遍历的顺序不会按照对象的顺序进行


for of
不能遍历对象
返回的是数组的元素

Symbol.iterator  任何数据结构后带了这个，就具有迭代器的接口
数组，Map，Set，String，arguments对象， Nodelist对象 都具有迭代器。
*/


// for-in 和 for-of 的区别？ 输出顺序是什么？ 数字为什么这样排序？


/* 
对象中的常规属性(在jsv8引擎中有一个properties的线性结构)和排序属性(在jsv8引擎中有一个element的线性结构)
对象中的数字会被优先遍历，且按照顺序遍历。 ECMAScript 规范中定义了 【数字属性应该按照索引值的大小升序排列，字符串属性根据创建时的顺序升序排列】
*/
function Foo() {
    this[100] = 'test-100',
    this[1] = 'test-1',
    this['b'] = 'bar-b',
    this[50] = 'test-50',
    this[9] = 'test-9',
    this[8] = 'test-8',
    this[3] = 'test-3',
    this[5] = 'test-5',
    this['A'] = 'test-a',
    this['C'] = 'test-c'
}
let bar = new Foo()
for(let key in bar) {
    console.log(`index: ${key} value:${bar[key]}`);
}