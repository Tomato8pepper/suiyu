package GMS;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame {
	private JFrame jf;
	private JPanel p1,p2,p3;
	private JTextField name_tx;
	private JPasswordField password_tx;
	private JLabel nameL,pwL;
	private JButton loading,register;//登陆和注册
	int userid;
	void display() {
		jf=new JFrame();
		jf.setSize(600,500);
		jf.setTitle("登陆/注册");
		jf.setLayout(null);
//		ImageIcon img=new ImageIcon("C:\\Users\\www23\\Pictures\\Camera Roll\\登录界面.jpg");
//		JLabel backgroundL=new JLabel(img);
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
		nameL=new JLabel("账户名：");
		pwL=new JLabel("密码：");
		name_tx=new JTextField();
		password_tx=new JPasswordField();
		password_tx.setEchoChar('*');
		loading =new JButton("登陆");
		
		  
		
		
		loading.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String Spassword=String.valueOf(password_tx.getPassword());
				if(name_tx.getText().equals("")||Spassword.equals("")) {
					JOptionPane.showMessageDialog(jf, "请输入账户名和密码", null, JOptionPane.ERROR_MESSAGE);
				}else {
					String driver="com.mysql.jdbc.Driver";
					String url="jdbc:mysql://localhost:3306/goodssystem";
					String dbuser="root";
					String dbpassword="2798645458";
					Connection conn=null;
					PreparedStatement ps=null;
					ResultSet rs=null;
					String selectSql="SELECT * FROM user";
					try {
						Class.forName(driver);
						conn=DriverManager.getConnection(url, dbuser, dbpassword);
						ps=conn.prepareStatement(selectSql);
						rs=ps.executeQuery();
						while(rs.next()) {
							String Uname=rs.getString(2);
							String Upassword=rs.getString(7);
							if(name_tx.getText().equals(Uname)) {
								if(Spassword.equals(Upassword)) {
									//在此创建主面板
									userid=Integer.parseInt(rs.getString(1));
									MainFrame mf=new MainFrame(userid);
									mf.display();
									jf.setVisible(false);
								}else {
									JOptionPane.showMessageDialog(jf, "密码输入错误", null, JOptionPane.ERROR_MESSAGE);
								}
							}
						}
					} catch (HeadlessException e1) {
						e1.printStackTrace();
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}finally {
						try {
							if(rs!=null)
								rs.close();
							if(ps!=null)
								ps.close();
							if(conn!=null)
								conn.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
					
				}
			}
			
		});
		register =new JButton("注册");
		register.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				RegisterFrame rf=new RegisterFrame();
				rf.display();
			}
			
		});
		p1.setLocation(170, 100);
		p1.setSize(200, 30);
		p1.setLayout(new GridLayout(1,2));
		p1.add(nameL);
		p1.add(name_tx);
		
		p2.setLocation(170, 140);
		p2.setSize(200, 30);
		p2.setLayout(new GridLayout(1,2));
		p2.add(pwL);
		p2.add(password_tx);
		
		p3.setLocation(170, 220);
		p3.setSize(200, 30);
		p3.setLayout(new GridLayout(1,2));
		p3.add(loading);
		p3.add(register);
		
		jf.add(p1);
		jf.add(p2);
		jf.add(p3);
		

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		LoginFrame lf=new LoginFrame();
		lf.display();
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}

