import java.util.Scanner;
public class program5 {
	public static void main(String[] args) {
			System.out.println("��������� ��");
			Scanner scanner=new Scanner(System.in);
			int score=scanner.nextInt();
			if(score>=60){

				System.out.println("����");
			}
			else
			{
				System.out.println("������");
			}
			scanner.close();
		}
	}
