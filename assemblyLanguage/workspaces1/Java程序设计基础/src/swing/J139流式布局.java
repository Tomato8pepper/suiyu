package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class J139��ʽ���� extends JFrame {
	static JFrame frm=new JFrame("��ʽ�������ù�����FlowLayout");
	public static void main(String[] args) {
		FlowLayout flow=new FlowLayout(FlowLayout.CENTER,5,10);
		JButton but=new JButton("��ť");
		JLabel lab=new JLabel("����һ���ɰ��ı�ǩ");
		frm.setLocation(800, 400);     //����ʾ����λ��
		frm.setLayout(flow);          //������ʽ����
		frm.setSize(260, 150);
		frm.add(but);      //��Ӱ�ť���
		frm.add(lab);          //��ӱ�ǩ1
		frm.add(new JTextField("��ʽ���ֲ��� FlowLayout",18));          //����ı������
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
	

}
