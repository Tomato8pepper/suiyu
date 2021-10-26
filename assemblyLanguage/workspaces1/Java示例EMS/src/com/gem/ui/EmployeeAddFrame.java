package com.gem.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.border.EmptyBorder;

import com.gem.dao.EmployeeDAO;
import com.gem.model.Dept;
import com.gem.model.Employee;


public class EmployeeAddFrame extends JFrame {
	

	private JTextField fldId;
	private JPasswordField fldPwd;
	private JTextField fldName;
	private JTextField fldBirthDate;
	private JRadioButton rbGender;
	private JButton btnAdd;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeAddFrame() {
		super("添加员工");
		this.setSize(650, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
		Container c = this.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		
		//添加界面组件元素
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
		// app.setUndecorated(true); // 去掉窗口的装饰
		// app.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG
		// );//采用指定的窗口装饰风格
		this.btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//输入必填提示
				String empId = fldId.getText();
				String empName = fldName.getText();
				String empPassword = fldPwd.getText();
				String gender = "男";
				String birthDate = fldBirthDate.getText();
				String pic="";
				int deptId=1;
				Employee emp=new Employee(empId,empName,empPassword,
						gender,birthDate); 
				EmployeeDAO dao=new EmployeeDAO();
				int i=dao.addEmployee(emp);
				if (i>0) {
					JOptionPane.showMessageDialog(null, "添加成功!");
				} else
					JOptionPane.showMessageDialog(null, "添加失败！", "员工管理系统", 0);
			}
		});
		
	}

	public JPanel getTitleGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 50);

		JLabel lbl = new JLabel("添加员工", JLabel.LEFT);
		Font f = new Font("楷体", Font.BOLD, 24);
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
		jp.add(new JLabel("帐        号:", JLabel.LEFT));
		fldId=new JTextField("请输入帐号", 15);
		jp.add(fldId);
		return jp;
	}

	// 2
	public JPanel getPwdGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		JLabel lbl = new JLabel("密        码:", JLabel.LEFT);
		lbl.setSize(55, 30);
		jp.add(lbl);
		fldPwd=new JPasswordField("请输入密码", 15);
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
		jp.add(new JLabel("姓        名:", JLabel.LEFT));
		fldName=new JTextField("请输入姓名", 15);
		jp.add(fldName);
		// jp.setBackground(Color.orange);
		return jp;
	}

	// 4
	public JPanel getGenderGUI() {
		JPanel jp = new JPanel();
		jp.setBorder(BorderFactory.createTitledBorder("性        别:"));
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		JLabel lbl = new JLabel("性        别:", JLabel.LEFT);
		jp.add(lbl);
		JRadioButton[] r = { new JRadioButton("男"), new JRadioButton("女") };
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
		jp.add(new JLabel("出生日期:", JLabel.LEFT));
		fldBirthDate=new JTextField("", 15);
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
		jp.add(new JLabel("头        像:", JLabel.LEFT));
		ImageIcon ic1 = new ImageIcon("xjp.jpg");
		JLabel lable2 = new JLabel("", ic1, JLabel.LEFT);
		jp.add(lable2);
		// jp.setBackground(Color.orange);
		return jp;
	}

	// 7 Dept
	public JPanel getDeptGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("部        门:", JLabel.LEFT));
		String[] items = { "IT部", "销售部" };
		JComboBox<String> cmbDept = new JComboBox<String>(items);
		//cmbDept.add(new Dept(1,"IT"));
		jp.add(cmbDept);
		// jp.setBackground(Color.orange);
		return jp;
	}

	// 8 add
	public JPanel getAddGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 50);
		// jp.setBackground(Color.orange);
		btnAdd=new JButton("添加 ");
		jp.add(btnAdd);
		return jp;
	}

	public static void main(String[] args) {
		new EmployeeAddFrame();
	}
}

