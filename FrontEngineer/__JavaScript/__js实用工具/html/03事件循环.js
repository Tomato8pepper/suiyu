// setTimeout(() => {
//     console.log(1)
// }, 0)

// setTimeout(() => {
//     console.log(3);
// }, 0);

// new Promise((resolve, reject) =>{
//     console.log(2)
// })

// 结果是： 2 1 3


/* 进程和线程的区别？
        进程: 是指cpu在运行指令及保存和加载上下文所需的时间。
        线程: 是进程中的一个更小的单位，它描述的是执行一段指令所需要的时间。

   如何理解js中的单线程？
        在浏览器的渲染过程中，加载js的时候，会阻塞浏览器的页面渲染。这是因为线程是互斥的，js又是单线程的。

   js单线程的好处？
        1.不安全的渲染
        2.节约内存

   什么是执行栈？
        执行栈是一个存储函数调用的栈结构

   Event-Loop 事件循环
        同步代码
        异步代码  - 微任务(microtask)   - 宏任务(macrotask)

            微任务: process.nextTick, promise, MutationObserver 
            宏任务: script, setTimeout, setInterval, setImmdiate, I/O, UI rendering

   Event-Loop执行顺序
        1.同步代码先执行，这属于宏任务
        2.当执行完同步代码后，执行栈为空，查询是否有异步代码需要执行
        3.执行微任务
        4.当执行完所有的微任务后，如果有必要会渲染页面
        5.然后开始下一轮 Event Loop 然后执行宏任务中的异步代码
    
        微任务一定快于宏任务？   错误，只有当执行完script这个宏任务之后才可以说

*/


console.log('script start');
async function async1() {        //async await封装了promise    新版浏览器读await的速度更快，让出线程
    console.log(123);
    await async2()               //执行之前都是同步  去掉await之后就都是同步
    console.log('async1 end');
}
async function async2() {
    console.log('async2 end');
}

async1()
                                                        //  ss    
setTimeout(() => {
    console.log('setTimeout');
}, 0);

new Promise(resolve =>{
    console.log('Promise');
    resolve()                  //resolve() 执行之前都是同步代码
}) 
.then(() => {
    console.log('promise1');
  })
.then(() => {
    console.log('promise2');
  })

console.log('script end');

// script start
// 123
// async2 end
// Promise
// script end
// async1 end
// promise1
// promise2
// setTimeout