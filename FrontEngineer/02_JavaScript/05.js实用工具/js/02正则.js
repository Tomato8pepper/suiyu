// 正则的定义
let patt1 = new RegExp('hello1')
let patt2 = /world/

// 正则的使用 
let pat = /is/g
let str = "this is my code..."
let msg = /is/g

console.log('===========数组的方法')
let arr = str.split(' ')
console.log(arr)
console.log(arr.indexOf('is'))

console.log('============正则的方法')
console.log(pat.test(str))
console.log(msg.exec(str))

console.log('=============正则表达式的大小写类型')
// pattern/attributes   g   i  全局分配，区分大小写匹配
// 不区分大小写
let str1 = 'visit NanChang oh my world'
let pat1 = /nanchang/i
let pat11 = /nanchang/g
let pat111 = /nanchang/gi
console.log(pat1.test(str1))
console.log(pat11.test(str1))
console.log(pat111.test(str1))


console.log('==========字符串的正则')
let zfc = 'Visit W3School'
console.log(zfc.search(/w3school/i))


console.log('==========字符串的数字查找   \d')
let zfc1 = '1 plus 2 equl 33'
console.log(zfc1.match(/\d+/))
console.log(zfc1.match(/\d+/g))


console.log('==========字符串的替换')
let zfc2 = 'hello pp! oh I am hungry'
console.log(zfc2.replace(/hungry/,'snail'))


console.log(zfc2.split(''))
console.log(zfc2.split(' '))
console.log(zfc2.split('/\s+'))

console.log('============[abc]查找中括号之间的任何字符')
let zfc3 = 'Is this all there is?'
let pat3 = /[a-h]/g
console.log(zfc3.match(pat3))


console.log('============[^abc]查找中括号之间的没有的字符')
let zfc4 = 'hello pp like jinlong'
let pet4 = /[^a-h]/
let pat4 = /[^a-h]/g
console.log(zfc4.match(pet4))
console.log(zfc4.match(pat4))


console.log('============= |')
let zfc5 = 'hello ziChen! How are you'
let pet5 = /hello|you/
let pat5 = /hello|you/g
console.log(zfc5.match(pet5))
console.log(zfc5.match(pat5))


console.log('========== . \w  \W')
let zfc6 = "That's hot! 100%"
let pat6 = /h.t/g
let pat66 = /\w/g
let pat666 = /\W/g
console.log(zfc6.match(pat6))
console.log(zfc6.match(pat66))
console.log(zfc6.match(pat666))


console.log('============= 边界\b ')
let zf = 'moon'
let pbt = /\bm/g
let pbtt = /n\b/g
console.log(zf.match(pbt))
console.log(zf.match(pbtt))



console.log('=============== n+')
let zf1 = 'hhello yangyang! hello world!'
let pbt1 = /h+/g
let pbt11 = /lo+/g
console.log(zf1.match(pbt1))
console.log(zf1.match(pbt11))



console.log('============= $')
let zf2 = 'Is this his'
let pbt2 = /is$/g
console.log(zf2.match(pbt2))



console.log('===========phone 正则')
let tel = '18279268285'
let tel1 = '18764654984648'
let tel11 = '25465468515'
let tel111 = 'a4897648585'
let pet3 = /^1([3-9])\d{9}$/

console.log(pet3.test(tel))
console.log(pet3.test(tel1))
console.log(pet3.test(tel11))
console.log(pet3.test(tel111))


console.log('===========email 正则')
let email = /(\S)+[@]{1}(\S)+[.]{1}(\w)+/