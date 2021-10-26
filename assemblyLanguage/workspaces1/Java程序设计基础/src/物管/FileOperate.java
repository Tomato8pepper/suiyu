package 物管;
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
			System.out.println("请输入编号：");
			String id = Program.getUserInput();
			System.out.println("请输入名称：");
			String name = Program.getUserInput();
			System.out.println("请输入价格：");
			Float price = Float.parseFloat(Program.getUserInput());
			Goods gds = new Goods(id, name, price);// 得到文件的内容
			List<Goods> list = getList();
			list.add(gds);
			// 如何写入文件
			saveList(list);
			System.out.println("新增成功!");
		} catch (Exception e) {
			System.out.println("新增失败!");
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
			System.out.print("请输入要删除的编号：");
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
				System.out.println("删除成功!");
			else
				System.out.println("删除失败!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update() {
		try {
			System.out.println("请输入编号：");
			String id = Program.getUserInput();
			System.out.println("请输入名称：");
			String name = Program.getUserInput();
			System.out.println("请输入价格：");
			Float price = Float.parseFloat(Program.getUserInput());
			Goods gds = new Goods(id, name, price);// 得到文件的内容

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
				System.out.println("修改成功!");
			else
				System.out.println("无此数据!");
		} catch (Exception e) {
			System.out.println("修改失败!");
			e.printStackTrace();
		}

	}

	public void search() {
	
		String sid = Program.getUserInput();
		//根据sid的值等于一，请输入编号
		//sid的值等于二，请输入名称：
		//sid的值等于三，请输入价格；
		//sid的值等于4，退出；

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
			System.out.println("结果:\t编号\t名称\t价格");
			for (Goods goods : tmpList) {
				System.out.println("\t" + goods.getId() + "\t" + goods.getName() + "\t" + goods.getPrice());

			}

		} else {
			System.out.println("\t查询无记录！");
		}
		System.out.println();
	}
	public void showAll() {
		try {
			List<Goods> list=this.getList();
			if (list.size() > 0) {
				System.out.println("结果:\t编号\t名称\t价格");
				for (Goods goods :list) {
					System.out.println("\t" + goods.getId() + "\t" + goods.getName() + "\t" + goods.getPrice());

				}

			} else {
				System.out.println("\t查询无记录！");
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}


}
