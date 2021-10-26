package com.gem.ems;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame {
	private JFrame f;
	private Container c;

	private JLabel lblTitle;
	private JLabel lblName;
	private JTextField fldName;
	private JLabel lblPwd;
	private JPasswordField fldPwd;
	private JButton btnLogin;

	public LoginFrame(){
		f=new JFrame();
		// 设置大小
		f.setSize(300, 300);
		f.setTitle("员工管理系统");
		// 设置标题
		lblTitle=new JLabel("员工管理系统");
		lblName=new JLabel("账号：");
		fldName=new JTextField();
		lblPwd=new JLabel("密码：");
		fldPwd=new JPasswordField();
		btnLogin=new JButton("登录");
		 // 设置布局为空，使用坐标控制控件位置的时候，一定要设置布局为空
        f.setLayout(null);
		// 设置位置与大小
        lblTitle.setBounds(100, 50, 150, 30);
        //lblTitle.setSize();
		lblName.setBounds(50, 100, 50, 30);
		fldName.setBounds(100, 100, 150, 30);
		lblPwd.setBounds(50, 150, 50, 30);
		fldPwd.setBounds(100, 150,150, 30);
		btnLogin.setBounds(100, 210,100, 40);
		// 添加控件
		c=f.getContentPane();
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
        //P53
        btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Button’s label is:"+
				//		e.getActionCommand());
				String name=fldName.getText();
				String pwd=fldPwd.getText();//.getPassword().toString();
				//System.out.println(name);
				//System.out.println(pwd);
				//ok
				//if(name.equals("admin")&&pwd.equals("123456"))
				EmployeeDAO dao=new EmployeeDAO();
				if(dao.login(name, pwd))
					JOptionPane.showMessageDialog(f, "登录成功!");
				else
					JOptionPane.showMessageDialog(f, "登录失败！","EMS",0);
			}
		});
		
	}

	public static void main(String[] args) {
		new LoginFrame();
	}
}
