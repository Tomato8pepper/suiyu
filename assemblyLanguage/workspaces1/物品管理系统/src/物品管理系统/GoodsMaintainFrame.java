package 物品管理系统;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

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

public class GoodsMaintainFrame extends JFrame {
	private JTextField fldId;
	private JTextField fldName;
	private JTextField fldPrice;
	private JTextField fldStock;
	private JButton btnSearch;
	private JButton btnUpdate;
	private JButton btnDelete;
	GoodsDAO dao=new GoodsDAO();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GoodsMaintainFrame() {
		super("物品维护");
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
		c.add(getPriceGUI());
		c.add(getStockGUI());

		c.add(getAddGUI());

		this.setVisible(true);
		this.setResizable(false);
		// app.setUndecorated(true); // 去掉窗口的装饰
		// app.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG
		// );//采用指定的窗口装饰风格

		this.btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String gId = fldId.getText();
				String gName = fldId.getText();
				String gPrice = fldId.getText();
				String gStock = fldId.getText();
				Goods gds = new GoodsDAO().getGoodsById(gId);
				if (gds == null) {
					JOptionPane.showMessageDialog(null, "无此物品！");
					fldName.setText("");
				} else {
					fldName.setText(gds.getgName());
					fldPrice.setText(gds.getgPrice());
					fldStock.setText(gds.getStock());
				}
			}
		});


		this.btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "确认修改吗?", "mms", JOptionPane.YES_NO_OPTION);
				if (n==0) {
				System.out.println(n);
				String gId = fldId.getText();
				String gName = fldName.getText();
				String gPrice = fldPrice.getText();
				String Stock = fldStock.getText();
				//int m= dao.deleteGoods(gId);
				
				Goods gds=new Goods(gId,gName,gPrice,Stock); 
				GoodsDAO dao=new GoodsDAO();
				int i=dao.updateGoods(gds);
				if (i==0) {
					JOptionPane.showMessageDialog(null, "修改成功!");
				} else
					JOptionPane.showMessageDialog(null, "修改失败！", "物品管理系统", 0);
					
				}
			}
		});
		this.btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "确认删除吗?", "标题", JOptionPane.YES_NO_OPTION);
				System.out.println(n);
				String gId = fldId.getText();
				if(n==0){
					int i= dao.deleteGoods(gId);
					if(i>0)
						JOptionPane.showMessageDialog(null, "删除成功!");
					else
						JOptionPane.showMessageDialog(null, "删除失败!");
				}
			}
		});
	}

	public JPanel getTitleGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 50);

		JLabel lbl = new JLabel("物品维护", JLabel.LEFT);
		Font f = new Font("楷体", Font.BOLD, 24);
		lbl.setFont(f);
		jp.add(lbl);
		jp.setBackground(Color.ORANGE);
		return jp;
	}

	public JPanel getIdGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("编        号:", JLabel.LEFT));
		fldId = new JTextField("请输入编号", 15);
		jp.add(fldId);
		btnSearch = new JButton("查询");
		jp.add(btnSearch);
		return jp;
	}

	public JPanel getNameGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("名        称:", JLabel.LEFT));
		fldName = new JTextField("请输入名称", 15);
		jp.add(fldName);
		// jp.setBackground(Color.orange);
		return jp;
	}

	
	public JPanel getPriceGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("价        格:", JLabel.LEFT));
		fldPrice = new JTextField("", 15);
		jp.add(fldPrice);
		// jp.setBackground(Color.orange);
		return jp;
	}
	public JPanel getStockGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("库        存:", JLabel.LEFT));
		fldStock = new JTextField("", 15);
		jp.add(fldStock);
		// jp.setBackground(Color.orange);
		return jp;
	}

	
	public JPanel getAddGUI() {
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
		new GoodsMaintainFrame();
	}
}
