// var name 变量提升
/*console.log(name)
var name = 'zha ming'*/




// 没得 let i
/*  for (let i = 0; i < 10; i++){
     console.log(i)
    }
 console.log(i)*/



// var a = [function(){console.log(i)}], ..., function(){console.log(i)}
// 当循环里面i由var定义i的值是最后一次赋的值    var i
/*var a = []
for (let i = 0; i < 10; i++) {
    a[i] = function () {
        console.log(i)
    }
}*/
// 当循环结束后执行  为let的时候，i每次使用的时候都会重新定义一个块级变量i，但是之前给i赋的值会有一个标记。
// a[3]()




/*for(let i = 0; i < 0; i++){     //父作用域
    let i = 'zmg'               //子作用域
    console.log(i)
}*/



/*var tem = 123
console.log(tem)     //123
if(true){
    tem = 'abc'
    console.log(tem) //暂时性死区 Cannot access 'tem' before initialization
    let tem          //局部变量tem 在if里面优先性大于全局变量 tem   人称清场
}*/


// let i = 1
// let i = 2   //Identifier 'i' has already been declared


const num = 100
const a = 2    //必须赋初值
console.log(a)



