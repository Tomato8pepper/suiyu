import java.util.Scanner;
public class program4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("请输入分数 ：");
			int score = scanner.nextInt();
			if (score >= 60) {

				System.out.println("及格！");
			} else {
				System.out.println("不及格！");
			}
		}
	}

}
