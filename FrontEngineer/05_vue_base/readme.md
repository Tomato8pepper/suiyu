vue.js官方文档
vue awesome vue项目中的用到的ui框架
axios抛出一个对象
vue起步
* 1:引包
* 2:启动 new Vue({el:目的地,template:模板内容});
* options
  * 目的地 el
  * 内容 template(优先级>el)
  * 数据 data  保存数据属性
    数据驱动视图


插值表达式 
* {{ 表达式 }}


vue中常用的v-指令演示
v-bind:class='String、变量、{}'
v-bind:value=  v-on:input=


关于对象内的this(指向new的实例化对象)
* vue已经把以前this是window或者事件对象的问题搞定了
* methods和data本身是在同一个对象中的,所以在该对象中可以通过this.随意取
* this.xxx 取data中的值, this.xxxMethod调methods中的函数


局部组件的使用
​	渲染组件-父使用子组件
* 1: 创建子组件(对象)
    - `var Header = { template:'模板' , data是一个函数,methods:功能,components:子组件们 } `
* 2: 在父组件中声明,根属性`components:{ 组件名:组件对象 }`
* 3: 在父组件要用的地方使用 `<组件名></组件名>`
    - 在不同框架中,有的不支持大写字母，用的时候
        + 组件名 MyHeader
        + 使用 my-header


父子组件传值(父传子)
* 1:父用子的时候通过属性Prop传递 (动态:[], 静态：type='string')
* 2:子要声明props:['属性名'] 来接收
* 3:收到就是自己的了，随便你用
    - 在template中 直接用
    - 在js中 this.属性名 用
* 总结:父传,子声明,就是子的了
* 小补充: 常量传递直接用，变量传递加冒号


子传父
- 1.子要绑定原生事件，在原生事件函数中通过this.$emit(‘自定义的事件名’,arg1);触发父组件中子组件自定义的事件名
- 2.父组件中的子组件```v-bind:自定义事件的名字 = 'fn'```绑定自定义的事件
- 3.父组件 就可以触发fn的函数 数据就可以从子组件中传过来了


注册全局组件
* 应用场景: 多出使用的公共性功能组件，就可以注册成全局组件,减少冗余代码
* 全局API `Vue.component('组件名',组件对象);`


附加功能:过滤器&监视改动
* filter
    * 将数据进行添油加醋的操作
    * 过滤器分为两种
        * 1:组件内的过滤器(组件内有效)
        * 2:全局过滤器(所有组件共享)
    * 先注册,后使用
    * 组件内 `filters:{ 过滤器名:过滤器fn }` 最终fn内通过return产出最终的数据
    * 使用方式是 `{{ 原有数据 | 过滤器名  }}`
    * 需求
        * 页面input框输入字符串, 另一边显示其反转的内容
    * 过滤器fn:
        * 声明`function(data,argv1,argv2...){}`
        * 使用`{{ 数据 | 过滤器名(参数1,参数2) }}`
