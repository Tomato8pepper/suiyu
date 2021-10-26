package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {
		try {
			// 导入类库
			Class.forName("com.mysql.jdbc.Driver");
			// 连接数据库
			String url = "jdbc:mysql://localhost:3306/mms";
			String user = "root";
			String pwd = "2798645458";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			// Connection conn=DriverManager.getConnection(url, user, pwd);
			System.out.println("连接成功");
			// 查询数据
			Statement st = conn.createStatement();
			String sql = "select id,name,price,stock  from Goods ";
			//String sql = "select sno,sname,ssex,sage,sdept  from student ";
			//String sql = "select A.EmpId,A.EmpName,A.Gender,A.BirthDate,A.Pic,B.DeptName  from employee A ,dept B where  A.DeptId=B.DeptId";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(
						// 输出列
						        rs.getString(1) + "\t" + 
								rs.getString(2) + "\t" + 
						        rs.getString(3) + "\t" + 
								rs.getString(4));
						        //+ "\t" + rs.getString(5));
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
