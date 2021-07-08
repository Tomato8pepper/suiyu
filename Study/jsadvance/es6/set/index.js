/*
    遍历Array可以采用下标循环，遍历Map和Set就无法使用下标。为了统一集合类型，ES6标准引入了新的iterable类型,
    Array、Map和Set都属于iterable类型, 具有iterable类型的集合可以通过新的for……of循环来遍历。
*/

/**
    Set() 构造函数, 类似于数组, set的成员值没有相同的, NaN === NaN => false, set中可以去重; {}{}认为是不一样
        参数：数组或者具有iterable接口的其他数据进行初始化   返回值：{}
        实例属性: size  长度  
                constructor  set()
        实例方法: add(param) set{}
                delete(param) Boolean
                has(param) Boolean
                clear(param) null
                for...of直接遍历，因为set可以说没有键名或者键名和键值是一样的
                set.keys() set{keys}
                set.values() set{values}
                set.entries() set{[key, value]}
                set.forEach((value, key, 集合本身))
 */


 //第一天的readme.md


let set = new Set()          // s: {}
// console.log('---Set()实例:', set);

console.log('---constructor', set.constructor);
console.log('---size', set.size);


set.add(1, 1.11).add(2).add('2').add(NaN).add(NaN).add('wn').add({name: 'wn'}).add({name: 'wn'}).add([{age: 12}, {sex: 'man'}]).add([{age: 12}, {sex: 'man'}])          // s: { 1, 2,'2', NaN, 'wn', { name: 'wn' }, { name: 'wn' }, [ { age: 12 }, { sex: 'man' } ], [ { age: 12 }, { sex: 'man' } ] }
// console.log('---add():', set);
for(let key of set) {
    // console.log('---输出:', key);
}
console.log(set.entries());
for(let key of set.keys()) {
    // console.log('---键名:', key);
}
for(let value of set.values()) {
    // console.log('---键值:', value);
}
for(let key of set.entries()) {
    // console.log('---键值对:', key);
}
console.log(set.delete({name: 'wn'}));    //返回false 不能删除
// console.log('---delete(object):', set);
console.log(set.delete(1));               //返回true
// console.log('---delete(number)', set);
console.log('---has:', set.has('wn'));                //返回true
console.log('---has:', set.has({name: 'wn'}));        //返回false
console.log('---clear:', set.clear());                //返回一个空Set()实例
console.log('---转数组:', Array.from(set));

//并集, 交集
let set1 = new Set([1, 2, 3, 4])
let set2 = new Set([2, 3, 5])
let union = new Set([...set1, ...set2])
console.log('---并集:', union);

let intersect = new Set([...set1].filter(x => !set2.has(x)))
console.log('---交集:', intersect);



/**
 * WeakSet()构造函数，与set()类似.
 * 区别:  1.成员只能是对象类型      2.不能被遍历
 *      参数: 可以接受一个数组或类似数组的对象作为参数，参数的成员必须是对象。
 *      方法: ws.add(param)  WeakSet{}
 *            ws.delete(param) null
 *            ws.has(param)  Boolean
 */

const ws = new WeakSet()         //WeakSet{}
// console.log('---weakset:', ws); 
ws.add([1, 2], [3, 4])           //weakset{}
console.log('---add:', ws);




// 数组，字符串去重
let array = [1, 2, 2, 2, 3, 3, 3];
let [a, ...b] = [1, 2, 3, 4];             // a = 1; b = [2, 3, 4]
console.log([...new Set(array)]);        // [1, 2, 3]
let str = 'abcabc'
console.log([...new Set(str)]);          // ['a', 'b', 'c']



/**
 * 对象的解构赋值：
 * 对象的解构与数组有一个重要的不同。数组的元素是按次序排列的，变量的取值由它的位置决定；
 * 而对象的属性没有次序，变量必须与属性同名，才能取到正确的值。
 */
let person = {
    name: 'wn',
    age: 20,
    sex: 'man'
}
let { age } = person             // age: 20
let { name: myname } = person    // myname: 'wn'




//Array() 构造函数    参数： any     返回值： [any]
let arr = new Array()      // arr: []
arr.push(1); arr.push(2); arr.push({name: 'wn'}) //[1, 2, {name: 'wn'}]
arr.includes(1)            //返回：true 
arr.forEach(param => {
    //param 数组中的每一个元素
    // 操作
})