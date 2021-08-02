/*
实现功能：
push(x) 讲一个元素放入队列的尾部
pop()   从队首移除元素并返回元素
peek()  返回队首的元素
empty() 判断队列是否为空

forexample: 
let queue = new MyQueu()
queue.push(1)
queue.push(2)
queue.peek()  =>1
queue.pop()   =>1
queue.empty() =>false
*/



/*
初始化队列
*/ 
let MyQueue = function() {
    this.stack1 = []
    this.stack2 = []
}

/*
功能：放入元素
参数：any
返回值：无
*/ 
MyQueue.prototype.push = function(n) {
    this.stack1.push(n)
}

/*
功能：移除队列首部元素，并返回这个元素
参数：无
返回值：any
*/ 
MyQueue.prototype.pop = function() {
    while(this.stack1.length !== 0) {
        this.stack2.push(this.stack1.pop())
    }
    let popEle = this.stack2.pop()
    while(this.stack2.length !== 0) {
        this.stack1.push(this.stack2.pop())
    }
    return popEle
}

/*
功能：返回队首元素
参数：无
返回值：any
*/
MyQueue.prototype.peek = function (){
    return this.stack1[0]
}

/*
功能：判空
参数：无
返回值：布尔值
*/
MyQueue.prototype.empty = function() {
    return !this.stack1.length
}