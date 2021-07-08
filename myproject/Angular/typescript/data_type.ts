//boolean, string, number, array.
let isOk:boolean;      //isOK 变量声明未赋值
let str:string; 
let num:number;
let nums:number[]; 


isOk= false;
str = 'abc';
num = 1;
nums = [1, 2, 3];

//any 任意类型
let arr:any[];
arr = ['a', 1, false]

// enum类型
    // 每周七天，以外的数据不需要了
    enum Week { One=23, Two, Three='type' };     //默认从0开始,跟数组索引类似

    // 使用枚举
    let w: Week;
    // 不能将key赋值给枚举类型
    w= Week.One;
    console.log(w);
    
    

    
    console.log('---[0]', Week[0]);       //undefined
    console.log('---One', Week.One);      //23
    

    //1.可以看成一个数组，默认是从0开始
    //2.也可以将Week看成一个对象，其key是双向的。既可以通过索引取key，也可以通过key取到数据

    
    