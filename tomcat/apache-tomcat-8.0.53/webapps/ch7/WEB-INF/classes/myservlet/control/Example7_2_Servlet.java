package myservlet.control;
import mybean.data.Example7_2_Bean;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Example7_2_Servlet extends HttpServlet{
     public void init(ServletConfig config)throws ServletException{
            super.init(config);
     }
     public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
            Example7_2_Bean resultBean=null;
	  PrintWriter out = response.getWriter();
          try{   resultBean=(Example7_2_Bean)request.getAttribute("resultBean");
                  if(resultBean==null){
                      resultBean=new Example7_2_Bean();
                      request.setAttribute("resultBean",resultBean);
                  }
          }
          catch(Exception exp){
                  resultBean=new Example7_2_Bean();
                  request.setAttribute("resultBean",resultBean);
           }
          try{ Class.forName("com.mysql.jdbc.Driver");
           }
          catch(Exception e){}
          request.setCharacterEncoding("utf-8");
          String number=request.getParameter("price");
          if(number==null||number.length()==0)
                return;
          String dataBase=request.getParameter("dataBase");
          String tableName=request.getParameter("tableName");
          String user=request.getParameter("user");
          String password=request.getParameter("password");
          float p=Float.parseFloat(number);
          Connection con;
          Statement sql;
          ResultSet rs;
          try{
              String uri="jdbc:mysql://localhost/"+dataBase;
              con=DriverManager.getConnection(uri,user,password);
              sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
              String condition="SELECT * FROM "+tableName+" where price>"+p;
              rs=sql.executeQuery(condition);
              ResultSetMetaData metaData=rs.getMetaData();
              int columnCount=metaData.getColumnCount();
              String []columnName=new String[columnCount];
              for(int i=0;i<columnName.length;i++){
                 columnName[i]=metaData.getColumnName(i+1);
              }
              resultBean.setColumnName(columnName);
              rs.last();
              int rowNumber=rs.getRow();
              String [][]tableRecord=resultBean.getTableRecord();
              tableRecord=new String[rowNumber][columnCount];
              rs.beforeFirst();
              int i=0;
              while(rs.next()){
                for(int k=0;k<columnCount;k++)
                  tableRecord[i][k]=rs.getString(k+1);
                i++;
              }
              resultBean.setTableRecord(tableRecord);
              con.close();
              RequestDispatcher dispatcher=request.getRequestDispatcher("showRecord.jsp");
              dispatcher.forward(request,response);
           }
           catch(SQLException e){

		 out.println("try22");
                  //System.out.println(e);
           }
      }
      public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
                  doPost(request,response);
      }
}