* watch 监视单个
watch:{          
        //监视复杂类型,无法监视的原因是因为监视的是对象的地址 
        // obj:function(newV,oldV) {
        // 	console.log(newV,oldV);
        // },
        // key是属于data属性的属性名，value是监视后的行为 fn中的参数（新值，旧值）
        msg:function (newV,oldV) {
            console.log(newV,oldV);

            if (newV==='alex') {
                console.log('sb');
            }
        },
        // 深度监视 ：object ||array
        stus:{
            deep:true,//深度监视
            handler:function (newV,oldV) {
                console.log(newV[0].name)
            }
        }
* computed 监视多个


箭头函数和function
* 一方面箭头函数是种简写形式
* 应用场景: 由于箭头函数本身没有this和arguments，通常用在事件类的回调函数上，让其向上级function绑定this，而非事件对象
* 箭头函数不可以作为构造函数


key
* 使用子组件循环输出一堆数据
* 不依赖子组件状态或临时 DOM 状态 (例如：表单输入值) 的列表渲染输出。
* 建议v-for就写，提升性能，避免vue运算,key就是记录元素与dom间的位置关系


slot
* slot就是子组件里给DOM留下的坑
* <子组件>DOM</子组件>
* slot动态的DOM、props是动态的数据
* 具名 name、slot
* @click.native='chan'  获取原生button的点击事件


组件生命周期
* 需要频繁的创建和销毁组件
  - 比如页面中部分内容显示与隐藏，但是用的是v-if
* 组件缓存
  - 内置组件中<keep-alive>
  - 被其包裹的组件，在v-if=false的时候，不会销毁，而是停用
  - v-if="true" 不会创建,而是激活
  - 避免频繁创建组件对象的性能损耗
* 成对比较
  - created 和 beforeCreate 
    + A 可以操作数据 B 数据没有初始化
  - mounted 和 beforeMount
    + A 可以操作DOM B 还未生成DOM
  - updated 和 beforeUpdate
    + A 可以获取最终数据 B 可以二次修改
  - 频繁销毁创建的组件使用内置组件<keep-alive></keep-alive>包裹


  获取DOM元素
* 救命稻草, document.querySelector
* 1: 在template中标识元素 ref="xxxx"
* 2: 在要获取的时候, this.$refs.xxxx 获取元素
  - 创建组件,装载DOM,用户点击按钮
* ref在DOM上获取的是原生DOM对象
* ref在组件上获取的是组件对象
* 如果是mounted之后添加的dom元素， this.$nextTick(function(){ ... })


vue路由插件(前端路由history、hash模式/#)
基本使用
* vue-router 
* 其是vue的核心插件
* 1:下载 `npm i vue-router -S`
* 1.2(重要):安装插件`Vue.use(VueRouter);`  
* 2:在main.js中引入vue-router对象 `import VueRouter form './x.js';`
* 3:创建路由对象 `var router = new VueRouter();`
* 4:配置路由规则 `router.addRoutes([路由对象]);`
  * 路由对象`{path:'锚点值',component:要(填坑)显示的组件}`
* 5:将配置好的路由对象交给Vue
  * 在options中传递-> key叫做 router
* 6:留坑(使用组件) `<router-view></router-view>`


命名路由
* 1:给路由对象一个名称 `{ name:'home',path:'/home',component:Home}`
* 2:在router-link的to属性中描述这个规则
  * `<router-link :to="{name:'home'}></router-link>"`
  * 通过名称找路由对象，获取其path，生成自己的href
* 大大降低维护成本，锚点值改变只用在main.js中改变path属性即可


生僻API梳理:
  * 1. Vue.use(插件对象);   //  过程中会注册一些全局组件,及给vm或者组件对象挂在属性
    2. 给vm及组件对象挂在的方式  :  
      Object.defineProperty(Vue.prototype,'$router',{
       ​	get:function () {
       		return 自己的router对象;
       ​	}
       })


参数router-link,
* `Vue.prototype.xxx = {add:fn}`
* 所有组件中，使用this.xxx就能拿到这个对象
* 查询字符串 
  * 1:配置`:to="{name:'detail',query:{id:hero.id} }"`
  * 2:规则 `{name:'detail',path:'/detail',component:Detail}`
  * 3:获取 `this.$route.query.id`
  * 4:生成 `<a href="/detail?id=1">`
* path方式 
  * 4:生成 `<a href="/detail/1">`
  * 1:配置 `:to="{name:'detail',params:{id:hero.id}  }"`
  * 2:规则 `{ name:'detail',path:'/detail/:id'}`
  * 3:获取 `this.$route.params.id`
* 查询字符串配置参数
  * router-link一次
  * 获取的时候一次
* path方式配置参数
  * router-link一次
  * 规则配置的时候声明位置
  * 获取的时候一次
* 总结书写代码注意事项
  * path方式需要在路由规则中声明位置


vue-router中的对象
* $route 路由信息对象,只读对象
* $router 路由操作对象,只写对象


嵌套路由
* 市面上所谓的用单页应用框架开发多页应用
  * 嵌套路由
* 案例
  * 进入我的主页显示：电影、歌曲
* 代码思想
  * 1:router-view的细分
    * router-view第一层中，包含一个router-view
  * 2:每一个坑挖好了，要对应单独的组件
* 使用须知: 1:router-view包含router-view 2:路由children路由


动态路由匹配
* 当二级路由组件组件一样只有数据不一样可以使用动态路由
* 复用组件的生命周期函数，在第一次触发之后，就不会触发了
* watch监听$route(to, from)


路由权限控制
meta和全局路由的渲染前配置router.beforeEach
编程式路由 this.$router.push({name: ''})


路由导航守卫
三个钩子函数


知识点介绍
* 路由meta元数据 -> meta是对于路由规则是否需要验证权限的配置
  * 路由对象中 和name属性同级 ```{  meta:{ isChecked:true  }  }```
* 路由钩子 -> 权限控制的函数执行时期
  * 每次路由匹配后,  渲染组件到router-view之前
  * ```router.beforeEach(function(to,from,next) {    } )```




axios
基本使用
Axios.method('url',[,..data],options)
.then(function(res){  })
.catch(function(err) { } )

合并请求
  this.$axios.all([请求1,请求2])
  .then(  this.$axios.spread(function(res1,res2){  
           
    })
  )

拦截器
- 单请求配置options: `axios.post(url,data,options);`
- 全局配置defaults: `this.$axios.defaults`
- config : `请求拦截器中的参数`
- response.config `响应拦截器中的参数`

* options
    - baseURL 基础URL路径
    - params 查询字符串（对象）
    - transformRequest 转换请求体数据
    - transformResponse 转换响应体数据
    - headers 头信息
    - data 请求体数据
    - timeout 请求超时，请求多久以后没有响应算是超时（毫秒）


文件上传
<transition> && this.$set()

☆ 偏门

☆ vue中的优化
    v-lazy

☆ vuex与localStorage与sessionStorage与cookie
    [](https://www.cnblogs.com/xieyao/p/13265947.html)

☆ 





### 准备开始
---


### vue基础

---

#### (1).历史介绍
* angular 09年，年份较早，一开始大家是拒绝  star:![image-20180805111029197](/var/folders/7b/sz6pt5jd3y3b51q1ngm_8pph0000gn/T/abnerworks.Typora/image-20180805111029197.png)
* react 2013年, 用户体验好，直接拉到一堆粉丝 star:![image-20180805110949122](/var/folders/7b/sz6pt5jd3y3b51q1ngm_8pph0000gn/T/abnerworks.Typora/image-20180805110949122.png)
* vue 2014年,  用户体验好  star:![image-20180805110909812](/var/folders/7b/sz6pt5jd3y3b51q1ngm_8pph0000gn/T/abnerworks.Typora/image-20180805110909812.png)

#### (2).前端框架与库的区别?

* jquery 库 -> DOM(操作DOM) + 请求

* art-template 库 -> 模板引擎

* 框架 = 全方位功能齐全

  

  - 简易的DOM体验 + 发请求 + 模板引擎 + 路由功能

* KFC的世界里,库就是一个小套餐, 框架就是全家桶

* 代码上的不同
  - 一般使用库的代码，是调用某个函数，我们自己把控库的代码
  - 一般使用框架，其框架在帮我们运行我们编写好的代码
    - 框架:  初始化自身的一些行为
      - 执行你所编写的代码
      - 施放一些资源

#### (3).vue起步

* 1:引包
* 2:启动 new Vue({el:目的地,template:模板内容});

* options
  * 目的地 el

  * 内容 template

  * 数据 data  保存数据属性

    数据驱动视图



#### vue的文件介绍

#### (4).插值表达式 
* {{ 表达式 }}
  - 对象 (不要连续3个{{ {name:'jack'} }})
  - 字符串 {{ 'xxx' }}
  - 判断后的布尔值  {{  true }}
  - 三元表达式  {{ true?'是正确':'错误'  }}
* 可以用于页面中简单粗暴的调试


* 注意: 必须在data这个函数中返回的对象中声明

#### (5).什么是指令

* 在vue中提供了一些对于页面 + 数据的更为方便的输出,这些操作就叫做指令, 以v-xxx表示
  * 比如html页面中的属性 ```<div v-xxx ></div>``


* 比如在angular中 以ng-xxx开头的就叫做指令
* 在vue中 以v-xxx开头的就叫做指令
* 指令中封装了一些DOM行为, 结合属性作为一个暗号, 暗号有对应的值,根据不同的值，框架会进行相关DOM操作的绑定


#### (6).vue中常用的v-指令演示
* v-text:元素的InnerText属性,必须是双标签 跟{{ }}效果是一样的 使用较少
* v-html: 元素的innerHTML
* v-if : 判断是否插入这个元素,相当于对元素的销毁和创建
* v-else-if
* v-else
* v-show 隐藏元素  如果确定要隐藏,   会给元素的style加上display:none。是基于css样式的切换

```javascript
 v-text 只能用在双标签中
 v-text 其实就是给元素的innerText赋值
 v-html 其实就是给元素的innerHTML赋值
 v-if 如果值为false,会留下一个<!---->作为标记，万一未来v-if的值是true了，就在这里插入元素
 如果有if和else就不需要单独留坑了
 如果全用上  v-if 相邻v-else-if 相邻 v-else 否则 v-else-if可以不用
 v-if和v-else-if都有等于对应的值，而v-else直接写
 v-if家族都是对元素进行插入和移除的操作
 v-show是显示与否的问题
 注意: 指令其实就是利用属性作为标识符,简化DOM操作,
  看：v-model="xxx"
  v-model 代表要做什么  xxx代表针对的js内存对象
  写在那个元素上，就对哪个元素操作

```
#### (7).v-if和v-show的区别 (官网解释)

`v-if` 是“真正”的条件渲染，因为它会确保在切换过程中条件块内的事件监听器和子组件适当地被销毁和重建。

`v-if` 也是**惰性的**：如果在初始渲染时条件为假，则什么也不做——直到条件第一次变为真时，才会开始渲染条件块。

相比之下，`v-show` 就简单得多——不管初始条件是什么，元素总是会被渲染，并且只是简单地基于 CSS 进行切换。

一般来说，`v-if` 有更高的切换开销，而 `v-show` 有更高的初始渲染开销。因此，如果需要非常频繁地切换，则使用 `v-show` 较好；如果在运行时条件很少改变，则使用 `v-if` 较好。

#### (8).v-bind使用

* 给元素的属性赋值  <div id="{{变量}}"></div>
  - 可以给已经存在的属性赋值 input value
  - 也可以给自定义属性赋值 mydata

* 语法 在元素上 `v-bind:属性名="常量||变量名"`

* 简写形式 `:属性名="变量名"`

* ```html
  <div v-bind:原属性名="变量"></div>
  <div :属性名="变量">
      
  </div>
  ```


#### (9).v-on的使用
* 处理自定义原生事件的,给按钮添加click并让使用变量的样式改变
* 普通使用   ```v-on:事件名="表达式||函数名"```
* 简写方式  ``` @事件名="表达式"```

#### 1-9知识点阶段总结

* 如何启动vue  : 1:引包 2:留坑 3:启动(new Vue)   
  * options:  el/template/data函数
* 更便捷的操作DOM及数据  v-xxx指令
  * v-text/v-html/v-if/v-show/v-bind/v-on
  * v-bind绑定属性值
  * v-on绑定事件





#### (10).v-model

* 双向数据流（绑定）
  * 页面改变影响内存(js)
  * 内存(js)改变影响页面

#### (11).v-bind 和 v-model 的区别?
* `input v-model="name"`
  - 双向数据绑定  页面对于input的value改变，能影响内存中name变量
  - 内存js改变name的值，会影响页面重新渲染最新值
* `input :value="name"`
  - 单向数据绑定 内存改变影响页面改变
* v-model: 其的改变影响其他  v-bind: 其的改变不影响其他
* v-bind就是对属性的简单赋值,当内存中值改变，还是会触发重新渲染

#### (12).v-for的使用
* 基本语法 `v-for="item in arr"`
* 对象的操作 `v-for="item in obj"`
* 如果是数组没有id
  * `v-for="(item,index) in arr" :class="index" `
* 各中v-for的属性顺序(了解)
  * 数组 item,index
  * 对象 value,key,index

##### 漂亮的列表
* class 是可变的


#### 关于对象内的this

* vue已经把以前this是window或者事件对象的问题搞定了
* methods和data本身是在同一个对象中的,所以在该对象中可以通过this.随意取
* this.xxx 取data中的值, this.xxxMethod调methods中的函数

#### (13).局部组件的使用

​	渲染组件-父使用子组件

* 1: 创建子组件(对象)
    - `var Header = { template:'模板' , data是一个函数,methods:功能,components:子组件们 } `
* 2: 在父组件中声明,根属性`components:{ 组件名:组件对象 }`
* 3: 在父组件要用的地方使用 `<组件名></组件名>`
    - 在不同框架中,有的不支持大写字母，用的时候
        + 组件名 MyHeader
        + 使用 my-header
* 总结: 有父，声子，挂子，用子

### （14）组件深入
---
#### 父子组件传值(父传子)
* 1:父用子的时候通过属性Prop传递
* 2:子要声明props:['属性名'] 来接收
* 3:收到就是自己的了，随便你用
    - 在template中 直接用
    - 在js中 this.属性名 用
* 总结:父传,子声明,就是子的了
* 小补充: 常量传递直接用，变量传递加冒号
* ![image-20180811220901826](/var/folders/7b/sz6pt5jd3y3b51q1ngm_8pph0000gn/T/abnerworks.Typora/image-20180811220901826.png)




#### 总结父传子

* 父用子     先声子,挂子,用子
* 父传子     父传子(属性),子声明(收),子直接用(就是自己的一样)







#### 注册全局组件
* 应用场景: 多出使用的公共性功能组件，就可以注册成全局组件,减少冗余代码
* 全局API `Vue.component('组件名',组件对象);`

#### 附加功能:过滤器&监视改动
* filter
    * 将数据进行添油加醋的操作
    * 过滤器分为两种
        * 1:组件内的过滤器(组件内有效)
        * 2:全局过滤器(所有组件共享)
    * 先注册,后使用
    * 组件内 `filters:{ 过滤器名:过滤器fn }` 最终fn内通过return产出最终的数据
    * 使用方式是 `{{ 原有数据 | 过滤器名  }}`
    * 需求
        * 页面input框输入字符串, 另一边显示其反转的内容
    * 过滤器fn:
        * 声明`function(data,argv1,argv2...){}`
        * 使用`{{ 数据 | 过滤器名(参数1,参数2) }}`
* watch 监视单个
* computed 监视多个

#### 模块化
* webpack命令
  `npm init -y`
  `npm install webpack@2.2.1 --save-dev --registry https://registry.npm.taobao.org`
* package.json文件
  `"scripts": {
    "test": "webpack ./main.js ./build.js"
  },`
* 命令行运行 `npm run test`

#### ES6模块
* 导入和导出只能存在顶级作用域
* require引入是代码执行的时候才加载
* import 和export 都是提前加载 ，加载在代码执行之前

#### 箭头函数和function
* 一方面箭头函数是种简写形式
* 应用场景: 由于箭头函数本身没有this和arguments，通常用在事件类的回调函数上，让其向上级function绑定this，而非事件对象
* 箭头函数不可以作为构造函数

#### ES6函数简写
* 用在对象的属性中
```javascript
fn3() { //干掉了:function,用在对象的属性中
				console.log(this);
},
```

#### key
* 使用子组件循环输出一堆数据
* 不依赖子组件状态或临时 DOM 状态 (例如：表单输入值) 的列表渲染输出。
* 建议v-for就写，提升性能，避免vue运算,key就是记录元素与dom间的位置关系

```html
<son v-for="(item,index) in persons" :key="index" ></son>
```
#### slot
* slot就是子组件里给DOM留下的坑
* <子组件>DOM</子组件>
* slot动态的DOM、props是动态的数据

#### 组件生命周期
* 需要频繁的创建和销毁组件
  - 比如页面中部分内容显示与隐藏，但是用的是v-if
* 组件缓存
  - 内置组件中<keep-alive>
  - 被其包裹的组件，在v-if=false的时候，不会销毁，而是停用
  - v-if="true" 不会创建,而是激活
  - 避免频繁创建组件对象的性能损耗
* 成对比较
  - created 和 beforeCreate 
    + A 可以操作数据 B 数据没有初始化
  - mounted 和 beforeMount
    + A 可以操作DOM B 还未生成DOM
  - updated 和 beforeUpdate
    + A 可以获取最终数据 B 可以二次修改
  - 频繁销毁创建的组件使用内置组件<keep-alive></keep-alive>包裹

```javascript
	activated(){  //激活的 keep-alive v-if="true"
		console.log('activated')
	},
	deactivated(){  //停用的 keep-alive v-if="false"
		console.log('deactivated')
	},
	beforeDestroy(){ //销毁前 v-if="false"
		console.log('beforeDestroy')
	},
	destroyed(){//销毁后 v-if="false"
		console.log('destroyed')
	},
```

#### 获取DOM元素
* 救命稻草, document.querySelector
* 1: 在template中标识元素 ref="xxxx"
* 2: 在要获取的时候, this.$refs.xxxx 获取元素
  - 创建组件,装载DOM,用户点击按钮

* ref在DOM上获取的是原生DOM对象
* ref在组件上获取的是组件对象
  - $el 是拿其DOM
  - 这个对象就相当于我们平时玩的this,也可以直接调用函数




### 准备开始
---


### vue基础

---

#### (1).历史介绍
* angular 09年，年份较早，一开始大家是拒绝  star:![image-20180805111029197](/var/folders/7b/sz6pt5jd3y3b51q1ngm_8pph0000gn/T/abnerworks.Typora/image-20180805111029197.png)
* react 2013年, 用户体验好，直接拉到一堆粉丝 star:![image-20180805110949122](/var/folders/7b/sz6pt5jd3y3b51q1ngm_8pph0000gn/T/abnerworks.Typora/image-20180805110949122.png)
* vue 2014年,  用户体验好  star:![image-20180805110909812](/var/folders/7b/sz6pt5jd3y3b51q1ngm_8pph0000gn/T/abnerworks.Typora/image-20180805110909812.png)

#### (2).前端框架与库的区别?

* jquery 库 -> DOM(操作DOM) + 请求

* art-template 库 -> 模板引擎

* 框架 = 全方位功能齐全

  

  - 简易的DOM体验 + 发请求 + 模板引擎 + 路由功能

* KFC的世界里,库就是一个小套餐, 框架就是全家桶

* 代码上的不同
  - 一般使用库的代码，是调用某个函数，我们自己把控库的代码
  - 一般使用框架，其框架在帮我们运行我们编写好的代码
    - 框架:  初始化自身的一些行为
      - 执行你所编写的代码
      - 施放一些资源

#### (3).vue起步

* 1:引包
* 2:启动 new Vue({el:目的地,template:模板内容});

* options
  * 目的地 el

  * 内容 template

  * 数据 data  保存数据属性

    数据驱动视图



#### vue的文件介绍

#### (4).插值表达式 
* {{ 表达式 }}
  - 对象 (不要连续3个{{ {name:'jack'} }})
  - 字符串 {{ 'xxx' }}
  - 判断后的布尔值  {{  true }}
  - 三元表达式  {{ true?'是正确':'错误'  }}
* 可以用于页面中简单粗暴的调试


* 注意: 必须在data这个函数中返回的对象中声明

#### (5).什么是指令

* 在vue中提供了一些对于页面 + 数据的更为方便的输出,这些操作就叫做指令, 以v-xxx表示
  * 比如html页面中的属性 ```<div v-xxx ></div>``


* 比如在angular中 以ng-xxx开头的就叫做指令
* 在vue中 以v-xxx开头的就叫做指令
* 指令中封装了一些DOM行为, 结合属性作为一个暗号, 暗号有对应的值,根据不同的值，框架会进行相关DOM操作的绑定


#### (6).vue中常用的v-指令演示
* v-text:元素的InnerText属性,必须是双标签 跟{{ }}效果是一样的 使用较少
* v-html: 元素的innerHTML
* v-if : 判断是否插入这个元素,相当于对元素的销毁和创建
* v-else-if
* v-else
* v-show 隐藏元素  如果确定要隐藏,   会给元素的style加上display:none。是基于css样式的切换

```javascript
 v-text 只能用在双标签中
 v-text 其实就是给元素的innerText赋值
 v-html 其实就是给元素的innerHTML赋值
 v-if 如果值为false,会留下一个<!---->作为标记，万一未来v-if的值是true了，就在这里插入元素
 如果有if和else就不需要单独留坑了
 如果全用上  v-if 相邻v-else-if 相邻 v-else 否则 v-else-if可以不用
 v-if和v-else-if都有等于对应的值，而v-else直接写
 v-if家族都是对元素进行插入和移除的操作
 v-show是显示与否的问题
 注意: 指令其实就是利用属性作为标识符,简化DOM操作,
  看：v-model="xxx"
  v-model 代表要做什么  xxx代表针对的js内存对象
  写在那个元素上，就对哪个元素操作

```
#### (7).v-if和v-show的区别 (官网解释)

`v-if` 是“真正”的条件渲染，因为它会确保在切换过程中条件块内的事件监听器和子组件适当地被销毁和重建。

`v-if` 也是**惰性的**：如果在初始渲染时条件为假，则什么也不做——直到条件第一次变为真时，才会开始渲染条件块。

相比之下，`v-show` 就简单得多——不管初始条件是什么，元素总是会被渲染，并且只是简单地基于 CSS 进行切换。

一般来说，`v-if` 有更高的切换开销，而 `v-show` 有更高的初始渲染开销。因此，如果需要非常频繁地切换，则使用 `v-show` 较好；如果在运行时条件很少改变，则使用 `v-if` 较好。

#### (8).v-bind使用

* 给元素的属性赋值  <div id="{{变量}}"></div>
  - 可以给已经存在的属性赋值 input value
  - 也可以给自定义属性赋值 mydata

* 语法 在元素上 `v-bind:属性名="常量||变量名"`

* 简写形式 `:属性名="变量名"`

* ```html
  <div v-bind:原属性名="变量"></div>
  <div :属性名="变量">
      
  </div>
  ```


#### (9).v-on的使用
* 处理自定义原生事件的,给按钮添加click并让使用变量的样式改变
* 普通使用   ```v-on:事件名="表达式||函数名"```
* 简写方式  ``` @事件名="表达式"```

#### 1-9知识点阶段总结

* 如何启动vue  : 1:引包 2:留坑 3:启动(new Vue)   
  * options:  el/template/data函数
* 更便捷的操作DOM及数据  v-xxx指令
  * v-text/v-html/v-if/v-show/v-bind/v-on
  * v-bind绑定属性值
  * v-on绑定事件





#### (10).v-model

* 双向数据流（绑定）
  * 页面改变影响内存(js)
  * 内存(js)改变影响页面

#### (11).v-bind 和 v-model 的区别?
* `input v-model="name"`
  - 双向数据绑定  页面对于input的value改变，能影响内存中name变量
  - 内存js改变name的值，会影响页面重新渲染最新值
* `input :value="name"`
  - 单向数据绑定 内存改变影响页面改变
* v-model: 其的改变影响其他  v-bind: 其的改变不影响其他
* v-bind就是对属性的简单赋值,当内存中值改变，还是会触发重新渲染
* ![image-20180811220901826](/var/folders/7b/sz6pt5jd3y3b51q1ngm_8pph0000gn/T/abnerworks.Typora/image-20180811220901826.png)

#### (12).v-for的使用
* 基本语法 `v-for="item in arr"`
* 对象的操作 `v-for="item in obj"`
* 如果是数组没有id
  * `v-for="(item,index) in arr" :class="index" `
* 各中v-for的属性顺序(了解)
  * 数组 item,index
  * 对象 value,key,index


#### 关于对象内的this

* vue已经把以前this是window或者事件对象的问题搞定了
* methods和data本身是在同一个对象中的,所以在该对象中可以通过this.随意取
* this.xxx 取data中的值, this.xxxMethod调methods中的函数

#### (13).局部组件的使用

​	渲染组件-父使用子组件

* 1: 创建子组件(对象)
    - `var Header = { template:'模板' , data是一个函数,methods:功能,components:子组件们 } `
* 2: 在父组件中声明,根属性`components:{ 组件名:组件对象 }`
* 3: 在父组件要用的地方使用 `<组件名></组件名>`
    - 在不同框架中,有的不支持大写字母，用的时候
        + 组件名 MyHeader
        + 使用 my-header
* 总结: 有父，声子，挂子，用子

### （14）组件深入
---
#### 父子组件传值(父传子)
* 1:父用子的时候通过属性Prop传递
* 2:子要声明props:['属性名'] 来接收
* 3:收到就是自己的了，随便你用
    - 在template中 直接用
    - 在js中 this.属性名 用
* 总结:父传,子声明,就是子的了
* 小补充: 常量传递直接用，变量传递加冒号
* 




#### 总结父传子

* 父用子     先声子,挂子,用子
* 父传子     父传子(属性),子声明(收),子直接用(就是自己的一样)



#### 子传父

- 1.子要绑定原生事件，在原生事件函数中通过this.$emit(‘自定义的事件名’,arg1);触发父组件中子组件自定义的事件名
- 2.父组件中的子组件```v-bind:自定义事件的名字 = 'fn'```绑定自定义的事件
- 3.父组件 就可以触发fn的函数 数据就可以从子组件中传过来了









#### 注册全局组件
* 应用场景: 多出使用的公共性功能组件，就可以注册成全局组件,减少冗余代码
* 全局API `Vue.component('组件名',组件对象);`

#### 附加功能:过滤器&监视改动
* filters
    * 将数据进行添油加醋的操作

    * 过滤器分为两种
        * 1:组件内的过滤器(组件内有效)

        * 2:全局过滤器(所有组件共享)

          ##### 局部过滤器的使用

          * 先注册,后使用
          * 组件内 `filters:{ 过滤器名:过滤器fn }` 最终fn内通过return产出最终的数据
          * 使用方式是 `{{ 原有数据 | 过滤器名  }}`
          * 需求：
              * 页面input框输入钱数, 另一边显示其前面都加上¥
          * 过滤器fn:
              * 声明`function(data,argv1,argv2...){}`
              * 使用`{{ 数据 | 过滤器名(参数1,参数2) }}`

        #####        全局过滤器的使用

        ##### 		   语法：```Vue.component('过滤器的名字',fn)```

        ##### 		调用：跟局部组件调用方式一样

* watch 监视单个属性

    ```javascript
    watch:{
    
                   
            		//监视复杂类型,无法监视的原因是因为监视的是对象的地址 
            		// obj:function(newV,oldV) {
            		// 	console.log(newV,oldV);
            		// },
            		// key是属于data属性的属性名，value是监视后的行为 fn中的参数（新值，旧值）
            		msg:function (newV,oldV) {
            			console.log(newV,oldV);
    
            			if (newV==='alex') {
            				console.log('sb');
            			}
            		},
                    // 深度监视 ：object ||array
            		stus:{
            			deep:true,//深度监视
            			handler:function (newV,oldV) {
            				console.log(newV[0].name)
            			}
            		}
    ```

    ##### 	小结：  基本数据类型 简单监视，复杂数据类型深度监视   

    

* computed 同时监视多个属性

    ​	默认computed只有getter方法





#### 生命周期

##### 定义：

 每个 Vue 实例在被创建时都要经过从创建倒挂载再到更新、卸载的一系列过程，同时在这个过程中也会运行一些叫做**生命周期钩子**的函数，可以让我们用自己注册的js方法控制整个大局，在这些事件响应方法中的this直接指向的是vue的实例。



##### 钩子函数的执行时间

beforeCreate

> 在实例初始化之后，数据观测(data observer) 和 event/watcher 事件配置之前被调用。

created

> 实例已经创建完成之后被调用。在这一步，实例已完成以下的配置：数据观测(data observer)，属性和方法的运算， watch/event 事件回调。然而，挂载阶段还没开始，$el 属性目前不可见。

beforeMount

> 在挂载开始之前被调用：相关的 render 函数首次被调用。

mounted

> el 被新创建的 vm.$el 替换，并挂载到实例上去之后调用该钩子。

beforeUpdate

> 数据更新时调用，发生在虚拟 DOM 重新渲染和打补丁之前。

updated

> 由于数据更改导致的虚拟 DOM 重新渲染和打补丁，在这之后会调用该钩子。

 

beforeDestroy

> 实例销毁之前调用。在这一步，实例仍然完全可用。

destroyed

> Vue 实例销毁后调用。调用后，Vue 实例指示的所有东西都会解绑定，所有的事件监听器会被移除，所有的子实例也会被销毁。 该钩子在服务器端渲染期间不被调用。

 还有两个特殊的（配合使用keep-alive）：[activated](https://cn.vuejs.org/v2/api/#activated)、[deactivated](https://cn.vuejs.org/v2/api/#deactivated) 

activated

> keep-alive组件被激活时调用

deactivated 

> keep-alive组件被停用时调用
>
> 

##### 钩子函数中该做的事情

created

> 实例已经创建完成，因为它是最早触发的原因可以进行一些数据，资源的请求。

mounted

> 实例已经挂载完成，可以进行一些DOM操作

beforeUpdate

> 可以在这个钩子中进一步地更改状态，这不会触发附加的重渲染过程。

updated

> 可以执行依赖于 DOM 的操作。然而在大多数情况下，你应该避免在此期间更改状态，因为这可能会导致更新无限循环。
>
> 该钩子在服务器端渲染期间不被调用。

destroyed

> 可以执行一些优化操作

keep-alive 

> 在使用vue-router时有时需要使用<keep-alive></keep-alive>来缓存组件状态，这个时候created钩子就不会被重复调用了，如果我们的子组件需要在每次加载的时候进行某些操作，可以使用activated钩子触发。 

#### 模块化

* webpack命令
  `npm init -y`
  `npm install webpack@2.2.1 --save-dev --registry https://registry.npm.taobao.org`
* package.json文件
  `"scripts": {
    "test": "webpack ./main.js ./build.js"
  },`
* 命令行运行 `npm run test`

#### ES6模块
* 导入和导出只能存在顶级作用域
* require引入是代码执行的时候才加载
* import 和export 都是提前加载 ，加载在代码执行之前

#### 箭头函数和function
* 一方面箭头函数是种简写形式
* 应用场景: 由于箭头函数本身没有this和arguments，通常用在事件类的回调函数上，让其向上级function绑定this，而非事件对象
* 箭头函数不可以作为构造函数

#### ES6函数简写
* 用在对象的属性中
```javascript
fn3() { //干掉了:function,用在对象的属性中
				console.log(this);
},
```

#### key
* 使用子组件循环输出一堆数据
* 不依赖子组件状态或临时 DOM 状态 (例如：表单输入值) 的列表渲染输出。
* 建议v-for就写，提升性能，避免vue运算,key就是记录元素与dom间的位置关系

```html
<son v-for="(item,index) in persons" :key="index" ></son>
```
#### slot
* slot就是子组件里给DOM留下的坑
* <子组件>DOM</子组件>
* slot动态的DOM、props是动态的数据

#### 组件生命周期
* 需要频繁的创建和销毁组件
  - 比如页面中部分内容显示与隐藏，但是用的是v-if
* 组件缓存
  - 内置组件中<keep-alive>
  - 被其包裹的组件，在v-if=false的时候，不会销毁，而是停用
  - v-if="true" 不会创建,而是激活
  - 避免频繁创建组件对象的性能损耗
* 成对比较
  - created 和 beforeCreate 
    + A 可以操作数据 B 数据没有初始化
  - mounted 和 beforeMount
    + A 可以操作DOM B 还未生成DOM
  - updated 和 beforeUpdate
    + A 可以获取最终数据 B 可以二次修改
  - 频繁销毁创建的组件使用内置组件<keep-alive></keep-alive>包裹

```javascript
	activated(){  //激活的 keep-alive v-if="true"
		console.log('activated')
	},
	deactivated(){  //停用的 keep-alive v-if="false"
		console.log('deactivated')
	},
	beforeDestroy(){ //销毁前 v-if="false"
		console.log('beforeDestroy')
	},
	destroyed(){//销毁后 v-if="false"
		console.log('destroyed')
	},
```

#### 获取DOM元素
* 救命稻草, document.querySelector
* 1: 在template中标识元素 ref="xxxx"
* 2: 在要获取的时候, this.$refs.xxxx 获取元素
  - 创建组件,装载DOM,用户点击按钮

* ref在DOM上获取的是原生DOM对象
* ref在组件上获取的是组件对象
  - $el 是拿其DOM
  - 这个对象就相当于我们平时玩的this,也可以直接调用函数






### vue补充

#### 获取DOM元素

* 救命稻草, document.querySelector
* 1: 在template中标识元素 ref="xxxx"
* 2: 在要获取的时候, this.$refs.xxxx 获取元素
  * 创建组件,装载DOM,用户点击按钮
* ref在DOM上获取的是原生DOM对象
* ref在组件上获取的是组件对象
  * $el 是拿其DOM
  * 这个对象就相当于我们平时玩的this,也可以直接调用函数



### 路由

------

#### 路由原理

* 传统开发方式 url改变后 立刻发起请求，响应整个页面，渲染整个页面
* SPA 锚点值改变后 不会发起请求,发起ajax请求,局部改变页面数据
  * 页面不跳转 用户体验更好

#### SPA

* single page application(单页应用程序)
* 前端路由
  * 锚点值监视
  * ajax获取动态数据
  * 核心点是锚点值
* 前端框架 Vue/angular/react都很适合开发单页应用

#### 基本使用

* vue-router 
* 其是vue的核心插件
* 1:下载 `npm i vue-router -S`
* 1.2(重要):安装插件`Vue.use(VueRouter);`  
* 2:在main.js中引入vue-router对象 `import VueRouter form './x.js';`
* 3:创建路由对象 `var router = new VueRouter();`
* 4:配置路由规则 `router.addRoutes([路由对象]);`
  * 路由对象`{path:'锚点值',component:要(填坑)显示的组件}`
* 5:将配置好的路由对象交给Vue
  * 在options中传递-> key叫做 router
* 6:留坑(使用组件) `<router-view></router-view>`

#### router-link

* to
* 帮助我们生成a标签的href
* 锚点值代码维护不方便，如果需要改变锚点值名称
  * 则需要改变 [使用次数 + 1（配置规则）] 个地方的代码

#### 命名路由

* 1:给路由对象一个名称 `{ name:'home',path:'/home',component:Home}`
* 2:在router-link的to属性中描述这个规则
  * `<router-link :to="{name:'home'}></router-link>"`
  * 通过名称找路由对象，获取其path，生成自己的href
* 大大降低维护成本，锚点值改变只用在main.js中改变path属性即可



#### 阶段总结

* vue-router使用步骤 : 1:引入 2:安装插件 3:创建路由实例 4:配置路由规则  5:将路由对象关联vue 6:留坑
* router-link   to="/xxx"  命名路由   
  * 1. 在路由规则对象中 加入name属性
    2. 在router-link中  :to="{ name:"xxx'} "

![52855161286](assets/1528551612863.png)



* 生僻API梳理:

  * 1. Vue.use(插件对象);   //  过程中会注册一些全局组件,及给vm或者组件对象挂在属性

    2. 给vm及组件对象挂在的方式  :  Object.defineProperty(Vue.prototype,'$router',{

       ​	get:function () {
       		return 自己的router对象;

       ​	}

       })

#### 参数router-link,

* `Vue.prototype.xxx = {add:fn}`
* 所有组件中，使用this.xxx就能拿到这个对象
* 查询字符串 
  * 1:配置`:to="{name:'detail',query:{id:hero.id} }"`
  * 2:规则 `{name:'detail',path:'/detail',component:Detail}`
  * 3:获取 `this.$route.query.id`
  * 4:生成 `<a href="/detail?id=1">`
* path方式 
  * 4:生成 `<a href="/detail/1">`
  * 1:配置 `:to="{name:'detail',params:{id:hero.id}  }"`
  * 2:规则 `{ name:'detail',path:'/detail/:id'}`
  * 3:获取 `this.$route.params.id`
* 查询字符串配置参数
  * router-link一次
  * 获取的时候一次
* path方式配置参数
  * router-link一次
  * 规则配置的时候声明位置
  * 获取的时候一次
* 总结书写代码注意事项
  * path方式需要在路由规则中声明位置

#### vue-router中的对象

* $route 路由信息对象,只读对象
* $router 路由操作对象,只写对象

#### 嵌套路由


* 市面上所谓的用单页应用框架开发多页应用
  * 嵌套路由
* 案例
  * 进入我的主页显示：电影、歌曲
* 代码思想
  * 1:router-view的细分
    * router-view第一层中，包含一个router-view
  * 2:每一个坑挖好了，要对应单独的组件
* 使用须知: 1:router-view包含router-view 2:路由children路由

#### 知识点介绍

* 路由meta元数据 -> meta是对于路由规则是否需要验证权限的配置
  * 路由对象中 和name属性同级 ```{  meta:{ isChecked:true  }  }```
* 路由钩子 -> 权限控制的函数执行时期
  * 每次路由匹配后,  渲染组件到router-view之前
  * ```router.beforeEach(function(to,from,next) {    } )```



#### 练习

* 1: 使用koa 编写一个服务器...
  * a. /login的请求..    ctx.body = { msg:'ok'}   ```前端用jq发送ajax请求```
* 2: 客户端接收响应以后.如果是ok.  localStroage中保存该值
* 3: 在全局路由守卫中,区分/login 不验证(meta),   /show 要验证,  验证条件就是从localStorage中获取



#### 编程导航

* 1: 跳到指定的锚点,并显示页面 ```this.$router.push({ name:'xxx',query:{id:1},params:{name:'abc'}  });```
* 2: 配置规则 ```{name:'xxx',path:'/xxx/:name'}```
* 3: 根据历史记录.前进或后退
  * ```this.$router.go(-1|1);```
  * 1代表进一步,-1是退一步





### axios

#### 基本使用

```js
Axios.method('url',[,..data],options)
.then(function(res){  })
.catch(function(err) { } )
```

#### 合并请求

* ```js
  this.$axios.all([请求1,请求2])
  .then(  this.$axios.spread(function(res1,res2){  
           
           })
  )
  ```



#### 拦截器
- 单请求配置options: `axios.post(url,data,options);`
- 全局配置defaults: `this.$axios.defaults`
- config : `请求拦截器中的参数`
- response.config `响应拦截器中的参数`

* options
    - baseURL 基础URL路径
    - params 查询字符串（对象）
    - transformRequest 转换请求体数据
    - transformResponse 转换响应体数据
    - headers 头信息
    - data 请求体数据
    - timeout 请求超时，请求多久以后没有响应算是超时（毫秒）




### 模块化

* webpack命令
  npm init -y
  npm install webpack@3.6.0 --save-dev --registry https://registry.npm.taobao.org
* package.json文件
  `"scripts": {
    "test": "webpack ./main.js ./build.js"
  },`
* 命令行运行 npm run test

#### ES6模块

* 导入和导出只能存在顶级作用域
* require引入是代码执行的时候才加载
* import 和export 都是提前加载 ，加载在代码执行之前

#### 箭头函数和function

* 一方面箭头函数是种简写形式
* 应用场景: 由于箭头函数本身没有this和arguments，通常用在事件类的回调函数上，让其向上级function绑定this，而非事件对象
* 箭头函数不可以作为构造函数

#### ES6函数简写

* 用在对象的属性中

    ```js
    fn3() { //干掉了:function,用在对象的属性中

    				console.log(this);

    		},

    ```

    ​


### v-for中key的作用

大家要知道，不仅只是vue中，react中在执行列表渲染时也会要求给每个组件添加key这个属性

如果想知道key的作用，不得我们得聊一下虚拟DOM的Diff算法



所谓虚拟DOM的诞生，使我们可以不直接操作DOM元素，只操作数据便可以重新渲染页面。而隐藏在背后的原理便是其高效的Diff算法，它的核心是基于两个简单的假设：

1. ###### 两个相同的组件产生类似的DOM结构，不同的组件产生不同的DOM结构

2. ###### 同一个层级的一组节点，他们可以通过唯一的id进行区分



下面这张图是react的Diff示意图：

![image-20180820211848710](/var/folders/7b/sz6pt5jd3y3b51q1ngm_8pph0000gn/T/abnerworks.Typora/image-20180820211848710.png)

由此图我们可以看出：

当页面的数据发生变化时，Diff算法只会比较同一层级的节点：

###### 如果节点类型不同，直接干掉前面的节点，再创建并插入新的节点，不会再比较这个节点以后的子节点了

###### 如果节点类型相同，则会重新设置该节点的属性，从而实现节点的更新

当某一层有很多相同的界定啊时，也就是列表节点，Diff算法的更新过程默认情况下也是遵循以上原则

比如下面这个情况

![image-20180820212221368](/var/folders/7b/sz6pt5jd3y3b51q1ngm_8pph0000gn/T/abnerworks.Typora/image-20180820212221368.png)

我们希望可以在B和C之间加一个F,Diff算法默认 执行起来是这样的：

![image-20180820212311533](/var/folders/7b/sz6pt5jd3y3b51q1ngm_8pph0000gn/T/abnerworks.Typora/image-20180820212311533.png)

既把C更新成F,D更新成C,E更新成D,最后再插入E,是不是很没有效率？



所有我们***需要使用key来给每个节点做一个唯一的标识，Diff算法就可以正确的识别此节点，找到正确的位置区插入新的节点***

![image-20180820212507408](/var/folders/7b/sz6pt5jd3y3b51q1ngm_8pph0000gn/T/abnerworks.Typora/image-20180820212507408.png)

所以一句话，***key的作用主要是为了高效的更新虚拟DOM***。另外vue的在使用相同标签名元素的过渡切换时，也会使用到key属性，其目的也是为了让vue可以区分他们，否则vue只会替换其内部属性而不会触发过渡效果。



### $emit和$on进行组件之间的传值

> 注意：$emit和$on的事件必须在一个公共的实例上，才能够触发



需求：

​	1.有A，B，C三个组件，同时挂载到入口组件中

​	2.将A组件中的数据传递到C组件，再将B组件中的数据传递到C组件

```javascript
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>Vue2-单一事件管理组件通信</title>

  
</head>
<body>
  <div id="app">
    <dom-a></dom-a>
    <dom-b></dom-b>
    <dom-c></dom-c>   
  </div>
  <script src="vue.js"></script>
  <script>
    

  //准备一个空的实例对象
  var Event = new Vue();
  console.log(Event);
 
  //组件A
  var A = {
    template: `
      <div>
        <span>我是A组件的数据->{{a}}</span>
        <input type="button" value="把A数据传给C" @click = "send">
      </div>
    `,
    methods: {
      send () {
        alert(1);
        console.log(this);
        Event.$emit("a-msg", this.a);
      }
    },
    data () {
      return {
        a: "我是a组件中数据"
      }
    }
  };
  //组件B
  var B = {
    template: `
      <div>
        <span>我是B组件的数据->{{a}}</span>
        <input type="button" value="把B数据传给C" @click = "send">
      </div>
    `,
    methods: {
      send () {
        Event.$emit("b-msg", this.a);
      }
    },
    data () {
      return {
        a: "我是b组件中数据"
      }
    }
  };
  //组件C
  var C = {
    template: `
      <div>
        <h3>我是C组件</h3>
        <span>接收过来A的数据为: {{a}}</span>
        <br>
        <span>接收过来B的数据为: {{b}}</span>
      </div>
    `,
    mounted () {
      alert(2);
      //接收A组件的数据
      Event.$on("a-msg", (a)=> {
        this.a = a;
      });
 
      //接收B组件的数据
      Event.$on("b-msg",  (b)=> {
        this.b = b;
      });
    },
    data () {
      return {
        a: "",
        b: ""
      }
    }
  };

    new Vue({
      el: "#app",
      components: {
         'dom-a':A,
         'dom-b':B,
         'dom-c':C
      }
    });
  </script>
 
</body>
</html>

```

### vue-router的导航守卫之在导航完成后获取数据

需求：在导航完成之后加载数据。渲染DOM

```javascript
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title></title>
</head>
<body>
	<div id="app"></div>
	<script type="text/javascript" src="vue.js"></script>
	<script type="text/javascript" src="vue-router.js"></script>
	<script type="text/javascript" src="axios.js"></script>
	<script type="text/javascript">

		// 导航完成后获取数据，这让我们有机会在数据获取期间展示一个 loading 状态，还可以在不同视图间展示不同的 loading 状态。
		var Index = {
			template:`
				<div>我是首页</div>
			`
		};

		var Post = {
			data(){
				return {
					loading:false,
					error:null,
					post:null
				}
			},
			template:`
				<div>
					<div class = 'loading' v-if = 'loading'>
						loading.....
					</div>
					<div v-if="error" class = 'error'>
						{{error}}
					</div>
					<div class = 'content' v-if = 'post'>
						<h2>{{post.title}}</h2>
						<p>{{post.body}}</p>
					</div>
				</div>
			`,
			created(){
				// 组件创建完成后获取数据
				// 此时data已经被监听了
				this.fetchData();

			},
			watch:{
				'$route':'fetchData'
			},
			methods:{
				fetchData(){
					this.error = null;
					this.post = null;
					this.loading = true;
					this.$axios.get('http://127.0.0.1:8888/post')
					.then(res=>{
						this.loading = false;
						console.log(res.data);
						this.post = res.data;
					})
					.catch(err=>{
						this.err = err.toString();
					})

				}
			}
		}

		var router = new VueRouter({
			routes:[
				{
					path:'/index',
					name:'index',
					component:Index
				},
				{
					path:'/post',
					name:'post',
					component:Post
				}
			]
		});

		var App = {
			template:`
				<div>
					<router-link :to = "{name:'index'}">首页</router-link>
					<router-link :to = "{name:'post'}">我的博客</router-link>

						<router-view></router-view>


				</div>
			`
		};
		Vue.prototype.$axios  = axios;
		new Vue({
			el:"#app",
			data:{

			},

			components:{
				App
			},
			template:`<App />`,
			router
		});
	</script>
</body>
</html>


```

### vue-router的导航守卫之导航完成之前获取数据

需求：在导航完成之前获取数据，之后再渲染DOM

```javascript
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title></title>
</head>

<body>
    <div id="app"></div>
    <script type="text/javascript" src="vue.js"></script>
    <script type="text/javascript" src="vue-router.js"></script>
    <script type="text/javascript" src="axios.js"></script>
    <script type="text/javascript">
    // 导航完成后获取数据，这让我们有机会在数据获取期间展示一个 loading 状态，还可以在不同视图间展示不同的 loading 状态。

    var vm = null;
    var User = {
        data() {
            return {
                error: null,
                user: ''
            }
        },
        template: `
				<div>
					<div v-if="error" class = 'error'>
						{{error}}
					</div>
					<div class = 'user' v-if = 'user'>
						<h2>{{user}}</h2>
					</div>
				</div>
			`,
        beforeRouteEnter(to, from, next) {
            // 在渲染该组件的对应路由被 confirm 前调用
            // 不！能！获取组件实例 `this`
            // 因为当守卫执行前，组件实例还没被创建


            console.log(to);
            axios.get(`http://127.0.0.1:8888/user/${to.params.id}`)
                .then(res => {

                    next(vm => vm.setData(res.data))

                })
                .catch(err => {
                    console.log(err);
                    next(vm => vm.setError(err));
                })
        },
        beforeRouteUpdate(to, from, next) {
        	 // 在当前路由改变，但是该组件被复用时调用
	    // 举例来说，对于一个带有动态参数的路径 /foo/:id，在 /foo/1 和 /foo/2 之间跳转的时候，
	    // 由于会渲染同样的 Foo 组件，因此组件实例会被复用。而这个钩子就会在这个情况下被调用。
	    // 可以访问组件实例 `this`

            this.user = null;
            this.$axios.get(`http://127.0.0.1:8888/user/${to.params.id}`)
                .then(res => {
                    this.setData(res.data);
                    next();
                })
                .catch(err => {
                 	   this.setError(err);
                    next();
                })



        },
        methods: {
            setData(user) {
                this.$nextTick(() => {
                    this.user = user;
                })
            },
            setError(err) {
                this.err = err.toString();

            }

        }

    }

    var router = new VueRouter({
        routes: [{
            path: '/user/:id',
            name: 'user',
            component: User,

        }]
    });

    var App = {
        template: `
				<div>
					
					<router-link :to = "{name:'user',params:{id:1}}">我的用户1</router-link>
					<router-link :to = "{name:'user',params:{id:2}}">我的用户2</router-link>

						<router-view></router-view>


				</div>
			`
    };
    Vue.prototype.$axios = axios;
    vm = new Vue({
        el: "#app",
        data: {

        },

        components: {
            App
        },
        template: `<App />`,
        router
    });
    </script>
</body>

</html>
```







### vue-cli2.x脚手架的使用

参考链接：https://github.com/vuejs/vue-cli/tree/v2#vue-cli--

安装：

```jade
npm install -g vue-cli
```

用法：

```
$ vue init < template-name >  < project-name >
```

例：

```
$ vue init webpack my-project
```

目前可用的模块包括：

- [webpack](https://github.com/vuejs-templates/webpack) - 一个功能齐全的Webpack + vue-loader设置，具有热重载，linting，测试和css提取功能。
- [webpack-simple](https://github.com/vuejs-templates/webpack-simple) - 一个简单的Webpack + vue-loader设置，用于快速原型设计。
- [browserify](https://github.com/vuejs-templates/browserify) -全功能Browserify + vueify设置用热重装载，linting＆单元测试。
- browserify [-simple](https://github.com/vuejs-templates/browserify-simple) - 一个简单的Browserify + vueify设置，用于快速原型设计。
- [pwa](https://github.com/vuejs-templates/pwa) - 基于webpack模板的vue-cli的PWA模板
- [simple](https://github.com/vuejs-templates/simple) - 单个HTML文件中最简单的Vue设置



相关文件和文件夹的含义：

![image-20180822222713459](/var/folders/7b/sz6pt5jd3y3b51q1ngm_8pph0000gn/T/abnerworks.Typora/image-20180822222713459.png)

![image-20180823225043216](/var/folders/7b/sz6pt5jd3y3b51q1ngm_8pph0000gn/T/abnerworks.Typora/image-20180823225043216.png)

### vue-cli3x脚手架的使用

vue-cli3x的官方文档：https://cli.vuejs.org/

Vue-cli3 中vue.config.js文件配置参考文档：https://cli.vuejs.org/zh/config/#integrity

```javascript
// vue.config.js 配置说明
//官方vue.config.js 参考文档 https://cli.vuejs.org/zh/config/#css-loaderoptions
// 这里只列一部分，具体配置参考文档
module.exports = {
  // 部署生产环境和开发环境下的URL。
  // 默认情况下，Vue CLI 会假设你的应用是被部署在一个域名的根路径上
  //例如 https://www.my-app.com/。如果应用被部署在一个子路径上，你就需要用这个选项指定这个子路径。例如，如果你的应用被部署在 https://www.my-app.com/my-app/，则设置 baseUrl 为 /my-app/。
  baseUrl: process.env.NODE_ENV === "production" ? "./" : "/",
 
  // outputDir: 在npm run build 或 yarn build 时 ，生成文件的目录名称（要和baseUrl的生产环境路径一致）
  outputDir: "dist",
  //用于放置生成的静态资源 (js、css、img、fonts) 的；（项目打包之后，静态资源会放在这个文件夹下）
  assetsDir: "assets",
  //指定生成的 index.html 的输出路径  (打包之后，改变系统默认的index.html的文件名)
  // indexPath: "myIndex.html",
  //默认情况下，生成的静态资源在它们的文件名中包含了 hash 以便更好的控制缓存。你可以通过将这个选项设为 false 来关闭文件名哈希。(false的时候就是让原来的文件名不改变)
  filenameHashing: false,
 
  //   lintOnSave：{ type:Boolean default:true } 问你是否使用eslint
  lintOnSave: true,
  //如果你想要在生产构建时禁用 eslint-loader，你可以用如下配置
  // lintOnSave: process.env.NODE_ENV !== 'production',
 
  //是否使用包含运行时编译器的 Vue 构建版本。设置为 true 后你就可以在 Vue 组件中使用 template 选项了，但是这会让你的应用额外增加 10kb 左右。(默认false)
  // runtimeCompiler: false,
 
  /**
   * 如果你不需要生产环境的 source map，可以将其设置为 false 以加速生产环境构建。
   *  打包之后发现map文件过大，项目文件体积很大，设置为false就可以不输出map文件
   *  map文件的作用在于：项目打包后，代码都是经过压缩加密的，如果运行时报错，输出的错误信息无法准确得知是哪里的代码报错。
   *  有了map就可以像未加密的代码一样，准确的输出是哪一行哪一列有错。
   * */
  productionSourceMap: false,
 
  // 它支持webPack-dev-server的所有选项
  devServer: {
    host: "localhost",
    port: 1111, // 端口号
    https: false, // https:{type:Boolean}
    open: true, //配置自动启动浏览器
    // proxy: 'http://localhost:4000' // 配置跨域处理,只有一个代理
 
    // 配置多个代理
    proxy: {
      "/api": {
        target: "<url>",
        ws: true,
        changeOrigin: true
      },
      "/foo": {
        target: "<other_url>"
      }
    }
  }
};

```



### RESTful



##### RESTful 规范

　　一种软件的架构风格，设计风格，而不是标准，为客户端和服务端的交互提供一组设计原则和约束条件。

##### 一  面向资源编程

　　每个URL代表一种资源，URL中尽量不要用动词，要用名词，往往名词跟数据库表格相对应。

​	一般来说，数据库中的表都是同种记录的集合，所有API中的名词也应该使用复数。

​	举例来说，有一个API提供动物园（zoo）的信息，还包括各种动物和雇员的信息，则它的路径应该设计成下面这样。

```javascript
https://api.example.com/v1/zoos
https://api.example.com/v1/animals
https://api.example.com/v1/employees
```



##### 二  HTTP动词

​	对于资源的具体操作类型，由HTTP动词表示

​	常用的HTTP动词有下面五个(括号里对应的sql命令)

```javascript
GET（SELECT）：从服务器取出资源（一项或多项）。
POST（CREATE）：在服务器新建一个资源。
PUT（UPDATE）：在服务器更新资源（客户端提供改变后的完整资源）。
PATCH（UPDATE）：在服务器更新资源（客户端提供改变的属性）。
DELETE（DELETE）：从服务器删除资源。
```

　　

##### 三  在URL中体现版本

##### 　　https://www.bootcss.com/v1/

　　https://v1.bootcss.com/

##### 四  在URL中体现是否是API

　　https://www.bootcss.com/api/mycss

　　https://api.bootcss.com/mycss

##### 五  在URL中的过滤条件

​	如果记录数量很多，服务器不可能都将它们返回给用户。API应该提供参数，过滤返回结果。

```javascript
?limit=10：指定返回记录的数量
?offset=10：指定返回记录的开始位置。
?page=2&per_page=100：指定第几页，以及每页的记录数。
?sortby=name&order=asc：指定返回结果按照哪个属性排序，以及排序顺序。
?animal_type_id=1：指定筛选条件
```



##### 六  尽量使用HTTPS

　　https://www.bootcss.com/v1/mycss

##### 七  响应时设置状态码

　　1**   信息，服务器收到请求，需要请求者继续执行操作

　　2**  成功，操作被成功接收并处理

　　3**  重定向，需要进一步的操作以完成请求

　　4**  客户端错误，请求包含语法错误或无法完成请求

　　5**  服务器错误，服务器在处理请求的过程中发生了错误

##### 八  返回值

　　GET请求 返回查到所有或单条数据

　　POST请求  返回新增的数据

　　PUT请求  返回更新数据

　　PATCH请求  局部更新  返回更新整条数据

　　DELETE请求  返回值为空

##### 九  返回错误信息

如果状态码是4xx，就应该向用户返回出错信息。一般来说，返回的信息中将error作为键名，出错信息作为键值即可。

```javascript
{
    error: "Invalid API key"
}
```



##### 十   Hypermedia API

　　如果遇到需要跳转的情况 携带调转接口的URL

　Hypermedi API的设计,比如github的API就是这种设计，访问api.github.com会得到一个所有可用的API的网址列表。

```javascript
{
  "current_user_url": "https://api.github.com/user",
  "authorizations_url": "https://api.github.com/authorizations",
  // ...
}
```

从上面可以看到，如果想获取当前用户的信息，应该去访问 api.github.com/user，就会得到下面的记过

```javascript
{
message: "Requires authentication",
documentation_url: "https://developer.github.com/v3/users/#get-the-authenticated-user"
}
```

##### 十一 其他

（1）API的身份认证应该使用OAuth 2.0框架

（2）服务器返回的数据格式，应该尽量使用JSON，避免使用XML




#### #### 处理跨域

* ```js
  proxyTable: {
    '/list': {
      target: 'http://api.xxxxxxxx.com',
      changeOrigin: true,
      pathRewrite: {
        '^/list': '/list'
      }
    }
  }
  ```

* 开发环境以上配置，生产环境服务器拦截ajax代理

#### 特殊场景函数

* 手动完成属性响应式
* 在vue加入元素后对元素的操作



#### 新版cli

* ```npm i -g @vue/cli ```

* vue ui 图形化



#### chrome插件

* devTools  可以看到vuex数据快照状态



#### 开发中必须要踩的坑

* 业务中给state添加属性

* ``` productionSourceMap: true,``` 加快打包速度，增大打包体积 ，依赖.map文件



#### http-server

* npm i -g http-server
*  hs -o -p 9999






