function identity(arg) {
    //对于类型的处理或判断，需要用到类型
    return arg;
}
var output = identity('mystring');
console.log(output);
var Test = /** @class */ (function () {
    function Test() {
    }
    // add: (X: S) => S;
    Test.prototype.add = function (X) { return X; };
    return Test;
}());
var test = new Test();
test.name = 112;
var result = test.add('123');
console.log(result);
