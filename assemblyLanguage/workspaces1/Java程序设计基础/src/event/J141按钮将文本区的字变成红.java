package event;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class J141��ť���ı������ֱ�ɺ� extends JFrame implements ActionListener{
		
	static J141��ť���ı������ֱ�ɺ� frm=new J141��ť���ı������ֱ�ɺ�();
	static JButton bt=new JButton("����������ɫ");
	static JTextArea ta=new JTextArea("����һ��������������Ů����",5,20);
	public static void main(String[] args) {
		bt.addActionListener(frm);        // �Ѽ�����frm���¼�Դbtע��
		frm.setTitle("�ľ����к�");
		frm.setLayout(new FlowLayout());
		frm.setSize(400,400);
		frm.add(ta);
		frm.add(bt);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) { //������ťbt�¼�����ʱ�Ĳ���
		ta.setForeground(Color.blue);   //���ֱ�ɺ�
	}
}
