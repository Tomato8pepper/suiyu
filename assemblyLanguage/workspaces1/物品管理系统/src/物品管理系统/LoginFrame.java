package ��Ʒ����ϵͳ;

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
		// ���ô�С
		f.setSize(450, 450);
		f.setTitle("��Ʒ����ϵͳ");
		// ���ñ���
		lblTitle = new JLabel("��Ʒ����ϵͳ");
		lblTitle.setForeground(Color.RED);
		lblName = new JLabel("�˺ţ�");
		fldName = new JTextField();
		lblPwd = new JLabel("���룺");
		fldPwd = new JPasswordField();
		btnLogin = new JButton("��¼");
		btnLogin.setForeground(Color.RED);
		btnRegister = new JButton("ע��");
		// ���ò���Ϊ�գ�ʹ��������ƿؼ�λ�õ�ʱ��һ��Ҫ���ò���Ϊ��
		f.setLayout(null);
		ImageIcon ic = new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\�й���.jpg");
		Image im = (new ImageIcon("D:\\BIANXHENG\\workspaces1\\��Ʒ����ϵͳ\\456.jpg")).getImage();
		f.setIconImage(im);
		Container c = f.getContentPane();
		c.setBackground(Color.cyan);
		lblPwd.setOpaque(true);
		// lblPwd.setBackground(Color.GREEN);
		lblPwd.setForeground(Color.RED);
		lblName.setOpaque(true);
		// lblPwd.setBackground(Color.GREEN);
		lblName.setForeground(Color.RED);

		// ����λ�����СD:\BIANXHENG\workspaces1\��Ʒ����ϵͳ
		Font m = new Font("����", Font.BOLD, 24);
		lblTitle.setFont(m);
		Font n = new Font("����", Font.BOLD, 15);
		lblName.setFont(n);
		Font n1 = new Font("����", Font.BOLD, 15);
		lblPwd.setFont(n1);
		lblTitle.setBounds(150, 50, 200, 40);
		// lblTitle.setSize();
		lblName.setBounds(90, 100, 50, 30);
		fldName.setBounds(150, 100, 150, 30);
		lblPwd.setBounds(90, 150, 50, 30);
		fldPwd.setBounds(150, 150, 150, 30);
		btnLogin.setBounds(80, 250, 100, 40);
		btnRegister.setBounds(250, 250, 100, 40);
		// ��ӿؼ�
		// Button mybutton = new Button("Button Font");
		Font m1 = new Font("����", Font.BOLD, 18);
		btnLogin.setFont(m1);
		Font m2 = new Font("����", Font.BOLD, 18);
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
		// ����f�����λ�ã�����Ϊnull������ʾ����Ļ�м�
		f.setLocationRelativeTo(null);
		// ���õ��û��ڴ˶Ի��������� "close" ʱĬ��ִ�еĲ���
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// �����Ƿ���ʾ
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
				// System.out.println("Button��s label is:"+
				// e.getActionCommand());
				String name = fldName.getText();
				String pwd = fldPwd.getText();// .getPassword().toString();
				// System.out.println(name);
				// System.out.println(pwd);
				if (name.trim().equals("") || pwd.trim().equals("")) {
					JOptionPane.showMessageDialog(f, "�����˺Ż���������,����������!", "��Ʒ����ϵͳ", 0);
					return;
				}
				// ok
				// if(name.equals("admin")&&pwd.equals("123456"))
				GoodsDAO dao = new GoodsDAO();
				if (dao.login(name, pwd)) {
					MainFrame f2 = new MainFrame();
					f2.setVisible(true);
					f.setVisible(false);
					// JOptionPane.showMessageDialog(f, "��¼�ɹ�!");
				} else
					JOptionPane.showMessageDialog(f, "��¼ʧ�ܣ�", "��Ʒ����ϵͳ", 0);
			}
		});

	}

	public static void main(String[] args) {
		new LoginFrame();
	}
}
