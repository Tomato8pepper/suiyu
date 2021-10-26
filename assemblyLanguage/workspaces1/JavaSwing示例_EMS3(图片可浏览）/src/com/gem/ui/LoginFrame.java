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
 * ��¼����
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
		// ���ô�С
		f.setSize(300, 300);
		f.setTitle("Ա������ϵͳ(QQ:23665701)");
		// ���ñ���
		lblTitle = new JLabel("Ա������ϵͳV1(GYB)");
		lblName = new JLabel("�˺ţ�");
		fldName = new JTextField();
		lblPwd = new JLabel("���룺");
		fldPwd = new JPasswordField();
		btnLogin = new JButton("��¼");
		// ���ò���Ϊ�գ�ʹ��������ƿؼ�λ�õ�ʱ��һ��Ҫ���ò���Ϊ��
		f.setLayout(null);
		// ����λ�����С
		lblTitle.setBounds(100, 50, 150, 30);
		// lblTitle.setSize();
		lblName.setBounds(50, 100, 50, 30);
		fldName.setBounds(100, 100, 150, 30);
		lblPwd.setBounds(50, 150, 50, 30);
		fldPwd.setBounds(100, 150, 150, 30);
		btnLogin.setBounds(100, 210, 100, 40);
		// ��ӿؼ�
		c = f.getContentPane();
		c.add(lblTitle);
		c.add(lblName);
		c.add(fldName);
		c.add(lblPwd);
		c.add(fldPwd);
		c.add(btnLogin);
		// ����f�����λ�ã�����Ϊnull������ʾ����Ļ�м�
		f.setLocationRelativeTo(null);
		// ���õ��û��ڴ˶Ի��������� "close" ʱĬ��ִ�еĲ���
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// �����Ƿ���ʾ
		f.setVisible(true);
		f.setResizable(false);
		// P53
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println("Button��s label is:"+
				// e.getActionCommand());
				
				String name = fldName.getText();
				String pwd = fldPwd.getText();// .getPassword().toString();
				if (name.trim().equals("") || pwd.trim().equals("")) {
					JOptionPane.showMessageDialog(f, "�ʺŻ�������", "Ա������ϵͳ", 0);
					return;
				}
				System.out.println(name);
				System.out.println(pwd);
				
				// ok
				EmployeeDAO dao = new EmployeeDAO();
				if (dao.login(name, pwd)) {
					// JOptionPane.showMessageDialog(f, "��¼�ɹ�!");
					MainFrame f2 = new MainFrame();
					f2.setVisible(true);
					f.setVisible(false);
				} else
					JOptionPane.showMessageDialog(f, "��¼ʧ�ܣ�", "Ա������ϵͳ", 0);
			}
		});
//		f.addWindowListener(new WindowAdapter() { // �����¼�����
//			public void windowClosing(WindowEvent arg0) { // ��д���ڹرյķ���
//				System.exit(1);// ϵͳ�˳�
//			}
//		});


	}

	public static void main(String[] args) {
		new LoginFrame();
	}
}
