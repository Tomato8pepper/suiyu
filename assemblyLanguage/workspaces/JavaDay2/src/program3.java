import javax.swing.JOptionPane;
import java.util.Scanner;
public class program3 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); 	//����̨  ��ʾ�� 
	while (true) {
		System.out.print("��������� ��");
		int score = scanner.nextInt();
		if (score >= 60) {

			System.out.println("����");			//����̨  ��ʾ�� 
			JOptionPane.showMessageDialog(null, "����!","���ĳɼ�",JOptionPane.INFORMATION_MESSAGE);
		} else {
			System.out.println("������");	
			JOptionPane.showMessageDialog(null, "������!","���ĳɼ�",2);
			
		}
	}
	}
}