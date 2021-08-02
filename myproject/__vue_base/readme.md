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
vuex
