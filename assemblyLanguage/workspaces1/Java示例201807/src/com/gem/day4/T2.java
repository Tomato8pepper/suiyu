package com.gem.day4;

import javax.swing.JOptionPane;

public class T2 {

	public static void main(String[] args) {
		// ==>采用面向对象思想

		//***写法1：
		// 1,定义类 OK
		// 2,使用类 类名 对象名= new 构造方法(实参);
		//3 ， 对象名.方法()
		Circle cir = new Circle(10.0);
		double area = cir.getArea();
		double l = cir.getLength();
		System.out.println("面积是：" + area);
		System.out.println("周长是：" + l);
		
		//***写法2：
		Circle.showInfo("小");
		Circle.showInfo("大");
		
		String result=	Circle.showInfo2(200);
						//JOptionPane.showInputDialog(null)
		System.out.println(result);
	}

}
