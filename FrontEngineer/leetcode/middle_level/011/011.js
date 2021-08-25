var maxArea = function (height) {
    if (!height || height.length <= 1) return 0;
  
    let leftPos = 0;
    let rightPos = height.length - 1;
    let max = 0;
    while (leftPos < rightPos) {
      const currentArea =
        Math.abs(leftPos - rightPos) *
        Math.min(height[leftPos], height[rightPos]);
      if (currentArea > max) {
        max = currentArea;
      }
      // 更新小的
      if (height[leftPos] < height[rightPos]) {
        leftPos++;
      } else {
        // 如果相等就随便了
        rightPos--;
      }
    }
  
    return max;
  };