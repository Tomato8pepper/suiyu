// function createTask(ms) {
//     return () => {
//       console.log('start', ms)
//       return new Promise(r => setTimeout(() => {
//         console.log('end', ms)
//         r(ms)
//       }, ms))
//     }
//  }
//  const tasks = Array(5).fill(null).map((_, i) => createTask(i * 1000))
//  // 0 1000 2000 3000 4000 同时计时
//  Promise.all(tasks.map(task => task())).then(console.log)
//  // 等着 所有的 promise 完成
//  Promise.resolve(1).then((r) => {
//      console.log(r);
//  })
//  Promise.resolve(1).then(console.log)
 

 function readFile (fn) {
    fn('hello world')
 }
 readFile ((r) => {
    console.log(r);
 })