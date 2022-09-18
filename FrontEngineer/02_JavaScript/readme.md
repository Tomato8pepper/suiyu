[阮一峰](https://es6.ruanyifeng.com/)
[js](https://developer.mozilla.org/zh-CN/)

☆ [BOM](https://blog.csdn.net/qq_24401529/article/details/93337456)

☆ 构造函数（原型）、this（bind）、作用域（闭包）、

☆ 浅拷贝与深拷贝

☆ 闭包对页面的影响
    使用闭包会占有内存资源，过多的使用闭包会导致内存溢出等。

☆ Object.create(proto)
    proto：新对象的原型对象。   无原型对象：Object.create(null)

☆ strict模式
    更加规范、比如未声明的变量不可以使用

☆ typeof('')  xxx instanceof []

☆ [继承类型]:(https://juejin.cn/post/6844903475021627400)




# JS高级第一天
## JS基本介绍
+ JS的用途：Javascript可以实现浏览器端、服务器端(nodejs)。。。
+ 浏览器端JS由以下三个部分组成：
    - ECMAScript：基础语法(数据类型、运算符、函数。。。)
    - BOM(浏览器对象模型)：window、location、history、navigator。。。
    - DOM(文档对象模型)：div、p、span。。。
+ ECMAScript又名es，有以下重大版本：
    - 旧时代：
        - es1.0。。。es3.1
    - 新时代：
        - es5
        - es6(es2015)
        - es7(es2016)、es8(es2017)

## 数据类型
+ 基本数据类型——值类型：(数字、字符串、布尔值、null、undefined)
    - undefined类型？
+ 复杂数据类型——引用类型：(对象)
    - 数组
    - 函数
    - 正则表达式
    - Date

## 对象的基本使用
### 创建一个对象
```js
    var student={ 
        name:"李白" , //student有一个name属性，值为"李白"
        grade:"初一" ,
        //a、student有一个say属性，值为一个函数
        //b、student有一个say方法
        say:function(){
            console.log("你好");
        },
        run:function(speed){
            console.log("正在以"+speed+"米/秒的速度奔跑");
        }
    }
```

### 对象是键值对的集合：对象是由属性和方法构成的 (ps：也有说法为：对象里面皆属性，认为方法也是一个属性)
+ name是属性    grade是属性
+ say是方法     run是方法

### 对象属性操作
#### 获取属性：
#### 第一种方式：.语法
+ student.name      获取到name属性的值，为："李白"
+ student.say       获取到一个函数

#### 第二种方式：[]语法
+ student["name"]   等价于student.name
+ student["say"]    等价于student.say

#### 号外：2种方式的差异：
+ .语法更方便，但是坑比较多(有局限性)，比如：
    - .后面不能使用js中的关键字、保留字(class、this、function。。。)
    - .后面不能使用数字
```js
    var obj={};
    obj.this=5; //语法错误
    obj.0=10;   //语法错误
```

+ []使用更广泛
    - o1[变量name]
    - ["class"]、["this"]都可以随意使用 `obj["this"]=10`
    - [0]、[1]、[2]也可以使用       
        - `obj[3]=50 = obj["3"]=50`     
        - 思考：为什么obj[3]=obj["3"]
    - 甚至还可以这样用：["[object Array]"]
        - jquery里面就有这样的实现
    - 也可以这样用：["{abc}"]
        - 给对象添加了{abc}属性

#### 设置属性
+ `student["gender"]="男"`    等价于：    `student.gender="男"`
    - 含义：如果student对象中没有gender属性，就添加一个gender属性，值为"男"
    -      如果student对象中有gender属性，就修改gender属性的值为"男"
+ 案例1：`student.isFemale=true`
+ 案例2：`student["children"]=[1,2,5]`
+ 案例3：
```js
    student.toShanghai=function(){   
        console.log("正在去往上海的路上")   
    }
```

#### 删除属性
+ delete student["gender"]      
+ delete student.gender



## 通过构造函数创建对象
### 构造函数创建对象的例子：
+ var xiaoming = new Object()     -->   var xiaoming = {};  
+ var now = new Date() 
+ var rooms = new Array(1,3,5)    -->   var rooms = [1,3,5]
+ `var isMale=/123/;`   ==> `var isMale=new RegExp("123")`
    - isMale是通过RegExp构造函数创建出来的对象
    - isMale是RegExp构造函数的实例

+ 以上例子中，Object、Date、Array都是内置的构造函数

## 自定义一个构造函数来创建对象
+ 构造函数
```js
    function Person(name,age){
        this.name=name;
        this.age=age;
    }
    var p1=new Person("赵云",18)
```
+ 说明：`p1就是根据【Person构造函数】创建出来的对象`

### 构造函数的概念
+ 任何函数都可以当成构造函数
    `function CreateFunc(){ }`
+ 只要把一个函数通过new的方式来进行调用，我们就把这一次函数的调用方式称之为：构造函数的调用
    - new CreateFunc(); 此时CreateFunc就是一个构造函数
    - CreateFunc();     此时的CreateFunc并不是构造函数

### 关于new Object()
+ new Object()等同于对象字面量{}

### 构造函数的执行过程
`var p1=new Person();`
+ 1、创建一个对象 (我们把这个对象称之为Person构造函数的实例)- `_p1 `
+ 2、创建一个内部对象，`this`，将this指向该实例(_p1)
+ 3、执行函数内部的代码，其中，操作this的部分就是操作了该实例(_p1)
+ 4、返回值：
    - a、如果函数没有返回值(没有return语句)，那么就会返回构造函数的实例(p1)
    - b、如果函数返回了一个基本数据类型的值，那么本次构造函数的返回值是该实例(_p1)
    ```js
        function fn(){
            
        }
        var f1=new fn();    //f1就是fn的实例

        function fn2(){
            return "abc";
        }
        var f2=new fn2();   //f2是fn2构造函数的实例
    ```
    - c、如果函数返回了一个复杂数据类型的值，那么本次函数的返回值就是该值
    ```js
        function fn3(){
            return [1,3,5]; 
            //数组是一个对象类型的值，
            //所以数组是一个复杂数据类型的值
            //-->本次构造函数的真正返回值就是该数组
            //-->不再是fn3构造函数的实例
        }
        var f3=new fn3();   //f3还是fn3的实例吗？错
        //f3值为[1,3,5]
    ```



## 继承
### JS中继承的概念：
+ 通过【某种方式】让一个对象可以访问到另一个对象中的属性和方法，我们把这种方式称之为继承  `并不是所谓的xxx extends yyy`

### 为什么要使用继承？
+ 有些对象会有方法(动作、行为)，而这些方法都是函数，如果把这些方法和函数都放在构造函数中声明就会导致内存的浪费
```js
    function Person(){
        this.say=function(){
            console.log("你好")
        }
    }
    var p1=new Person();
    var p2=new Person();
    console.log(p1.say === p2.say);   //false
```

### 继承的第一种方式：原型链继承1
```js
    Person.prototype.say=function(){
        console.log("你好")
    }
```
+ 缺点：添加1、2个方法无所谓，但是如果方法很多会导致过多的代码冗余

### 继承的第二种方式：原型链继承2
```js
    Person.prototype = {
        //切记不能忘记
        constructor:Person,
        say:function(){
            console.log("你好");
        },
        run:function(){
            console.log("正在进行百米冲刺");
        }
    }
```
+ 注意点：
+ a、一般情况下，应该先改变原型对象，再创建对象
+ b、一般情况下，对于新原型，会添加一个constructor属性，从而不破坏原有的原型对象的结构

### 继承的第三种方式：拷贝继承(混入继承：mixin)
+ 场景：有时候想使用某个对象中的属性，但是又不能直接修改它，于是就可以创建一个该对象的拷贝
+ 实际运用：
    - jquery：$.extend：编写jquery插件的必经之路
        - 基于jquery封装一个表格控件

```js
    var o1={ age:2 };

    var o2 = o1;
    o2.age=18;      
    //1、修改了o2对象的age属性
    //2、由于o2对象跟o1对象是同一个对象
    //3、所以此时o1对象的age属性也被修改了
```
```js
    var o3={gender:"男",grade:"初三",group:"第五组",name:"张三"};
    var o4={gender:"男",grade:"初三",group:"第五组",name:"李四"};
    //上述代码中，如果使用拷贝继承对代码进行优化会非常和谐

    //实现拷贝继承：
    //1、已经拥有了o3对象
    //2、创建一个o3对象的拷贝(克隆)：for...in循环
    

    //3、修改克隆对象，把该对象的name属性改为"李四"
    
```

+ 实现1：
```js
    var source={name:"李白",age:15}
    var target={};
    target.name=source.name
    target.age=source.age;
```

+ 浅拷贝和深拷贝
    - 浅拷贝只是拷贝一层属性，没有内部对象
    - 深拷贝其实是利用了递归的原理，将对象的若干层属性拷贝出来
    ```js
        var students=[
            {name:"",age:""},
            {name:"",age:""}
        ]
    ```

+ 上面的方式很明显无法重用，实际代码编写过程中，很多时候都会使用拷贝继承的方式，所以为了重用，可以编写一个函数把他们封装起来：
```js
    function extend(target,source){
        for(key in source){
            target[key]=source[key];
        }
        return target;
    }
    extend(target,source)
```

+ 由于拷贝继承在实际开发中使用场景非常多，所以很多库都对此有了实现
    - jquery：$.extend

+ es6中有了 <对象扩展运算符> 仿佛就是专门为了拷贝继承而生：
    - 优点：简单的令人发指
```js
    var source={name:"李白",age:15}
    //让target是一个新对象，同时拥有了name、age属性
    var target={ ...source }
    
    var target2={ ...source,age:18 }
```

### 继承的第四种方式：原型式继承：(道格拉斯在蝴蝶书中提出来的)
+ 场景：
    - a、创建一个纯洁的对象：对象什么属性都没有
    - b、创建一个继承自某个父对象的子对象
        ```js
            var parent={ age:18,gender:"男"};
            var student=Object.create(parent);
            //student.__proto__===parent
        ```
+ 使用方式：
    - 空对象：Object.create(null)
    - 
    ```js
        var o1={ say:function(){} }
        var o2=Object.create(o1);
    ```

### 继承的第五种方式：借用构造函数实现继承
+ 场景：适用于2种构造函数之间逻辑有相似的情况
+ 原理：函数的call、apply调用方式

```js
function Animal(name,age,gender){
    this.name=name;
    this.age=age;
    this.gender=gender;
}
function Person(name,age,gender,say){
    this.name=name;
    this.age=age;
    this.gender=gender;

    this.say=function(){

    }
}
```
+ 局限性：Animal(父类构造函数)的代码必须完全适用于Person(子类构造函数)

+ 以上代码用借用构造函数实现
```js
function Animal(name,age){
    this.name=name;
    this.age=age;
}
function Person(name,age,address){
    Animal.call(this,name,age);
    //this.name=name;
    //this.age=age;
    this.address=address;
}
```

+ 寄生继承、寄生组合继承

## 原型链(家族族谱)
+ 概念：JS里面的对象可能会有父对象，父对象还会有父对象，。。。。。祖先
+ 根本：继承
    - 属性：对象中几乎都会有一个__proto__属性，指向他的父对象
        -意义：可以实现让该对象访问到父对象中相关属性
+ 根对象：Object.prototype
    - var arr=[1,3,5]
    - arr.__proto__：Array.prototype
    - arr.__proto__.__proto__找到了根对象

    ```js
        function Animal(){}
        var cat=new Animal();
        //cat.__proto__：Animal.prototype
        //cat.__proto__.__proto__:根对象
    ```
+ 错误的理解：万物继承自Object？

## 闭包
### 变量作用域
+ 变量作用域的概念：就是一个变量可以使用的范围
+ JS中首先有一个最外层的作用域：称之为全局作用域
+ JS中还可以通过函数创建出一个独立的作用域，其中函数可以嵌套，所以作用域也可以嵌套
```js
var age=18;     //age是在全局作用域中声明的变量：全局变量

function f1(){
    console.log(name);      //可以访问到name变量
    var name="周董" //name是f1函数内部声明的变量，所以name变量的作用域就是在f1函数内部

    console.log(name);      //可以访问到name变量

    console.log(age);       //age是全局作用域中声明的，所以age也可以访问
}

console.log(age);       //也可以访问
```

```js
    //多级作用域
    //-->1级作用域
    var gender="男";
    function fn(){
        //问题：
        //gender:可以访问
        //age:  可以访问
        //height:不能访问

        //-->2级作用域
        return function(){
            //问题：
            //gender:   通过一级一级作用域的查找，发现gender是全局作用域中声明的变量
            //age:
            //height：
            console.log(gender);

            //-->3级作用域
            var height=180;
        }
        var age=5;
    }
```

### 作用域链
+ 由于作用域是相对于变量而言的，而如果存在多级作用域，这个变量又来自于哪里？这个问题就需要好好地探究一下了，我们把这个变量的查找过程称之为变量的作用域链
+ 作用域链的意义：查找变量（确定变量来自于哪里，变量是否可以访问）
+ 简单来说，作用域链可以用以下几句话来概括：(或者说：确定一个变量来自于哪个作用域)
    - 查看当前作用域，如果当前作用域声明了这个变量，就确定结果
        - 查找当前作用域的上级作用域，也就是当前函数的上级函数，看看上级函数中有没有声明
            - 再查找上级函数的上级函数，直到全局作用域为止
                - 如果全局作用域中也没有，我们就认为这个变量未声明(xxx is not defined)

+ 举例1：
```js
    var name="张三";
    function f1(){
        var name="abc";
        console.log(name);
    }
    f1();
```

+ 举例2：
```js
    var name="张三";
    function f1(){
        console.log(name);
        var name="abc";
    }
    f1();
```

+ 举例3：
```js
    var name="张三";
    function f1(){
        console.log(name);
        var name="abc";
    }
    f1();
```

+ 举例4：
```js
    var name="张三";
    function f1(){
        return function(){
            console.log(name);
        }
        var name="abc";
    }
    var fn=f1();
    fn();
```

+ 举例5：
```js
    var name="张三";
    function f1(){
        return {
            say:function(){
                console.log(name);
                var name="abc";
            }
        }
    }
    var fn=f1();
```

### 闭包的问题
```js
    function fn(){
        var a=5;
        return function(){
            a++;
            console.log(a);
        }
    }
    var f1=fn();
    f1();
    f1();
    f1();
```

### 闭包问题的产生原因
+ 函数执行完毕后，作用域中保留了最新的a变量的值

### 闭包的应用场景
+ 模块化
+ 防止变量被破坏

### 函数的4种调用方式
+ 在`ES6之前`，函数内部的this是由该函数的调用方式决定的
    - 函数内部的this跟大小写、书写位置无关
+ 1、函数调用
```js
    var age=18;
    var p={
        age:15
        say:function(){
            console.log(this.age);//window.age:18
        }
    }
    var s1=p.say
    s1();       //函数调用
```
+ 2、方法调用
```js
    var age=18;
    var p={
        age:15
        say:function(){
            console.log(this.age);//this:p
            //this.age->p.age:15
        }
    }
    p.say()//方法调用
```
+ 3、new调用(构造函数)
```js
    var age=18;
    var p={
        age:15
        say:function(){
            //this：say构造函数的实例,实例中并没有age属性，值为：undefined
            console.log(this.age);
        }
    }
    new p.say()//构造函数调用
    //相当于：
    var s1=p.say;
    new s1();
```
+ 4、上下文方式(call、apply、bind)
```js
    var length=21;
    function f1(){
        console.log(this.length);
    }
    f1.call([1,3,5])    //3
    f1.apply(this)      //window.length：21
    f1.call(5)          //undefined
```
- 上下文模式应用场景：
    - 一些需要指定this的情况，比如$.each方法回调函数内部的this
    - 判断数据类型：
        - Object.prototype.toString.call(1);


+ 在ES6的箭头函数之前的时代，想要判断一个函数内部的this指向谁，就是根据上面的四种方式来决定的



### 原型
+ 原型很多人开发用不到？
    - 很多人都用es6/7/8开发，确实用的比较少
    - 如果你用es5之前的版本开发代码(IE8、IE7。。。)，可能天天都要写原型
    - 理解了原型，才是理解了JS面向对象的核心
+ 类继承其实本质上还是用原型继承来(包装)的

## 对象的属性查找规则
//-->1、首先查看本身有没有length属性
//-->2、如果本身没有该属性，那么去它的原型对象中查找
//-->3、如果原型对象中没有，那么就去原型对象的原型对象中查找，最终一直找到根对象（Object.prototype）
//-->4、最终都没有找到的话，我们认为该对象并没有该属性，如果获取该属性的值：undefined

## 5.29课外作业
+ 思考如何解决bind的浏览器兼容性问题

## 补充，判断数据类型
+ typeof 
    - typeof只能判断：数字、字符串、布尔值、undefined、函数
+ `Object.prototype.toString.call()`
    - 5  '[object Number]'
    - "abc" '[object String]'
    - true '[object Boolean]'
    - null '[object Null]'
    - undefined '[object Undefined]'
    - [1,3,5] '[object Array]'
    - function(){}  '[object Function]'
    - new Date()   '[object Date]'
    - /abc/        '[object RegExp]'
+ Array.isArray()  es5中提出来的检测数组
+ isNaN()   
+ isInfinity()

## 指向window
```js
$.ajax({
    success:function(){
        console.log(this);        //window
    }
})
```

```js
[1,3,5].map(function(){
    console.log(this);      //window
})
```

```js
    $("div")

    `${$}`
    `${$('div')}`
```


## global和window的区别
+ global是es中全局作用域中的根对象
    - 但是nodejs里面，global全是表示全局变量的载体
    - 浏览器端的js里面，全局变量都放在了window中，浏览器中不存在global对象



# ES6(常用的、重点的)
## 数组API、正则API、字符串API都不讲
## 模板字符串
+ 模板字符串的基本用法
```js
    var s1 = `abc`
```
+ 模板字符串的优势：
```js
    var obj={ name:"",age:5 };
    var s1 ="我叫："+obj.name+"，今年："+obj.age+"岁。"
```

## 解构赋值
+ 对象的解构赋值
```js
    var obj={name:"张三",age:18}

    var {name,age}=obj; 
    //生成2个变量，
    //  name值来自于obj.name、
    //  age值来自于obj.age

    var {name:title}=obj;
    //生成一个变量：title，值来自于obj.name
```

+ 函数参数的解构赋值
```js
    function f1(obj){
        console.log(obj.age);
        console.log(obj.height)
    }
    //等价于
    function f1({ age,height }){
        console.log(age);
        console.log(height)
    }

    f1({age:5,height:180})
```

+ 补充：属性的简写
```js
    var a = 3 ; 
    var c = 10;
    var b = { a,c } ;   
    //b对象有一个a属性，a属性的值，来自于a变量  ，
    //还有一个c属性，c属性的值来自于c变量
    console.log(b)
```

## 函数的扩展
### rest参数
+ 使用背景：es6的
+ 优点：arguments是伪数组，而rest参数是真数组
```js
    function fn(...args){
        console.log(args);  //数组：[1,2,3,4,5]
    }
    fn(1,2,3,4,5)
```
### 箭头函数
+ 场景：用于替换匿名函数
+ 基本用法：
```js
    //匿名函数
    div.onclick=function(){
        console.log("你好")
    }
    //箭头函数
    div.onclick=()=>{
        console.log("你好")
    }
```
+ 有一个参数的箭头函数
```js
    var fn=(a)=>{
        console.log("abc");
    }
    //等价于：
    var fn=a=>{
        console.log("abc");
    }
```
+ 有2个及更多参数的箭头函数
```js
    var f=(a,b,c)=>{
        console.log("abc")
    }
```

+ 箭头函数和普通匿名函数有哪些不同？
    - 函数体内的this对象，就是定义时所在的对象，而不是使用时所在的对象。
    - 不可以当作构造函数，也就是说，不可以使用new命令，否则会抛出一个错误。
    - 不可以使用arguments对象，该对象在函数体内不存在。如果要用，可以用 rest 参数代替。
    - （不常用）不可以使用yield命令，因此箭头函数不能用作 Generator 函数。 
        - generator函数现在经常用async替代

## 对象的扩展
+ Object.assign：实现拷贝继承
+ 对象扩展运算符
```js
    var obj1={ age:5,gender:"男" }
    var obj2={ ...obj1 }
    var obj3={ ...obj1 , age:10 }
```

## Promise
### 为什么要有promise：解决（回调地狱）的问题
### 回调地狱：
```js
    //跟以前的if条件地狱很像
    // if(){
    //     if(){
    //         if(){
    //         }
    //     }
    // }

    $.get("/getUser",function(res){
        $.get("/getUserDetail",function(){
            $.get("/getCart",function(){
                $.get("/getBooks",function(){
                    //...
                })
            })
        })
    })

    //node开发：读取文件；开个服务器、接收一个请求、请求路径、访问数据库
```

### Promise函数基本用法
```js
    var promise=new Promise((resolve,reject)=>{
        //b 把需要执行的异步操作放在这里
        $.get("/getUser",res=>{
            //获取数据的异步操作已经执行完毕了，等待下一步的执行，通过执行resolve函数，告诉外界你可以执行下一步操作了
            //c、
            resolve(res)
            //而执行的下一步操作，其实就是写在then的回调函数中的
        })
    })
    //a、
    promise.then(res=>{
        //d、执行后续的操作
        console.log(res);
    })
```

### Promise函数实现多层回调
```js
    new Promise((resolve,reject)=>{
        $.get("/getUser",res=>{
            resolve(res)
        })
    }).then(res=>{
        //用户基本信息
        return new Promise(resolve=>{
            $.get("/getUserDetail",res=>{
                resolve(res)
            })
        })
    }).then(res=>{
        //用户详情
        return new Promise(resolve=>{
            $.get("/getCart",res=>{
                resolve(res)
            })
        })
    }).then(res=>{
        //购物车信息
    })
```

### Promise函数错误处理
+ 第一种方式
```js
    new Promise((resolve,reject)=>{
        $.ajax({
            url:"/getUser",
            type:"GET",
            success:res=>{
                resolve(res);
            },
            error:res=>{
                reject(res)
            }
        })
    }).then(resSuccess=>{
        //成功的返回值
    },resError=>{
        //失败的返回值
    })
```

+ 第二种方式
```js
    new Promise((resolve,reject)=>{
        $.ajax({
            url:"/getUser",
            type:"GET",
            success:res=>{
                resolve(res);
            },
            error:res=>{
                reject(res)
            }
        })
    }).then(resSuccess=>{
        //成功的返回值
    }).catch(resError=>{
        //失败的返回值
    })

```

## async
+ async其实是一个promise的语法糖
```js
    async function get(){
        console.log('开始执行');
        var res = await timer()
        console.log('执行结束：',res);
    }
    function timer(){
        return new Promise((resolve,reject)=>{
            setTimeout(()=>{
                resolve("你好");
            },1000)
        })
    }
    get();
```

+ await可以执行异步操作，但是await必须在async函数内执行

+ await操作可以有返回值，这个返回值表示promise操作成功的返回值

+ 如果await里面执行的异步操作发生了reject，或者发生了错误，那么只能使用try...catch语法来进行错误处理

## class
### 定义一个类
```js
    class Person {
        constructor(name) {
            this.name=name;
        }
    }
    //相当于：
    function Person(name){
        this.name=name;
    }
```

### 添加实例方法
```js
    class Person {
        constructor(name,age) {
            this.name=name;
            this.age=age;
        }
        //定义方法
        say() {
            console.log("大家好，我叫："+this.name+"，今年："+this.age+"岁");
        }
        travel(){
            console.log("坐着飞机去巴厘岛");
        }
    }
```

### 添加静态方法
+ 静态成员：静态属性、静态方法
+ 静态属性：通过类本身来访问：Person.maxAge
+ 静态方法：通过类本身来访问的一个方法：Person.born();
```js
    class Animal {
        constructor(){

        }
        //这就是一个静态方法了
        static born(){
            console.log("小呆萌出生了")
        }
    }
    //访问静态方法
    Animal.born();
```

### 类的继承
```js
    //父类
    class Person {
        constructor(name){
            this.name=name;
        }
    }
    //Student类继承自Person类
    class Student extends Person {
        //构造方法
        constructor(name,grade){
            //规定：必须调用父类构造方法，如果不调用就会报错
            super(name);    
            //调用父类构造方法，从而给子类的实例添加了name属性

            this.grade=grade;
        }
    }
```

```js
[1,3,5].map(function(value,index){

})

[1,3,5].map((value,index)=>{

})

//以前变量和字符串拼接，现在用模板字符串

```

## es6的新语法
+ 个人建议：不要去试想着一下子全部把之前的代码习惯变成es6的方式
    - 而是今年学会了模板字符串，把今天项目用到的所有字符串拼接都换成模板字符串
    - 过了几天学会了箭头函数，把当天项目里面的所有用到的匿名函数都换成箭头函数

## 预习作业：通过MDN学习Object.defineProperty()的用法

## module -->放到后面的模块化课程中讲解
### 基本用法
+ 导出模块：
```js
    //common.js
    export default { name:"abc" }
```

+ 导入模块：
```js
    //b.js
    import common from "common.js"

    console.log( common.name ) //"abc"
```

### 模块有多个导出
```js
    //person.js
    export const jim = { country :"France" }
    export const tony = { color:"gray" }
    //默认的导出
    export default { name:"abc" }
```
```js
    //index.js
    import person , { jim , tony } from "person.js"

    //person：{ name:"abc" }
    //jim：{ country :"France" }
    //tony：{ color:"gray" }
```

### 模块导入导出取别名
```js
    //person.js
    export const tony = { color:"gray" }
    export { tony as Tony }

    //index.js
    import { Tony } from "person.js"
    import { Tony as man} from "person.js"

    console.log(man)    //{ color:"gray" }
```


# 框架封装
- 参考jquery
- 作为JS高级的案例
- `$("div").css("color","red")`
- `$("div").click(function(){ ... })`

## 问题：怎样在微信中呼起其他的app呢？
+ 1、如果在移动端web页面中调起app？
    - 网页是直接在移动浏览器中访问的，
    - 网页是嵌入在app中的(web view)
        - 实现方式：由app开发者制定一个协议(http://www.baidu.com/getUserInfo)
        - 协议地址如：sdk://xxx.com/getUserInfo
        - 前端直接通过页面跳转就可以了
            - a标签
            - location.href
+ 2、微信中一个网页，呼起app？
    - 微信对于一般的用户并不支持跳转app
    - 微信只针对一些大客户（携程、唯品会、京东）才会提供这种跳转的接口
    - 如果小客户一定要做到这种功能，直接去一些第三方平台购买凭证

## 入口函数
```js
    (function(window){
        function Fn(selector){

        }
        Fn.prototype = {
            init(selector){
                var elements = document.querySelectorAll(selector);
                for( var i = 0 ; i < elements.length ; i++ ){
                    this[i] = elements[i];
                    this.length++;
                }
            },
            length : 0
        }

        function jQuery(selector){
            return new Fn(selector)
        }
        window.$ = window.jQuery = jQuery;
    })(window)
```

### 浏览器兼容性问题
+ 获取样式
    - 现代浏览器：`window.getComputedStyle(dom,null)`
    - IE10之前：`dom.currentStyle`
+ 设置文本内容
    - FF45之前：`dom.textContent`
    - 其他：`dom.innerText`
+ 绑定事件：
    - IE10之前：`dom.attachEvent`
        - 获取事件对象
        - 阻止事件冒泡
        - 阻止默认行为
    - 现代浏览器：`dom.addEventListener`
        - 获取事件对象
        - 阻止事件冒泡
        - 阻止默认行为

### DOM操作
+ $("<div>100</div>")
    - 字符串标签转换为一个DOM元素
        - document.createElement("div")
        - div.innerHTML="<div>100</div>"
        - -->div.childNodes[0]
        - 高性能的文档碎片：document.createDocumentFragment("div")
+ $("div").append("<span>300</span>")

### 属性操作




# 正则表达式 js java c# python
## 学习网站
`https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/RegExp`
## 概念
+ 正则表达式是为了解决字符串操作中一些比较麻烦的场景，比如字符串提取、字符串替换、字符串验证等
    - 常用于：表单验证：是否是一个数字、是一个电话号码、是一个邮箱。。。
    - 字符串替换：
    - 字符串查找

## 正则表达式其实也是js里面的一个对象

## 创建一个正则表达式
+ `var reg2=new RegExp("a");`
+ `var reg1=/a/;`   
    - 其中//是标记，a表示要匹配的字符

## 正则表达式匹配
```js
    var reg=/a/;        //匹配字符串中的a字符
    reg.test("abc");        
    //正则表达式的test用来检测字符串是否满足正则表达式的要求；
    //由于"abc"中存在a，所以是符合要求的，所以这段代码的返回值为：true

    const isTrue = reg.test("coke");   //由于"coke"中不存在a字符，所以不符合条件   -->isTrue:false


    var reg2=/abc/;     
    reg2.test("adbcd"); //字符串中必然存在"abc"才符合要求，所以这段代码的返回值为false

    reg2.test("1abc");  //true
    reg2.test("abc123");    //true
    reg2.test("abcabc");    //true
```

## 正则表达式特殊字符
### 字符类别
+ . 表示除了换行符(\r \n)以外的任意字符
```js
    var reg=/./;
    reg.test("a");  //true
    reg.test(".");  //true
    reg.test("\r"); //false
    reg.test("1\r");    //存在一个1，不是换行符，所以结果为：true
    reg.test("\r\n");   //false

    //注意点：如果以后要匹配.字符，不要直接写.
    //为了匹配qq邮箱，写了 /qq.com/ 这是一个错误的写法：
    //=>/qq.com/不仅匹配："qq.com"也匹配"qq3com" "qq@com"

    //解决方案：/qq\.com/  或者 /qq[.]com/
```

+ \d 表示数字
```js
    var reg=/\d/;
    reg.test("123abc"); //由于存在一个数字，所以结果为true
    reg.test("abcde");  //由于不存在任何数字，所以结果为false

    //扩展：
    var _reg=/\d\d/;
    _reg.test("1b");    //不存在2个连续数字，所以结果为：false
    _reg.test("a12c");  //存在2个连续数字，结果为：true

    //匹配手机号码：出现了连续11个数字
    var isCellphoneNumber=/\d\d\d\d\d\d\d\d\d\d\d/;
```

+ 案例：匹配手机号码
```js
    var reg = /\d\d\d\d\d\d\d\d\d\d\d/;
    reg.test("13532159091");    //true
    reg.test("17380889395");    //true
    reg.test("a7380889395");        //false
```

+ \D 是\d的取反结果，表示不是数字
```js
    var reg=/\D/;
    _reg.test("123");   //由于全是数字，所以结果为：false
    _reg.test("123a");  //存在一个字母，所以结果为：true

    var reg2=/123\D5/;
    _reg.test("12345"); //false
    _reg.test("123b5"); //true
```

+ \w 匹配字母、数字、下划线 ，三者满足其一即可
```js
    var reg=/\w/;   
    reg.test("123");    //存在数字，结果为：true
    reg.test("a");  //true
    reg.test("1");  //true
    reg.test("_");  //true
    reg.test("-");  //false
    reg.test(".");  //false

    reg.test("1.");   //true
    reg.test("_\r\n");  //true
    reg.test("\r\n");   //false
```

+ \W 是\w的取反

+ \s 表示一个空白字符（例如：\r \n \t 空格 。。。）
```js
    var reg=/\s/;
    reg.test("abc def");   //存在一个空白，结果为：true
    reg.test("abc\r123");   //存在一个\r，结果为：true
    reg.test("abc");    //false
```

+ \S 是\s的取反
```js
    var reg=/\S/;
    reg.test(" \r \n ");   //全是空白字符，结果为false
    reg.test("123 abc");    //存在一个空白，结果为true


    var reg3=/\s\S/;
    reg3.test(" a");    //true
    reg3.test("a ");    //false
    reg3.test("a b");   //true
```

+ \ 转义字符
```js
    var reg=/./;    //匹配除了换行符以外的任意字符
    var reg=/\./;   //匹配.字符

    var reg=/\//;   //匹配一个正斜杠：/
    var reg=/[/]/;  //。。。。。。。。。
```

+ 案例：匹配邮箱
```js
    //asfas.com
    //123ad.com
    //ABC12.com
    //abc_1.com
    var reg =/\w\w\w\w\w\.com/;
```


### 字符集合
+ []
```js
    var reg=/[1a2b3]/; //匹配一个字符，这个字符必须是：1/a/2/b/3其中一种，如果是就表示满足，如果不是就不满足
    reg.test("a");      //结果为：true
    reg.test("3");      //结果为：true
    reg.test("fg5678"); //一个符合要求的字符都不存在，结果为：false
    reg.test("a999999");    //结果为：true

    //升级版
    var reg2=/[123][abc]/;  //为了匹配连续2个字符，第一个字符必须在1/2/3之内，第二个字符必须在a/b/c之内
    reg2.test("2a");    //true
    reg2.test("3c");    //true
    reg2.test("1basdfasf"); //true
    reg2.test("asdfasdf1c");    //存在符合条件的1c，结果为：true
    reg2.test("39");    //false

    var reg2=/[0-9]/;   //匹配数字0-9之间，任何一个数字 等价于：/\d/
    var reg3=/[a-z]/;   //匹配小写字母
    var reg4=/[A-Z]/;   //匹配大写字母
    var reg5=/[a-zA-Z]/;//匹配所有字母
    var reg6=/[A-Za-z]/;//..........

    var reg10=/[0-9abc]/;
    reg10.test("3");//true
    reg10.test("five");//false
    reg10.test("banana");//true
```
+ [^]
```js
    var reg=/[^123]/;   //匹配一个字符，但是这个字符既不是1 并且 不是2 并且 不是3 
    reg.test("a");      //true
    reg.test("3");      //false
    reg.test("123");    //没有1，2，3以外的字符，结果为：false
    reg.test("a123");   //存在一个符合条件的a，所以结果为：true
```

### 边界
+ ^ 表示字符串最左边
+ $ 表示字符串最右边
```js
    var reg=/^abc/;     //表示以abc开头
    reg.test("123abc123");  //并不是以abc开头，结果为：false
    reg.test("abc123");     //以abc开头，结果为：true
```
```js
    var reg=/abc$/;     //表示以abc结尾
    reg.test("123abc"); //结果为：true
    reg.test("abc123"); //结果为：false
    reg.test("123bc");  //结果为：false
```
```js
    //匹配一个手机号码 (11位)-->(1)+(10位数字)
    var reg=/1\d\d\d\d\d\d\d\d\d\d/;
    reg.test("13166668888a");   //true

    var reg2=/^1\d\d\d\d\d\d\d\d\d\d$/;
    reg2.test("13166668888a");   //false
    reg2.test("13166668888");    //true

    var reg3=/^1[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$/;

```

```js
    var reg=/^abc$/;    //表示字符串abc
    reg.test("abc");    //结果为：true
    reg.test("123abc"); //结果为：false
```

### 量词
+ `*` 出现0次或多次
```js
    var reg=/\d*/;
    reg.test("123");    //true
    reg.test("234");    //true

    var reg3=/1\d*/;
    reg3.test("1"); //true
    reg3.test("123");   //true
    reg3.test("a123")   //true
    reg3.test("a123456b");   //false
```
+ `+` 出现1次或多次(至少一次)
```js
    var reg=/1\d+/;
    reg.test("1");      //false
    reg.test("123");    //true
```
+ `?` 出现0次或一次
```js
    var reg=/1\d?/; 
    reg.test("12");     //true
    reg.test("1");      //true
```
+ `{3}` 出现3次
```js
    var reg=/1\w{5}/;
    reg.test("1abc");   //false
    reg.test("112345"); //true
    reg.test("1abc12"); //true
```
+ `{3,}` 至少出现3次
```js
    var reg=/\d{2,}/;
    reg.test("12"); //true
    reg.test("5");  //false
```
+ `{3,5}` 出现3-5次
```js
    var reg=/abc{3}/;           //表示匹配abccc
    reg.test("123abccc123");    //结果为：true

    var reg3=/(abc){2}/;    //匹配abcabc
```
+ `|` 或者
```js
    var reg=/abc|123/;  //表示匹配abc或者123

    reg.test("abc456"); //true

    var reg5=/^abc|123$/;  //匹配以abc开头，或者以123结尾
    reg5.test("abcafsadfasd");//true
    reg5.test("afsdfasdf123");//true

    var reg6=/^(abc|123)$/;        //匹配abc/123
```
+ `()` 分组
```js
    //010-88889999
    //0576-12312312
    //0895-1234567
    var reg=/(\d{3,4})-(\d{7,8})/;  //匹配电话号码
    var arr="021-33335555".match(/(\d{3,4})-(\d{7,8})/)
    arr[0]  //全部
    arr[1]  //第一组：区号：021
    arr[2]  //第二组：号码：333355555
```
```js
    var reg=/(\d{3,4})-(\d{7,8})/;
    "021-33335555".replace(/(\d{3,4})-(\d{7,8})/,'区号是：$1')
    //区号是：021
```

```js
    var str="[object Array]";
    var str2="[object Object]";
    var str3='[object Function]';
    var str4='[object Date]';

    str.replace("[object ","").replace("]","").toLowerCase();

    str.replace(/\[object /,"").replace(/\]/,"").toLowerCase();

    //这样的话正则表达式只匹配一次，也就是说后面的]换不掉
    str.replace(/\[object |\]/,"").toLowerCase();
    //如何解决？进行全局匹配
    str.replace(/\[object |\]/g,"").toLowerCase();

    str.replace(/[^\s]+\s/,"").replace(/\]/,"")
```

### 案例：匹配邮箱
### 案例：匹配电话座机

## 作业1
### jquery：选择器引擎：Sizzle大量的使用了正则表达式
```js
    $("#abc")   //id
    $(".abc")   //类
    $("span")   //标签
```

## 作业2：写一个正则表达式，用于替换一个字符串的前后空格
+ 比如："   asdffsf  asdfasfsd asfas a "替换为"asdffsf  asdfasfsd asfas a"




# 模块化(切记：学习思想)
## 如果不用模块化编写代码，那么会具有以下问题：
+ 代码杂乱无章，没有条理性，不便于维护，不便于复用
+ 很多代码重复、逻辑重复
+ 全局变量污染
+ 不方便保护私有数据(闭包)

## 模块化的基本实现：闭包的自调用函数
```js
    //日期控件
    var DatePicker = (function(){
        return {
            init(){

            }
        }
    })();

    //Header
    //  tabbar
    //  login

    //Content
    //  sidebar
    //  table

    //Footer

    var KTV=(function(){
        return {
            pay(){

            },
            xiaofei(){

            }
        }
    })()
```

## AMD模块化  -->requireJS
+ AMD：async module define：异步模块定义
+ AMD其实就是requireJS实现的模块化解决方案

## 其他模块化解决方案：
+ CommonJS：Node中使用的模块化解决方案
+ CMD（common module define）：seajs中提出来的模块化解决方案
    - 其实CMD可以认为是CommonJS的前端实现
    - seajs由阿里的（玉帛）编写
    - seajs在2，3年前比较火，从去年开始已经停止更新
        - vue 、angular、react已经集成了各自的模块化
        - es6模块化
        - webpack也有模块化的解决方案

## vue、angular、react已经将模块化的思想植入在里面

## AMD和CMD的不同之处：
+ amd需要依赖前置，cmd需要依赖就近
+ 导入导出方式不同：
    - amd通过define定义，return导出；
    - cmd通过不需要定义，只需要最后通过module.exports、exports导出

## requireJS —— AMD规范
### 中文网：`http://www.requirejs.cn/docs/api.html#jsfiles`
### 基本用法
```js
    //1、通过script标签导入requirejs源文件
    //2、编写模块文件，基本格式如下：
    //cart.js
    define([],function(){
        console.log('cart模块');
    })
    //product.js
    define([],function(){
        console.log('product模块');
    })
    //3、首页调用模块：
    require(["cart.js","product.js"],function(){
        //编写后面的逻辑代码
    })
    //等价于：
    require(["cart","product"],function(){
        
    })
```
### 入口文件

### 配置
```js
    require.config({
        //baseUrl
        //paths
        
    })
```

### 定义模块的返回值（返回值相当于模块的入口）
```js
    //cart.js：
    define([],function(){

        return {
            init(){

            },
            addProduct(){

            }
        }
    })

    //首页：
    require(["cart"],function(cart){
        cart.init();
        cart.addProduct();
    })
```
+ 注意：一般在导入模块的时候，需要将`有返回值的模块`在`[前面]`导入，`无返回值的模块`在`[后面]`导入


### 案例——模块依赖子模块
```js
    //productAdd.js
    define([],function(){
        return {
            init(){
                console.log("添加商品");
            }
        }
    })

    //productEdit.js
    define([],function(){
        return {
            init(){
                console.log("编辑商品");
            }
        }
    })

    //product.js
    define(["productAdd","productEdit"],function(productAdd,productEdit){
        return {
            init(){
                console.log("商品列表");
            },
            add(){
                productAdd.init();
            },
            edit(){
                productEdit.init();
            }
        }
    })

    //首页：
    require(["product"],function(product){
        product.init();

        product.add();

        product.edit();

    })
    
```

### 检测第三方库是否支持AMD规范
```js
    if ( typeof define === "function" && define.amd ) {
        define([], function() {
            return jQuery;
        } );
    }
```
+ 类似的还有：echarts

### 常用的模块、文件夹路径的配置
+ 一般用于配置第三方模块，比如jquery、bootstrap、zepto等等
```js
    require.config(
        paths:{
            jquery:"js/lib/jquery-1.11.min",
            zepto:"js/lib/zepto.min",
            bootstrap:"assets/bootstrap/js/bootstrap.min"
        }
    )

    define(["jquery","zepto"],function($,$$){

    })

    require(["jquery","bootstrap"],function($){

    })
```

### 插件
+ 插件列表：`https://github.com/requirejs/requirejs/wiki/Plugins`
+ i18n 国际化
+ text 加载文件（.html文件。。。）
    - 插件github地址：https://github.com/requirejs/text

### requirejs和vuejs浅显的比较
+ requirejs是一个库
    - 相当于：一个房间
    - 相当于：一个底盘
    - 功能：只是一种模块化的解决方案
+ vue是一个框架
    - 相当于：一栋楼
    - 功能：1、不仅仅是模块化的解决方案
    -      2、减少了DOM的操作(-->jquery的功能)
    -      3、。。。。。。

### requirejs解决循环依赖
+ a已经依赖了b
+ b中先添加require模块的依赖，然后再添加a的依赖，但是并不要去通过回调函数的形参获取返回值  
    - `define(["require","a"],function(require){})`
    - 在需要执行a模块代码的时候，`require("a")()`

### node中的模块化
+ require("http").createServer()
+ require("fs").readFile()
+ require("common/type").doSth()

### 前端路由的意义
+ 1、通过路由将各个功能从url上面就分辨出来了
    - /user/list
    - /user/3
    - /user/edit/3
+ 2、路由还可以进行前进、后退等导航操作

### 前端路由的实现方式
+ 1、监听window对象的hashchange事件
    - hash值：通过location.hash获取，获取的值以`#`开头
    - 也可以通过location.hash来设置hash值，当然设置的新hash也应该以`#`开头
+ 2、history对象:popState/pushState

## ES6模块化
### 浏览器调试
```html
    <script type="module">
        //导入模块
    </script>
```

### 基本用法
```js
    //cart.js
    export default {
        name:"张三",
        age:18
    }

    //index.js
    import cart from "./cart.js"
    cart.name
    cart.age
```

### 导出模块
```js
    //cart.js
    export const age = 18;
    export function f1(){
        console.log("f1函数");
    }
    //默认返回值
    export default {
        init(){
            console.log("初始化");
        }
    }

    //index.js
    import cart,{ age,f1 } from "./cart.js"
    cart.init();
    age,
    f1();
```

### 导入模块
```js
    //index.js
    import cart as cartIndex from "./cart.js"
    import { age as AGE } from "./product.js"

    //使用变量：cartIndex
    //使用变量：AGE
```



