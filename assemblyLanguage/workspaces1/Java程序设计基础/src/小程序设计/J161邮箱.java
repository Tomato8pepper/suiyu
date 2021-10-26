package 小程序设计;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class J161邮箱 extends JApplet implements ActionListener {
	private JTextField name;
	private JPasswordField password;
	private JComboBox<String>mailBox;
	private JButton login;
	public void init() {
		Container c=getContentPane();
		c.setBackground(Color.white);
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		c.add(new JLabel("邮箱"));
		name=new JTextField("用户名",10);
		name.addActionListener(this);
		c.add(name);
		c.add(new JLabel("@"));
		String[] box= {"tom.com","263.net"};
		mailBox=new JComboBox<String>(box);
		c.add(mailBox);
		c.add(new JLabel("密码"));
		password=new JPasswordField("*",10);
		c.add(password);
		login=new JButton("登录");
		c.add(login);
		login.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login||e.getSource()==password)
		{}
	}
}
