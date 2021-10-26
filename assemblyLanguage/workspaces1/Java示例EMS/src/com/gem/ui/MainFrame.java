package com.gem.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 主界面
 * 
 * @author ybgong
 *
 */
public class MainFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		super("员工管理系统V1(GYB QQ:23665701)");
		JMenuBar menubar = new JMenuBar();
		// 员工管理:查询员工 ，添加员工， 员工维护
		JMenu menu = new JMenu("员工管理");

		JMenuItem item1 = new JMenuItem(" 查询员工");
		item1.addActionListener(this);
		JMenuItem item2 = new JMenuItem(" 添加员工");
		item2.addActionListener(this);
		JMenuItem item3 = new JMenuItem(" 员工维护");

		setJMenuBar(menubar);
		menubar.add(menu);
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.addSeparator();
		JMenuItem item4 = new JMenuItem(" 退出");
		item4.addActionListener(this);
		menu.add(item4);
		// 部门管理：部门浏览，部门维护
		JMenu menu2 = new JMenu("部门管理");

		JMenuItem item21 = new JMenuItem(" 部门浏览");
		item21.addActionListener(this);
		JMenuItem item22 = new JMenuItem(" 部门维护");
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
		// 如何识别点了哪个item？
		System.out.println(e.getActionCommand());
		System.out.println(e.getID());
		JFrame f = null;
		// 显示某个界面
		if (e.getActionCommand().contains("查询员工")) {
			f = new EmployeeSearchFrame();
		}
		if (e.getActionCommand().contains("添加员工")) {
			f = new EmployeeAddFrame();
		}
		if (e.getActionCommand().contains("退出")) {
			System.exit(0);
		}
		if (f != null) {
			f.setVisible(true);
		}
	}
}
