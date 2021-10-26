package Lesson2继承多态super面向对象this;
class Animal{
	int height,weight;
	Animal(){
		System.out.println("animal construct父类的构造方法先被调用");
	}
	void eat(){
		System.out.println("animal eat");
	}
	void sleep() {
		System.out.println("animal sleep");
	}
	void breathe() {
		System.out.println(height);
		System.out.println("animal breathe");
	}
}
class Fish extends Animal{  //不能再继承其他的类了
	int height;  //成员变量覆盖
	Fish(){
		super();    //隐含的调用了父类的不带参数的构造方法，调用带参数的构造加两个形参 ，此行代码可以省略但父类必须有无参构造
		System.out.println("fish construct");
	}
	void breathe() {        //方法覆盖
		super.height=30;    //访问父类的成员变量
		super.breathe();    //访问父类中被覆盖的方法
		System.out.println("fish bubble");
		System.out.println(height);
	}
}
public class J继承 {
	static void fn(Animal an) {
		an.breathe();
	}
	public static void main(String []args) {
		//Animal an=new Animal();
		//an.breathe();
		/*Fish f=new Fish();
		Animal an;
		an=f;             //运行时多态：将子类的变量赋值给父类的变量，子类的变量起作用
		J继承.fn(an);       //编译时多态：重载，根据调用方法传递的参数不同调用不同的方法' */
		//f.height=20;
		//f.breathe();
		Animal an=new Animal();
		Fish fh=new Fish();
		//an=fh; //赋值以后父类对象也是子类的实例
		//instanceof判断一个对象是否是一个类的实例
		if(an instanceof Animal) {
			System.out.println("an is Animal's instanceof");
		}
		if(fh instanceof Fish) {
			System.out.println("an is Fish's instanceof");
		}
		if(fh instanceof Animal) {      //轿车是车，而车不是轿车。子类对象是父类对象，父类对象不是子类对象，但将子类对象赋值给父类对象以后，父类对象也是子类的实例
			System.out.println("fh is Animal's instanceof");
		}
		else {
			System.out.println("fh isn't Animal's instanceof");
		}
		if(an instanceof Fish){
			System.out.println("an is Fish's instanceof");
		}
		else {
			System.out.println("an isn't Fish's instanceof");
		}
	}
}
