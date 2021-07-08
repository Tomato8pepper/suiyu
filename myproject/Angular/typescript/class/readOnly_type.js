var Octopus = /** @class */ (function () {
    function Octopus() {
        this.name = "abc";
    }
    return Octopus;
}());
var dad = new Octopus();
console.log(dad.name);
// dad.name = 'Man with the 3-piece suit';      //错误， name属性只是可读的。
