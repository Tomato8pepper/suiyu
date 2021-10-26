package 物品管理系统;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class GoodsShowFrame  extends JFrame implements ActionListener {
	Container c = null;
	JTextField fldName;
	JButton btnSearch;
	JTable t;
	private Object[][] data;
	private String[] head = new String[] { "编号", "名称", "价格", "库存" };
	public GoodsShowFrame() {

		super("查询物品");
		Container c = this.getContentPane();
		c.setBackground(Color.cyan);
		ImageIcon ic = new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\中国心.jpg");
		Image im = (new ImageIcon("D:\\BIANXHENG\\workspaces1\\物品管理系统\\456.jpg")).getImage();
		this.setIconImage(im);
		this.setSize(650, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		c = this.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

		
	/*	 Object[][] data2= { {"Jenny","female","football",new
		 Integer(20),"ENGLISH"}, {"May","female","music",new
		  Integer(20),"ENGLISH"}, {"Lili","female","art",new
		  Integer(20),"CHINESE"} }; Object[]
		  columnNames={"name","sex","hobby","age","nationality"}; JTable
		  jtable1=new JTable(data2,columnNames); jtable1.setRowHeight(20);
		  JScrollPane jscrp1=new JScrollPane();
		  jscrp1.getViewport().add(jtable1); 
		  c.add(jscrp1);*/
		 

		c.add(getTitleGUI());
		c.add(getSearchNameGUI());
		c.add(getTablePane(""));
		btnSearch.addActionListener(this);

		// 添加界面组件元素
		this.setVisible(true);
		this.setResizable(false);
	}

	public JPanel getTitleGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 30);

		JLabel lbl = new JLabel("显示物品", JLabel.LEFT);
		Font f = new Font("楷体", Font.BOLD, 20);
		lbl.setFont(f);
		jp.add(lbl);
		jp.setBackground(Color.PINK);
		return jp;
	}

	public JPanel getSearchNameGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("按名称查询:", JLabel.LEFT));
		fldName = new JTextField("", 15);
		jp.add(fldName);
		btnSearch = new JButton("查询");
		Font m1 = new Font("楷体", Font.BOLD, 18);
		btnSearch.setFont(m1);
		jp.add(btnSearch);
		return jp;
	}

	private JScrollPane getTablePane(String name) {
		// 显示所有物品
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

	// 生成表格数据
	/**
	 * @return
	 */
	public Object[][] queryData(String name) {
		List<Goods> list = new GoodsDAO().getAllGoods(name);
		data = new Object[list.size()][head.length];

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < head.length; j++) {
				data[i][0] = list.get(i).getgId();
				data[i][1] = list.get(i).getgName();
				data[i][2] = list.get(i).getgPrice();
				data[i][3] = list.get(i).getStock();
				
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
