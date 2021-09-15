Person.prototype.lastName = 'frank'
function Person(name) {
    this.name = name
}
var person =new Person('mr')

// 修改
console.log(person.lastName)
Person.prototype.lastName = 'YU'
console.log(person.lastName)

// 删除
delete Person.prototype.lastName
console.log(person.lastName)






function Bus() {
    
}
Car.prototype = {
    constructor: Bus
}
function Car() {
    
}
var car = new Car()
console.log(car)
console.log(car.constructor)
console.log(Car.prototype)

//constructor 为了让Car()构造出的所有的对象都能找到它的自己的构造器

console.log(car.constructor)