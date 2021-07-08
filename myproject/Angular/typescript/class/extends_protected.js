var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Person2 = /** @class */ (function () {
    function Person2() {
        this.name = 'ming';
        this.parentAge = 20;
        this.parentSex = 'man';
    }
    return Person2;
}());
var Son = /** @class */ (function (_super) {
    __extends(Son, _super);
    function Son() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.sonAge = 23;
        return _this;
    }
    Son.prototype.testParentAge = function () {
        // console.log(this.parentAge);         // private 依旧不能访问
        console.log(this.parentSex); // protected 子类可以访问 
    };
    return Son;
}(Person2));
var s = new Son(); //s -> { name: 'ming', sonAge: 23, parentAge: 20 }
console.log('--s', s);
// s.parentAge = 333;      //外部不能访问  
/**
 * 总结：
 *  1.
 */ 
