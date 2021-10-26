package GMS;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class RegisterFrame implements ItemListener{
	private JFrame jf;
	private JPanel p1,p2,p3,p4,p5,p6,p7;
	private JLabel name_L,sex_L,birthDate_L,tel_L,Email_L,passWord;
	private JTextField name_tx,tel_tx,Email_tx,birthDate_tx,passWord_tx;
	private JComboBox<String> sex_cmb;
	private JButton sure;
	
	void display() {
		jf=new JFrame();
		jf.setTitle("注册窗口");
		jf.setSize(500,400);
		jf.setLayout(null);
		Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包
		Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸
		int screenWidth = screenSize.width/2; // 获取屏幕的宽
		int screenHeight = screenSize.height/2; // 获取屏幕的高
		int height = jf.getHeight();
		int width = jf.getWidth();
		jf.setLocation(screenWidth-width/2, screenHeight-height/2);
		
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		p6=new JPanel();
		p7=new JPanel();
		
		name_L=new JLabel("账户名：");
		name_tx=new JTextField();
		p1.setLocation(100, 50);
		p1.setSize(260, 30);
		p1.setLayout(new GridLayout(1,2));
		p1.add(name_L);
		p1.add(name_tx);
		
		sex_L=new JLabel("性别：");
		sex_cmb=new JComboBox<String>();
		sex_cmb.addItem("男");
		sex_cmb.addItem("女");
		sex_cmb.addItemListener(this);
		p2.setLocation(100, 85);
		p2.setSize(260, 30);
		p2.setLayout(new GridLayout(1,2));
		p2.add(sex_L);
		p2.add(sex_cmb);
		
		birthDate_L=new JLabel("出生日期：");
		birthDate_tx=new JTextField();
		birthDate_tx.setToolTipText("格式：yyyy-MM-dd");
		p3.setLocation(100, 120);
		p3.setSize(260, 30);
		p3.setLayout(new GridLayout(1,2));
		p3.add(birthDate_L);
		p3.add(birthDate_tx);
		
		tel_L=new JLabel("电话号码：");
		tel_tx=new JTextField();
		p4.setLocation(100, 155);
		p4.setSize(260, 30);
		p4.setLayout(new GridLayout(1,2));
		p4.add(tel_L);
		p4.add(tel_tx);
		
		Email_L=new JLabel("Email：");
		Email_tx=new JTextField();
		p5.setLocation(100, 190);
		p5.setSize(260, 30);
		p5.setLayout(new GridLayout(1,2));
		p5.add(Email_L);
		p5.add(Email_tx);
		
		passWord=new JLabel("密码：");
		passWord_tx=new JTextField();
		p6.setLocation(100, 225);
		p6.setSize(260, 30);
		p6.setLayout(new GridLayout(1,2));
		p6.add(passWord);
		p6.add(passWord_tx);
		
		
		sure=new JButton("确定");
		p7.setLocation(200, 300);
		p7.setSize(100, 30);
		p7.setLayout(new GridLayout(1,2));
		p7.add(sure);
		jf.add(p1);
		jf.add(p2);
		jf.add(p3);
		jf.add(p4);
		jf.add(p5);
		jf.add(p6);
		jf.add(p7);
		jf.setVisible(true);
		sure.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new User(name_tx.getText(),sex_cmb.getSelectedItem().toString(),birthDate_tx.getText(),tel_tx.getText(),Email_tx.getText(),passWord_tx.getText());
				JOptionPane.showMessageDialog(jf, "注册成功", null, JOptionPane.PLAIN_MESSAGE);
				jf.setVisible(false);
			}
		});
	}
	public void itemStateChanged(ItemEvent e) {
		
	}
}
