package swing;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import javax.swing.JFrame;
public class J138�����з�ѡ�����ͼƬ  extends JFrame{
	JTabbedPane jtab=new JTabbedPane(JTabbedPane.TOP);//����ѡ� �Ϸ�
	public J138�����з�ѡ�����ͼƬ() {
		JLabel[] lab=new JLabel[6];
		Icon pic;
		String title;
		for (int i=1;i<=5;i++) {
			pic=new ImageIcon("t"+i+".jpg");
			lab[i]=new JLabel();
			lab[i].setIcon(pic);
			title="��"+i+"ҳ";
			jtab.add(title, lab[i]);
		}
		this.add(jtab);
	}
	public static void main(String[] args) {
		J138�����з�ѡ�����ͼƬ frm=new J138�����з�ѡ�����ͼƬ();
		Container c=frm.getContentPane();
		c.setBackground(Color.blue);
		frm.setTitle("ѡ���Ӧ��");
		frm.setSize(300,300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);

	}

}
