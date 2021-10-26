package 物品管理系统;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class UserShowFrame extends JFrame implements ActionListener{
	Container c = null;
	JTextField fldName;
	JButton btnSearch;
	JTable t;
	private Object[][] data;
	private String[] head = new String[] { "账号", "姓名", "密码","性别" , "年龄" };
	
	public UserShowFrame() {

		super("查找用户");
		ImageIcon ic = new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\中国心.jpg");
		Image im = (new ImageIcon("D:\\BIANXHENG\\workspaces1\\物品管理系统\\456.jpg")).getImage();
		this.setIconImage(im);
		this.setSize(650, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		c = this.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		c.add(getTitleGUI());
		c.add(getSearchNameGUI());
		c.add(getTablePane(""));
		btnSearch.addActionListener(this);

		// 添加界面组件元素
		this.setVisible(true);
		this.setResizable(false);
	}
	
	private JPanel getTitleGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 30);

		JLabel lbl = new JLabel("显示用户", JLabel.LEFT);
		Font f = new Font("楷体", Font.BOLD, 20);
		lbl.setFont(f);
		jp.add(lbl);
		jp.setBackground(Color.PINK);
		return jp;
	}

	
	

	private JPanel getSearchNameGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("按姓名查询:", JLabel.LEFT));
		fldName = new JTextField("", 15);
		jp.add(fldName);
		btnSearch = new JButton("查询");
		jp.add(btnSearch);
		return jp;
	}
	private JScrollPane getTablePane(String name) {
		t = new JTable();
		this.data = queryData(name);
		
		DefaultTableModel tableModel = new DefaultTableModel(data, head) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		//设置单元格不可编辑
		t.setModel(tableModel);

		t.setRowHeight(22);
		JScrollPane sp = new JScrollPane();
		sp.getViewport().add(t);
		return sp;	
		}


	
	private Object[][] queryData(String name) {
		List<User> list = new UserDAO().getAllUser(name);
		data = new Object[list.size()][head.length];

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < head.length; j++) {
				data[i][0] = list.get(i).getuId();
				data[i][1] = list.get(i).getuName();
				data[i][2] = list.get(i).getuPw();
				data[i][3] = list.get(i).getGender();
				data[i][4] = list.get(i).getuAge();
			}
		}
		return data;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = fldName.getText();
		JOptionPane.showMessageDialog(null, name, "成功!", 2);

		this.data = queryData(name);
		DefaultTableModel tableModel = new DefaultTableModel(data, head) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		t.setModel(tableModel);
	}

}
