  # 对于MVVM的理解？
   - model 数据模型，可以对数据进行操作和修改的业务逻辑
   - view 将数据转换成ui界面展示出来
   - viewModel 分别于model和view进行交互，用来连接view和model
   联系： view和model都和viewmodel是双向绑定的，view改变，，， model改变，，，

  # beforeCreate  ->  init   -> created
   - [](https://www.cnblogs.com/yuliangbin/p/9348156.html)
   -  1.什么是vue生命周期？
      答： Vue 实例从创建到销毁的过程，就是生命周期。从开始创建、初始化数据、编译模板、挂载Dom→渲染、更新→渲染、销毁等一系列过程，称之为 Vue 的生命周期。

      2.vue生命周期的作用是什么？
      答：它的生命周期中有多个事件钩子，让我们在控制整个Vue实例的过程时更容易形成好的逻辑。

      3.vue生命周期总共有几个阶段？
      答：它可以总共分为8个阶段：创建前/后, 载入前/后,更新前/后,销毁前/销毁后。

      4.第一次页面加载会触发哪几个钩子？
      答：会触发 下面这几个beforeCreate, created, beforeMount, mounted 。

      5.DOM 渲染在 哪个周期中就已经完成？
      答：DOM 渲染在 mounted 中就已经完成了。

  # Vue实现数据双向绑定的原理：Object.defineProperty（）
    

  #### 问: 父组件与子组件的生命周期执行顺序
  - 答:
      - son     beforeCreate()  created()  beforeMount() Mounted() 
                     4               5           6           7   
      - father  beforeCreate()  created()  beforeMount() Mounted()
                    1               2           3           8
  - 问: 为什么父组件的mounted在最后执行
  - 答: 


  # 问: <keep-alive></keep-alive>的作用
   - <keep-alive>
      <component></component>
    </keep-alive>
  - 答:
      - keep-alive是用来给组件做缓存的。
      - 有activated(){}, deactivated(){}这两个生命周期。 
      - 被keep-alive包裹组件不会被立即销毁，并且被缓存到内存当中。命中缓存的时候，会执行activated()周期函数, 
        切换页面的时候会执行deactivated()
  


  # 问: 父子组件通信的方式与类型
  - [详情参考](https://www.jianshu.com/p/15062473ec45) 
  - 答: p->s: props:{ property: string }
            单项数据流，但是不能修改父组件传过来的值，解决方法:
             1.子组件自己存一个数据类型; 
             2.通过emit告知父组件，让父组件修改。父组件直接 :value.sync=""
       s->p: toParent() { this.$emit('methodName', 'sonData')}       
            P: @methodName='getDataFromSon'    getDataFromSon(e){//e包含传过来的数据}
  - 跨层
        上一层级组件：provide: {msg: ''}    下一级组件：inject: ['msg']
    
  # 问: vue中的数据流
  - 答: 
    - vue中一般是单向数据流(不能修改)，v-model指令是双向数据绑定。

  # 问: vue中的data写成函数
  - 答:
    - vue1中使用对象
    - vue2中使用函数，因为函数有自己的作用域，可以使变量私有化。让组件的数据更加安全，使用起来更加方便。

  # 问: vue中的extend 组件拓展
    let component = Vue.extend({
      template: `<div>test</div>
    })

    new Component.$mount('#app')

  # 问: mixin & mixins 的异同
  - 答:
  - mixin和mixins都是向vue中混入一段代码,
  - mixin全局注册一个混入，影响全局的钩子函数
  - mixins代码片段混入

  # 问: computed & watch 的异同
  - computed计算属性，
    需要依赖数据源里面的属性，计算出来的值是有缓存的。页面发生渲染会立即返回之前计算的结果，函数不再执行。
  - watch是观察的动作，监听的值不会有缓存的。页面重新渲染时值不变化也会执行。

  # 问: v-show & v-if
  - 都可以动态控制Dom元素显示与隐藏
  - v-if是将dom元素整个添加或者删除，v-show则是将display的值设置为none
  - v-if比v-show消耗性能

  # 问: 请用代码描述一下vue的响应式原理
  - 手写代码

  # 问: this.$nextTick()
  - 答: 
    - nextTick中的代码一定会在dom结构挂载完成之后就执行。不论nextTick函数写在哪个生命周期函数中。
    - created () { this.nextTick ( () => { console.log(this.$refs.refName)})}


  在下次dom更新循环结束之后执行延迟回调，

  1.DOM更新是什么时候？
  2.下次更新是什么时候。
  3.修改数据之后，是加快了数据更新的进度吗？
  4.什么时候使用。



  # 手写promise
  - 答:
    - const PENDING = 'pending'
      const RESOLVED = 'resolve'
      const REJECTED = 'rejected'
      function MyPromise(fn) {
        const that = this
        that.state = PENDING
        that.value = null            //resolve、 reject接收的值
        that.resolvedCallbacks = []
        that.rejectedCallbacks = []

        function resolve(value) {
          if(that.state === PENDING) {
            that.state = RESOLVED
            that.value = value
            that.resolvedCallbacks.map(cb => {
              return cb(that.value)
            })
          }
        }

        function reject(value) {
          if(that.state === PENDING) {
            that.state = RESOLVED
            that.value = value
            that.rejectedCallbacks.map(cb => {
              return cb(that.value)
            })
          }
        }

        try{
          fn(resolve, reject)
        }catch(error) {
          reject(error)
        }
      }

      MyPromise.prototype.then = function(onFulfilled, onRejected) {
        const that = this
        onFulfilled = typeof onFulfilled === 'function' ? onFulfilled : v => v
        onRejected = typeof onRejected === 'function' ? onRejected : r => { throw r }
        if (that.state === PENDING) {
          that.resolvedCallbacks.push(onFulfilled)
          that.rejectedCallbacks.push(onRejected)
        }
        if (that.state === RESOLVED) {
          onFulfilled(that.value)
        }
        if (that.state === REJECTED) {
          onRejected(that.value)
        }
      }


      let p = new MyPromise()             // { state: 'pending', value: null }



  ## Vue
  - 1. 写 React / Vue 项目时为什么要在列表组件中写 key，其作用是什么？
      - 当 Vue.js 用 v-for 正在更新已渲染过的元素列表时，它默认用“就地复用”策略。如果数据项的顺序被改变，Vue 将不会移动 DOM 元素来匹配数据项的顺序， 而是简单复用此处每个元素，并且确保它在特定索引下显示已被渲染过的每个元素。key的作用主要是为了高效的更新虚拟DOM。
  - 2. 


  ## 数据库
  1. mysql与Redis

  ## 八大排序
  1. 冒泡排序：




  - 37 + 52 + 
  - 2. 前端需要注意哪些SEO
  - 3. <img> 的 title 和 alt 有什么区别
  - 4. HTTP的⼏种请求⽅法⽤途
  - 5. 从浏览器地址栏输⼊url到显示⻚⾯的步骤
  - 6. 如何进⾏⽹站性能优化
  - 7. HTTP状态码及其含义
  - 8. 介绍⼀下你对浏览器内核的理解？
  - 9. html5有哪些新特性、移除了那些元素？
  - 10. HTML5 的离线储存怎么使⽤，⼯作原理能不能解释⼀下？
  - 11. 




### 项目面试
  1. 音乐管理系统
      歌词随时间移动：当发起请求获取到数据以后，通过调用三个函数来实现，先将歌词解析成为对象，在传入得到的对象参数到生成dom的函数，最后通过动画实现滚动。
  
  2. 极客时间app
      api： 路由跳转页面switchTab、navigateTo以及他们的区别。 request等，比如获取设备信息，getUserInfo

  3. 信息管理app



1. 什么是原型和原型链(我答的不是特别专业，但是往继承上面讲了，举例把构造函数的原型关系和继承一起说了)，你项目中哪里用到过这个
      - 当试图找到一个对象的某个属性时，如果该对象没有这个属性，那么就会到它的__proto__（即它的构造函数的prototype）去寻找。如果它的__proto__还是没有则继续在f.proto.proto（也即F.prototype.proto）上寻找。如果直到最上层也没有找到，则返回undefined。
      - 上述找的过程，是一个链式的结构，叫做“原型链”。所有原型链的最上层都是null（即Object.prototype.proto === null）
      - 所有从原型链中得到的方法，在this执行时，都指向了当前触发这个方法的对象。


2. ES6有哪些新特性(我讲了扩展运算符和promise，数组新增的一些方法，set和map以及weakMap和weakSet，重点问了set和map，map一时忘了，犯傻了)
    - var let const 
        变量提升  作用域  重复声明  const常量不可修改(对象)   

3. 常见的数据结构有哪些(栈，队列，忘了还有链表)，
    - 栈、队列、链表、树、图
4. 谈谈你的项目，谈谈简历上没有的(语言没有组织好，建议写篇小作文背下来)
5. 项目中提到cors解决跨域，讲讲怎么做的(项目是用的插件，但是答了cors设置四个请求头)
    - Q：为什么会出现跨域问题？
      A：出于浏览器的同源策略限制，浏览器会拒绝跨域请求。如果没有同源策略，那么很容易受到XSS、 CSRF攻击
    - JSONP <script src="http://example.com/data.php?callback=dosomething"></script>
      兼容性好（兼容低版本IE）
      缺点：1.JSONP只支持GET请求； 2.XMLHttpRequest相对于JSONP有着更好的错误处理机制
    - CORS 是W3C 推荐的一种新的官方方案，能使服务器支持 XMLHttpRequest 的跨域请求。CORS 实现起来非常方便，只需要增加一些 HTTP 头，
    - window.postMessage(message,targetOrigin) 方法是html5新引进的特性，可以使用它来向其它的window对象发送消息，
    - 反向代理

6. 还有哪些解决跨域的方法(完整地描述了JSONP的实现原理)
7. 项目后端是用什么写的，回答node，node相对于其他语言来说有什么优势(不知道)
8. 项目中用到的哪个数据库，mysql，还用过什么其他的数据库，mongoDB，mongoDB有什么特点，和mysql有什么区别(忘了关系型数据库，也怕深究答不出，就一直说mongoDB简单易上手)
9. 轮播图有没有写过(写过，图片顺序排列，js操作dom用定时器改变translate)，最后一张直接跳到第一张时有什么优化手段使其更加优雅
10. 怎么实现懒加载(忘了，凉凉) 
11. 讲讲js单线程和异步任务(我讲的Event-loop)
12. 卷子上写的排序方法里(我写了冒泡和哈希，但是只知道冒泡的原理，8种写不出，也只记得两种，就知道会问实现原理，炸裂)哈希排序什么原理，还有没有其他排序方法
13. 你的项目设计的流程是什么样的
14. 你的职业规划
  


技术面:
1. h5有哪些新特性(不了解哪些是新的)
2. 浏览器有哪些存储方式，都有什么区别(cookie，SessonStorage，localStorage)
3. 如果两个不同url的页面需要传值，可以采取哪个方式(localStorage)
4. get和post的区别(只说了get参数暴露在url，post隐藏在请求头里，感觉没答到点)
5. 元素水平垂直居中(我分行内元素和块级元素，块级又分已知宽高和未知宽高详细说了)
6. css中有哪些常用的单位，详细讲讲他们以及他们的不同点(px, em, rem, vw, vh, 后面四个常用于移动端适配，em和rem兼容性好一点，vw和vh有些浏览器不兼容)
7. herf和src的区别(herf不会阻断进程，src会先加载资源再接着往下走)，所有的src都会阻断进程吗(答了js会，img不会)
8. 浏览器的渲染过程是什么样的
9. 单页应用有什么优缺点(没答上来)
10. vue的生命周期有哪几个
11. vue监听数据变化的方式有哪些(只答了watch，没答computed)
12. ajax同步和异步有什么区别(不知道)
13. 谈谈你了解的状态码(大概讲了一下，1开头讲错了，不太了解，200请求成功，301,302,303,307重定向，304协商缓存，4开头找不到资源，5开头服务端错误)
经理面:
1. 你在公司是怎么部署代码线上测试的
2. 如果后端没有写好，你怎么测试自己的代码
3. 和后端联调时，如果报404该怎么解决
4. 你在公司做了哪个项目，负责哪个部分
5. 你在公司负责的项目整个开发流程是什么样的(pental-Kill直接带走我，没怎么回答到点上)



# 笔试
html5,css3新增标签，问的很细
  - <audio> 标签定义声音，比如音乐或其他音频流。
  - <canvas> 标签定义图形，比如图表和其他图像。
  - <video> 标签定义视频，比如电影片段或其他视频流。controls属性提供播放控件
  - transition属性    属性   持续时间   缓动函数   开始出现的延迟时间
  - text-shadow <水平偏移><纵向偏移><模糊半径><颜色>
  - border-radius: 5px;
  - background-origin: border | padding | content;
骨架屏怎么实现思路
  使用css实现，用animation属性,background-position: 100% 50%;  -> 0 50%;
  vue中：我们可以index.html中的#app的div来实现骨架屏，程序渲染后就会替换掉#app
  

深拷贝实现 不能简单实现
  - json
  - for...in 遍历和赋值
手写数组去重方法 越多越好
  - set 
  - 自己编+splice()
js实现一个循环红灯5秒，黄灯2秒，绿灯3秒
  -
css为什么要初始化
  - 浏览器的默认内外边距不同，方便编程
css选择器 哪些属性可以继承
  - 6种选择器
  - 所有元素可继承的： 
    visibility和cursor 
    终极块级元素可继承的： 
    text-indent和text-align 
    内联元素可继承的： 
    letter-spacing、word-spacing、white-space、line-height、color、font、font-family、font-size、font-style、font-variant、font-weight、text-decoration、text-transform、direction 
    列表元素可继承的： 
    list-style、list-style-type、list-style-position、list-style-image
    cookie sessionstorage loaclstorage区别
水平垂直居中布局 越多越好
  - 定宽高
    - absolute + 负margin
    - absolute + margin auto
    - absolute + calc
  - 未定宽高
    - absolute + transform

  - flex
    display: flex;
    jcc; aic;（移动端完全适应了）

  - inline-box
    line-height, text-align: center;   vertical-align: middle

# 技术面
meta标签的作用
  - <meta> 标签提供关于 HTML 文档的元数据。它不会显示在页面上，但是对于机器是可读的。可用于浏览器（如何 显示内容或重新加载页面），搜索引擎（关键词），或其他 web 服务。
  - meta里的数据是供机器解读的，告诉机器该如何解析这个页面，还有一个用途是可以添加服务器发送到浏览器的http头部内容
  - 必需属性content    可选属性 http-equiv name
var const let 区别，你平时用哪个用的多 为什么

for in for of forEach  map 区别
  - 遍历对象的属性和继承属性
  - 遍历可迭代对象
  - map返回新数组
  - forEach
事件循环
  - ()[https://juejin.cn/post/6844904042481582087]
  - 线程是程序执行的最小单位，而进程是操作系统分配资源的最小单位；
  - 一个进程由一个或多个线程组成，线程是一个进程中代码的不同执行路线
  - 进程之间相互独立，但同一进程下的各个线程之间共享程序的内存空间(包括代码段，数据集，堆等)及一些进程级的资源(如打开文件和信
  - ()[https://juejin.cn/post/6898975636035993607]
事件代理
  - 事件代理就是利用事件冒泡或事件捕获的机制把一系列的内层元素事件绑定到外层元素。
  - ()[https://juejin.cn/post/6844904190280466440]
JS事件流
  -
BFC容器，触发方式，里面元素超过容器会怎样
  - 
输入一个URL到页面渲染经历了什么  详细
原型链说一下
防抖节流实现
浏览器缓存 强缓存 协商缓存
响应式布局你知道哪些，你平时用的是哪个
  - 媒体查询
  - rem布局
  - 百分比

SSR,CSR 服务器端渲染，浏览器渲染
浏览器性能优化说你知道的
如何让加载页面时间更短说你知道的
网络安全 XSS CSRF 原理及预防措施
http协议  TCP UDP
http 与https区别
网络七层协议模型
堆和栈 说一下
git 命令  回滚知道么  git有几个仓库  gitpull 是从哪个拉倒哪个 
promise优缺点 及相关方法 
 -  
vue生命周期 ，你用哪个比较多 原因  beforedestroy和destroyed用过么，一般用来干什么
 - created()
computed和watch区别，分别说下什么情况下使用
 -  1. 支持缓存，只有依赖数据发生改变，才会重新进行计算
    2. 不支持异步，当computed内有异步操作时无效，无法监听数据的变化
    3.computed 属性值会默认走缓存，计算属性是基于它们的响应式依赖进行缓存的，也就是基于data中声明过或者父组件传递的props中的数据通过计算得到的值
    4. 如果一个属性是由其他属性计算而来的，这个属性依赖其他属性，是一个多对一或者一对一，一般用computed
 -  1. 不支持缓存，数据变，直接会触发相应的操作
    2.watch支持异步
    3.监听的函数接收两个参数，第一个参数是最新的值；第二个参数是输入之前的值；
    4. 当一个属性发生变化时，需要执行对应的操作；一对多；

双向数据绑定原理, definedproperty    我说监听不到数组，追问为什么？举个例子如何监听不到
 - 
vue各种组件通信，EVENTBUS ,为什么EVENTBUS 可以实现全局的一个通信
    bus.$emit()   bus.$on

vuex在你项目中怎么使用的，一般拿来干嘛
 -  多个组件依赖于同一状态时。
    来自不同组件的行为需要变更同一状态。

diff算法优缺点
 - 

vue 的优缺点
 - 响应式编程、组件化。
 - 

函数式编程思想了解么 
vue的自带的组件用过么 ？？？可能描述有误 
  - component、transition、keep-alive、slot

vue路由定义的方式 区别是啥
  - vue中路由分为hash和history两种模式
  - 通过 hashchange 事件监听 url 的变化
  - 提供了 pushState 和 replaceState 两个方法，这两个方法改变url的path部分， 不会引起页面刷新

vue不用路由如何实现一小块内容的切换    一个IS+方法名或者组件名实现类似局部组件更换
  - 有组件用组件，
  - 没组件用点击事件、v-show


# 其他项目问题和HR面略




# JS基础与原理
  - 数据类型
  - 对象的使用
  - 构造函数与对象
  - 构造函数的实例以及识别 instanceof && xxx.__proto__.constructor
  - 构造函数实例的原型对象 xxx.prototype 以及构造函数的原型对象
  - 继承：原型链继承（简便方式）、构造函数继承（缺点）、组合继承、寄生组合继承（constructor）、类继承、拷贝继承for...in
  - 原型与原型链
  - 作用域与作用域链
  - 闭包
  - 函数的四种调用方式决定函数内部的this指向
  - call()、apply() 、bind()
  - Es6


问：你在公司做过什么任务？
答：负责过项目的前端部分，利用vue+蓝湖+graceui完成了前端页面，并与后端人员共同协商完成了数据的渲染。
问：你在公司做过什么项目。
答：曾经参与过src项目前端页面优化，星河华讯项目前端部分转账、充值页面以及数据渲染的完成。



# html5 & css3
1. 盒模型
2. BFC
3. 层叠上下文
4. 居中布局
5. 选择器优先级
6. link 与 @import 的区别
7. CSS预处理器(Sass/Less/Postcss)
8. CSS动画


# js
1. script 引入方式：
  html 静态<script>引入
  js 动态插入<script>
  <script defer>: 延迟加载，元素解析完成后执行
  <script async>: 异步加载，但执行时会阻塞元素渲染
2. new运算符的执行过程
   能在实例的 原型对象链 中找到该构造函数的prototype属性所指向的 原型对象，就返回true
3. 模块化
4. 
