package com.gem.day43;

public class T1 {

	public static void main(String[] args) {
		Employee emp=new Employee("101", "Ï°½üÆ½");
		String info=emp.work();
		System.out.println(info);

		//
		Manager m=new Manager("103", "Lucy");
		System.out.println(m.work());
		m.discuss();
		System.out.println(m.getEmpId());
		System.out.println(m.getEmpName());
	}

}
