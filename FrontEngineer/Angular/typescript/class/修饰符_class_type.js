var Person1 = /** @class */ (function () {
    function Person1() {
        this.name = 'ming';
        this.age = 20;
    }
    Person1.prototype.showName = function () {
        console.log(this.name);
    };
    return Person1;
}());
//默认修饰符是 public; 外部可以访问到类里面的属性和方法
var p = new Person1();
