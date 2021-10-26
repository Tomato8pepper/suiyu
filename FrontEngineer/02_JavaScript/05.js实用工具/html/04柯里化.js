// 接收到足够的参数之后就执行原函数
function curry () {

}

function checkByRegExp (regExp, string) {
    return regExp.test(string);
}

let check = curry(checkByRegExp)       
let checkCellPhone = check(/^1\d{10}$/)
let res1 = checkCellPhone('1111111')
let res2 = checkCellPhone('22222')
console.log(res1, res2);


// 遍历一个数组中的多个对象, 
let arr = [{name: 'xx', age: 1}, {name: 'xxx', age: 2}, {name: 'xxxd', age: 3}]
let props = curry(function (key, obj) { return obj[key] })
let names = arr.map(props('name'))