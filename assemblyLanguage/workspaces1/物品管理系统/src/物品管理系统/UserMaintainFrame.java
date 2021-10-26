package ��Ʒ����ϵͳ;
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
		super("�û�ά��");
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
		c.add(getPwGUI());
		c.add(getGenderGUI());
		c.add(getAgeGUI());
		c.add(getAddGUI());

		this.setVisible(true);
		this.setResizable(false);
		// app.setUndecorated(true); // ȥ�����ڵ�װ��
		// app.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG
		// );//����ָ���Ĵ���װ�η��

		

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
				JOptionPane.showMessageDialog(null, "�޴��û���");
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
			int n = JOptionPane.showConfirmDialog(null, "ȷ���޸���?", "mms", JOptionPane.YES_NO_OPTION);
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
				JOptionPane.showMessageDialog(null, "�޸ĳɹ�!");
			} else
				JOptionPane.showMessageDialog(null, "�޸�ʧ�ܣ�", "�û�����ϵͳ", 0);
				
			}
		}
	});
	this.btnDelete.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int n = JOptionPane.showConfirmDialog(null, "ȷ��ɾ����?", "����", JOptionPane.YES_NO_OPTION);
			System.out.println(n);
			String uId = fldId.getText();
			if(n==0){
				int i= dao.deleteUser(uId);
				if(i>0)
					JOptionPane.showMessageDialog(null, "ɾ���ɹ�!");
				else
					JOptionPane.showMessageDialog(null, "ɾ��ʧ��!");
			}
		}
	});
}





	

	private JPanel getTitleGUI() {
		JPanel jp = new JPanel();
		jp.setSize(400, 50);

		JLabel lbl = new JLabel("�û�ά��", JLabel.LEFT);
		Font f = new Font("����", Font.BOLD, 24);
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
		jp.add(new JLabel("��        ��:", JLabel.LEFT));
		fldId = new JTextField("��������", 15);
		jp.add(fldId);
		btnSearch = new JButton("��ѯ");
		jp.add(btnSearch);
		return jp;	
	}
    private JPanel getNameGUI() {
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
    private JPanel getPwGUI() {
    	JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		JLabel lbl = new JLabel("��        ��:", JLabel.LEFT);
		lbl.setSize(55, 30);
		jp.add(lbl);
		fldPw = new JPasswordField("����������", 15);
		jp.add(fldPw);
		// jp.setBackground(Color.orange);
		return jp;
	}
    private JPanel getGenderGUI() {
    	JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp.setBorder(new EmptyBorder(5, 210, 0, 5));
		jp.setSize(400, 50);
		jp.add(new JLabel("��        ��:", JLabel.LEFT));
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
		jp.add(new JLabel("��        ��:", JLabel.LEFT));
		fldAge = new JTextField("", 15);
		jp.add(fldAge);
		// jp.setBackground(Color.orange);
		return jp;
    }
    private JPanel getAddGUI() {
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
		new UserMaintainFrame();
	}
}
