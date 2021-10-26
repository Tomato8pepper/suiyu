<%@page contentType="text/html;charset=gb2312"%>
<HTML><body bgcolor=pink><font Size=2>
<%   int count=((Integer)session.getAttribute("count")).intValue();
     int num=((Integer)session.getAttribute("save")).intValue();
%>
<br>恭喜您，猜对了
<br><b>您共猜了<%=count%>次
<br>这个数字就是<%=num%>
</font></body></HTML>