package 员工管理系统;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileOperate operate = new FileOperate();
		Menus menus = new Menus();
		boolean flag = true;
		while (flag) {
			int i = menus.mainMenus();
			switch (i) {
			case 1:
				operate.addEmployee();
				break;
			case 2:
				operate.deleteEmployee();
				break;
			case 3:
				operate.updateEmployee();
				break;
			case 4:
				operate.selectEmployee();
				break;
			case 5:
				operate.showAllEmployee();
				break;
			case 0:
				System.exit(0);// 退出
				break;
			default:
				break;
			}

		}

	}

}
