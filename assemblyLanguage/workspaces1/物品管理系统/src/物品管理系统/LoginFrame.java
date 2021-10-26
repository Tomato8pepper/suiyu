package 物品管理系统;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
	private JButton btnRegister;

	public LoginFrame() {
		f = new JFrame();
		// 设置大小
		f.setSize(450, 450);
		f.setTitle("物品管理系统");
		// 设置标题
		lblTitle = new JLabel("物品管理系统");
		lblTitle.setForeground(Color.RED);
		lblName = new JLabel("账号：");
		fldName = new JTextField();
		lblPwd = new JLabel("密码：");
		fldPwd = new JPasswordField();
		btnLogin = new JButton("登录");
		btnLogin.setForeground(Color.RED);
		btnRegister = new JButton("注册");
		// 设置布局为空，使用坐标控制控件位置的时候，一定要设置布局为空
		f.setLayout(null);
		ImageIcon ic = new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\中国心.jpg");
		Image im = (new ImageIcon("D:\\BIANXHENG\\workspaces1\\物品管理系统\\456.jpg")).getImage();
		f.setIconImage(im);
		Container c = f.getContentPane();
		c.setBackground(Color.cyan);
		lblPwd.setOpaque(true);
		// lblPwd.setBackground(Color.GREEN);
		lblPwd.setForeground(Color.RED);
		lblName.setOpaque(true);
		// lblPwd.setBackground(Color.GREEN);
		lblName.setForeground(Color.RED);

		// 设置位置与大小D:\BIANXHENG\workspaces1\物品管理系统
		Font m = new Font("楷体", Font.BOLD, 24);
		lblTitle.setFont(m);
		Font n = new Font("楷体", Font.BOLD, 15);
		lblName.setFont(n);
		Font n1 = new Font("楷体", Font.BOLD, 15);
		lblPwd.setFont(n1);
		lblTitle.setBounds(150, 50, 200, 40);
		// lblTitle.setSize();
		lblName.setBounds(90, 100, 50, 30);
		fldName.setBounds(150, 100, 150, 30);
		lblPwd.setBounds(90, 150, 50, 30);
		fldPwd.setBounds(150, 150, 150, 30);
		btnLogin.setBounds(80, 250, 100, 40);
		btnRegister.setBounds(250, 250, 100, 40);
		// 添加控件
		// Button mybutton = new Button("Button Font");
		Font m1 = new Font("楷体", Font.BOLD, 18);
		btnLogin.setFont(m1);
		Font m2 = new Font("楷体", Font.BOLD, 18);
		btnRegister.setFont(m2);
		// mybutton.setFont(myfont);
		c = f.getContentPane();
		c.add(lblTitle);
		c.add(lblName);
		c.add(fldName);
		c.add(lblPwd);
		c.add(fldPwd);
		c.add(btnLogin);
		c.add(btnRegister);
		// 设置f的相对位置，参数为null，即显示在屏幕中间
		f.setLocationRelativeTo(null);
		// 设置当用户在此对话框上启动 "close" 时默认执行的操作
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// 设置是否显示
		f.setVisible(true);
		f.setResizable(false);
		// P53
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserAddFrame a=new UserAddFrame();
			}
		});
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println("Button’s label is:"+
				// e.getActionCommand());
				String name = fldName.getText();
				String pwd = fldPwd.getText();// .getPassword().toString();
				// System.out.println(name);
				// System.out.println(pwd);
				if (name.trim().equals("") || pwd.trim().equals("")) {
					JOptionPane.showMessageDialog(f, "您的账号或密码有误,请重新输入!", "物品管理系统", 0);
					return;
				}
				// ok
				// if(name.equals("admin")&&pwd.equals("123456"))
				GoodsDAO dao = new GoodsDAO();
				if (dao.login(name, pwd)) {
					MainFrame f2 = new MainFrame();
					f2.setVisible(true);
					f.setVisible(false);
					// JOptionPane.showMessageDialog(f, "登录成功!");
				} else
					JOptionPane.showMessageDialog(f, "登录失败！", "物品管理系统", 0);
			}
		});

	}

	public static void main(String[] args) {
		new LoginFrame();
	}
}
