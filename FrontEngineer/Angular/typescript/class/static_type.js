var Test = /** @class */ (function () {
    function Test() {
        this.age = 12;
    }
    Test.show = function () {
        // console.log(this.age); 不能访问
    };
    Test.prototype.myShow = function () {
        console.log(Test.myName);
    };
    Test.myName = '12';
    return Test;
}());
console.log(Test.myName);
Test.myName = 'abc';
console.log(Test.myName);
Test.show(); //模板遭遇实例的创建，不能访问实例属性；
// Test.myShow();     
var p = new Test();
