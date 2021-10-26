package Ա������ϵͳ;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FileOperate {
	private static String fileName = "Employee.txt";
	File file = new File(fileName);
	Scanner input = new Scanner(System.in);

	public FileOperate() {
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// ��ȡԱ����Ϣ
	public List<Employee> getList() throws IOException {
		List<Employee> list = new ArrayList<Employee>();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String line;
		while ((line = br.readLine()) != null) {
			String[] arr = line.split("\t");
			int arr0 = Integer.parseInt(arr[0]);
			Employee employee = new Employee(arr0, arr[1], arr[2], arr[3]);
			list.add(employee);
		}
		br.close();
		return list;
	}

	// ����Ա����Ϣ
	private void saveList(List<Employee> list) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File(fileName));
		for (Employee e : list) {
			pw.format("%d\t%s\t%s\t%s\t\r\n", e.getEmpId(), e.getEmpName(), e.getGender(), e.getBirthDate());
		}
		pw.close();
	}

	// ��ȡ�û�����ID
	public int getUser(int userId) throws IOException {
		List<Employee> list = getList();
		for (int i = 0; i < list.size(); i++) {
			Employee user = list.get(i);
			if (userId == user.getEmpId()) {
				return i;
			}
		}
		return -1;
	}

	// ����
	public void addEmployee() throws IOException {

		System.out.println("\t[1]����");
		System.out.print("�����빤�ţ�");
		int empId = input.nextInt();
		int index = getUser(empId);
		if (index != -1) {
			System.out.println("ID�Ѵ��ڣ����������룡");
			addEmployee();
		} else {
			System.out.print("������������");
			String empName = input.next();
			System.out.print("�������Ա�");
			String gender = input.next();
			System.out.print("������������ڣ�");
			String birthDate = input.next();

			Employee employee = new Employee(empId, empName, gender, birthDate);
			List<Employee> list = getList();
			list.add(employee);
			saveList(list);
			System.out.println("��ӳɹ���");
		}
	}

	// ɾ��
	public void deleteEmployee() throws IOException {
		System.out.println("������Ҫɾ����ID��");
		int userId = input.nextInt();
		List<Employee> list = getList();
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Employee user = list.get(i);
			if (userId == user.getEmpId()) {
				System.out.println("Ա����ϢΪ��\n����\t����\t�Ա�\t��������");
				System.out.println(user.getEmpId() + "\t" + user.getEmpName() + "\t" + user.getGender() + "\t"
						+ user.getBirthDate());
				System.out.println("�Ƿ�ȷ��ɾ����yes or no��?");
				String answer = input.next();
				if ("yes".equalsIgnoreCase(answer)) {
					list.remove(i);
					saveList(list);
					System.out.println("ɾ���ɹ���");
				}
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("\tԱ�������ڣ����������룺");
			deleteEmployee();
		}
	}

	// �޸�
	public void updateEmployee() throws IOException {
		showAllEmployee();
		System.out.println("������Ҫ�޸ĵ�ID��");
		int userId = input.nextInt();
		int id = getUser(userId);
		if (id != -1) {
			System.out.print("������������");
			String empName = input.next();
			System.out.print("�������Ա�");
			String gender = input.next();
			System.out.print("������������ڣ�");
			String birthDate = input.next();
			List<Employee> list = getList();
			Employee user = list.get(id);
			user.setEmpName(empName);
			user.setGender(gender);
			user.setBirthDate(birthDate);
			System.out.println("Ա����ϢΪ��\n����\t����\t�Ա�\t��������");
			System.out.println(
					user.getEmpId() + "\t" + user.getEmpName() + "\t" + user.getGender() + "\t" + user.getBirthDate());
			saveList(list);
			System.out.println("�޸ĳɹ���");
		} else {
			System.out.println("�޸�ʧ�ܣ����������룺");
			updateEmployee();
		}
	}

	// ��ѯ
	public void selectEmployee() throws IOException {
		boolean flag = true;
		List<Employee> list = getList();
		if (list.size() != 0) {
			while (flag) {
				int s = new Menus().selectMenus();
				switch (s) {
				case 1:
					System.out.println("\t�����빤�ţ�");
					selectId(input.nextInt());
					break;
				case 2:
					System.out.println("\t������������");
					selectName(input.next());
					break;
				case 3:
					System.out.println("\t������������ڣ�");
					selectBirthDate(input.next());
					break;
				case 4:
					flag = quit();
					break;
				}
			}
		} else {
			System.out.println("����Ϣ��");
		}
	}

	// �����Ų�ѯ
	public void selectId(int userId) throws IOException {
		List<Employee> list = getList();
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Employee user = list.get(i);
			if (userId == user.getEmpId()) {
				System.out.println("Ա����ϢΪ��\n����\t����\t�Ա�\t��������");
				System.out.println(user.getEmpId() + "\t" + user.getEmpName() + "\t" + user.getGender() + "\t"
						+ user.getBirthDate());
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("\t��Ա�������ڣ����������룺");
		}
	}

	// ��������ѯ
	public void selectName(String empName) throws IOException {
		List<Employee> list = getList();
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Employee user = list.get(i);
			if (empName.equals(user.getEmpName())) {
				System.out.println("Ա����ϢΪ��\n����\t����\t�Ա�\t��������");
				System.out.println(user.getEmpId() + "\t" + user.getEmpName() + "\t" + user.getGender() + "\t"
						+ user.getBirthDate());
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("\t��Ա�������ڣ�");
		}
	}

	// ���������ڲ���
	public void selectBirthDate(String birthDate) throws IOException {
		List<Employee> list = getList();
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Employee user = list.get(i);
			if (birthDate.equals(user.getBirthDate())) {
				System.out.println("Ա����ϢΪ��\n����\t����\t�Ա�\t��������");
				System.out.println(user.getEmpId() + "\t" + user.getEmpName() + "\t" + user.getGender() + "\t"
						+ user.getBirthDate());
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("\t��Ա�������ڣ�");
		}
	}

	// ���
	public void showAllEmployee() throws IOException {
		List<Employee> list = getList();
		if (list.size() != 0) {
			System.out.println("Ա����ϢΪ��\n����\t����\t�Ա�\t��������");
			for (Employee employee : list) {
				System.out.println(employee.getEmpId() + "\t" + employee.getEmpName() + "\t" + employee.getGender()
						+ "\t" + employee.getBirthDate());
			}
		} else {
			System.out.println("\t����Ϣ��");
		}
	}

	// �˳�ϵͳ
	public boolean quit() {
		System.out.println("ȷ��Ҫ�˳���yes or no����");
		return !"yes".equalsIgnoreCase(input.next()) ? true : false;
	}


}
