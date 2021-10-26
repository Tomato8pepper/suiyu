<%@page contentType="text/html;charset=gb2312"%>
<head><jsp:include page="head.txt"/></head>
<HTML><font  color=green size=4><br>这是two.jsp页面</font>
<font size=4 color=yellow>
<br>
<%    String n=request.getParameter("mess");
      out.print("您输入的值是："+n);
%>
</font></HTML>