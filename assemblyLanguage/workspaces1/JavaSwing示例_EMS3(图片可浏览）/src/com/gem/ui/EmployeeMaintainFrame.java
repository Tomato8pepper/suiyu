package com.gem.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.gem.dao.EmployeeDAO;
import com.gem.model.Dept;
import com.gem.model.Employee;

public class EmployeeMaintainFrame extends JFrame {

	private JTextField fldId;
	private JPasswordField fldPwd;
	private JTextField fldName;
	private JRadioButton rbGender;
	private JTextField fldBirthDate;
	private	JLabel lblPic;
	private JButton btnSearch;
	private JButton btnUpdate;
	private JButton btnDelete;
	private String fileName = "xjp.jpg";
	EmployeeDAO dao=new EmployeeDAO();
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeMaintainFrame() {
		super("Ա��ά��");
		this.setSize(650, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		Container c = this.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

		// ��ӽ������Ԫ��
		c.add(getTitleGUI());
		c.add(getIdGUI());
		c.add(getPwdGUI());
		c.add(getNameGUI());
		c.add(getGenderGUI());

		c.add(getBirthDateGUI());
		c.add(getPicGUI());
		c.add(getDeptGUI());

		c.add(getAddGUI());

		this.setVisible(true);
		this.setResizable(false);
		// app.setUndecorated(true); // ȥ�����ڵ�װ��
		// app.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG
		// );//����ָ���Ĵ���װ�η��

		this.btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String empId = fldId.getText();
				Employee emp = new EmployeeDAO().getEmployeeById(empId);
				if (emp == null) {
					JOptionPane.showMessageDialog(null, "�޴�Ա����");
					fldName.setText("");
				} else {
					try {
						fldName.setText(emp.getEmpName());
						Blob photo = emp.getPic();
						byte[] imageData = photo.getBytes(1, photo.getBinaryStream().available());

						ImageIcon imageIcon = new ImageIcon(imageData);
						//�����ǿ�����ŵ������(Label)��С��ͬ
						imageIcon =new ImageIcon(imageIcon.getImage().getScaledInstance(130, 150, Image.SCALE_DEFAULT));
			              
						lblPic.setIcon(imageIcon);
						lblPic.setHorizontalAlignment(SwingConstants.CENTER);

					} catch (SQLException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});

		this.btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "ȷ���޸���?", "EMS", JOptionPane.YES_NO_OPTION);

				// //���������ʾ
				// String empId = fldId.getText();
				// String empName = fldName.getText();
				// String empPassword = fldPwd.getText();
				// String gender = "��";
				// String birthDate = fldBirthDate.getText();
				// int deptId=1;
				// if(empId.trim().equals("")){
				// JOptionPane.showMessageDialog(null, "������Ա����", "Ա������ϵͳ", 0);
				// return ;
				// }
				// Employee emp=new Employee(empId,empName,empPassword,
				// gender,birthDate);
				// EmployeeDAO dao=new EmployeeDAO();
				// File headerFile = new File(fileName);
				// FileInputStream inputStream;
				// try {
				// inputStream = new FileInputStream(headerFile);
				// byte[] imageData = new byte[inputStream.available()];
				// inputStream.read(imageData);
				// //���浽���ݿ�
				// Blob photo = new SerialBlob(imageData);
				// int i=dao.addEmployee(emp,photo);
				// if (i>0) {
				// JOptionPane.showMessageDialog(null, "��ӳɹ�!");
				// } else
				// JOptionPane.showMessageDialog(null, "���ʧ�ܣ�", "Ա������ϵͳ", 0);
				// } catch (FileNotFoundException e1) {
				// e1.printStackTrace();
				// } catch (IOException e1) {
				// e1.printStackTrace();
				// } catch (SerialException e1) {
				// e1.printStackTrace();
				// } catch (SQLException e1) {
				// e1.printStackTrace();
				// }
			}
		});
		this.btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "ȷ��ɾ����?", "����", JOptionPane.YES_NO_OPTION);
				System.out.println(n);
				String empId = fldId.getText();
				if(n==0){
					int i=dao.deleteEmployee(empId);
					if(i>0)
						JOptionPane.showMessageDialog(null, "ɾ���ɹ�!");
					else
						JOptionPane.showMessageDialog(null, "ɾ��ʧ��!");
				}
			}
		});
	}

	public JPanel getTitleGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 50);

		JLabel lbl = new JLabel("Ա��ά��", JLabel.LEFT);
		Font f = new Font("����", Font.BOLD, 24);
		lbl.setFont(f);
		jp.add(lbl);
		jp.setBackground(Color.ORANGE);
		return jp;
	}

	// 1
	public JPanel getIdGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("��        ��:", JLabel.LEFT));
		fldId = new JTextField("�������ʺ�", 15);
		jp.add(fldId);
		btnSearch = new JButton("��ѯ");
		jp.add(btnSearch);
		return jp;
	}

	// 2
	public JPanel getPwdGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		JLabel lbl = new JLabel("��        ��:", JLabel.LEFT);
		lbl.setSize(55, 30);
		jp.add(lbl);
		fldPwd = new JPasswordField("����������", 15);
		jp.add(fldPwd);
		// jp.setBackground(Color.orange);
		return jp;
	}

	// 3
	public JPanel getNameGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("��        ��:", JLabel.LEFT));
		fldName = new JTextField("����������", 15);
		jp.add(fldName);
		// jp.setBackground(Color.orange);
		return jp;
	}

	// 4
	public JPanel getGenderGUI() {
		JPanel jp = new JPanel();
		jp.setBorder(BorderFactory.createTitledBorder("��        ��:"));
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		JLabel lbl = new JLabel("��        ��:", JLabel.LEFT);
		jp.add(lbl);
		JRadioButton[] r = { new JRadioButton("��"), new JRadioButton("Ů") };
		ButtonGroup rg = new ButtonGroup();
		for (int i = 0; i < r.length; i++) {
			jp.add(r[i]);
			rg.add(r[i]);
		}
		r[0].setSelected(true);
		// jp.setBackground(Color.orange);
		return jp;
	}

	// 5
	public JPanel getBirthDateGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("��������:", JLabel.LEFT));
		fldBirthDate = new JTextField("", 15);
		jp.add(fldBirthDate);
		// jp.setBackground(Color.orange);
		return jp;
	}

	// 6 Pic
	public JPanel getPicGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("ͷ        ��:", JLabel.LEFT));
		
		ImageIcon imageIcon = new ImageIcon(fileName);
		imageIcon =new ImageIcon(imageIcon.getImage().getScaledInstance(130, 150, Image.SCALE_DEFAULT));
		  
		lblPic = new JLabel("", imageIcon, JLabel.LEFT);
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		jp.add(lblPic);
		// jp.setBackground(Color.orange);
		return jp;
	}

	// 7 Dept
	public JPanel getDeptGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("��        ��:", JLabel.LEFT));
		String[] items = { "IT��", "���۲�" };
		JComboBox<String> cmbDept = new JComboBox<String>(items);
		// cmbDept.add(new Dept(1,"IT"));
		jp.add(cmbDept);
		// jp.setBackground(Color.orange);
		return jp;
	}

	// 8 add
	public JPanel getAddGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 50);
		// jp.setBackground(Color.orange);
		btnUpdate = new JButton("�� ��");
		btnUpdate.setBackground(Color.pink);
		jp.add(btnUpdate);
		btnDelete = new JButton("ɾ ��");
		btnDelete.setBackground(Color.pink);
		jp.add(btnDelete);
		return jp;
	}

	public static void main(String[] args) {
		new EmployeeMaintainFrame();
	}
}
