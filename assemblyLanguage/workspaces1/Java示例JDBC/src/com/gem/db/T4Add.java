package com.gem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class T4Add {
	public static void main(String[] args) {
		String empId="105";
		String empName="������";
		String gender="��";
		
		String url = "jdbc:mysql://localhost:3306/ems";
		String id = "root";
		String password = "123456";

		try {
			// 1 ��������
			Class.forName("com.mysql.jdbc.Driver");
			// 2 �õ����ݿ������
			Connection conn = DriverManager.getConnection(url, id, password);
			String sql="insert into Employee(empId,empname,gender) values(?,?,?)";
			
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1,empId);
			pst.setString(2, empName);
			pst.setString(3, gender);
			
			pst.executeUpdate();
			System.out.println("Add OK!");	
			pst.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
