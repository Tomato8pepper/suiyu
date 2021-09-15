// null undefined 都没有原型
var num = 123
num.toString()    // '123'  包装类      ----> new Number(num).toString()
console.log(num.toString())
 
 
 
 
// 方法重写
Object.prototype.toString = function (){
    return 'hahaha'
}
function Person() {
    
}
var person = new Person()
console.log(person.toString())