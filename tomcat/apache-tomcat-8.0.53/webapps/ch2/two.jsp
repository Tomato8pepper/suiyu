<%@page contentType="text/html;charset=gb2312"%>
<head><jsp:include page="head.txt"/></head>
<HTML><font  color=green size=4><br>����two.jspҳ��</font>
<font size=4 color=yellow>
<br>
<%    String n=request.getParameter("mess");
      out.print("�������ֵ�ǣ�"+n);
%>
</font></HTML>