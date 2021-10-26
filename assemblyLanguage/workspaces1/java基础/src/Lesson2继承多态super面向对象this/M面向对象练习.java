package Lesson2继承多态super面向对象this;
public class M面向对象练习 {
	//面向过程的：
	/*static int perimeter(int length,int width) {
		return 2*(length+width);
	}
	static int area(int length,int width) {
		return length*width;
	}
	public static void main(String []args) {
		System.out.println("Rectangle's perimeter is:"+M面向对象练习.perimeter(5, 4));
		System.out.println("Rectangle's area is:"+M面向对象练习.area(7, 8));
	}*/
	
	//面向对象：
	int l,w;
	int perimeter() {
		return 2*(l+w);
	}
	int area() {
		return l*w;
	}
	public static void main(String []args) {
		M面向对象练习 m1=new M面向对象练习();
		M面向对象练习 m2=new M面向对象练习();
		
		m1.l=3;
		m1.w=4;
		System.out.println("perimeter of m1 is:"+m1.perimeter());
		System.out.println("area of m1 is:"+m1.area());
		
		m2.l=7;
		m2.w=8;
		System.out.println("perimeter of m1 is:"+m2.perimeter());
		System.out.println("area of m1 is:"+m2.area());
	}
}
   //以上内容：java的位运算
   //       java面向对象与面向过程的区别
   //       类和对象的关系
   //       构造函数、函数重载、this和super变量、静态变量、java中的常量、继承、多态