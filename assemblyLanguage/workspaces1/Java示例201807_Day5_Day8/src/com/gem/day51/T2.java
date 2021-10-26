package com.gem.day51;

public class T2 {
	public static void main(String[] args) {
		// ==================================
		Employee emp;
		emp = new Employee("101", "lily");
		System.out.println(emp.work());
		
		emp=new CEO("102", "lucy");
		System.out.println(emp.work());
		
		//多态
		emp=new IT("103", "Tom","U盘");
		System.out.println(emp.work());
		
		//===================================
		Employee emp2;
		CEO ceo=new CEO("202", "lucy202");
		emp2=ceo;   //待价于Line10 ,自动转换，上转型对象;  
		System.out.println(emp2.work());
		emp2=(Employee)ceo;  
		System.out.println(emp2.work());
		
		//自动装箱就是把一个基本类型的变量直接赋给对应的包装类变量
		int i=15;
		Integer j=i;
		//Employee k=i; //XX
		Object obj=i;
		System.out.println(j);//自动装箱
		System.out.println(obj.toString());
	}
}
