let a = [1, 2, 3,4]
let a1 = a.map((i , d, a)=>{
    // 元素、索引、这个数组
    return i -1;
})
console.log(a1);
for(let i of a){
    console.log(i);
}

// let a2 = [1, 2, 3,4]
// let a1 = a2.map((a , b, c, d, e, f)=>{
//     console.log('aaa', a);
//      console.log('bbb',b); 
//       console.log('ccc',c); 
// })