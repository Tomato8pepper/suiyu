package com.gem.day8员工管理系统;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//添加，显示
public class T1 {
	private static String fileName = "Employee.txt";
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
				System.exit(0);// 退出
				break;

			default:
				break;
			}
		}
	}

	// 添加员工
	private static void addEmployee() {
		try {
			System.out.println("\t【1】增加");
			System.out.print("\t请输入工号：");
			String empId = sc.next();
			System.out.print("\t请输入姓名：");
			String empName = sc.next();
			System.out.print("\t请输入性别：");
			String gender = sc.next();

			String content = empId + "\t" + empName + "\t" + gender;
			FileOperate op = new FileOperate(fileName, content);
			op.appendContent();

			System.out.println("\t保存成功！");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("\t保存失败！");
		}
	}

	// 【5】浏览
	private static void showAllEmployee() {
		// try {
		//
		// FileOperate op = new FileOperate(fileName);
		// op.readContent();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		FileOperate op = new FileOperate(fileName);
		try {
			empList = op.readContent();
			if (empList.size() == 0) {
				System.out.println("无结果！");
			} else {
				for (Employee emp : empList) {
					System.out.println(emp.getEmpId() + "；" + emp.getEmpName() + "；" + emp.getGender());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
