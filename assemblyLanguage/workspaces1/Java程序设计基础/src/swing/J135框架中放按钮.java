package swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J135����зŰ�ť extends JFrame{
	public static void main(String[] args) {
		J135����зŰ�ť jfrm=new J135����зŰ�ť();     //������ܶ���
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon ic=new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\�й���.jpg");
		JButton btn=new JButton("����",ic);   //������ť����
		//jfrm.setLayout(null);
		jfrm.setSize(200, 180);
		jfrm.setTitle("��ť�ര��");          //���ڱ���
		/*/Container c=jfrm.getContentPane();
		c.setBackground(Color.yellow);/*/
		btn.setBounds(50,45,100,40);  //����λ�����С
		btn.setToolTipText("���ǰ�ť");    //���ֹͣʱ��ʾ
		jfrm.add(btn);
		jfrm.setVisible(true);
	}

}
