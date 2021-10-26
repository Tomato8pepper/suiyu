<%@page contentType="text/html;charset=gb2312"%>
<%@page import="java.sql.*"%>
</HTML>
<body bgcolor=cyan>
	<% Connection con;
   PreparedStatement sql;
   ResultSet rs;
   try{  Class.forName("com.mysql.jdbc.Driver");
   }
   catch(Exception e){
         out.println("忘记把数据库的JDBC数据库驱动程序复制到JDK的拓展目录中");
   }
   try{
   String uri="jdbc:mysql://localhost/warehouse";
   String user="root";
   String password="2798645458";
   con=DriverManager.getConnection(uri,user,password);
   sql=con.prepareStatement("select * from product");
   rs=sql.executeQuery();
   out.print("<table border=2>");
   out.print("<tr>");
   out.print("<th width=100>"+"产品号");
   out.print("<th width=100>"+"名称");
   out.print("<th width=50>"+"生产日期");
   out.print("<th width=50>"+"价格");
   out.print("</tr>");
   while(rs.next()){
	   out.print("<tr>");
	   out.print("<td>"+rs.getString(1)+"</td>");
       out.print("<td>"+rs.getString(2)+"</td>");
       out.print("<td>"+rs.getDate("madeTime")+"</td>");
       out.print("<td>"+rs.getFloat("price")+"</td>");
   out.print("</tr>");
   }
   out.print("</table>");
   con.close();
}catch(SQLException e){
    out.print(e);
}
%>
</body>
</HTML>

