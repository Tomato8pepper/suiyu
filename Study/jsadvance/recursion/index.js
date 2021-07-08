function mul(a) {
    if (a == 0) {
        return 1
    }
    return a * mul(a - 1)
}
console.log(mul(5))

// feibo(n) = feibo(n - 1) + feibo(n -2)
// 斐波那锲数列 1 1 2 3 5 8 13 21 ...
function feibo(n) {
    // 出口
    if (n == 1 || n ==2) {
        return 1
    }
    //规律
    return feibo(n - 1) + feibo(n - 2)
}
console.log(feibo(20))
