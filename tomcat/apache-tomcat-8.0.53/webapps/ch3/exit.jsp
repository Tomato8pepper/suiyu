<%@page contentType="text/html;charset=gb2312"%>
<head>
    <a href="login.jsp">登录</a>
    <a href="show.jsp">显示</a>
    <a href="exit.jsp">退出</a>
</head>
<html><body bgcolor=yellow>
<%  
    session.invalidate();
%>
    <b>session会话失效
</body></html>