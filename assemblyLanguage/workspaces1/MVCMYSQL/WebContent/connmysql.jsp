<%@page contentType="text/html;charset=gb2312"%>
<%@page import ="java.sql.*"%>
</HTML><body bgcolor=cyan>
<% Connection con;
   Statement sql;
   ResultSet rs;
   try{  Class.forName("com.mysql.jdbc.Driver");
   }
   catch(Exception e){
         out.println("���ǰ����ݿ��JDBC���ݿ����������Ƶ�JDK����չĿ¼��");
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
             out.print("<th width=100>"+"��Ʒ��");
             out.print("<th width=100>"+"����");
             out.print("<th width=100>"+"��������");
             out.print("<th width=50>"+"�۸�");
         out.print("</TR>");
         while(rs.next()){  //���α������ƶ�һ�е���˼ ������whileѭ��������ѭ�������������������һ�е���˼������ִ�����α�������ƶ���
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