package com.gem.day52abstract;

public class T1 {

	public static void main(String[] args) {
		// ==================================
		Employee emp;
		// emp = new Employee("101", "lily");//失去了创建对象的能力
		// System.out.println(emp.work());

		emp = new CEO("102", "lucy");
		System.out.println(emp.work());
		emp = new IT("103", "lily", "U盘");
		System.out.println(emp.work());
		// 多态；

	}

}
