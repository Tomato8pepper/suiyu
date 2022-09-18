// [002.Add Two Numbers](https://leetcode-cn.com/problems/add-two-numbers/)
//     Algorithm description:      链表：值域：存放当前节点的值, 指针域：存放下一个节点的内存地址
/*     给出两个非空的链表用来表示两个非负的整数。其中，它们各自的位数是按照逆序的方式存储的，
       并且它们的每个节点只能存储一位数字。如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
       您可以假设除了数字 0 之外，这两个数都不会以 0开头。
       输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
       输出：7 -> 0 -> 8
       原因：342 + 465 = 807   */

/**
 *                  2  4  3             7  2  5         7  2  5
 * 分析：三种情况    5  6  4             2  0  0         5  0  0
                    7  0  8             9  2  5         2  3  5
 */

function ListNode(val, next) {
  this.val = (val === undefined ? 0 : val)
  this.next = (next === undefined ? null : next)
}

var addTwoNumbers = function (l1, l2) {
  let flag = 0
  let l3 = new ListNode(null, null)
  let res = l3

  while(l1 || l2) {
    let val1 = l1 ? l1.val : 0
    let val2 = l2 ? l2.val : 0
    let va = val1 + val2 + flag
    flag = va >= 10 ? 1 : 0
    va = va >= 10 ? va-10 : va
    let node = new ListNode(va, null)
    l3.next = node
    l3 = l3.next
    l1 = l1 ? l1.next : null
    l2 = l2 ? l2.next : null
  }

  if (flag === 1) {
    l3.next = new ListNode(1, null)
  }

  return res.next
}
let a = new ListNode(7, null)
let b = new ListNode(5, a)
let c = new ListNode(2, b)
let d = new ListNode(1, null)
let e = new ListNode(5, d)
let f = new ListNode(3, e)
let g = new ListNode(5, new ListNode(6, new ListNode(7, null)))
let h = new ListNode(6, new ListNode(5, new ListNode(6, null)))
let no = addTwoNumbers (c, f)
let no1 = addTwoNumbers(g, h)
console.log(no)
console.log(no1)
console.log(no1.next.next.next)

//  2   5   7
//  3   5   1
//  5   0   9















// var addTwoNumbers = function (l1, l2) {
//   if (l1 === null || l2 === null) return null;

//   // 使用dummyHead可以简化对链表的处理，dummyHead.next指向新链表
//   let dummyHead = new LinkdeList(0);
//   let cur1 = l1;
//   let cur2 = l2;
//   let cur = dummyHead; // cur用于计算新链表
//   let carry = 0; // 进位标志

//   while (cur1 !== null || cur2 !== null) {
//     let val1 = cur1 !== null ? cur1.val : 0;
//     let val2 = cur2 !== null ? cur2.val : 0;
//     let sum = val1 + val2 + carry;
//     let newNode = new LinkdeList(sum % 10); // sum%10取模结果范围为0~9，即为当前节点的值
//     carry = sum >= 10 ? 1 : 0; // sum>=10，carry=1，表示有进位
//     cur.next = newNode;
//     cur = cur.next;

//     if (cur1 !== null) {
//       cur1 = cur1.next;
//     }

//     if (cur2 !== null) {
//       cur2 = cur2.next;
//     }
//   }
//   if (carry > 0) {
//     // 如果最后还有进位，新加一个节点
//     cur.next = new LinkdeList(carry);
//   }
//   return dummyHead.next;
// };









// //链表
// var Node = function (e) {
//   this.element = e
//   this.next = null
// }

// var LinkdeList = function () {
//   //当创建一个新的链表时，里面会包含一个空的链数
//   this.head = new Node()
//   this._length = 0
// }

// LinkdeList.prototype.append = function (e) {
//   var node = new Node(e)
//   var n = this.head
//   while (n.next != null) {
//     n = n.next
//   }
//   n.next = node
//   this._length++
// }

// LinkdeList.prototype.indexof = function (e) {
//   var n = this.head
//   for (let i = 0; i < this._length; i++) {
//     n = n.next
//     if (n.element == e) {
//       return i
//     }
//   }
// }

// LinkdeList.prototype.log = function () {
//   var n = this.head.next
//   while (n != null) {
//     log('>', n.element)
//     n = n.next
//   }
// }

// addTwoNumbers([1, 2, 3], [2, 5, 8])