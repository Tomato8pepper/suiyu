import javax.swing.JOptionPane;
import java.util.Scanner;
public class program3 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); 	//控制台  提示框 
	while (true) {
		System.out.print("请输入分数 ：");
		int score = scanner.nextInt();
		if (score >= 60) {

			System.out.println("及格！");			//控制台  提示框 
			JOptionPane.showMessageDialog(null, "及格!","您的成绩",JOptionPane.INFORMATION_MESSAGE);
		} else {
			System.out.println("不及格！");	
			JOptionPane.showMessageDialog(null, "不及格!","您的成绩",2);
			
		}
	}
	}
}