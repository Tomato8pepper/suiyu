package swing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
public class J132�����尴ť {
	public static void main(String[] args) {
		JFrame jfrm=new JFrame("����������ã�"); //���
		jfrm.setSize(210,210);  // ��ܵĴ�С
		Image im=(new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\�й���.jpg")).getImage();  
		jfrm.setIconImage(im); //��ʾͼ��
		Container c=jfrm.getContentPane();
		c.setBackground(Color.BLUE);   //ûʲô��
		jfrm.setLocation(1000,500);  //����ʾ����λ��
		JPanel jpan=new JPanel();   //����������
		jpan.setSize(200,200);  //���Ĵ�С
		jpan.setLocation(30,30);  
		JButton bun=new JButton("���ǰ�ť");// ��ť
		bun.setSize(80,170);     //��  ��
		bun.setLocation(20,30);//��ť��λ��
		jfrm.setLayout(null);   //ȡ��Ĭ�ϵĲ��ֹ�����
		jpan.setLayout(null);
		jpan.add(bun);      //�����ť��ӵ���嵱��
		jpan.setBorder(new TitledBorder("�����"));//Ϊ���������ñ߿�
		jfrm.add(jpan);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
	}
}
