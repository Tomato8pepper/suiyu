// 声明一个Person类
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person;
}());
var p1 = new Person('ming', 20);
console.log(p1);
