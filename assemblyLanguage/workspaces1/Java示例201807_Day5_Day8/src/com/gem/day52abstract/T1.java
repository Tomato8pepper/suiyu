package com.gem.day52abstract;

public class T1 {

	public static void main(String[] args) {
		// ==================================
		Employee emp;
		// emp = new Employee("101", "lily");//ʧȥ�˴������������
		// System.out.println(emp.work());

		emp = new CEO("102", "lucy");
		System.out.println(emp.work());
		emp = new IT("103", "lily", "U��");
		System.out.println(emp.work());
		// ��̬��

	}

}
