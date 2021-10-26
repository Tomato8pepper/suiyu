package com.gem.day4;
/**封装
 * 计算圆的面积和周长
 * @author ybgong *
 */
public class Circle {
	public  static int TEST_AGE=500;//全局变量XXX
	//1，属性
	public final double PI=3.14;//常量
	private double r;    //变量  实例变量***  ，成员变量  
	
	//4 set/get方法
	//为私有成员变量赋值（2）
	public void setR(double r){
		this.r=r;
	}
	//返回半径值
	public double getR(){
		return this.r;
	}
	
	//2 构造方法，构造器==>重载1
	public Circle(){
	}
	
	//为私有成员变量赋值（1）
	public Circle(double r){
		//构造器中引用该构造器执行初始化的对象
		this.r=r;
	}
	
	//一般   3方法
	/**
	 * 求圆的面积,
	 */
	public double getArea(){
		return PI*this.r*this.r;
	}
	
	/**
	 * 求圆的周长
	 */
	public double getLength(){
		return 2*PI*r;
	}

	//==>重载2
	public  void  showInfo(){
		System.out.println("我的半径是："+this.r);
	}
	public  void  showInfo(int age){
		System.out.println("我几岁了："+age);
	}
	
	//=================普通的参数=====================
	//静态方法
	public static void  showInfo(String size){  //参数变量
	
		int i=10;	// 局部变量
		System.out.println("我是一个 " +size+" 圆");
	}
	

	public static String  showInfo2(double number ){
		return  "我是 " + number+" 圆!";
	}
	
}
