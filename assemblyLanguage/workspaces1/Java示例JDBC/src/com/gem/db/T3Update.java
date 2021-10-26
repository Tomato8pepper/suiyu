package com.gem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class T3Update {
	public static void main(String[] args) {
		String empId="104";
		String empName="张三";
		String gender="男";
		
		String url = "jdbc:mysql://localhost:3306/ems";
		String id = "root";
		String password = "123456";

		try {
			// 1 加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 2 得到数据库的连接
			Connection conn = DriverManager.getConnection(url, id, password);
			String sql="update Employee set empName=?,gender=? where empId=?";
			
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, empName);
			pst.setString(2, gender);
			pst.setString(3,empId);
			
			pst.executeUpdate();
			System.out.println("Update OK!");	
			pst.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
