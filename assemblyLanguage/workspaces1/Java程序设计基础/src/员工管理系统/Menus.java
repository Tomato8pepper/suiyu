package 员工管理系统;
import java.util.Scanner;
public class Menus {

	Scanner input = new Scanner(System.in);

	public Menus() {
	}

	public int mainMenus() {

		while (true) {
			System.out.println("\t员工管理系统");
			System.out.println("************************");
			System.out.println("[1]增加");
			System.out.println("[2]删除");
			System.out.println("[3]修改");
			System.out.println("[4]查询");
			System.out.println("[5]浏览");
			System.out.println("[0]退出");
			System.out.println("************************");
			System.out.println("请选择操作：");

			return input.nextInt();
		}
	}

	public int selectMenus() {
		System.out.println("\t[查询员工]");
		System.out.println("\t[1]按员工工号查询");
		System.out.println("\t[2]按员工姓名查询");
		System.out.println("\t[3]按出生日期查询");
		System.out.println("\t[4]退出查询");
		System.out.println("\t请选择查询功能序号：");

		return input.nextInt();
	}


}
