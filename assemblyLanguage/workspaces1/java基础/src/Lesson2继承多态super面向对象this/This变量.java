package Lesson2继承多态super面向对象this;
class Point2{
	int x,y;
	static int z;//类变量属于类，可以在成员方法中直接使用
	final double PI;//=3.1415926;//声明的同时进行初始化，也可以在构造函数中进行初始化  但是如果声明一个静态的常量则只能直接初始化因为当类名调用该静态常量的时候并不会去调用构造函数所以相当于没有初始化、
	Point2(int a,int b){
		PI=3.1415926;
		x=a;
		y=b;
	}
	Point2(){
		//PI=3.1415926;
		this(1,1);}   //this调用了带参数的构造方法，使用时必须放在第一行
	void output() {
		System.out.println(x);
		System.out.println(y);
	}
	void output(int x,int y) {
		this.x=x;//x=x; 代表的是对象变量
		this.y=y;//y=y;
	}
	static void output1() {       //静态方法属于类本身而不属于那个类的方法
		System.out.println("静态方法被调用");
		System.out.println("静态方法直接用类名调用");
		System.out.println(z);
	}
}
public class This变量 {
	public static void main(String []args) {
		/*Point2 p=new Point2(3,3);
		p.output(4,4);
		p.output();*/
		Point2 p=new Point2();
		p.x=2;
		p.output();
		Point2 pt=new Point2();
		pt.x=23;
		System.out.println(p.x);
		System.out.println(pt.x);   //一个类的所有的实例调用的成员方法在内存中只有只有一份拷贝，数据成员在对在每一个对象中都有一份拷贝
		pt.output();
		Point2.output1();    //调用可以用类名也可以用对象，静态方法在类加载的时候就给其分配了代码空间，如果方法中使用了成员变量那必须调用的时候必须先实例化给变量分配内存空间在实现调用
		p.z=5;
		pt.z=6;
		System.out.println(p.z);
		System.out.println(pt.z);//静态变量是类的而不是某个对象的只有一个内存
	}
}
