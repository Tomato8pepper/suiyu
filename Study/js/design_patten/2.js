var Bonus = {
    S: function (salar) {
        return 100 * salar
    },
    A: function (salar) {
        return 20 * salar
    },
    B: function (salar) {
        return 18 * salar
    },
    C: function (salar) {
        return 16 * salar
    },
    D: function (salar) {
        return 12 * salar
    }
}
function calculateBonus(salar, level = 'C') {
    console.log(typeof level)
    console.log(typeof salar)
    return Bonus[level](salar)
}

console.log(calculateBonus(20000,'A'))