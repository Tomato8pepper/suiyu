package swing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Image;
import javax.swing.*;
public class J131��� extends Frame{
	static JFrame jfrm=new JFrame("���������ѽ!");      //������̬���
	public static void main(String[] args) {
		JLabel lab=new JLabel("�������Ǹ��󱿵���");        //����һ����ǩ����
		Image im=(new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\�й���.jpg")).getImage(); //����ͼ�����
		jfrm.setIconImage(im);     //��ʾͼ��
		jfrm.setSize(400,400);  // ��ܴ�С
		jfrm.setLocation(800, 400);// �������ʾ����λ��
		jfrm.add(lab);
		jfrm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);  //�رհ�ť  
		jfrm.setVisible(true);//��ʾ����
		Container c=jfrm.getContentPane(); // ��Ӵ��ڱ���ɫ
		c.setBackground(Color.yellow);
	}
}
