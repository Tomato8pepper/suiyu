var addTwoNumbers = function (l1, l2) {
  if (l1 === null || l2 === null) return null;

  // 使用dummyHead可以简化对链表的处理，dummyHead.next指向新链表
  let dummyHead = new ListNode(0);
  let cur1 = l1;
  let cur2 = l2;
  let cur = dummyHead; // cur用于计算新链表
  let carry = 0; // 进位标志

  while (cur1 !== null || cur2 !== null) {
    let val1 = cur1 !== null ? cur1.val : 0;
    let val2 = cur2 !== null ? cur2.val : 0;
    let sum = val1 + val2 + carry;
    let newNode = new ListNode(sum % 10); // sum%10取模结果范围为0~9，即为当前节点的值
    carry = sum >= 10 ? 1 : 0; // sum>=10，carry=1，表示有进位
    cur.next = newNode;
    cur = cur.next;

    if (cur1 !== null) {
      cur1 = cur1.next;
    }

    if (cur2 !== null) {
      cur2 = cur2.next;
    }
  }
  if (carry > 0) {
    // 如果最后还有进位，新加一个节点
    cur.next = new ListNode(carry);
  }
  return dummyHead.next;
};









//链表
// var Node = function(e){
//   this.element = e
//   this.next = null
// }

// var LinkdeList = function(){
//   //当创建一个新的链表时，里面会包含一个空的链数
//   this.head = new Node()
//   this._length = 0
// }

// LinkdeList.prototype.append = function(e){
//   var node = new Node(e)
//   var n = this.head
//   while(n.next != null){
//       n = n.next
//   }
//   n.next = node
//   this._length++
// }

// LinkdeList.prototype.indexof = function(e){
//   var n = this.head
//   for (let i = 0; i < this._length; i++) {
//       n = n.next
//       if (n.element == e){
//           return i
//       }
//   }
// }

// LinkdeList.prototype.log = function(){
//   var n = this.head.next
//   while(n != null){
//       log('>',n.element)
//       n = n.next
//   }
// }