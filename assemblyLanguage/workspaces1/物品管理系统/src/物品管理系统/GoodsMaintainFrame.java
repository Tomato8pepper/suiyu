package ��Ʒ����ϵͳ;
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
		super("��Ʒά��");
		ImageIcon ic = new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\�й���.jpg");
		Image im = (new ImageIcon("D:\\BIANXHENG\\workspaces1\\��Ʒ����ϵͳ\\456.jpg")).getImage();
		this.setIconImage(im);
		this.setSize(650, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		Container c = this.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

		// ��ӽ������Ԫ��
		c.add(getTitleGUI());
		c.add(getIdGUI());
		c.add(getNameGUI());
		c.add(getPriceGUI());
		c.add(getStockGUI());

		c.add(getAddGUI());

		this.setVisible(true);
		this.setResizable(false);
		// app.setUndecorated(true); // ȥ�����ڵ�װ��
		// app.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG
		// );//����ָ���Ĵ���װ�η��

		this.btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String gId = fldId.getText();
				String gName = fldId.getText();
				String gPrice = fldId.getText();
				String gStock = fldId.getText();
				Goods gds = new GoodsDAO().getGoodsById(gId);
				if (gds == null) {
					JOptionPane.showMessageDialog(null, "�޴���Ʒ��");
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
				int n = JOptionPane.showConfirmDialog(null, "ȷ���޸���?", "mms", JOptionPane.YES_NO_OPTION);
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
					JOptionPane.showMessageDialog(null, "�޸ĳɹ�!");
				} else
					JOptionPane.showMessageDialog(null, "�޸�ʧ�ܣ�", "��Ʒ����ϵͳ", 0);
					
				}
			}
		});
		this.btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "ȷ��ɾ����?", "����", JOptionPane.YES_NO_OPTION);
				System.out.println(n);
				String gId = fldId.getText();
				if(n==0){
					int i= dao.deleteGoods(gId);
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

		JLabel lbl = new JLabel("��Ʒά��", JLabel.LEFT);
		Font f = new Font("����", Font.BOLD, 24);
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
		jp.add(new JLabel("��        ��:", JLabel.LEFT));
		fldId = new JTextField("��������", 15);
		jp.add(fldId);
		btnSearch = new JButton("��ѯ");
		jp.add(btnSearch);
		return jp;
	}

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

	
	public JPanel getPriceGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("��        ��:", JLabel.LEFT));
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
		jp.add(new JLabel("��        ��:", JLabel.LEFT));
		fldStock = new JTextField("", 15);
		jp.add(fldStock);
		// jp.setBackground(Color.orange);
		return jp;
	}

	
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
		new GoodsMaintainFrame();
	}
}
