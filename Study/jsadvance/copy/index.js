// 什么是拷贝     深拷贝与浅拷贝
// 浅拷贝  指向自己内存地址的指针复制给别人     
// let a = {age: 1}
// let b = a
// a.age = 2
// console.log(b)    {age : 2}



// Object.assign将多个对象进行拼接
// 深拷贝(不会受原数据影响的赋值操作)
let a = { age: 1 }
let c = { sex: 'nan', height: '000', name: 'zmg'}
let d = Object.assign(a, c)
a.age = 2
console.log(d)     //{ age: 1 }