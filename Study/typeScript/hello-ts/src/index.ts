// function greeter(person: string) {
//     return "Hello, " + person;
// }

// let user = "Jane User";

// document.body.innerHTML = greeter(user);



// 类型声明一律小写
// let idLoading:boolean = false
// idLoading = 123   //警告

// let num = 6
// num = '8'        //警告


// let book = 'typescript'
// book = 1          //警告



// 添加了返回值类型  void  可省
// function warnUser(): void {

// }

// 空值
// const a: void = undefined


// let a1: any = undefined


// sym1 != sym2
// let sym1 = Symbol('key1')
// let sym2 = Symbol('key1')


//BigInt
const max = BigInt(Number.MAX_SAFE_INTEGER)

const max1 = max + 1n 
const max2 = max + 2n

console.log(max1 === max2)
console.log(max1, max2)
