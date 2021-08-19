package main; // 包声明
// go语言是一个天生支持多核计算的云开发时代c语言
// node + go	 服务器
// require('fs') fileSystem
//向命令行输出hello world  format
import	("fmt"); // 核心模块：fmt库
	   
// go语言 有静态编译 先编译成一个二进制文件
// 编译器原理	
// 875算法
func minEatingSpeed(piles []int, H int)(int) {
	low := 1
	// 最大数量是11，函数（块级作用域）
	hi := maxPiles(piles)
	// mid := low + (hi - low)/2
	for{
		if low > hi {
			break;
		}
		if canEatAllBanas(piles, H, low){
			return low
			// hi = mid - 1
		}else{
			low++
		}
	}
	return low
}

func canEatAllBanas(piles []int, H int, k int) bool{
	//range piles piles[i]/k         Math.ceil()向上取整
	// 求和
	// 是否小于等于H
	hour := 0
	for _, num := range piles {
		div := num / k
		hour += div
		if num % k != 0 {
			hour++
		}
	}
	if hour <= H{
		return true
	}else{
		return false
	}
}

func maxPiles(piles []int)(int)  {
	h := 0
	for _, n := range  piles {
		h = max(h, n)
	}
	return h
}
func max(a int, b int)int {
	if a > b{
		return a
	}else{               //else必须贴着写
		return b
	}
	
	
}
func main() { //func 函数关键字
	fmt.Printf("%d小时内吃完香蕉的最慢速度是%d只/小时\n", 8, minEatingSpeed([]int{3, 6, 7, 11}, 8))
	// var i int = 4
	// var f float32
	// var b bool
	// var s string
	// const (
	// 	a = iota
	// 	b1 
	// 	d = "100"
	// 	e
	// 	f1 = iota
	// )
	
	// fmt.Println(a, b1, d, e, f1)
	// fmt.Printf("%v %v %v %q\n", i, f, b, s)
	// fmt.Println(i)
	// fmt.Println("hello world")
}
