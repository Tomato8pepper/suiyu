package com.gem.day42;

public class T1 {

	public static void main(String[] args) {
		Employee emp=new Employee("101", "Ï°½üÆ½");
		String info=emp.work();
		System.out.println(info);

		//
		Manager m=new Manager();
		m.setEmpId("102");
		m.setEmpName("Lily");
		System.out.println(m.work());
		m.discuss();
	}

}
