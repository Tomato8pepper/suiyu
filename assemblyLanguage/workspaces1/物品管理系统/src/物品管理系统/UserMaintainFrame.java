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

public class UserMaintainFrame extends JFrame {
	private JTextField fldId;
	private JTextField fldName;
	private JTextField fldPw;
	private JTextField fldGender;
	private JTextField fldAge;
	private JButton btnSearch;
	private JButton btnUpdate;
	private JButton btnDelete;
	UserDAO dao=new UserDAO();

	private static final long serialVersionUID = 1L;

	public UserMaintainFrame() {
		super("用户维护");
		ImageIcon ic = new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\中国心.jpg");
		Image im = (new ImageIcon("D:\\BIANXHENG\\workspaces1\\物品管理系统\\456.jpg")).getImage();
		this.setIconImage(im);
		this.setSize(650, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		Container c = this.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

		// 添加界面组件元素
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

		

	this.btnSearch.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			String uId = fldId.getText();
			String uName = fldName.getText();
			String uPw = fldPw.getText();
			String Gender = fldGender.getText();
			String uAge = fldAge.getText();

			User ue = new UserDAO().getUserById(uId);
			if (ue == null) {
				JOptionPane.showMessageDialog(null, "无此用户！");
				fldName.setText("");
			} else {
				fldName.setText(ue.getuName());
				fldPw.setText(ue.getuPw());
				fldGender.setText(ue.getGender());
				fldAge.setText(ue.getuAge());
			}
		
		}
	});
	this.btnUpdate.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int n = JOptionPane.showConfirmDialog(null, "确认修改吗?", "mms", JOptionPane.YES_NO_OPTION);
			if (n==0) {
			System.out.println(n);
			String uId = fldId.getText();
			String uName= fldName.getText();
			String uPw= fldPw.getText();
			String Gender= fldGender.getText();
			String uAge= fldAge.getText();
			//int m= dao.deleteGoods(gId);
			
			User ue=new User(uId,uName,uPw,Gender,uAge); 
			UserDAO dao=new UserDAO();
			int i=dao.updateUser(ue);
			if (i==0) {
				JOptionPane.showMessageDialog(null, "修改成功!");
			} else
				JOptionPane.showMessageDialog(null, "修改失败！", "用户管理系统", 0);
				
			}
		}
	});
	this.btnDelete.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int n = JOptionPane.showConfirmDialog(null, "确认删除吗?", "标题", JOptionPane.YES_NO_OPTION);
			System.out.println(n);
			String uId = fldId.getText();
			if(n==0){
				int i= dao.deleteUser(uId);
				if(i>0)
					JOptionPane.showMessageDialog(null, "删除成功!");
				else
					JOptionPane.showMessageDialog(null, "删除失败!");
			}
		}
	});
}





	

	private JPanel getTitleGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 50);

		JLabel lbl = new JLabel("用户维护", JLabel.LEFT);
		Font f = new Font("楷体", Font.BOLD, 24);
		lbl.setFont(f);
		jp.add(lbl);
		jp.setBackground(Color.ORANGE);
		return jp;
	}
	private JPanel getIdGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("工        号:", JLabel.LEFT));
		fldId = new JTextField("请输入编号", 15);
		jp.add(fldId);
		btnSearch = new JButton("查询");
		jp.add(btnSearch);
		return jp;	
	}
    private JPanel getNameGUI() {
    	JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("姓        命:", JLabel.LEFT));
		fldName = new JTextField("请输入名称", 15);
		jp.add(fldName);
		// jp.setBackground(Color.orange);
		return jp;
	}
    private JPanel getPwGUI() {
    	JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		JLabel lbl = new JLabel("密        码:", JLabel.LEFT);
		lbl.setSize(55, 30);
		jp.add(lbl);
		fldPw = new JPasswordField("请输入密码", 15);
		jp.add(fldPw);
		// jp.setBackground(Color.orange);
		return jp;
	}
    private JPanel getGenderGUI() {
    	JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("性        别:", JLabel.LEFT));
		fldGender = new JTextField("", 15);
		jp.add(fldGender);
		// jp.setBackground(Color.orange);
		return jp;
    }

    private JPanel getAgeGUI() {
    	JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("年        龄:", JLabel.LEFT));
		fldAge = new JTextField("", 15);
		jp.add(fldAge);
		// jp.setBackground(Color.orange);
		return jp;
    }
    private JPanel getAddGUI() {
    	JPanel jp = new JPanel();
		jp.setSize(400, 50);
		// jp.setBackground(Color.orange);
		btnUpdate = new JButton("修 改");
		btnUpdate.setBackground(Color.pink);
		jp.add(btnUpdate);
		btnDelete = new JButton("删 除");
		btnDelete.setBackground(Color.pink);
		jp.add(btnDelete);
		return jp;
    }
    public static void main(String[] args) {
		new UserMaintainFrame();
	}
}
