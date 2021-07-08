// S   100
// A   20
// B   18
// C   16
// D   12
// @author zmg
// @data   09.12
// @params number level
// @return
function calculateBonus1(salar, level = 'B') {
    // console.log(arguments)
    console.log(typeof(salar - 0))
    // if (arguments.length < 2) {
    //     throw new Error('请输入薪资和等级两个参数')
    // }
    if(typeof +salar != 'number' || salar < 0){
        throw new TypeError('salar需要时正整数')
    }
    salar = parseInt(salar)  
    
    if(['A', 'B', 'C', 'D', 'S'].indexOf(level) == -1) {
        throw new Error('错误的等级')
    }
        switch (level) {
            case 'S':
                return salar * 100
                break
            case 'A':
                return salar * 20
                break
            case 'B':
                return salar * 18
                break
            case 'C':
                return salar * 16
                break
            default:
                return salar * 12
        }
        return salar * 16
}
// console.log(calculateBonus1(2, 'A'))
console.log(calculateBonus1(2000))
// var sal = prompt('请输入您的基本薪资')
// var lev = prompt('请输入您的薪资等级')
// calculateBonus1(sal, lev)
// console.log(i)