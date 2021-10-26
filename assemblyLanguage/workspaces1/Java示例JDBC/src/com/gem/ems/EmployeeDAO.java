package com.gem.ems;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class EmployeeDAO {
	public boolean login(String empId, String empPassword) {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			// 1加载类库
			Class.forName("com.mysql.jdbc.Driver");

			// 2连接
			String url = "jdbc:mysql://localhost:3306/ems";
			String user = "root";
			String pwd = "2798645458";
			conn = DriverManager.getConnection(url, user, pwd);
			//System.out.println("连接成功!");

			String sql = "select * from Employee where empId=? and empPassword=?";// ?参数

			pst = conn.prepareStatement(sql);
			pst.setString(1, empId);
			pst.setString(2, empPassword);
			rs = pst.executeQuery();

			while (rs.next()) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
