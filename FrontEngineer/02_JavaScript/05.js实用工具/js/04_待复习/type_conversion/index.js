// String Boolean Number Underfined Null Object
var s = '123'
console.log(Boolean(s))
console.log(Number('zm'))
console.log(parseFloat('12.35555 abc'))
console.log(parseInt('1.23 abc'))
console.log(String())


//原始值通过调用 String() Number()  Boolean()构造函数成为包装类对象
let b = new String(b)