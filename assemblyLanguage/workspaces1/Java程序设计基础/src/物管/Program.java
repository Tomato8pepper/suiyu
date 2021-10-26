package Îï¹Ü;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		FileOperate fo=new FileOperate();
		while(true) {
			Menu.showMenu();
			String ch=getUserInput();
			switch(ch) {
			case "1":
				fo.insert();
				break;
			case "2":
				fo.delete();
				break;
			case "3":
				fo.update();
				break;
			case "4":
				Menu.subMenu();
				fo.search();
				break;
			case "5":
				fo.showAll();
				break;
			case "0":
				System.exit(0);
				default:
				break;


			}

		}
	}

	
	public static String getUserInput() {
		Scanner sc=new Scanner(System.in);
		return sc.nextLine();
	}

	  

}
 