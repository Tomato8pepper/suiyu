package com.gem.day8Ա������ϵͳ;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//��ӣ���ʾ
public class T1 {
	private static String fileName = "Employee.txt";
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

			String content = empId + "\t" + empName + "\t" + gender;
			FileOperate op = new FileOperate(fileName, content);
			op.appendContent();

			System.out.println("\t����ɹ���");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("\t����ʧ�ܣ�");
		}
	}

	// ��5�����
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
				System.out.println("�޽����");
			} else {
				for (Employee emp : empList) {
					System.out.println(emp.getEmpId() + "��" + emp.getEmpName() + "��" + emp.getGender());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
