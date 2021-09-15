// 函数
function obj () {}
obj.prototype.age = 1
let o = new obj()
obj.staticTest = 1 //静态属性
obj.staticFn = function () {}




// 类es6  实例可以访问静态属性，静态无法访问实例
class obj1 {
  static staticAge = 1
  static staticFn = function () {
    console.log('静态函数');
  }

  myAge = 123
  myFn () {
    console.log(this.myAge);
  }
}
let o1 = new obj1()
let os = obj1.staticAge
obj1.staticFn()
let ma = o1.myAge
o1.myFn()