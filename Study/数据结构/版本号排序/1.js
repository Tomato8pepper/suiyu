/*
版本号排序
输入：
['1.1.1.1.1.1', '6', '5.4.3', '2.3.1', '2.3.1.1'] 
返回从大到小的版本号数组
[6, 7, 8]
5.4.3
5.4.2
*/

function compareVersion(v1, v2) {
    let v1Arr = v1.split('.')
    let v2Arr = v2.split('.')
    let len = Math.max(v1Arr.length, v2Arr.length);
    for (let i = 0; i < len; i ++) {
      let v1Num = Number(v1Arr[i] ? v1Arr[i] : 0),
      v2Num = Number(v2Arr[i] ? v2Arr[i] : 0);
      if (v1Num > v2Num) {
        return 1
      } else if (v1Num < v2Num) {
        return -1
      }
    }
    return 0;
  }
// 1, -1, 0
//sort()

console.log(compareVersion('5.4.9', '5.4.11'))

let arr = ['1.1.1.1.1.1', '6', '5.4.3', '2.3.1', '2.3.1.1']
console.log('====', arr.sort(compareVersion))