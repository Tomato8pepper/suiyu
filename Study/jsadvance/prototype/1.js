/*
原型
    1.定义：原型是函数function对象的一个属性(可读可写),他定义了构造函数制造出对象的公共祖先。通过该构造函数产生的对象，可以继承原型上的属性和方法，原型也是对象     [[scope]](不可读也不可写)
    2.作用：利用原型的特点和概念，可以实现公有属性
*/

// Person.prototype = {}        --原型，函数被定义出来，就天生具备的属性。
Person.prototype.age = '18'
Person.prototype.say = function () {
    console.log('你好！')
}

function Person() {
    this.name = 'mr'

}
var person = new Person()
console.log(person.name)
console.log(person.age)          //从原型上继承来的


var person1 = new Person()
console.log(person1.age)

person.say()
person1.say()
