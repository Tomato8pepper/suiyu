package myservlet.control;
import mybean.data.Mingguo;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Calendar;
public class Rumeng extends HttpServlet {
	public void init(ServletConfig c) throws ServletException {
		super.init(c);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter o = res.getWriter();
		Mingguo mingguo = null;
		try {
			mingguo = (Mingguo) req.getAttribute("mingguo");
			if (mingguo == null) {
				mingguo = new Mingguo();
				req.setAttribute("mingguo", mingguo);
			}
		} catch (Exception e) {
			mingguo = new Mingguo();
			req.setAttribute("mingguo", mingguo);
		}
		//o.print("duixiang");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
		}
		req.setCharacterEncoding("gb2312");
		String dataBase = req.getParameter("dataBase");
		String tableName = req.getParameter("tableName");
		String number = req.getParameter("number");
		String name = req.getParameter("name");
		String ageStr = req.getParameter("age");
		if (number == null || number.length() == 0) {
			fail(req, res, "添加记录失败，必须给出记录");
			return;
		}
		if (ageStr == null || ageStr.length() == 0)
			ageStr = "-1";
		int age = Integer.parseInt(ageStr);
		Connection con;
		PreparedStatement sql;
		ResultSet rs;
		try {
			String uri = "jdbc:mysql://localhost/" + dataBase + "?"
					+ "user=root&password=2798645458 &characterEncoding=gb2312";
			con = DriverManager.getConnection(uri);
			sql = con.prepareStatement("insert message values(?,?,?) ");
			sql.setString(1, number);
			sql.setString(2, name);
			sql.setInt(3, age);
			sql.executeUpdate();
			sql = con.prepareStatement("SELECT * FROM " + tableName);
			rs = sql.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			String[] columnName = new String[columnCount];
			for (int i = 0; i < columnName.length; i++) {
				columnName[i] = rsmd.getColumnName(i + 1);
			}
			mingguo.setColumnName(columnName);
			rs.last();
			int rowNumber = rs.getRow();
			String[][] tableRecord = mingguo.getTableRecord();
			tableRecord = new String[rowNumber][columnCount];
			rs.beforeFirst();
			int i = 0;
			while (rs.next()) {
				for (int k = 0; k < columnCount; k++)
					tableRecord[i][k] = rs.getString(k + 1);
				i++;
			}
			mingguo.setTableRecord(tableRecord);
			con.close();
			RequestDispatcher dis = req.getRequestDispatcher("insertshowRecord.jsp");
			dis.forward(req, res);

		} catch (SQLException exp) {
			System.out.println(exp);
			fail(req, res, "添加记录失败" + exp.toString());
		}
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}
	public void fail(HttpServletRequest req, HttpServletResponse res, String backNews) {
		res.setContentType("text/html;charset=gb2312");
		try {
			PrintWriter o = res.getWriter();
			o.println("<html><body>");
			o.println("<h2>" + backNews + "</h2>");
			o.println("返回");
			o.println("<a href=input.jsp>输入正确的信息</a>");
			o.println("</body></html>");
		} catch (IOException e) {
		}
	}
}
