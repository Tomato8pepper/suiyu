package com.gem.day71;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// 80�ռ�̶�
		int[] arr = new int[5];

		// 95 �ռ䲻�̶�
		List list = new ArrayList();
		list.add(11); // װ�䣬Ч�ʵ���Щ
		list.add("22��");
		list.add(33.3);
		list.add(44);
		list.add(55);

		// 05���� ���Ͳ�����,�ռ䲻�̶�,Ч�ʸ�
		// List<Integer> list=new ArrayList<Integer>();
		List<String> list2 = new ArrayList<String>();
		list2.add("111");
		list2.add("222");
		list2.add("333��");
		list2.remove("333��");
		list2.add("222");
		System.out.println(list2.size());
		// foreachѭ��
		for (String item : list2) {
			System.out.println(item);
		}
		System.out.println("*********************************");

		// ������ѭ��*
		for (Iterator<String> iterator = list2.iterator(); iterator.hasNext();) {
			String s = (String) iterator.next();
			System.out.println(s);
		}
		System.out.println("*********************************");
		// ������ѭ��***
		Iterator<String> iterator = list2.iterator(); // ������������
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("*********************************");

		// ������Ա����
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
		// ɾ��102���޸�103��������������
		String id = "102";
		for (int i = 0; i < list3.size(); i++) {
			Employee emp = list3.get(i);
			if (emp.getEmpId().equals(id)) {
				list3.remove(i);
			}
		
			if (emp.getEmpId().equals("103")) {
				emp.setEmpName("������");
			}
		}
		/*for (int i = 0; i < list3.size(); i++) {
			Employee emp = list3.get(i);
			if (emp.getEmpId().equals("103")) {
				emp.setEmpName("������");
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
