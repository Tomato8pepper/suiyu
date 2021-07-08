//对象的增删改查
var mr = {
    name: 'object',
    age: 20,
    sex: 'boy',
    health: 100,
    smoke: function () {
        console.log('smoke is very cool!')
        mr.health--
    },
    drink: function () {
        console.log('drink is very cool!')
        mr.health++
    },
}
// mr.health++
mr.drink()
mr.smoke()
mr.smoke()
console.log(mr.health)
//增
mr.friend = 'function1'
console.log(mr.friend)
//查
mr.sex
console.log(mr.sex)
//改
mr.sex = '女'
console.log(mr.sex)
//删
delete mr.friend
console.log(mr)
//underfined
console.log(mr.friend)



// 对象的创建方法 -对象字面量  -构造函数
var a = {}       
b = new Object()

console.log('===========================自定义构造函数======================================')
function Car() {            //大驼峰式命名
    this.name = 'BMW'
    this.height = '1400'
    this.length = '4900'
    this.weight = 1000
    this.run = function(color, height){
        this.height = height;
        console.log(`the car is ${color}`)
    }
}

var car = new Car()
var car1 = new Car()
car.name = '大众'
car1.name = '蓝天'
car.run('green', 2000)
car1.run('red', 3000)
console.log(car)
console.log(car1)




//内部原理
/*
    1.在函数体最前面隐式加上一个this对象 this = {}
    2.执行 this.xxx = xxx
    3.隐式的返回这个this
    注意：构造函数中显示的return {}, 会干扰原来隐式的return值 (return 原始值不会
             number， string， Boolean， null， undefined)
*/
function Student(name, age, sex) {
    //var this = {
        // name: '',
        // age: ''
    // }
    this.name = name 
    this.age = age
    this.sex = sex
    this.grade = '2016'
    /*
        return 123
        return 'str'
        return {aaa: ''}
        return []
    */

    // return this
}
var student = new Student('mr', '20', 'boy')
console.log(student)



function Person(name, age) {
    var that = {}
    that.name = name
    that.age = age
    return that
}
var person = Person('mr', 18)
console.log(person)









