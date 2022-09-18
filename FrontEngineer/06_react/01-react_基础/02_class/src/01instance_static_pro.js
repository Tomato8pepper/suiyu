// 函数
function obj () {
  this.name = 'obj';
  this.fun1 = function () {
    console.log('obj的函数！');
  }
}
obj.prototype.age = 1
obj.staticTest = 1 //静态属性
obj.staticFn = function () {}
let o = new obj()
console.log('==', o);
console.log('==', obj.staticTest);




// 类es6  实例可以访问静态属性，静态无法访问实例
class obj1 {
  static staticAge = 1
  static staticFn = function () {
    console.log('静态函数');
  }

  myAge = 123
  myFn () {
    console.log('调用类属性', this.myAge);
  }
}
let o1 = new obj1()
// 实例不可以访问类的静态属性, 类可以
// o1.staticFn()
console.log(obj1.staticFn());

 