// 包装类
//原始值是没有属性值和方法，并且是对象独有的


//创建number字面量
var num = 123
num.abc = 'aaa'
console.log(num) // 123


// 创建number对象
var nm = new Number(123)
nm.abc = 'aaa'
console.log(nm) // {123, abc: '123'}
//参与运算就变回数字，不参与运算可以当做对象来用，能有属性和方法，同理字符串和布尔也一样，但是null和undefined不可以这样
console.log(nm * 2)



// why.............
var str = 'abcd'
console.log(str.length)

var n = 4
n.len = 3
console.log('kk', num.len)


//隐式过程
var numb = 4
numb.len = 3    //new Number(4).len = 3; 
console.log('kkk', numb.len)     //delete len; new Number(4).len;  在打印



//考点 
var arr = [1, 2, 3, 4, 5] 
arr.length = 2
console.log(arr)

var str = 'abcd'
str.length = 2
console.log(str.length)
/* 
    new String('abcd').length = 2
    delete str.length
    new String('abcd').length
    字符串对象，天生就具备length属性
*/ 




// albb面试题
var str = 'abc'
str += 1 // abc1
var test = typeof(str) //String
if(test.length == 6){
    test.sign = 'typeOf的返回结果可能为String'
}
console.log(test.sign)   // underfined


