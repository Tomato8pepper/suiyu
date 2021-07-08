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
var Animal = /** @class */ (function () {
    function Animal() {
    }
    Animal.prototype.move = function () {
        console.log('roaming the earch');
    };
    return Animal;
}());
//只有抽象类包含抽象方法
var CatLei = /** @class */ (function (_super) {
    __extends(CatLei, _super);
    function CatLei() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    CatLei.prototype.makeSound = function () {
        console.log('旺旺');
    };
    return CatLei;
}(Animal));
var DogLei = /** @class */ (function (_super) {
    __extends(DogLei, _super);
    function DogLei() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    DogLei.prototype.makeSound = function () {
        console.log('喵喵');
    };
    return DogLei;
}(Animal));
new CatLei().makeSound();
new DogLei().makeSound();
