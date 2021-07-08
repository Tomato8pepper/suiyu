// 第五题:输出什么，
// async/await原理是什么，把下
// 面这段代码翻译成Promise
// function getJson() {
//     return new Promise((reslove, reject) => {
//         setTimeout(function () {
//             console.log(2)
//             reslove(2)
//         }, 2000)
//     })
// }
// async function testAsync() {
//     await getJson()
//     console.log(3)
// }
// testAsync()

function getJson() {
    return new Promise((resolve, reject) =>{
        setTimeout(() => {
            console.log(2);
            resolve(2)
        }, 2000);
    })
}

function testAsync() {
    return Promise.resolve().then((resolve)=>{
        return getJson()
    }).then((res)=>{
        console.log(3);
    })
}
testAsync()