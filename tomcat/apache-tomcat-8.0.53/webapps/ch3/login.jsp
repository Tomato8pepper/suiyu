<%@page contentType="text/html;charset=gb2312"%>
<head>
    <a href="login.jsp">��¼</a>
    <a href="show.jsp">��ʾ</a>
    <a href="exit.jsp">�˳�</a>
</head>
<html><body bgcolor=cyan>
    <form  action="" method=post name=form>
    ��������:<br>
       <input type=text name="n" size=6>
       <br><input type=submit value="�ύ">
    </form>
</body></html>
<%   String n=request.getParameter("n");
     if(n==null)
       n="";
     session.setAttribute("login",n);
%> 