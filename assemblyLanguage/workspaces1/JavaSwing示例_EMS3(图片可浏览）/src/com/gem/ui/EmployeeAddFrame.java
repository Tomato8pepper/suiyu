package com.gem.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.gem.dao.DeptDAO;
import com.gem.dao.EmployeeDAO;
import com.gem.model.Dept;
import com.gem.model.Employee;

public class EmployeeAddFrame extends JFrame {

	private JTextField fldId;
	private JPasswordField fldPwd;
	private JTextField fldName;
	private JTextField fldBirthDate;
	private JRadioButton jrb1 = new JRadioButton("��");
	private JRadioButton jrb2 = new JRadioButton("Ů");
	private JLabel lblPic;
	private JComboBox<String> cmbDept;
	private JTextArea fldNativePlace;
	private JButton btnAdd;
	private String fileName = "default.jpg";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeAddFrame() {
		super("���Ա��");
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
		c.add(getNativePlaceGUI());

		c.add(getAddGUI());
		this.setVisible(true);
		this.setResizable(false);
		// app.setUndecorated(true); // ȥ�����ڵ�װ��
		// app.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG
		// );//����ָ���Ĵ���װ�η��
		this.btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���������ʾ
				String empId = fldId.getText();
				String empName = fldName.getText();
				String empPassword = fldPwd.getText();

				String gender = jrb1.isSelected() ? "��" : "Ů";// rbGender.getText();
				String birthDate = fldBirthDate.getText();
				int item = cmbDept.getSelectedIndex();
				int deptId = boxmodelk[item];
				
				String nativePlace = fldNativePlace.getText();
				if (empId.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "������Ա����", "Ա������ϵͳ", 0);
					return;
				}
				if (empName.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "������������", "Ա������ϵͳ", 0);
					fldName.setFocusable(true);
					return;
				}
				if (birthDate.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "������������ڣ�", "Ա������ϵͳ", 0);
					fldBirthDate.setFocusable(true);
					return;
				}
				if (nativePlace.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "�����뼮�ᣡ", "Ա������ϵͳ", 0);
					fldNativePlace.setFocusable(true);
					return;
				}
				Employee emp = new Employee(empId, empName, empPassword, gender, birthDate, deptId, nativePlace);
				EmployeeDAO dao = new EmployeeDAO();

				File headerFile = new File(fileName);
				FileInputStream inputStream;
				try {
					inputStream = new FileInputStream(headerFile);
					byte[] imageData = new byte[inputStream.available()];
					inputStream.read(imageData);
					// ���浽���ݿ�
					Blob photo = new SerialBlob(imageData);
					int i = dao.addEmployee(emp, photo);
					if (i > 0) {
						JOptionPane.showMessageDialog(null, "��ӳɹ�!");
					} else
						JOptionPane.showMessageDialog(null, "���ʧ�ܣ�", "Ա������ϵͳ", 0);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (SerialException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

	}

	public JPanel getTitleGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 30);

		JLabel lbl = new JLabel("���Ա��", JLabel.LEFT);
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
		jp.setBorder(new EmptyBorder(3, 210, 0, 5));
		jp.setSize(400, 30);
		jp.add(new JLabel("��        ��:", JLabel.LEFT));
		fldId = new JTextField("�������ʺ�", 15);
		jp.add(fldId);
		return jp;
	}

	// 2
	public JPanel getPwdGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(3, 210, 0, 5));
		jp.setSize(400, 30);
		JLabel lbl = new JLabel("��        ��:", JLabel.LEFT);
		lbl.setSize(55, 18);
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
		jp.setBorder(new EmptyBorder(3, 210, 0, 5));
		jp.setSize(400, 30);
		jp.add(new JLabel("��        ��:", JLabel.LEFT));
		fldName = new JTextField("����������", 15);
		jp.add(fldName);
		// jp.setBackground(Color.orange);
		return jp;
	}

	// 4
	public JPanel getGenderGUI() {
		JPanel jp = new JPanel();
		jp.setBorder(BorderFactory.createTitledBorder(""));
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(3, 210, 0, 5));
		JLabel lbl = new JLabel("��        ��:", JLabel.LEFT);
		jp.add(lbl);
		JRadioButton[] r = { jrb1, jrb2 };
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
		jp.setBorder(new EmptyBorder(3, 210, 0, 0));
		jp.setSize(400, 15);
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
		jp.setBorder(new EmptyBorder(3, 210, 0, 5));
		jp.setSize(400, 30);
		jp.add(new JLabel("ͷ        ��:", JLabel.LEFT));
		ImageIcon ic1 = new ImageIcon(fileName);
		lblPic = new JLabel("", ic1, JLabel.LEFT);
		jp.add(lblPic);
		JButton btnBrowse = new JButton("��� ");
		btnBrowse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
				chooser.setFileFilter(filter);
				int returnVal = chooser.showOpenDialog(jp);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					fileName = chooser.getSelectedFile().getPath();
					System.out.println(fileName);
					ImageIcon imageIcon = new ImageIcon(fileName);
					imageIcon = new ImageIcon(imageIcon.getImage().getScaledInstance(130, 150, Image.SCALE_DEFAULT));
					lblPic.setIcon(imageIcon);
					lblPic.setHorizontalAlignment(SwingConstants.CENTER);
				}

			}
		});
		jp.add(btnBrowse);
		return jp;
	}

	// 7 Dept
	public JPanel getDeptGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(3, 210, 0, 5));
		jp.setSize(400, 30);
		jp.add(new JLabel("��        ��:", JLabel.LEFT));
		//String[] items = { "IT��", "���۲�" };
		cmbDept = new JComboBox<String>();
		getCombobox();
		cmbDept.setModel(new DefaultComboBoxModel<>(boxmodels));
		jp.add(cmbDept);
		// jp.setBackground(Color.orange);
		return jp;
	}

	int[] boxmodelk;
	String[] boxmodels;

	private void getCombobox() {
		List<Dept> list = new DeptDAO().getAllDept();
		boxmodelk = new int[list.size()];
		boxmodels = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			Dept d = new Dept();
			d = list.get(i);
			boxmodelk[i] = d.getDeptId();
			boxmodels[i] = d.getDeptName();
		}
	}

	// 8 NativePlace
	public JPanel getNativePlaceGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(3, 210, 0, 0));
		jp.setSize(400, 15);
		jp.add(new JLabel("����绰:", JLabel.LEFT));
		fldNativePlace = new JTextArea(5, 15);
		jp.add(fldNativePlace);
		return jp;
	}

	// 9 add
	public JPanel getAddGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 30);
		// jp.setBackground(Color.orange);
		btnAdd = new JButton("��� ");
		jp.add(btnAdd);
		return jp;
	}

	public static void main(String[] args) {
		new EmployeeAddFrame();
	}
}
