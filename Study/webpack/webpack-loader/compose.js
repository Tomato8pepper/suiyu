var greet = function (name) { return "hi: " + name; };
var exclaim = function (statement) { return statement.toUpperCase() + "!"; };

function compose(...args) {
    //从右往左执行传入的函数
    return function (str) {
        while(args.length) {
            //删除并得到最后一个
            let fn = args.pop()
            str = fn(str)
        }
        return str
    }
}

var welcome = compose(greet, exclaim);
console.log(welcome('moe'));





