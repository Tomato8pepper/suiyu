package com.gem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class T1Add {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ems";
		String id = "root";
		String password = "123456";

		String empId="104";
		String empName="Lily";
		String empPassword="123456";
		String gender="女";
		String birthDate="1993/6/15";
		String pic="104.jpg";
		int deptId=2;
		try {
			// 1 加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 2 数据库的连接
			Connection conn = DriverManager.getConnection(url, id, password);
			Statement st=conn.createStatement();
			//insert into Employee values('102','彭丽媛','123456','女','1963/6/15','102.jpg',2);
			//删除，修改 语法 一样
			String sql="insert into Employee values('"+empId+"','"+empName+"','"
					+empPassword+"','"+gender+"','"+birthDate+"','"+pic+"',"+deptId+")";
			st.executeUpdate(sql);
			System.out.println("Insert OK!");	
			st.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
