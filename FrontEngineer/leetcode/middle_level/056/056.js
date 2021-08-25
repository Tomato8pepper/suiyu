function intersected(a, b) {
    if (a[0] > b[1] || a[1] < b[0]) return false;
    return true;
  }
  
  function mergeTwo(a, b) {
    return [Math.min(a[0], b[0]), Math.max(a[1], b[1])];
  }
  var merge = function (intervals) {
    // 这种算法需要先排序
    intervals.sort((a, b) => a[0] - b[0]);
    for (let i = 0; i < intervals.length - 1; i++) {
      const cur = intervals[i];
      const next = intervals[i + 1];
  
      if (intersected(cur, next)) {
        intervals[i] = undefined;
        intervals[i + 1] = mergeTwo(cur, next);
      }
    }
    return intervals.filter((q) => q);
  };