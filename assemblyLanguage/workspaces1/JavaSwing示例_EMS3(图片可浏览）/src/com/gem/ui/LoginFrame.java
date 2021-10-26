package com.gem.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.gem.dao.EmployeeDAO;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 登录界面
 * 
 * @author ybgong
 *
 */
public class LoginFrame {
	private JFrame f;
	private Container c;

	private JLabel lblTitle;
	private JLabel lblName;
	private JTextField fldName;
	private JLabel lblPwd;
	private JPasswordField fldPwd;
	private JButton btnLogin;

	public LoginFrame() {
		f = new JFrame();
		// 设置大小
		f.setSize(300, 300);
		f.setTitle("员工管理系统(QQ:23665701)");
		// 设置标题
		lblTitle = new JLabel("员工管理系统V1(GYB)");
		lblName = new JLabel("账号：");
		fldName = new JTextField();
		lblPwd = new JLabel("密码：");
		fldPwd = new JPasswordField();
		btnLogin = new JButton("登录");
		// 设置布局为空，使用坐标控制控件位置的时候，一定要设置布局为空
		f.setLayout(null);
		// 设置位置与大小
		lblTitle.setBounds(100, 50, 150, 30);
		// lblTitle.setSize();
		lblName.setBounds(50, 100, 50, 30);
		fldName.setBounds(100, 100, 150, 30);
		lblPwd.setBounds(50, 150, 50, 30);
		fldPwd.setBounds(100, 150, 150, 30);
		btnLogin.setBounds(100, 210, 100, 40);
		// 添加控件
		c = f.getContentPane();
		c.add(lblTitle);
		c.add(lblName);
		c.add(fldName);
		c.add(lblPwd);
		c.add(fldPwd);
		c.add(btnLogin);
		// 设置f的相对位置，参数为null，即显示在屏幕中间
		f.setLocationRelativeTo(null);
		// 设置当用户在此对话框上启动 "close" 时默认执行的操作
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// 设置是否显示
		f.setVisible(true);
		f.setResizable(false);
		// P53
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println("Button’s label is:"+
				// e.getActionCommand());
				
				String name = fldName.getText();
				String pwd = fldPwd.getText();// .getPassword().toString();
				if (name.trim().equals("") || pwd.trim().equals("")) {
					JOptionPane.showMessageDialog(f, "帐号或密码必填！", "员工管理系统", 0);
					return;
				}
				System.out.println(name);
				System.out.println(pwd);
				
				// ok
				EmployeeDAO dao = new EmployeeDAO();
				if (dao.login(name, pwd)) {
					// JOptionPane.showMessageDialog(f, "登录成功!");
					MainFrame f2 = new MainFrame();
					f2.setVisible(true);
					f.setVisible(false);
				} else
					JOptionPane.showMessageDialog(f, "登录失败！", "员工管理系统", 0);
			}
		});
//		f.addWindowListener(new WindowAdapter() { // 加入事件监听
//			public void windowClosing(WindowEvent arg0) { // 复写窗口关闭的方法
//				System.exit(1);// 系统退出
//			}
//		});


	}

	public static void main(String[] args) {
		new LoginFrame();
	}
}
