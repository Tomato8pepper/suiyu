package 物品管理系统;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UserAddFrame extends JFrame{
	private JTextField fldId;
	private JTextField fldName;
	private JTextField fldPw;
	private JTextField fldGender;
	private JTextField fldAge;
	private JButton btnAdd;
	
	private static final long serialVersionUID = 1L;
	public UserAddFrame() {
		super("用户注册");
		ImageIcon ic = new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\中国心.jpg");
		Image im = (new ImageIcon("D:\\BIANXHENG\\workspaces1\\物品管理系统\\456.jpg")).getImage();
		this.setIconImage(im);
		this.setSize(350,450); //横 竖
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
		Container c = this.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		
		//添加界面组件元素
		c.add(getTitleGUI());
		c.add(getIdGUI());
		c.add(getNameGUI());
		c.add(getPwGUI());
		c.add(getGenderGUI());
		c.add(getAgeGUI());
		c.add(getAddGUI());

		this.setVisible(true);
		this.setResizable(false);
		// app.setUndecorated(true); // 去掉窗口的装饰
		// app.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG
		// );//采用指定的窗口装饰风格
		this.btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//输入必填提示
				String uId = fldId.getText();
				String uName = fldName.getText();
				String uPw = fldPw.getText();
				String Gender = fldGender.getText();
				String uAge = fldAge.getText();
				if (uId.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "请输入账号！", "用户注册", 0);
					fldId.setFocusable(true);
					return;
				}
				if (uName.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "请输入姓名！", "用户注册", 0);
					fldName.setFocusable(true);
					return;
				}
				if (uPw.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "请输入密码！", "用户注册", 0);
					fldPw.setFocusable(true);
					return;
				}
				if (Gender.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "请输入性别！", "用户注册", 0);
					fldGender.setFocusable(true);
					return;
				}
				if (uAge.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "请输入年龄！", "用户注册", 0);
					fldAge.setFocusable(true);
					return;
				}

				User ue=new User(uId,uName,uPw,Gender,uAge); 
				UserDAO dao=new UserDAO();
				int i= dao.addUser(ue);
				if (i>0) {
					JOptionPane.showMessageDialog(null, "注册成功!");
				} else
					JOptionPane.showMessageDialog(null, "注册失败！", "用户注册系统", 0);
			}
		});
		
	}
	private JPanel getTitleGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 150);

		JLabel lbl = new JLabel("用户注册", JLabel.LEFT);
		Font f = new Font("楷体", Font.BOLD, 24);
		lbl.setFont(f);
		jp.add(lbl);
		jp.setBackground(Color.ORANGE);
		return jp;
	}
	private JPanel getGenderGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5,30,0,80));
		jp.setSize(400, 50);
		JLabel lbl = new JLabel("年        龄:", JLabel.LEFT);
		lbl.setSize(55, 30);
		jp.add(lbl);
		fldGender=new JTextField("请输入年龄", 15);
		jp.add(fldGender);
		// jp.setBackground(Color.orange);
		return jp;
	}
	
	
	private JPanel getAgeGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5,30,0,80));
		jp.setSize(400, 50);
		JLabel lbl = new JLabel("性        别:", JLabel.LEFT);
		lbl.setSize(55, 30);
		jp.add(lbl);
		fldAge=new JTextField("请输入性别", 15);
		jp.add(fldAge);
		// jp.setBackground(Color.orange);
		return jp;
	}

	
	private JPanel getPwGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 30, 0, 5));
		jp.setSize(400, 30);
		JLabel lbl = new JLabel("密        码:", JLabel.LEFT);
		lbl.setSize(55, 18);
		jp.add(lbl);
		fldPw = new JPasswordField("请输入密码", 15);
		jp.add(fldPw);
		// jp.setBackground(Color.orange);
		return jp;
	}
	
	
	private JPanel getNameGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 30, 0,80));
		jp.setSize(400, 50);
		jp.add(new JLabel("姓        名:", JLabel.LEFT));
		fldName=new JTextField("请输入姓名", 15);
		jp.add(fldName);
		// jp.setBackground(Color.orange);
		return jp;
	}
	
	private JPanel getIdGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5,30, 0,80));
		jp.setSize(400, 50);
		jp.add(new JLabel("账        号:", JLabel.LEFT));
		fldId=new JTextField("请输入账号", 15);
		jp.add(fldId);
		return jp;
	}
	private JPanel getAddGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 50);
		// jp.setBackground(Color.orange);
		btnAdd=new JButton("注册 ");
		jp.add(btnAdd);
		return jp;
	}
	public static void main(String[] args) {
		new UserAddFrame();
	}
}
