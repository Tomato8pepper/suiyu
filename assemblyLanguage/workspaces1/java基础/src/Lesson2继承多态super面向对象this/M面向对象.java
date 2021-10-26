package Lesson2继承多态super面向对象this;
class Point {
	int x,y;
	void output(){
		System.out.println(x);
		System.out.println(y);
	}
}
class Point1{
	int x,y;
	Point1(){}
	//重载
	Point1(int a,int b,int c){}
	Point1(int a,int b) {
		x=a;
		y=b;
	}
	void output1() {
		System.out.println(x);
		System.out.println(y);
	}
}
//如果没有构造函数，java编译器会自动提供一个不带参数的构造函数
//默认  数值：0    Boolean：false   char：‘\0’   对象：null
public class M面向对象{
	public static void main (String []args) {
		Point p=new Point();
		p.output();
		Point1 p1=new Point1(5,5);
		p1.output1();
	}
}
