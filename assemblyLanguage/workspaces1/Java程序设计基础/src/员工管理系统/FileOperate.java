package 员工管理系统;
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

	// 获取员工信息
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

	// 保存员工信息
	private void saveList(List<Employee> list) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File(fileName));
		for (Employee e : list) {
			pw.format("%d\t%s\t%s\t%s\t\r\n", e.getEmpId(), e.getEmpName(), e.getGender(), e.getBirthDate());
		}
		pw.close();
	}

	// 获取用户输入ID
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

	// 增加
	public void addEmployee() throws IOException {

		System.out.println("\t[1]增加");
		System.out.print("请输入工号：");
		int empId = input.nextInt();
		int index = getUser(empId);
		if (index != -1) {
			System.out.println("ID已存在，请重新输入！");
			addEmployee();
		} else {
			System.out.print("请输入姓名：");
			String empName = input.next();
			System.out.print("请输入性别：");
			String gender = input.next();
			System.out.print("请输入出生日期：");
			String birthDate = input.next();

			Employee employee = new Employee(empId, empName, gender, birthDate);
			List<Employee> list = getList();
			list.add(employee);
			saveList(list);
			System.out.println("添加成功！");
		}
	}

	// 删除
	public void deleteEmployee() throws IOException {
		System.out.println("请输入要删除的ID：");
		int userId = input.nextInt();
		List<Employee> list = getList();
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Employee user = list.get(i);
			if (userId == user.getEmpId()) {
				System.out.println("员工信息为：\n工号\t姓名\t性别\t出生日期");
				System.out.println(user.getEmpId() + "\t" + user.getEmpName() + "\t" + user.getGender() + "\t"
						+ user.getBirthDate());
				System.out.println("是否确定删除（yes or no）?");
				String answer = input.next();
				if ("yes".equalsIgnoreCase(answer)) {
					list.remove(i);
					saveList(list);
					System.out.println("删除成功！");
				}
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("\t员工不存在！请重新输入：");
			deleteEmployee();
		}
	}

	// 修改
	public void updateEmployee() throws IOException {
		showAllEmployee();
		System.out.println("请输入要修改的ID：");
		int userId = input.nextInt();
		int id = getUser(userId);
		if (id != -1) {
			System.out.print("请输入姓名：");
			String empName = input.next();
			System.out.print("请输入性别：");
			String gender = input.next();
			System.out.print("请输入出生日期：");
			String birthDate = input.next();
			List<Employee> list = getList();
			Employee user = list.get(id);
			user.setEmpName(empName);
			user.setGender(gender);
			user.setBirthDate(birthDate);
			System.out.println("员工信息为：\n工号\t姓名\t性别\t出生日期");
			System.out.println(
					user.getEmpId() + "\t" + user.getEmpName() + "\t" + user.getGender() + "\t" + user.getBirthDate());
			saveList(list);
			System.out.println("修改成功！");
		} else {
			System.out.println("修改失败！请重新输入：");
			updateEmployee();
		}
	}

	// 查询
	public void selectEmployee() throws IOException {
		boolean flag = true;
		List<Employee> list = getList();
		if (list.size() != 0) {
			while (flag) {
				int s = new Menus().selectMenus();
				switch (s) {
				case 1:
					System.out.println("\t请输入工号：");
					selectId(input.nextInt());
					break;
				case 2:
					System.out.println("\t请输入姓名：");
					selectName(input.next());
					break;
				case 3:
					System.out.println("\t请输入出生日期：");
					selectBirthDate(input.next());
					break;
				case 4:
					flag = quit();
					break;
				}
			}
		} else {
			System.out.println("无信息！");
		}
	}

	// 按工号查询
	public void selectId(int userId) throws IOException {
		List<Employee> list = getList();
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Employee user = list.get(i);
			if (userId == user.getEmpId()) {
				System.out.println("员工信息为：\n工号\t姓名\t性别\t出生日期");
				System.out.println(user.getEmpId() + "\t" + user.getEmpName() + "\t" + user.getGender() + "\t"
						+ user.getBirthDate());
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("\t该员工不存在！请重新输入：");
		}
	}

	// 按姓名查询
	public void selectName(String empName) throws IOException {
		List<Employee> list = getList();
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Employee user = list.get(i);
			if (empName.equals(user.getEmpName())) {
				System.out.println("员工信息为：\n工号\t姓名\t性别\t出生日期");
				System.out.println(user.getEmpId() + "\t" + user.getEmpName() + "\t" + user.getGender() + "\t"
						+ user.getBirthDate());
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("\t该员工不存在！");
		}
	}

	// 按出生日期查找
	public void selectBirthDate(String birthDate) throws IOException {
		List<Employee> list = getList();
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Employee user = list.get(i);
			if (birthDate.equals(user.getBirthDate())) {
				System.out.println("员工信息为：\n工号\t姓名\t性别\t出生日期");
				System.out.println(user.getEmpId() + "\t" + user.getEmpName() + "\t" + user.getGender() + "\t"
						+ user.getBirthDate());
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("\t该员工不存在！");
		}
	}

	// 浏览
	public void showAllEmployee() throws IOException {
		List<Employee> list = getList();
		if (list.size() != 0) {
			System.out.println("员工信息为：\n工号\t姓名\t性别\t出生日期");
			for (Employee employee : list) {
				System.out.println(employee.getEmpId() + "\t" + employee.getEmpName() + "\t" + employee.getGender()
						+ "\t" + employee.getBirthDate());
			}
		} else {
			System.out.println("\t无信息！");
		}
	}

	// 退出系统
	public boolean quit() {
		System.out.println("确定要退出吗（yes or no）？");
		return !"yes".equalsIgnoreCase(input.next()) ? true : false;
	}


}
