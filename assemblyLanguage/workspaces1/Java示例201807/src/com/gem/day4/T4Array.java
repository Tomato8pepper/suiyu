package com.gem.day4;

public class T4Array {

	public static void main(String[] args) {
		Employee emp=new Employee();
		String[] arr=emp.getEmployees();
		for (String s : arr) {
			System.out.println(s);
		}
		
		String name1="张3",name2="李4";
		String[] arr2=emp.getEmployees(name1,name2);
		for (String s : arr2) {
			System.out.println(s);
		}

		//String[] arr3=emp.getEmployees("Lily","Lucy");
		String[] arr3=emp.getEmployees("Lily","Lucy","Trump","Bill");
		for (String s : arr3) {
			System.out.println(s);
		}
	}
}

//一个类文件中，可以定义多个并行的类。多个类中只能有一个类是public 类
//方法返回数组
class Employee {
	public String[] getEmployees(){
		String[] arr={"张三","李四"};
		return arr;
	}
	
	public String[] getEmployees(String name1,String name2){
		System.out.println("1111111111");
		String[] arr={name1,name2};
		return arr;
	}
	public String[] getEmployees(String... name ){
		System.out.println("22222222222");
		String[] arr=name;
		return arr;
	}
}