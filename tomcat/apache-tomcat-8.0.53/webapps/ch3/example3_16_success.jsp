<%@page contentType="text/html;charset=gb2312"%>
<HTML><body bgcolor=pink><font Size=2>
<%   int count=((Integer)session.getAttribute("count")).intValue();
     int num=((Integer)session.getAttribute("save")).intValue();
%>
<br>��ϲ�����¶���
<br><b>��������<%=count%>��
<br>������־���<%=num%>
</font></body></HTML>