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
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class GoodsAddFrame extends JFrame {
	private JTextField fldId;
	private JTextField fldName;
	private JTextField fldPrice;
	private JTextField fldStock;
	private JButton btnAdd;
	
	private static final long serialVersionUID = 1L;
	public GoodsAddFrame() {
		super("添加物品");
		Container c1 = this.getContentPane();
		c1.setBackground(Color.cyan);
		ImageIcon ic = new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\中国心.jpg");
		Image im = (new ImageIcon("D:\\BIANXHENG\\workspaces1\\物品管理系统\\456.jpg")).getImage();
		this.setIconImage(im);
		this.setSize(350, 450); //横 竖
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
		Container c = this.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		
		//添加界面组件元素
		c.add(getTitleGUI());
		c.add(getIdGUI());
		c.add(getNameGUI());
		c.add(getPriceGUI());
		c.add(getStockGUI());
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
				String gId = fldId.getText();
				String gName = fldName.getText();
				String gPrice = fldPrice.getText();
				String Stock = fldStock.getText();
				
				if (gId.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "请输入编号！", "物品管理系统", 0);
					return;
				}
				if (gName.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "请输入名称！", "物品管理系统", 0);
					fldName.setFocusable(true);
					return;
				}
				if (gPrice.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "请输入价格！", "物品管理系统", 0);
					fldPrice.setFocusable(true);
					return;
				}
				if (Stock.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "请输入库存！", "物品管理系统", 0);
					fldStock.setFocusable(true);
					return;
				}

				Goods gds=new Goods(gId,gName,gPrice,Stock); 
				GoodsDAO dao=new GoodsDAO();
				int i=dao.addGoods(gds);
				if (i>0) {
					JOptionPane.showMessageDialog(null, "添加成功!");
				} else
					JOptionPane.showMessageDialog(null, "添加失败！", "物品管理系统", 0);
			}
		});
		
	}
	
	private JPanel getStockGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5,61,0,80));
		jp.setSize(400, 50);
		JLabel lbl = new JLabel("库        存:", JLabel.LEFT);
		lbl.setSize(55, 30);
		jp.add(lbl);
		fldStock=new JTextField("请输入库存", 15);
		jp.add(fldStock);
		// jp.setBackground(Color.orange);
		return jp;
	}
	
	
	private JPanel getAddGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 50);
		// jp.setBackground(Color.orange);
		btnAdd=new JButton("添加 ");
		jp.add(btnAdd);
		return jp;
	}
	private JPanel getPriceGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5,61,0,80));
		jp.setSize(400, 50);
		JLabel lbl = new JLabel("价        格:", JLabel.LEFT);
		lbl.setSize(55, 30);
		jp.add(lbl);
		fldPrice=new JTextField("请输入价格", 15);
		jp.add(fldPrice);
		// jp.setBackground(Color.orange);
		return jp;
	}
	private JPanel getNameGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 61, 0,80));
		jp.setSize(400, 50);
		jp.add(new JLabel("名        称:", JLabel.LEFT));
		fldName=new JTextField("请输入名称", 15);
		jp.add(fldName);
		// jp.setBackground(Color.orange);
		return jp;
	}
	
	private JPanel getIdGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 61, 0,80));
		jp.setSize(400, 50);
		jp.add(new JLabel("编        号:", JLabel.LEFT));
		fldId=new JTextField("请输入编号", 15);
		jp.add(fldId);
		return jp;
	}
	private JPanel getTitleGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 150);

		JLabel lbl = new JLabel("添加物品", JLabel.LEFT);
		Font f = new Font("楷体", Font.BOLD, 24);
		lbl.setFont(f);
		jp.add(lbl);
		jp.setBackground(Color.ORANGE);
		return jp;
	}
	public static void main(String[] args) {
		new GoodsAddFrame();
	}
}
