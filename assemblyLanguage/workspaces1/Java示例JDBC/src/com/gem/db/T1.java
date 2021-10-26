package com.gem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class T1 {
	public static void main(String[] args) {
		try {
			// 1加载类库
			Class.forName("com.mysql.jdbc.Driver");

			// 2连接
			String url = "jdbc:mysql://localhost:3306/ems";
			String user = "root";
			String pwd = "123456";
			Connection conn=DriverManager.getConnection(url, user, pwd);
			System.out.println("连接成功!");
			
			Statement st =conn.createStatement();
			String sql="select A.EmpId,A.EmpName,A.Gender,A.BirthDate,A.Pic,B.DeptName  from employee A ,dept B where  A.DeptId=B.DeptId";
			ResultSet rs =st.executeQuery(sql);
			while(rs.next()){
						System.out.println(
										rs.getString(1)+"\t"+
										rs.getString(2)+"\t"+
										rs.getString(3)+"\t"+
										rs.getString(4)+"\t"+
										rs.getString(5)+"\t"+
										rs.getString(6));
			}
			rs.close();
			st.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
