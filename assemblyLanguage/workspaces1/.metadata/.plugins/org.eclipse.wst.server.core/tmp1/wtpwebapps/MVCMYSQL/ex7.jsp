<%@ page import="java.sql.*"%>
<%@ page contentType="text/html; charset=gb2312"%>
<html>
<body>
	bgcolor=cyan>
	<font size=4> <%
 	Connection con = null;
 	Statement sql;
 	ResultSet rs;
 	try {
 		Class.forName("com.mysql.jdbc.Driver");

 	} catch (ClassNotFoundException e) {
 	}
 	try {
 		int n = 50;
 		String uri = "jdbc:mysql://localhost/bank?" + "user=root&password=2798645458&characterEncoding=gb2312";
 		con = DriverManager.getConnection(uri);
 		con.setAutoCommit(false);
 		sql = con.createStatement();
 		rs = sql.executeQuery("select userMoney from user where name='geng'");
 		rs.next();
 		double gengMoney = rs.getDouble("userMoney");
 		rs = sql.executeQuery("select userMoney from user where name='zhang'");
 		rs.next();
 		double zhangMoney = rs.getDouble("userMoney");
 		out.print("转账前geng的userMoney的值是" + gengMoney + "<br>");
 		out.print("转账前zhang的userMoney的值是" + zhangMoney + "<br>");
 		gengMoney = gengMoney - n;
 		if (gengMoney >= 0) {
 			zhangMoney = zhangMoney + n;
 			sql.executeUpdate("update user set userMoney=" + gengMoney + "where name='geng'");
 			sql.executeUpdate("update user set userMoney=" + zhangMoney + "where name='zhang'");
 			con.commit();

 		}
 		rs = sql.executeQuery("select * from user where name='zhang'||name='geng'");
 		out.println("<b>转账后的情况如下：<br>");
 		while (rs.next()) {
 			out.print(rs.getString(1) + "");
 			out.print(rs.getString(2));
 			out.print("<br>");

 		}
 		con.close();
 	} catch (SQLException e) {
 		out.print(e);
 	}
 %>
	</font>
</body>
</html>