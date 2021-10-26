package ��Ʒ����ϵͳ;

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
		super("�����Ʒ");
		Container c1 = this.getContentPane();
		c1.setBackground(Color.cyan);
		ImageIcon ic = new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\�й���.jpg");
		Image im = (new ImageIcon("D:\\BIANXHENG\\workspaces1\\��Ʒ����ϵͳ\\456.jpg")).getImage();
		this.setIconImage(im);
		this.setSize(350, 450); //�� ��
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
		Container c = this.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		
		//��ӽ������Ԫ��
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
		this.btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//���������ʾ
				String gId = fldId.getText();
				String gName = fldName.getText();
				String gPrice = fldPrice.getText();
				String Stock = fldStock.getText();
				
				if (gId.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "�������ţ�", "��Ʒ����ϵͳ", 0);
					return;
				}
				if (gName.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "���������ƣ�", "��Ʒ����ϵͳ", 0);
					fldName.setFocusable(true);
					return;
				}
				if (gPrice.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "������۸�", "��Ʒ����ϵͳ", 0);
					fldPrice.setFocusable(true);
					return;
				}
				if (Stock.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "�������棡", "��Ʒ����ϵͳ", 0);
					fldStock.setFocusable(true);
					return;
				}

				Goods gds=new Goods(gId,gName,gPrice,Stock); 
				GoodsDAO dao=new GoodsDAO();
				int i=dao.addGoods(gds);
				if (i>0) {
					JOptionPane.showMessageDialog(null, "��ӳɹ�!");
				} else
					JOptionPane.showMessageDialog(null, "���ʧ�ܣ�", "��Ʒ����ϵͳ", 0);
			}
		});
		
	}
	
	private JPanel getStockGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5,61,0,80));
		jp.setSize(400, 50);
		JLabel lbl = new JLabel("��        ��:", JLabel.LEFT);
		lbl.setSize(55, 30);
		jp.add(lbl);
		fldStock=new JTextField("��������", 15);
		jp.add(fldStock);
		// jp.setBackground(Color.orange);
		return jp;
	}
	
	
	private JPanel getAddGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 50);
		// jp.setBackground(Color.orange);
		btnAdd=new JButton("��� ");
		jp.add(btnAdd);
		return jp;
	}
	private JPanel getPriceGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5,61,0,80));
		jp.setSize(400, 50);
		JLabel lbl = new JLabel("��        ��:", JLabel.LEFT);
		lbl.setSize(55, 30);
		jp.add(lbl);
		fldPrice=new JTextField("������۸�", 15);
		jp.add(fldPrice);
		// jp.setBackground(Color.orange);
		return jp;
	}
	private JPanel getNameGUI() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 61, 0,80));
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
		jp.setBorder(new EmptyBorder(5, 61, 0,80));
		jp.setSize(400, 50);
		jp.add(new JLabel("��        ��:", JLabel.LEFT));
		fldId=new JTextField("��������", 15);
		jp.add(fldId);
		return jp;
	}
	private JPanel getTitleGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 150);

		JLabel lbl = new JLabel("�����Ʒ", JLabel.LEFT);
		Font f = new Font("����", Font.BOLD, 24);
		lbl.setFont(f);
		jp.add(lbl);
		jp.setBackground(Color.ORANGE);
		return jp;
	}
	public static void main(String[] args) {
		new GoodsAddFrame();
	}
}
