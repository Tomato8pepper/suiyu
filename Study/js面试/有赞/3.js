// 面试题
function A() {
    this.name = 'n';
}
A.prototype.run = function () { console.log(`${this.name} run`); }
function B() {
    // A所有的属性  // ??
    A.call(this)
    this.email = 'email'
}
// 面试题精髓
B.prototype = A.__proto__
B.prototype.swim = function () {}
