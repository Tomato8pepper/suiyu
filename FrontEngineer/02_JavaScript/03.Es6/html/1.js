for (var i = 0; i < 2; i++) {
    setTimeout(() => {
        console.log('======', i);
    }, 0);
    console.log(3)
}

var a = '2'
var b = 3
console.log(++b+a)



console.log("------")
var age=18;
    var o={
        age:10,
        say(){
            //age是一个属性
            console.log(this.age);

            //age是一个变量
            //-->age这个变量来自于哪里？-->作用域链
            //  -->发现age是全局作用域中声明的变量，age：18
            console.log(age);
        }
    }
    o.say();    //10