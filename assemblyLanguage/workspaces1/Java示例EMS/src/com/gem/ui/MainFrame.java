package com.gem.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * ������
 * 
 * @author ybgong
 *
 */
public class MainFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		super("Ա������ϵͳV1(GYB QQ:23665701)");
		JMenuBar menubar = new JMenuBar();
		// Ա������:��ѯԱ�� �����Ա���� Ա��ά��
		JMenu menu = new JMenu("Ա������");

		JMenuItem item1 = new JMenuItem(" ��ѯԱ��");
		item1.addActionListener(this);
		JMenuItem item2 = new JMenuItem(" ���Ա��");
		item2.addActionListener(this);
		JMenuItem item3 = new JMenuItem(" Ա��ά��");

		setJMenuBar(menubar);
		menubar.add(menu);
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.addSeparator();
		JMenuItem item4 = new JMenuItem(" �˳�");
		item4.addActionListener(this);
		menu.add(item4);
		// ���Ź����������������ά��
		JMenu menu2 = new JMenu("���Ź���");

		JMenuItem item21 = new JMenuItem(" �������");
		item21.addActionListener(this);
		JMenuItem item22 = new JMenuItem(" ����ά��");
		menubar.add(menu2);
		menu2.add(item21);
		menu2.add(item22);

		this.setSize(1124, 650);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ���ʶ������ĸ�item��
		System.out.println(e.getActionCommand());
		System.out.println(e.getID());
		JFrame f = null;
		// ��ʾĳ������
		if (e.getActionCommand().contains("��ѯԱ��")) {
			f = new EmployeeSearchFrame();
		}
		if (e.getActionCommand().contains("���Ա��")) {
			f = new EmployeeAddFrame();
		}
		if (e.getActionCommand().contains("�˳�")) {
			System.exit(0);
		}
		if (f != null) {
			f.setVisible(true);
		}
	}
}
