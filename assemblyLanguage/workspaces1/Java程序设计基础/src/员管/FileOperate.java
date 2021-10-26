package Ա��;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
public class FileOperate {
	private String fileName = "Emp.txt";

	public FileOperate() {
		File file = new File(this.fileName);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void insert() {
		try {
			System.out.println("�����빤�ţ�");
			String id = Chengxvrukou.getUserInput();
			System.out.println("������������");
			String name = Chengxvrukou.getUserInput();
			System.out.println("�������Ա�");
			String gender = Chengxvrukou.getUserInput();
			Employee emp = new Employee(id, name, gender);// �õ��ļ�������
			List<Employee> list = getList();
			list.add(emp);
			// ���д���ļ�
			saveList(list);
			System.out.println("�����ɹ�!");
		} catch (Exception e) {
			System.out.println("����ʧ��!");
			e.printStackTrace();
		}

	}

	private void saveList(List<Employee> list) throws FileNotFoundException {
		PrintWriter out = new PrintWriter(new File(this.fileName));
		for (Employee g : list) {
			out.format("%s\t%s\t%s\t\r\n", g.getEmpId(), g.getEmpName(), g.getGender());
		}
		out.close();
	}

	private List<Employee> getList() throws FileNotFoundException {
		List<Employee> list = new ArrayList<Employee>();
		BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				String[] temp = line.split("\t");
				String id = temp[0];
				String name = temp[1];
				String gender = (temp[2]);
				list.add(new Employee(id, name, gender));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	public void delete() {
		try {
			System.out.print("������Ҫɾ���Ĺ��ţ�");
			String id = Chengxvrukou.getUserInput();
			List<Employee> list = this.getList();
			boolean flag = false;
			/*
			 * for (Employee Employee : list) { if (Employee.getId().equals(id)) {
			 * list.remove(Employee); flag = true; } }
			 */
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getEmpId().equals(id)) {
					list.remove(list.get(i));
					flag = true;
				}
			}
			saveList(list);
			if (flag)
				System.out.println("ɾ���ɹ�!");
			else
				System.out.println("ɾ��ʧ��!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void update() {
		try {
			System.out.println("�����빤�ţ�");
			String id = Chengxvrukou.getUserInput();
			System.out.println("������������");
			String name = Chengxvrukou.getUserInput();
			System.out.println("�������Ա�");
			String gender = Chengxvrukou.getUserInput();			
			Employee epy= new Employee(id, name, gender);// �õ��ļ�������
			List<Employee> list = getList();
			boolean flag = false;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getEmpId().equals(id)) {
					list.remove(list.get(i));
					list.add(epy);
					flag = true;
				}
			}
			saveList(list);
			if (flag)
				System.out.println("�޸ĳɹ�!");
			else
				System.out.println("�޴�����!");
		} catch (Exception e) {
			System.out.println("�޸�ʧ��!");
			e.printStackTrace();
		}

	}
	public void showAll() {
		try {
			List<Employee> list=this.getList();
			if (list.size() > 0) {
				System.out.println("���:\t����\t����\t�Ա�");
				for (Employee Employee :list) {
					System.out.println("\t" + Employee.getEmpId() + "\t" + Employee.getEmpName() + "\t" + Employee.getGender());

				}

			} else {
				System.out.println("\t��ѯ�޼�¼��");
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	public void search() {
		
		String sid = Chengxvrukou.getUserInput();
		//����sid��ֵ����һ����������
		//sid��ֵ���ڶ������������ƣ�
		//sid��ֵ��������������۸�
		//sid��ֵ����4���˳���

	}

	public void searchByCondition(String sid, String typeValue) throws IOException, ClassNotFoundException {
		List<Employee> list = getList();
		ArrayList<Employee> tmpList = new ArrayList<Employee>();
		for (Employee emp : list) {
			if (sid.equals("1")) {
				if (emp.getEmpId().equals(typeValue)) {
					tmpList.add(emp);
				}
			}
			if (sid.equals("2")) {
				if (emp.getEmpName().equals(typeValue)) {
					tmpList.add(emp);
				}
			}
			if (sid.equals("3")) {
				if (emp.getGender().equals(typeValue)) {
					tmpList.add(emp);
				}
			}
		}
		if (tmpList.size() != 0) {
			System.out.println("���:\t���\t����\t�۸�");
			for (Employee emp : tmpList) {
				System.out.println("\t" + emp.getEmpId() + "\t" + emp.getEmpName() + "\t" + emp.getGender());

			}

		} else {
			System.out.println("\t��ѯ�޼�¼��");
		}
		System.out.println();
	}

}
