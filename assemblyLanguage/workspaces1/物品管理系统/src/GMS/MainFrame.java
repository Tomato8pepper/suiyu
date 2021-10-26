package GMS;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;


public class MainFrame {
	private JFrame jf;
	private JMenuBar menuBar;
	private JPanel addP,fmdP,broP;
	private int userid;
	public MainFrame() {
		
	}
	public MainFrame(int userid) {
		super();
		this.userid=userid;
	};
	
	public void display() {
		jf=new JFrame();
		jf.setTitle("物品管理系统");
		jf.setSize(800,600);
		jf.setLayout(null);
		Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包
		Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸
		int screenWidth = screenSize.width/2; // 获取屏幕的宽
		int screenHeight = screenSize.height/2; // 获取屏幕的高
		int height = jf.getHeight();
		int width = jf.getWidth();
		jf.setLocation(screenWidth-width/2, screenHeight-height/2);
		menuBar=new JMenuBar();
		JMenu menu=new JMenu("菜单");
		menuBar.add(menu);
		JMenuItem addItem=new JMenuItem("添加物品");
		
		
		//添加操作
		addP=new JPanel();
		addP.setLayout(null);
		addP.setSize(300,200);
		addP.setLocation(250, 150);
		addP.setBackground(Color.CYAN);
		JLabel addL1=new JLabel("物品添加",JLabel.CENTER);
		addL1.setOpaque(true);
		addL1.setBackground(Color.orange);
		Font fnt=new Font("Serief",Font.BOLD,20);
		addL1.setFont(fnt);
		addL1.setBounds(0, 0, 300, 40);
		JLabel addL2=new JLabel("名称：");
		addL2.setBounds(20, 50, 50, 30);
		JLabel addL3=new JLabel("价格：");
		addL3.setBounds(20, 90, 50, 30);
		JLabel addL4=new JLabel("库存：");
		addL4.setBounds(20, 130, 50, 30);
		JTextField addTF1=new JTextField();
		addTF1.setBounds(75, 50, 180, 30);
		JTextField addTF2=new JTextField();
		addTF2.setBounds(75, 90, 180, 30);
		JTextField addTF3=new JTextField();
		addTF3.setBounds(75, 130, 180, 30);
		
		JButton addBu=new JButton("添加");
		addBu.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new Goods(addTF1.getText(),Double.parseDouble(addTF2.getText()),Integer.parseInt(addTF3.getText()),userid);
				JOptionPane.showMessageDialog(null, "添加成功", null, JOptionPane.INFORMATION_MESSAGE);
				addTF1.setText(null);
				addTF2.setText(null);
				addTF3.setText(null);
			}
		});
		addBu.setBounds(100, 170, 100, 30);
		addP.add(addL1);
		addP.add(addL2);
		addP.add(addL3);
		addP.add(addL4);
		addP.add(addTF1);
		addP.add(addTF2);
		addP.add(addTF3);
		addP.add(addBu);
		addP.setVisible(true);
		jf.add(addP);
		
		
		
		
		//查询/修改/删除 操做
		fmdP=new JPanel();
		fmdP.setSize(400, 450);
		fmdP.setLayout(null);
		fmdP.setLocation(200, 50);
		fmdP.setBackground(Color.CYAN);
		JLabel fmd=new JLabel("查询/修改/删除",JLabel.CENTER);
		fmd.setOpaque(true);
		fmd.setBackground(Color.orange);
		fmd.setFont(fnt);
		fmd.setBounds(0, 0, 400, 40);
		JComboBox<String> way=new JComboBox<String>();
		way.addItem("按名称查询");
		way.addItem("按ID查询");
		way.setBounds(75, 50, 100, 30);
		JTextField fwtf=new JTextField();
		fwtf.setBounds(175, 50, 150, 30);
		JLabel idl=new JLabel("ID：");
		idl.setBounds(40, 100, 40, 25);
		JTextField idtf=new JTextField();
		idtf.setBounds(70, 100, 200, 25);
		
		JLabel namel=new JLabel("名称：");
		namel.setBounds(40, 140, 40, 25);
		JTextField nametf=new JTextField();
		nametf.setBounds(70, 140, 200, 25);
		JButton modify2=new JButton("修改");
		modify2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(!idtf.getText().equals("")) {
					
					String newname=JOptionPane.showInputDialog(null, "请输入新名字", null, JOptionPane.INFORMATION_MESSAGE);
					String driver="com.mysql.jdbc.Driver";
					String url="jdbc:mySql://localhost:3306/goodssystem";
					String user="root";
					String dbpassword="2798645458";
					Connection conn=null;
					PreparedStatement ps=null;
					ResultSet rs=null;
					String selectSql="SELECT * FROM goods WHERE belong=?";
					String insertSql="UPDATE goods SET name=? WHERE id=?";
					try {
						Class.forName(driver);
						conn=DriverManager.getConnection(url, user, dbpassword);
						ps=conn.prepareStatement(selectSql);
						ps.setInt(1, userid);
						rs=ps.executeQuery();
						while(rs.next()) {
							if(rs.getInt(1)==Integer.parseInt(idtf.getText())) {
								ps=conn.prepareStatement(insertSql);
								ps.setString(1, newname);
								ps.setInt(2, Integer.parseInt(idtf.getText()));
								ps.executeUpdate();
							}
						}
						nametf.setText(newname);
						
					} catch (ClassNotFoundException | SQLException e1) {
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
				}else {
					JOptionPane.showMessageDialog(null, "请先进行查询操作", null, JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		modify2.setBounds(270, 140, 80, 25);
		JLabel pricel=new JLabel("价格：");
		pricel.setBounds(40, 180, 40, 25);
		JTextField pricetf=new JTextField();
		pricetf.setBounds(70, 180, 200, 25);
		JButton modify3=new JButton("修改");
		modify3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(!idtf.getText().equals("")) {
					
					String newprice=JOptionPane.showInputDialog(null, "请输入新价格", null, JOptionPane.INFORMATION_MESSAGE);
					String driver="com.mysql.jdbc.Driver";
					String url="jdbc:mySql://localhost:3306/goodssystem";
					String user="root";
					String dbpassword="2798645458";
					Connection conn=null;
					PreparedStatement ps=null;
					ResultSet rs=null;
					String selectSql="SELECT * FROM goods WHERE belong=?";
					String insertSql="UPDATE goods SET price=? WHERE id=?";
					try {
						Class.forName(driver);
						conn=DriverManager.getConnection(url, user, dbpassword);
						ps=conn.prepareStatement(selectSql);
						ps.setInt(1, userid);
						rs=ps.executeQuery();
						while(rs.next()) {
							if(rs.getInt(1)==Integer.parseInt(idtf.getText())) {
								ps=conn.prepareStatement(insertSql);
								ps.setDouble(1, Double.parseDouble(newprice));
								ps.setInt(2, Integer.parseInt(idtf.getText()));
								ps.executeUpdate();
							}
						}
						pricetf.setText(newprice);
					} catch (ClassNotFoundException | SQLException e1) {
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
				}else {
					JOptionPane.showMessageDialog(null, "请先进行查询操作", null, JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		modify3.setBounds(270, 180, 80, 25);
		JLabel stockl=new JLabel("库存：");
		stockl.setBounds(40, 220, 40, 25);
		JTextField stocktf=new JTextField();
		stocktf.setBounds(70, 220, 200, 25);
		JButton modify4=new JButton("修改");
		modify4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(!idtf.getText().equals("")) {
					
					String newstock=JOptionPane.showInputDialog(null, "请输入新库存", null, JOptionPane.INFORMATION_MESSAGE);
					String driver="com.mysql.jdbc.Driver";
					String url="jdbc:mySql://localhost:3306/goodssystem";
					String user="root";
					String dbpassword="2798645458";
					Connection conn=null;
					PreparedStatement ps=null;
					ResultSet rs=null;
					String selectSql="SELECT * FROM goods WHERE belong=?";
					String insertSql="UPDATE goods SET stock=? WHERE id=?";
					try {
						Class.forName(driver);
						conn=DriverManager.getConnection(url, user, dbpassword);
						ps=conn.prepareStatement(selectSql);
						ps.setInt(1, userid);
						rs=ps.executeQuery();
						while(rs.next()) {
							if(rs.getInt(1)==Integer.parseInt(idtf.getText())) {
								ps=conn.prepareStatement(insertSql);
								ps.setInt(1, Integer.parseInt(newstock));
								ps.setInt(2, Integer.parseInt(idtf.getText()));
								ps.executeUpdate();
							}
						}
						stocktf.setText(newstock);
					} catch (ClassNotFoundException | SQLException e1) {
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
				}else {
					JOptionPane.showMessageDialog(null, "请先进行查询操作", null, JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		modify4.setBounds(270, 220, 80, 25);
		JButton find=new JButton("查询");
		find.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(fwtf!=null) {
					String driver="com.mysql.jdbc.Driver";
					String url="jdbc:mySql://localhost:3306/goodssystem";
					String user="root";
					String dbpassword="2798645458";
					Connection conn=null;
					PreparedStatement ps=null;
					ResultSet rs=null;
					String selectSql="SELECT * FROM goods WHERE belong=?";
					try {
						Class.forName(driver);
						conn=DriverManager.getConnection(url, user, dbpassword);
						ps=conn.prepareStatement(selectSql);
						ps.setInt(1, userid);
						rs=ps.executeQuery();
						while(rs.next()) {
							if(way.getSelectedItem()=="按名称查询") {
								if(fwtf.getText()!=null) {
									if(fwtf.getText().equals(rs.getString("name"))) {
										idtf.setText(rs.getString("id"));
										nametf.setText(rs.getString("name"));
										pricetf.setText(rs.getString("price"));
										stocktf.setText(rs.getString("stock"));
									}
								}
							}
							if(way.getSelectedItem()=="按ID查询") {
								if(fwtf.getText()!=null) {
									if(fwtf.getText().equals(rs.getString("id"))) {
										idtf.setText(rs.getString("id"));
										nametf.setText(rs.getString("name"));
										pricetf.setText(rs.getString("price"));
										stocktf.setText(rs.getString("stock"));
									}
								}
							}
						}
					} catch (ClassNotFoundException | SQLException e1) {
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
		find.setBounds(120, 350, 70, 30);
		JButton delete=new JButton("删除");
		delete.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(!idtf.getText().equals("")) {
					String driver="com.mysql.jdbc.Driver";
					String url="jdbc:mySql://localhost:3306/goodssystem";
					String user="root";
					String dbpassword="2798645458";
					Connection conn=null;
					PreparedStatement ps=null;
					String deleteSql="DELETE FROM goods WHERE name=? AND belong=?";
					try {
						Class.forName(driver);
						conn=DriverManager.getConnection(url, user, dbpassword);
						ps=conn.prepareStatement(deleteSql);
						
						ps.setString(1, nametf.getText());
						ps.setInt(2, userid);
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "删除成功", null, JOptionPane.INFORMATION_MESSAGE);
						fwtf.setText(null);
						idtf.setText(null);
						nametf.setText(null);
						pricetf.setText(null);
						stocktf.setText(null);
					} catch (ClassNotFoundException | SQLException e1) {
						e1.printStackTrace();
					}finally {
						try {
							
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
		delete.setBounds(250, 350, 70, 30);
		JLabel[] arrL= {fmd,idl,namel,pricel,stockl};
		JTextField[] arrTf= {fwtf,idtf,nametf,pricetf,stocktf};
		JButton[] arrB= {modify2,modify3,modify4,find,delete};
		for(JLabel temp:arrL) {
			fmdP.add(temp);
		}
		for(JTextField temp:arrTf) {
			fmdP.add(temp);
		}
		for(JButton temp:arrB) {
			fmdP.add(temp);
		}
		fmdP.add(way);
		fmdP.setVisible(false);

		jf.add(fmdP);
		
		//浏览所有物品
		broP=new JPanel();
		broP.setSize(700, 500);
		broP.setLayout(null);
		broP.setLocation(50, 50);
		String[] columnName= {"ID","名称","单价","库存"};
		List<Object> list=new ArrayList<Object>();
		
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mySql://localhost:3306/goodssystem";
		String user="root";
		String dbpassword="2798645458";
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String selectSql="SELECT * FROM goods WHERE belong=?";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, dbpassword);
			ps=conn.prepareStatement(selectSql);
			ps.setInt(1, userid);
			rs=ps.executeQuery();
			while(rs.next()) {
				Object[] obj= {rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4)};
				list.add(obj);
			}
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}finally {
			try {
				
				if(ps!=null)
					ps.close();
				if(conn!=null)
					conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		Object[][] data=new Object[list.size()][4];
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<4;j++){
				data[i][j]=((Object[])list.get(i))[j];
			}
		}
		JTable table;
		JScrollPane jscrollpane = new JScrollPane();
		table = new JTable(data,columnName);
		jscrollpane.setBounds(80, 50, 550, 400);
		jscrollpane.setViewportView(table);//这句很重要
		table.setRowHeight(35); 
		table.getTableHeader().setReorderingAllowed(false);//设置不可移动
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();    
		r.setHorizontalAlignment(JLabel.CENTER);   
		table.setDefaultRenderer(Object.class,r);
		broP.add(jscrollpane);
		broP.setVisible(false);
		jf.add(broP);
		
		
		addItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				addP.setVisible(true);
				fmdP.setVisible(false);
				broP.setVisible(false);
			}
		});
		JMenuItem fmdItem=new JMenuItem("查询/修改/删除物品");
		fmdItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				addP.setVisible(false);
				fmdP.setVisible(true);
				broP.setVisible(false);
			}
		});
		JMenuItem browserItem=new JMenuItem("浏览所有物品");
		browserItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				addP.setVisible(false);
				fmdP.setVisible(false);
				broP.setVisible(true);
			}
		});
		menu.add(addItem);
		menu.add(fmdItem);
		menu.add(browserItem);
		jf.setJMenuBar(menuBar);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		MainFrame mf=new MainFrame();
		mf.display();
	}
}
