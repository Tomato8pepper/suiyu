var BlackCat = /** @class */ (function () {
    function BlackCat() {
        this.color = 'red';
    }
    BlackCat.prototype.fire = function (str) {
        console.log('黑猫开火了！' + str, this.color);
    };
    return BlackCat;
}());
new BlackCat().fire('piapiapia');
