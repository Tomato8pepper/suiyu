function backtrack(list, tempList, nums, remain, start) {
    if (remain < 0) return;
    else if (remain === 0) return list.push([...tempList]);
    for (let i = start; i < nums.length; i++) {
      tempList.push(nums[i]);
      backtrack(list, tempList, nums, remain - nums[i], i); // 数字可以重复使用， i + 1代表不可以重复利用
      tempList.pop();
    }
  }
  /**
   * @param {number[]} candidates
   * @param {number} target
   * @return {number[][]}
   */
  var combinationSum = function(candidates, target) {
    const list = [];
    backtrack(list, [], candidates.sort((a, b) => a - b), target, 0);
    return list;
  };