package swing;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
public class J136��ѡ��ѡ��ť extends JFrame {
		static JFrame frm=new JFrame("��ѡ��͵�ѡ��ť");
		static JCheckBox jchk1=new JCheckBox("б��");   //������ѡ��
		static JCheckBox jchk2=new JCheckBox("����",true);
		static JCheckBox jchk3=new JCheckBox("�»���");
		static JRadioButton jrb1=new JRadioButton("��ɫ");     
		static JRadioButton jrb2=new JRadioButton("��ɫ",true);//������ѡ�򣬳�ʼ״̬ѡ��
		static JRadioButton jrb3=new JRadioButton("��ɫ");

		public static void main(String[] args) {
			ButtonGroup grp=new ButtonGroup();  //������ѡ��ť�����
			Container c=frm.getContentPane();
			c.setBackground(Color.yellow);
			frm.setSize(300,220);  // ��ܴ�С
			frm.setLocation(200,150);
			frm.setLayout(null);
			jchk1.setBounds(20,20,150,20);  //��ѡ��λ�����С
			jchk2.setBounds(20,40,150,20);
			jchk3.setBounds(20,60,150,20);
			jrb1.setBounds(20,80,150,20);  //��ѡ��ťλ�����С
			jrb2.setBounds(20,100,150,20);
			jrb3.setBounds(20,120,150,20);
			grp.add(jrb1);
			grp.add(jrb2);
			grp.add(jrb3);
			frm.add(jchk1);
			frm.add(jchk2);
			frm.add(jchk3);
			frm.add(jrb1);
			frm.add(jrb2);
			frm.add(jrb3);
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frm.setVisible(true);
			
	}

}
