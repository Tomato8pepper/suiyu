//声明一个any类型并赋值
let myAny : any;
myAny = 'abcd'

// 声明一个string
let str : string;
str = myAny;         //目前可以赋值

// 正面操作(断言)  (强转)
str = <string>myAny;

// 正面操作(断言)
str = myAny as string;