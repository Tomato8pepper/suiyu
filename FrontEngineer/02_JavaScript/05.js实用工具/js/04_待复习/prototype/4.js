// 私有变量
let _this = this

Person.prototype.name = 'wn'
function Person() {
    // var this = {
    //     _proto_: Person.prototype
    // }
}
var person = new Person()
console.log(person.name)


var obj = {
    name: 'mr'
}
console.log(person._proto_)      //原构造函数的原型
person._proto_ = obj             //修改实例的隐式原型
console.log(person._proto_)






// ？？？
Person1.prototype.name = '来这里'
function Person1() {
    // this = {
    //     _proto_: Person1.prototype
    // }
}
var person1 = new Person1()
Person1.prototype = {
    name: 'abc'
}
var person2 = new Person1()
console.log(person1.name)
console.log(person2.name)