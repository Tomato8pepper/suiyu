import java.util.Scanner;
public class program5 {
	public static void main(String[] args) {
			System.out.println("请输入分数 ：");
			Scanner scanner=new Scanner(System.in);
			int score=scanner.nextInt();
			if(score>=60){

				System.out.println("及格！");
			}
			else
			{
				System.out.println("不及格！");
			}
			scanner.close();
		}
	}
