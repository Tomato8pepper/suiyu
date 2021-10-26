package com.gem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//���ݿ����ӹ�����
public class DBUtil {
	public static final String URL = "jdbc:mysql://10.40.7.7:3306/emsswing";
	public static final String USER = "root";
	public static final String PASSWORD = "123456";
	private static Connection conn = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		// 1�������
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		return conn;
	}

	public static void closeConnection() {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closePreparedStatement(PreparedStatement pst) {
		try {
			if (pst != null)
				pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeResultSet(ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
