<%@page contentType="text/html;charset=gb2312"%>
<head>
    <a href="login.jsp">��¼</a>
    <a href="show.jsp">��ʾ</a>
    <a href="exit.jsp">�˳�</a>
</head>
<html><body bgcolor=yellow>
<%     String n=(String)session.getAttribute("login");
       if(n==null||n.length()==0){
          response.sendRedirect("login.jsp");
       }
%>
       <image  src="image/back1.jpg" width=200 height=178></image>
</body></html>