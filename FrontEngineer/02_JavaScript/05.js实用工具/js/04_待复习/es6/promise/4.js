function a () {
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            console.log('aaa')
            resolve('yes')
        }, 1000)
    })
}
function b() {
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            console.log('bbb')
            resolve('s')
            // reject('no')
        }, 1500)
    })
}
function c() {
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            console.log('ccc')
            resolve('yes')
        }, 2000)
    })
}
function d() {
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            console.log('ddd')
            resolve('yes')
        }, 500)
    })
}


// Promise pending(进行中) resolved(已成功)  reject(已失败)
//finally最后一定执行
// a().then(b).then(c).finally(d)




// class Promise{
//     constructor(){
//         status: 'pending'
//     }
//     resolve(){this.status = 'resolved'}
//     reject(){this.status = 'reject'}
//     then() {
//         if(this.status == 'resolved'){}
//     }
//     catch() {
//         if(this.status == 'reject'){}
//     }
//     finally(){
//         // ....
//     }
//     all(){}
// }


function e() {
    console.log('eeee')
}


//all       必须等d和b都执行完了之后就可以执行e
Promise.all([d(),b()]).then(e)

//race     a和b两个只需执行一个就可以执行e
// Promise.race([a(), b()]).then(e)