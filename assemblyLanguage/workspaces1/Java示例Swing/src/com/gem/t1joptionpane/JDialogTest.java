package com.gem.t1joptionpane;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JDialogTest {
	public static void main(String[] args) {
		JDialog dialog = new JDialog();
	      // ���ô�С
	      dialog.setSize(300, 300);
	      // ���ñ���
	      dialog.setTitle("��¼����");
	      JLabel unameLabel = new JLabel("�˺ţ�");
	      JTextField unameField = new JTextField();
	      JLabel upsdLabel = new JLabel("���룺");
	      JTextField upsdField = new JTextField();
	      JButton login = new JButton("��¼");
	      JButton cancel = new JButton("ȡ��");
	      // ����λ�����С
	      unameLabel.setBounds(50, 50, 50, 30);
	      unameField.setBounds(100, 50, 150, 30);
	      upsdLabel.setBounds(50, 100, 50, 30);
	      upsdField.setBounds(100, 100, 150, 30);
	      login.setBounds(60, 160, 60, 40);
	      cancel.setBounds(160, 160, 60, 40);
	      // ���ò���Ϊ�գ�ʹ��������ƿؼ�λ�õ�ʱ��һ��Ҫ���ò���Ϊ��
	      dialog.setLayout(null);
	      // ��ӿؼ�
	      dialog.add(login);
	      dialog.add(cancel);
	      dialog.add(unameField);
	      dialog.add(unameLabel);
	      dialog.add(upsdLabel);
	      dialog.add(upsdField);
	      // ����dislog�����λ�ã�����Ϊnull������ʾ����Ļ�м�
	      dialog.setLocationRelativeTo(null);
	      // ���õ��û��ڴ˶Ի��������� "close" ʱĬ��ִ�еĲ���
	      dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	      // �����Ƿ���ʾ
	      dialog.setVisible(true);
	}
}
