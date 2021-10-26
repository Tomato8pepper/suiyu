<%@page contentType="text/html;charset=gb2312"%>
<%@page import ="java.sql.*"%>
</HTML><body bgcolor=cyan>
<% Connection con;
   Statement sql;
   ResultSet rs;
   try{  Class.forName("com.mysql.jdbc.Driver");
   }
   catch(Exception e){
         out.println("忘记把数据库的JDBC数据库驱动程序复制到JDK的拓展目录中");
   }
   try{  String uri="jdbc:mysql://localhost/warehouse";
         String user="root";
         String password="2798645458";
         con=DriverManager.getConnection(uri,user,password);
         //con=DriverManager.getConnection(uri+"?user=root&password=");
         sql=con.createStatement();
         rs=sql.executeQuery("SELECT * FROM product");
         out.print("<table border=2>");
         out.print("<tr>");
             out.print("<th width=100>"+"产品号");
             out.print("<th width=100>"+"名称");
             out.print("<th width=100>"+"生产日期");
             out.print("<th width=50>"+"价格");
         out.print("</TR>");
         while(rs.next()){  //是游标向下移动一行的意思 ，放在while循环里面做循环条件，就是如果有下一行的意思。并且执行了游标的向下移动。
         out.print("<tr>");
             out.print("<td>"+rs.getString(1)+"</td>");
             out.print("<td>"+rs.getString(2)+"</td>");
             out.print("<td>"+rs.getDate("madeTime")+"</td>");
             out.print("<td>"+rs.getFloat("price")+"</td>");
         out.print("</tr>");
         }
         out.print("</table>");
         con.close();
   }
   catch(SQLException e){
         out.print(e);
   }
%>
</body></HTML>