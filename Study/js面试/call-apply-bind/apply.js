Function.prototype.myapply = function (context) {
    // this指向调用call的对象
    if (typeof this !== 'function') {
        //调用call的不是函数
        throw new TypeError('Error')
    }
    const fn = Symbol('fn')
    const args = arguments[1]
    context = context || window
    // 将调用call函数的对象添加到context的属性中
    context[fn] = this
    // 执行该属性
    const result = context[fn](...args)
    // 删除该属性
    delete context[fn]
    // 返回执行结果
    return result
}
let name = 'bar'
function bar() {
    console.log(this.name);
}
let obj = {
    name: 'obj',
}
bar.myapply(obj, [1, 2, 3])