import javax.swing.JOptionPane;
public class program6 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "����һ����½����");
		int n=JOptionPane.showConfirmDialog(null,"��һ��Ҫ�˳���");
		if(n==0) {
			System.out.println("��ѡ����ȷ����");
		}
		else {
			System.out.println("��ѡ����ȡ����");
		}
	    String str=JOptionPane.showInputDialog("���������ַ���:");
	    n=Integer.parseInt(str);
	    JOptionPane.showMessageDialog(null, "�ðɡ�");
	    System.out.println("��������ǣ�"+n);
	    
	    
	}

}
