// 可变 (mutable)
// 不可变(immutable)

let a = { a: 1 };
let b = a;
b.a = 2;
console.log('a', a.a);
console.log('b', b.a);


let c = {
    ...a,
}
c.a = 'c';
console.log('c', c);


let d = [1, 2];
// 复制了一份
d.concat(3);
// console.log(d);
// 重新赋值了
d = d.concat(4);
// console.log(d);

let f = [1, 2, 3, 4, 5, 6, 7]
console.log(f);
let e = f.splice(5, 3)
console.log(e);
// console.log(d.slice(0));