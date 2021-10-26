package myservlet.control;
import mybean.data.Ruru;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Ruru1 extends HttpServlet{
	public void init(ServletConfig c)throws ServletException{
		super.init(c);
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e) {
			System.out.println("加载错误");
		}
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		req.setCharacterEncoding("gb2312");
		String dataBase=req.getParameter("dataBase");
		String tableName=req.getParameter("tableName");
		String user=req.getParameter("user");
		String password=req.getParameter("password");
		boolean boo=(dataBase==null||dataBase.length()==0);
		boo=boo||(tableName==null||tableName.length()==0);
		boo=boo||(user==null||user.length()==0);
		if(boo) {
			fail(req,res,"查询失败");
		}
		HttpSession session=req.getSession(true);
		Connection con=null;
		Ruru ruru=null;
		try {
			ruru=(Ruru)session.getAttribute("ruru");
			if(ruru==null) {
				ruru=new Ruru();
				session.setAttribute("ruru", ruru);
			}
		}
		catch(Exception exp) {
			ruru=new Ruru();
			session.setAttribute("ruru",ruru);
		}
		String uri="jdbc:mysql://localhost/"+dataBase;
		try {
			con=DriverManager.getConnection(uri, user, password);
			Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=sql.executeQuery("SELECT * FROM "+tableName);
			ResultSetMetaData rsmd=rs.getMetaData();
			int columnCount=rsmd.getColumnCount();
			String[] columnName=new String[columnCount];
			for(int i=0;i<columnName.length;i++) {
				columnName[i]=rsmd.getColumnName(i+1);
			}
			ruru.setColumnName(columnName);
			rs.last();
			int rowNumber=rs.getRow();
			String [][]tableRecord=ruru.getTableRecord();
			tableRecord=new String[rowNumber][columnCount];
			rs.beforeFirst();
			int i=0;
			while(rs.next()) {
				for(int k=0;k<columnCount;k++)
					tableRecord[i][k]=rs.getString(k+1);
				i++;
			}
				ruru.setTableRecord(tableRecord);
				con.close();
				res.sendRedirect("ex8show.jsp");
		} catch (SQLException e) {
			System.out .println("出现错误");
		}
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		doPost(req,res);
	}
	public void fail(HttpServletRequest req,HttpServletResponse res,String backNews){
		res.setContentType("text/html;charset=gb2312");
		try {
			PrintWriter o=res.getWriter();
			o.println("<html><body>");
			o.println("<h2>"+backNews+"</h2>");
			o.println("返回");
			o.println("<a href=ex8show.jsp>输入正确的信息</a>");
			o.println("</body></html>");
		}
		catch(IOException e) {}
	}
}
