// Car.prototype.carName = 'BM'
// Car.prototype.lang = 4900
// Car.prototype.height = 1400
Car.prototype = {
    
}



function Car(color, owner) {
    this.color = color
    this.owner = owner
    // this.carName = 'BM'
    // this.lang = 4900
    // this.height = 1400
}


var car = new Car('red', 'mr')
var car1 = new Car('green', 'mr1')
console.log(car)
console.log(car1)