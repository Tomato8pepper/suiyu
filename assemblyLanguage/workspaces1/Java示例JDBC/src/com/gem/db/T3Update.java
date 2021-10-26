package com.gem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class T3Update {
	public static void main(String[] args) {
		String empId="104";
		String empName="����";
		String gender="��";
		
		String url = "jdbc:mysql://localhost:3306/ems";
		String id = "root";
		String password = "123456";

		try {
			// 1 ��������
			Class.forName("com.mysql.jdbc.Driver");
			// 2 �õ����ݿ������
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
