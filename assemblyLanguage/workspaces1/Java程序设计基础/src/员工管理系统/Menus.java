package Ա������ϵͳ;
import java.util.Scanner;
public class Menus {

	Scanner input = new Scanner(System.in);

	public Menus() {
	}

	public int mainMenus() {

		while (true) {
			System.out.println("\tԱ������ϵͳ");
			System.out.println("************************");
			System.out.println("[1]����");
			System.out.println("[2]ɾ��");
			System.out.println("[3]�޸�");
			System.out.println("[4]��ѯ");
			System.out.println("[5]���");
			System.out.println("[0]�˳�");
			System.out.println("************************");
			System.out.println("��ѡ�������");

			return input.nextInt();
		}
	}

	public int selectMenus() {
		System.out.println("\t[��ѯԱ��]");
		System.out.println("\t[1]��Ա�����Ų�ѯ");
		System.out.println("\t[2]��Ա��������ѯ");
		System.out.println("\t[3]���������ڲ�ѯ");
		System.out.println("\t[4]�˳���ѯ");
		System.out.println("\t��ѡ���ѯ������ţ�");

		return input.nextInt();
	}


}
