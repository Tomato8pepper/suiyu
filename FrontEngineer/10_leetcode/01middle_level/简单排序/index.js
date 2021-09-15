// 冒泡排序
function bullSort(arr) {
    for (var i = 0; i < arr.length; i++) {
      for (var j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) { // 相邻元素两两对比
          var temp = arr[j + 1] // 相邻元素交换位置
          arr[j + 1] = arr[j]
          arr[j] = temp
        }
      }
    }
    return arr
  }