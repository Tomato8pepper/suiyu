<%@page contentType="text/html;charset=gb2312"%>
<head>
    <a href="login.jsp">╣гб╪</a>
    <a href="show.jsp">отй╬</a>
    <a href="exit.jsp">мкЁЖ</a>
</head>
<html><body bgcolor=yellow>
<%     String n=(String)session.getAttribute("login");
       if(n==null||n.length()==0){
          response.sendRedirect("login.jsp");
       }
%>
       <image  src="image/back1.jpg" width=200 height=178></image>
</body></html>