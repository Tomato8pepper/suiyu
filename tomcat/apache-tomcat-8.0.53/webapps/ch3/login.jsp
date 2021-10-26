<%@page contentType="text/html;charset=gb2312"%>
<head>
    <a href="login.jsp">登录</a>
    <a href="show.jsp">显示</a>
    <a href="exit.jsp">退出</a>
</head>
<html><body bgcolor=cyan>
    <form  action="" method=post name=form>
    输入名字:<br>
       <input type=text name="n" size=6>
       <br><input type=submit value="提交">
    </form>
</body></html>
<%   String n=request.getParameter("n");
     if(n==null)
       n="";
     session.setAttribute("login",n);
%> 