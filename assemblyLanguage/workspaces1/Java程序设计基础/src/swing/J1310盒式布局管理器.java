package swing;

import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J1310��ʽ���ֹ����� {
	public static void main(String[] args) {
		JFrame frm = new JFrame("��ʽ���ֹ�����");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(220, 130);
		Container app = frm.getContentPane(); // ��ȡ���ڵ����ݴ���
		BoxLayout b1 = new BoxLayout(app, BoxLayout./* (X_AXIS */Y_AXIS); // ������ʽ���ֹ���������
		frm.setLayout(b1);
		JButton but;
		for (int i = 1; i < 4; i++) {
			but = new JButton("��ť" + i); // ������ť����
			// but.setToolTipText("����˧��!");
			frm.add(but);
		}
		frm.setVisible(true);
	}

}
