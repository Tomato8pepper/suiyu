/**
 * 它类似于对象，也是键值对的集合，但是“键”的范围不限于字符串，各种类型的值（包括对象）都可以当作键。
 * 也就是说，Object 结构提供了“字符串—值”的对应，Map 结构提供了“值—值”的对应，是一种更完善的 Hash 结构实现。
 * 注意：1.num类型可以做键名, 0只有一个键, NaN默认为一个
 * map 构造函数：
 *      参数: 接受一个数组作为参数，该数组的成员是一个个表示键值对的数组。任何具有 Iterator 接口、且
 *            每个成员都是一个双元素的数组的数据结构, Set和Map都可以用来生成新的 Map。
 *      属性: map.size  成员总数
 *      方法: map.set(key, value)  map: {}
 *              map.get(key)       value
 *              map.has(key)       Boolean
 *              map.delete(key)    Boolean
 *              map.clear()        null
 *              四种遍历方法：
 */

const map = new Map([['name', 'wn'], ['age', 20]]);    //{ 'name' => 'wn', 'age' => 20 }
// console.log('---实例:', map);                   
map.set(1, 2).set('sex', 'man')
// console.log('---set:', map);
console.log('---size:', map.size);          //4
console.log('---get:', map.get(1));         //2
console.log('---delete:', map.delete('name'));      //true
map.forEach((value, key, coll) =>{
    // console.log('---forEach', key, value, coll);
})


let set = new Set([[1, 1.1], [2, 2.2]]);
console.log('---set:', set);
let mapSet = new Map(set);
console.log('---setparam:', mapSet);


//拓展变成数组
console.log('---...', [...map]);







/**
 * WeakMap 构造函数
 * 与map区别： 1. WeakMap只接受对象作为键名（null除外），不接受其他类型的值作为键名。
 *            2. 其次，WeakMap的键名所指向的对象，不计入垃圾回收机制。
 *        参数: 
 *        方法: get()、set()、has()、delete()
 */
