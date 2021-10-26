package ��Ʒ����ϵͳ;

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
		super("�û�ע��");
		ImageIcon ic = new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\�й���.jpg");
		Image im = (new ImageIcon("D:\\BIANXHENG\\workspaces1\\��Ʒ����ϵͳ\\456.jpg")).getImage();
		this.setIconImage(im);
		this.setSize(350,450); //�� ��
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
		Container c = this.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		
		//��ӽ������Ԫ��
		c.add(getTitleGUI());
		c.add(getIdGUI());
		c.add(getNameGUI());
		c.add(getPwGUI());
		c.add(getGenderGUI());
		c.add(getAgeGUI());
		c.add(getAddGUI());

		this.setVisible(true);
		this.setResizable(false);
		// app.setUndecorated(true); // ȥ�����ڵ�װ��
		// app.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG
		// );//����ָ���Ĵ���װ�η��
		this.btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//���������ʾ
				String uId = fldId.getText();
				String uName = fldName.getText();
				String uPw = fldPw.getText();
				String Gender = fldGender.getText();
				String uAge = fldAge.getText();
				if (uId.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "�������˺ţ�", "�û�ע��", 0);
					fldId.setFocusable(true);
					return;
				}
				if (uName.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "������������", "�û�ע��", 0);
					fldName.setFocusable(true);
					return;
				}
				if (uPw.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "���������룡", "�û�ע��", 0);
					fldPw.setFocusable(true);
					return;
				}
				if (Gender.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "�������Ա�", "�û�ע��", 0);
					fldGender.setFocusable(true);
					return;
				}
				if (uAge.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "���������䣡", "�û�ע��", 0);
					fldAge.setFocusable(true);
					return;
				}

				User ue=new User(uId,uName,uPw,Gender,uAge); 
				UserDAO dao=new UserDAO();
				int i= dao.addUser(ue);
				if (i>0) {
					JOptionPane.showMessageDialog(null, "ע��ɹ�!");
				} else
					JOptionPane.showMessageDialog(null, "ע��ʧ�ܣ�", "�û�ע��ϵͳ", 0);
			}
		});
		
	}
	private JPanel getTitleGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 150);

		JLabel lbl = new JLabel("�û�ע��", JLabel.LEFT);
		Font f = new Font("����", Font.BOLD, 24);
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
		JLabel lbl = new JLabel("��        ��:", JLabel.LEFT);
		lbl.setSize(55, 30);
		jp.add(lbl);
		fldGender=new JTextField("����������", 15);
		jp.add(fldGender);
		// jp.setBackground(Color.orange);
		return jp;
	}
	
	
	private JPanel getAgeGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5,30,0,80));
		jp.setSize(400, 50);
		JLabel lbl = new JLabel("��        ��:", JLabel.LEFT);
		lbl.setSize(55, 30);
		jp.add(lbl);
		fldAge=new JTextField("�������Ա�", 15);
		jp.add(fldAge);
		// jp.setBackground(Color.orange);
		return jp;
	}

	
	private JPanel getPwGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 30, 0, 5));
		jp.setSize(400, 30);
		JLabel lbl = new JLabel("��        ��:", JLabel.LEFT);
		lbl.setSize(55, 18);
		jp.add(lbl);
		fldPw = new JPasswordField("����������", 15);
		jp.add(fldPw);
		// jp.setBackground(Color.orange);
		return jp;
	}
	
	
	private JPanel getNameGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 30, 0,80));
		jp.setSize(400, 50);
		jp.add(new JLabel("��        ��:", JLabel.LEFT));
		fldName=new JTextField("����������", 15);
		jp.add(fldName);
		// jp.setBackground(Color.orange);
		return jp;
	}
	
	private JPanel getIdGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5,30, 0,80));
		jp.setSize(400, 50);
		jp.add(new JLabel("��        ��:", JLabel.LEFT));
		fldId=new JTextField("�������˺�", 15);
		jp.add(fldId);
		return jp;
	}
	private JPanel getAddGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 50);
		// jp.setBackground(Color.orange);
		btnAdd=new JButton("ע�� ");
		jp.add(btnAdd);
		return jp;
	}
	public static void main(String[] args) {
		new UserAddFrame();
	}
}
