package com.gem.day72员工管理系统;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gem.day71.Employee;

//添加，显示
public class T1 {
	private static Scanner sc = new Scanner(System.in);
	private static List<Employee> empList = new ArrayList<Employee>();

	public static void main(String[] args) {
		while (true) {

			System.out.println("员工管理系统");
			System.out.println("******************");
			System.out.println("【1】增加");
			System.out.println("【5】浏览");
			System.out.println("【0】退出");
			System.out.println("******************");
			System.out.print("请选择操作：");
			Integer i = sc.nextInt();
			switch (i) {
			case 1:
				addEmployee();
				break;
			case 5:
				showAllEmployee();
				break;
			case 0:
				System.exit(0);//退出
				break;

			default:
				break;
			}
		}
	}

	// 添加员工
	private static void addEmployee() {
		System.out.println("\t【1】增加");
		System.out.print("\t请输入工号：");
		String empId = sc.next();
		System.out.print("\t请输入姓名：");
		String empName = sc.next();
		System.out.print("\t请输入性别：");
		String gender = sc.next();
		Employee emp = new Employee(empId, empName, gender);
		empList.add(emp);
		System.out.println("\t添加成功！");
	}

	// 【5】浏览
	private static void showAllEmployee() {
		if (empList.size() == 0) {
			System.out.println("无结果！");
		} else {
			for (Employee emp : empList) {
				System.out.println(emp.getEmpId() + "\t" + emp.getEmpName() + "\t" + emp.getGender());
			}
		}
	}
}
