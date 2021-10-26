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
		// ���ô�С
		f.setSize(300, 300);
		f.setTitle("Ա������ϵͳ");
		// ���ñ���
		lblTitle=new JLabel("Ա������ϵͳ");
		lblName=new JLabel("�˺ţ�");
		fldName=new JTextField();
		lblPwd=new JLabel("���룺");
		fldPwd=new JPasswordField();
		btnLogin=new JButton("��¼");
		 // ���ò���Ϊ�գ�ʹ��������ƿؼ�λ�õ�ʱ��һ��Ҫ���ò���Ϊ��
        f.setLayout(null);
		// ����λ�����С
        lblTitle.setBounds(100, 50, 150, 30);
        //lblTitle.setSize();
		lblName.setBounds(50, 100, 50, 30);
		fldName.setBounds(100, 100, 150, 30);
		lblPwd.setBounds(50, 150, 50, 30);
		fldPwd.setBounds(100, 150,150, 30);
		btnLogin.setBounds(100, 210,100, 40);
		// ��ӿؼ�
		c=f.getContentPane();
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
        //P53
        btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Button��s label is:"+
				//		e.getActionCommand());
				String name=fldName.getText();
				String pwd=fldPwd.getText();//.getPassword().toString();
				//System.out.println(name);
				//System.out.println(pwd);
				//ok
				//if(name.equals("admin")&&pwd.equals("123456"))
				EmployeeDAO dao=new EmployeeDAO();
				if(dao.login(name, pwd))
					JOptionPane.showMessageDialog(f, "��¼�ɹ�!");
				else
					JOptionPane.showMessageDialog(f, "��¼ʧ�ܣ�","EMS",0);
			}
		});
		
	}

	public static void main(String[] args) {
		new LoginFrame();
	}
}
