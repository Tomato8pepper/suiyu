//call apply bind(返回的是一个函数)
Function.prototype.myBind = function (context) {
    if(typeof this !== 'function') {
        throw new TypeError('Bind must be called on a function')
    }
    // 拿到参数
    const args = [...arguments].slice(1)   //Array.prototype.slice.call(arguments, 1)
    // 保存this
    const that = this
    //定义空函数，用来保存原函数的原型
    const original = function() {}
    // 绑定的函数
    const bound = function() {
        //this instanceof original，判断是否用new来调用bound
        return that.apply(
            this instanceof original ? this : context,
            args.concat(Array.prototype.slice.call(arguments))
        )
    }
    if(this.prototype) {
        original.prototype = this.prototype
    }
    // 修改绑定函数原型指向
    bound.prototype = new original()
    return bound
}
fn.myBind(obj)