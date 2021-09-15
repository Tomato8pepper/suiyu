console.log('数组去重')
let array = [1, 1, '1', '1']

function unique(arr) {
    for (let i = 0; i < arr.length; i++) {
        for (let j = arr.length; j > i; j--) {
            if (arr[i] === arr[j]) {
                arr.splice(j, 1)
            }
        }
    }
    return arr
}



function unique1(arr) {
    var res = []
    res[0] = array[0]
    var resLen = arr.length
    for (var i = 0; i < arr.length; i++) {
        for (var j = 0; j < resLen; j++) {
            if (arr[i] === res[j]) {
                break
            }
            
        }
        if (j === resLen) {
            res.push(arr[i])
        }
        // console.log(res)
    }
    return res
}
console.log(unique1(array))

