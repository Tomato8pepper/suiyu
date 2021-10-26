<%@page contentType="text/html;charset=gb2312"%>
<head><jsp:include page="head.txt"/></head>
<HTML><font  color=green size=4><br>这是error.jsp页面</font>
<font size=4 color=yellow>
<%    String n=request.getParameter("mess");
      <br>out.println("您输入的值是："+n);
%>
</font></HTML>