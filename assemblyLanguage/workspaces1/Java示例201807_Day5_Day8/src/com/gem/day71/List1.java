package com.gem.day71;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// 80空间固定
		int[] arr = new int[5];

		// 95 空间不固定
		List list = new ArrayList();
		list.add(11); // 装箱，效率低了些
		list.add("22中");
		list.add(33.3);
		list.add(44);
		list.add(55);

		// 05泛型 类型参数化,空间不固定,效率高
		// List<Integer> list=new ArrayList<Integer>();
		List<String> list2 = new ArrayList<String>();
		list2.add("111");
		list2.add("222");
		list2.add("333中");
		list2.remove("333中");
		list2.add("222");
		System.out.println(list2.size());
		// foreach循环
		for (String item : list2) {
			System.out.println(item);
		}
		System.out.println("*********************************");

		// 迭代器循环*
		for (Iterator<String> iterator = list2.iterator(); iterator.hasNext();) {
			String s = (String) iterator.next();
			System.out.println(s);
		}
		System.out.println("*********************************");
		// 迭代器循环***
		Iterator<String> iterator = list2.iterator(); // 机器，迭代器
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("*********************************");

		// 保存多个员工；
		List<Employee> list3 = new ArrayList<Employee>();
		Employee e1 = new Employee("101", "Lily", "Female");
		list3.add(e1);
		list3.add(new Employee("102", "Lucy", "Female"));
		list3.add(new Employee("103", "Tomas", "Male"));
		System.out.println("**********************");
		showList(list3);
		System.out.println("**********************");
		// list3.remove(1);
		// showList(list3);
		System.out.println("**********************");
		// 删除102，修改103的姓名：彭丽媛
		String id = "102";
		for (int i = 0; i < list3.size(); i++) {
			Employee emp = list3.get(i);
			if (emp.getEmpId().equals(id)) {
				list3.remove(i);
			}
		
			if (emp.getEmpId().equals("103")) {
				emp.setEmpName("彭丽媛");
			}
		}
		/*for (int i = 0; i < list3.size(); i++) {
			Employee emp = list3.get(i);
			if (emp.getEmpId().equals("103")) {
				emp.setEmpName("彭丽媛");
			}
		}*/
		showList(list3);
	}

	private static void showList(List<Employee> list3) {
		System.out.println(list3.size());
		for (Employee emp : list3) {
			System.out.println(emp.getEmpId() + "\t" + emp.getEmpName() + "\t" + emp.getGender());
		}
	}

}
