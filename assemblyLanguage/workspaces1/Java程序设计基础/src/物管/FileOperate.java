package ���;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileOperate {
	private String fileName = "Info.txt";
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
			System.out.println("�������ţ�");
			String id = Program.getUserInput();
			System.out.println("���������ƣ�");
			String name = Program.getUserInput();
			System.out.println("������۸�");
			Float price = Float.parseFloat(Program.getUserInput());
			Goods gds = new Goods(id, name, price);// �õ��ļ�������
			List<Goods> list = getList();
			list.add(gds);
			// ���д���ļ�
			saveList(list);
			System.out.println("�����ɹ�!");
		} catch (Exception e) {
			System.out.println("����ʧ��!");
			e.printStackTrace();
		}

	}

	public List<Goods> getList() throws FileNotFoundException {
		List<Goods> list = new ArrayList<Goods>();
		BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				String[] temp = line.split("\t");
				String id = temp[0];
				String name = temp[1];
				Float price = Float.parseFloat(temp[2]);
				list.add(new Goods(id, name, price));
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

	public void saveList(List<Goods> list) throws FileNotFoundException {
		PrintWriter out = new PrintWriter(new File(this.fileName));
		for (Goods g : list) {
			out.format("%s\t%s\t%s\t\r\n", g.getId(), g.getName(), g.getPrice());
		}
		out.close();
	}

	public void delete() {
		try {
			System.out.print("������Ҫɾ���ı�ţ�");
			String id = Program.getUserInput();
			List<Goods> list = this.getList();
			boolean flag = false;
			/*for (Goods goods : list) {
				if (goods.getId().equals(id)) {
					list.remove(goods);
					flag = true;
				}
			}*/
			 for(int i=0;i<list.size();i++){
			 if (list.get(i).getId().equals(id)) {
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
			System.out.println("�������ţ�");
			String id = Program.getUserInput();
			System.out.println("���������ƣ�");
			String name = Program.getUserInput();
			System.out.println("������۸�");
			Float price = Float.parseFloat(Program.getUserInput());
			Goods gds = new Goods(id, name, price);// �õ��ļ�������

			List<Goods> list = getList();
			boolean flag = false;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId().equals(id)) {
					list.remove(list.get(i));
					list.add(gds);
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

	public void search() {
	
		String sid = Program.getUserInput();
		//����sid��ֵ����һ����������
		//sid��ֵ���ڶ������������ƣ�
		//sid��ֵ��������������۸�
		//sid��ֵ����4���˳���

	}

	public void searchByCondition(String sid, String typeValue) throws IOException, ClassNotFoundException {
		List<Goods> list = getList();
		ArrayList<Goods> tmpList = new ArrayList<Goods>();
		for (Goods goods : list) {
			if (sid.equals("1")) {
				if (goods.getId().equals(typeValue)) {
					tmpList.add(goods);
				}
			}
			if (sid.equals("2")) {
				if (goods.getName().equals(typeValue)) {
					tmpList.add(goods);
				}
			}
			if (sid.equals("3")) {
				if (goods.getPrice() == Float.parseFloat(typeValue)) {
					tmpList.add(goods);
				}
			}
		}
		if (tmpList.size() != 0) {
			System.out.println("���:\t���\t����\t�۸�");
			for (Goods goods : tmpList) {
				System.out.println("\t" + goods.getId() + "\t" + goods.getName() + "\t" + goods.getPrice());

			}

		} else {
			System.out.println("\t��ѯ�޼�¼��");
		}
		System.out.println();
	}
	public void showAll() {
		try {
			List<Goods> list=this.getList();
			if (list.size() > 0) {
				System.out.println("���:\t���\t����\t�۸�");
				for (Goods goods :list) {
					System.out.println("\t" + goods.getId() + "\t" + goods.getName() + "\t" + goods.getPrice());

				}

			} else {
				System.out.println("\t��ѯ�޼�¼��");
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}


}
