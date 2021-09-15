// function xq() {
//     setTimeout(()=>{
//         console.log('相亲中ing')
//         marry()
//     }, 1000)
// }
function marry() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log('结婚ing')
            resolve('已经结婚了！哈哈')        //执行以便让下一个.then能执行
            // reject('不同意结婚')
        }, 4000)
    })
}
function baby1() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log('生孩子1ing')
            resolve('孩子1出生了！哈哈')
        }, 3000)
    })
}
function baby2() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log('生孩子2ing')
            // resolve('孩子2出生了！哈哈')
            reject('不允许生二个')
        }, 2000)
    })
}
// xq()



let xq = new Promise((resolve, reject) => {
    setTimeout(() => {
        console.log('相亲中ing')
        resolve('相亲成功！哈哈')
    }, 2000)
})
xq.then((res) => {
    console.log(res)
    if (res == '相亲成功！哈哈')
        return marry()
}).then((res) => {
    // consol
    console.log(res)
    return baby1()
}).then((res) => {
    console.log(res)
    return baby2()
}).then((res) => {
    console.log(res)
    // consol
}).catch((err) => {
    console.log(err)
})












function aa() {
    return new Promise((resolve)=>{
        console.log('第一次调用')
        resolve('第一次调用成功')
    })
}
function bb() {
    return new Promise((resolve)=>{
        console.log('第二次调用')
        resolve('第二次调用成功')
    })
}

aa().then((res)=>{
    console.log(res)
    return bb()
}).then((res)=>{
    console.log(res)
}).catch((err)=>{
    console.log(err)
})