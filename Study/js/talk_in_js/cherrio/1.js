// 对象是由方法和属性构成  语法
// 1. 构建一只鸭子
// 2. 招募一千只鸭子
// 3. 完成任务

// JSON Object 对象字面量
var duck = {
    type: '煌上煌',
    yz: 99,
    duckSing: function() {
        console.log('嘎嘎嘎')
    }
}

var jiajun = {
    name: '佳俊',
    duckSing: function() {
        console.log('嘎嘎嘎');
    }
}

var xyl = {
    name: '谢元隆',
    duckSing:'嘎嘎嘎'
}

// const定义不可变的变量且必须初始化   var定义的变量可以修改，如果不初始化会输出undefined，不会报错。  let是块级作用域，函数内部使用let定义后，对函数外部无影响。
const xgg = [jiajun, xyl]  


// JS里面没有独立的Array类型
var cherrio;   
// console.log(cherrio);
// console.log(typeof cherrio) //undefined 没有赋值
cherrio = [];
// Array只是object中的一个字类型
// console.log(typeof cherrio); //object

for(var i = 0; i < 999; i++) {
    cherrio.push(duck);    //push()方法可以在数组的末属添加一个或多个元素
}

for(var i = 0; i < xgg.length; i++) {
    if(typeof xgg[i] == 'function') {            //if(!xgg[i].ducking)    if(xgg[i].ducking != undefined)
        cherrio.push (xgg[i])
    }
}

console.log(cherrio.length)

for(let singer of cherrio){                 // for( var i = 0; i < cherrio.length; i++){
    singer.duckSing();
}

if(cherrio.length === 1000){
    console.log('任务完成')
}

