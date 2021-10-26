package GMS;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Goods {
	private int id;
	private String name;
	private double price;
	private int stock;
	private int belong;
	public Goods() {
		
	}
	public Goods( String name, double price,int stock,int belong) {
		super();
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/goodssystem";
		String dbuser="root";
		String dbpassword="2798645458";
		Connection conn=null;
		PreparedStatement ps=null;
		String insertSql="INSERT INTO goods(name,price,stock,belong) VALUES(?,?,?,?);";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, dbuser, dbpassword);
			
			this.name = name;
			this.price = price;
			this.stock=stock;
			this.belong=belong;
			//将信息写入数据库中
			ps=conn.prepareStatement(insertSql);
			ps.setString(1, this.name);
			ps.setDouble(2, this.price);
			ps.setInt(3, this.stock);
			ps.setInt(4, this.belong);
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null)
					ps.close();
				
				if(conn!=null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getBelong() {
		return belong;
	}
	public void setBelong(int belong) {
		this.belong = belong;
	}
}
