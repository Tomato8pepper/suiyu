package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Add {
	public static void main(String[] args) {
		try {
			// �������
			Class.forName("com.mysql.jdbc.Driver");
			// �������ݿ�
			String url = "jdbc:mysql://localhost:3306/ems";
			String user = "root";
			String pwd = "2798645458";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			// Connection conn=DriverManager.getConnection(url, user, pwd);
			System.out.println("���ӳɹ�");

			PreparedStatement pst = (PreparedStatement) conn.createStatement();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
