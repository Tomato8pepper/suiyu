var removeNthFromEnd = function (head, n) {
    let i = -1;
    const noop = {
      next: null,
    };
  
    const dummyHead = new ListNode(); // 增加一个dummyHead 简化操作
    dummyHead.next = head;
  
    let currentP1 = dummyHead;
    let currentP2 = dummyHead;
  
    while (currentP1) {
      if (i === n) {
        currentP2 = currentP2.next;
      }
  
      if (i !== n) {
        i++;
      }
  
      currentP1 = currentP1.next;
    }
  
    currentP2.next = ((currentP2 || noop).next || noop).next;
  
    return dummyHead.next;
  };