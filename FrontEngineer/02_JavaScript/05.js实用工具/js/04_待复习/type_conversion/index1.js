//一元操作符
// 隐式类型转换
// 1 ==> '1'
console.log(1 + '1')    //11
// '1' ==> 1
console.log(11 - '1')  //10
// + 调用ToNumber()来处理该值   ==  Number()
console.log(+'1')
// [] = 0
console.log(+[])
// ToPrimitive(input, [preferredType])  input 输入值        preferredType 非必填项，表示期望转换的值 Number 和 String
// 如果第二个参数没传，并且当input是日期类型是，preferredType相当于String， 其他情况都相当于Number

// ToPrimitive(obj, Number)
// 1.如果obj是基本类型，直接返回
// 2.否则调用valueOf，如果返回一个原始值，则js将其返回
// 3.否则调用toString，如果返回一个原始值，则js将其返回
// 4.否则，js抛出一个类型错误异常.


// ToPrimitive(obj, String)
// 1.如果obj是基本类型，直接返回
// 2.否则调用toString，如果返回一个原始值，则js将其返回
// 3.否则调用valueOf，如果返回一个原始值，则js将其返回
// 4.否则，js抛出一个类型错误异常.


console.log(+['1'])

console.log(+{})        //会报错      NaN





// 二元操作符
// val1 + val2  =>  ToPrimitive(val1) + ToPrimitive(val2)
// null + 1   Number(null) = 0    0 + 1 = 1
// [] + []    [].valueOf()   []         [].valueOf().toString() = ""
// [] + {}
// {} + {}