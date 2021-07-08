//Object.create 的实现原理

let a = { b: 1 }
let c = Object.create(a)

function create(obj) {
    if(typeof obj !== 'object'){ throw TypeError }
    // function F() {}
    // F.prototype = obj
    // return new F()

    return a = {
        __proto__: obj
    }
}

let d = create(a)
console.log(d);
console.log(a);
console.log(b);