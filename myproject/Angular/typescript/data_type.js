//boolean, string, number, array.
var isOk; //isOK 变量声明未赋值
var str;
var num;
var nums;
isOk = false;
str = 'abc';
num = 1;
nums = [1, 2, 3];
//any 任意类型
var arr;
arr = ['a', 1, false];
// enum类型
// 每周七天，以外的数据不需要了
var Week;
(function (Week) {
    Week[Week["One"] = 23] = "One";
    Week[Week["Two"] = 24] = "Two";
    Week["Three"] = "type";
})(Week || (Week = {}));
; //默认从0开始,跟数组索引类似
// 使用枚举
var w;
// 不能将key赋值给枚举类型
w = Week.One;
console.log(w);
console.log('---[0]', Week[0]); //undefined
console.log('---One', Week.One); //23
//1.可以看成一个数组，默认是从0开始
//2.也可以将Week看成一个对象，其key是双向的。既可以通过索引取key，也可以通过key取到数据
