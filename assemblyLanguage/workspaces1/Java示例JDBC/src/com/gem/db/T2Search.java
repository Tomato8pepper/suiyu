package com.gem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class T2Search {
	public static void main(String[] args) {
		String name = "ϰ";

		try {
			// 1�������
			Class.forName("com.mysql.jdbc.Driver");

			// 2����
			String url = "jdbc:mysql://localhost:3306/ems";
			String user = "root";
			String pwd = "123456";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("���ӳɹ�!");

			Statement st = conn.createStatement();
			String sql = "select * from Employee where empname like '%"+name+"%'";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("empId") + "\t" 
						+ rs.getString("empName") + "\t" 
						+ rs.getString("gender") + "\t"
						+ rs.getString("birthDate") + "\t" 
						+ rs.getString("pic") + "\t" 
						+ rs.getString("deptId"));
			}
			rs.close();
			st.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
