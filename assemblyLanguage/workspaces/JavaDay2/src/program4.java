import java.util.Scanner;
public class program4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("��������� ��");
			int score = scanner.nextInt();
			if (score >= 60) {

				System.out.println("����");
			} else {
				System.out.println("������");
			}
		}
	}

}
