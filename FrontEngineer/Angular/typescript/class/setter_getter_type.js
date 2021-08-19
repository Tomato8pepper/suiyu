var Person3 = /** @class */ (function () {
    function Person3() {
        this._age = 12;
    }
    Object.defineProperty(Person3.prototype, "age", {
        //提供公共的访问方式
        get: function () {
            return this._age;
        },
        set: function (newAge) {
            if (newAge > 100 || newAge < 0) {
                alert('年龄不合法!');
            }
            else {
                this._age = newAge;
            }
            this._age = newAge;
        },
        enumerable: false,
        configurable: true
    });
    return Person3;
}());
var p = new Person3();
//get 获取，   set p.age = -1
p.age = -1;
p.age = 18;
