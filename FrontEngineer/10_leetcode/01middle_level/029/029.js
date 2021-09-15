var divide = function(dividend, divisor) {
    if (divisor === 1) return dividend;
  
    // 这种方法很巧妙，即符号相同则为正，不同则为负
    const isNegative = dividend > 0 !== divisor > 0;
  
    const MAX_INTERGER = Math.pow(2, 31);
  
    const res = helper(Math.abs(dividend), Math.abs(divisor));
  
    // overflow
    if (res > MAX_INTERGER - 1 || res < -1 * MAX_INTERGER) {
      return MAX_INTERGER - 1;
    }
  
    return isNegative ? -1 * res : res;
  };
  
  function helper(dividend, divisor) {
    // 二分法
    if (dividend <= 0) return 0;
    if (dividend < divisor) return 0;
    if (divisor === 1) return dividend;
  
    let acc = 2 * divisor;
    let count = 1;
  
    while (dividend - acc > 0) {
      acc += acc;
      count += count;
    }
    // 直接使用位移运算，比如acc >> 1会有问题
    const last = dividend - Math.floor(acc / 2);
  
    return count + helper(last, divisor);
  }