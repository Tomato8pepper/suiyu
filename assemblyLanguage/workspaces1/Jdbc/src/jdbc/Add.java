package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Add {
	public static void main(String[] args) {
		try {
			// 导入类库
			Class.forName("com.mysql.jdbc.Driver");
			// 连接数据库
			String url = "jdbc:mysql://localhost:3306/ems";
			String user = "root";
			String pwd = "2798645458";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			// Connection conn=DriverManager.getConnection(url, user, pwd);
			System.out.println("连接成功");

			PreparedStatement pst = (PreparedStatement) conn.createStatement();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
