<%@page contentType="text/html;charset=gb2312"%>
<head><jsp:include page="head.txt"/></head>
<HTML><font  color=green size=4><br>����error.jspҳ��</font>
<font size=4 color=yellow>
<%    String n=request.getParameter("mess");
      <br>out.println("�������ֵ�ǣ�"+n);
%>
</font></HTML>