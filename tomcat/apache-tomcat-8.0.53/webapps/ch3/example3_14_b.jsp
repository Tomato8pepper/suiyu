<%@ page contentType="text/html;charset=gb2312"%>
<HTML><body  bgcolor=cyan>
     您好！帅哥，这里是example3-14-b.jsp的界面
  <% String id=session.getId();
     out.println("<br>您的session对象的ID是：<br>"+id);
  %>
 <BR>连接到example3_14_a.jsp的页面。<br>
 <a href="example3_14_a.jsp">example3_14_a.jsp</A>
</body></HTML> 