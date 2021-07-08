# beforeCreate  ->  init   -> created
 - [](https://www.cnblogs.com/yuliangbin/p/9348156.html)

# 问: 父组件与子组件的生命周期执行顺序
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