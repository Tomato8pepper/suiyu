package myservlet.control;
import mybean.data.Minglong;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Calendar;
public class Minghui extends HttpServlet{
	public void init(ServletConfig c) throws ServletException {
		super.init(c);
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
		}
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		Minglong minglong = null;
		minglong = (Minglong) req.getAttribute("minglong");
		try {
			if (minglong == null) {
				minglong = new Minglong();
				req.setAttribute("minglong", minglong);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			minglong = new Minglong();
			req.setAttribute("minglong", minglong);
		}
		req.setCharacterEncoding("gb2312");
		String number = req.getParameter("number");
		String name = req.getParameter("name");
		String madeTime = req.getParameter("madeTime");
		String pr= req.getParameter("price");
		if (number == null || number.length() == 0) {
			fail(req, res, "添加记录失败，必须给出记录");
			return;
		}
		float price = Float.parseFloat(pr);
		String[] str=madeTime.split("[-/]");
		int year=Integer.parseInt(str[0]);
		int month=Integer.parseInt(str[1]);
		int day=Integer.parseInt(str[2]);
		Calendar cl=Calendar.getInstance();
		cl.set(year, month-1,day);
		Date da=new java.sql.Date(cl.getTimeInMillis());
		Connection con;
		PreparedStatement sql;
		ResultSet rs = null;
		try {
			String uri = "jdbc:mysql://localhost/warehouse? "+"user=root&password=2798645458&characterEncoding=gb2312";
			con = DriverManager.getConnection(uri);
			String condition="update product set name=?,price=?,nadeTime=? where number=?";
			sql = con.prepareStatement(condition);
			sql.setString(1,name);
			sql.setFloat(2,price);
			sql.setDate(3,da);
			sql.setString(4,number);
			sql.executeUpdate();
			sql=con.prepareStatement("select * from product");
			rs=sql.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			String[] columnName = new String[columnCount];
			for (int i = 0; i < columnName.length; i++) {
				columnName[i] = rsmd.getColumnName(i + 1);
			}
			minglong.setColumnName(columnName);
			rs.last();
			int rowNumber = rs.getRow();
			String[][] tableRecord = minglong.getTableRecord();
			tableRecord = new String[rowNumber][columnCount];
			rs.beforeFirst();
			int i = 0;
			while (rs.next()) {
				for (int k = 0; k < columnCount; k++)
					tableRecord[i][k] = rs.getString(k + 1);
				i++;
			}
			minglong.setTableRecord(tableRecord);
			con.close();
			RequestDispatcher dis = req.getRequestDispatcher("exshow.jsp");
			dis.forward(req, res);
			
			
		} catch (SQLException e) {
			System.out.println(e);
			fail(req, res, "添加记录失败" + e.toString());
		}
		
		
		
		
		
		
		
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		doPost(req,res);
	}
	public void fail(HttpServletRequest req, HttpServletResponse res, String backNews) {
		res.setContentType("text/html;charset=gb2312");
		try {
			PrintWriter o = res.getWriter();
			o.println("<html><body>");
			o.println("<h2>" + backNews + "</h2>");
			o.println("返回");
			o.println("<a href=ex6.jsp>输入记录</a>");
			o.println("</body></html>");
		} catch (IOException e) {
		}
	}
	
}
