package myservlet.control;
import mybean.data.Rumeng;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Mingguo extends HttpServlet{
	public void init(ServletConfig c)throws ServletException{
		super.init(c);
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e) {
			System.out.println("���ش���");
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
			fail(req,res,"��ѯʧ��");
		}
		HttpSession session=req.getSession(true);
		Connection con=null;
		Rumeng rumeng=null;
		try {
			rumeng=(Rumeng)session.getAttribute("rumeng");
			if(rumeng==null) {
				rumeng=new Rumeng();
				session.setAttribute("rumeng", rumeng);
			}
		}
		catch(Exception exp) {
			rumeng=new Rumeng();
			session.setAttribute("rumeng",rumeng);
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
			rumeng.setColumnName(columnName);
			rs.last();
			int rowNumber=rs.getRow();
			String [][]tableRecord=rumeng.getTableRecord();
			tableRecord=new String[rowNumber][columnCount];
			rs.beforeFirst();
			int i=0;
			while(rs.next()) {
				for(int k=0;k<columnCount;k++) 
					tableRecord[i][k]=rs.getString(k+1);
				i++;
			}
			rumeng.setTableRecord(tableRecord);
			con.close();
			res.sendRedirect("input.jsp");
						
		}catch(SQLException e) {}
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
			o.println("����");
			o.println("<a href=input.jsp>������ȷ����Ϣ</a>");
			o.println("</body></html>");
		}
		catch(IOException e) {}
	}
}