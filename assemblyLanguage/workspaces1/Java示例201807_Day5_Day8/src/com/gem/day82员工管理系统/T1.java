package com.gem.day82Ա������ϵͳ;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gem.day71.Employee;
import com.gem.day8.FileOperate;

//��ӣ���ʾ
public class T1 {
	private static Scanner sc = new Scanner(System.in);
	private static List<Employee> empList = new ArrayList<Employee>();

	public static void main(String[] args) {
		while (true) {

			System.out.println("Ա������ϵͳ");
			System.out.println("******************");
			System.out.println("��1������");
			System.out.println("��5�����");
			System.out.println("��0���˳�");
			System.out.println("******************");
			System.out.print("��ѡ�������");
			Integer i = sc.nextInt();
			switch (i) {
			case 1:
				addEmployee();
				break;
			case 5:
				showAllEmployee();
				break;
			case 0:
				System.exit(0);// �˳�
				break;

			default:
				break;
			}
		}
	}

	// ���Ա��
	private static void addEmployee() {
		try {
			System.out.println("\t��1������");
			System.out.print("\t�����빤�ţ�");
			String empId = sc.next();
			System.out.print("\t������������");
			String empName = sc.next();
			System.out.print("\t�������Ա�");
			String gender = sc.next();
			// Employee emp = new Employee(empId, empName, gender);
			// empList.add(emp);
			String content = empId + "\t" + empName + "\t" + gender;
			FileOperate op = new FileOperate("Employee.txt", content);
			op.writeContent();

			System.out.println("\t����ɹ���");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("\t����ʧ�ܣ�");
		}
	}

	// ��5�����
	private static void showAllEmployee() {
		if (empList.size() == 0) {
			System.out.println("�޽����");
		} else {
			for (Employee emp : empList) {
				System.out.println(emp.getEmpId() + "\t" + emp.getEmpName() + "\t" + emp.getGender());
			}
		}
	}
}
