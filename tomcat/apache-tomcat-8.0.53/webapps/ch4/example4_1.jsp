<%@page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="circle" class="tom.jiafei.Circle" scope="page"/>
<HTML><body bgcolor=pink><font Size=3>
   <p>Ԫ�ĳ�ʼ�뾶�ǣ�<%=circle.getRadius()%>
   <% double newRadius=100;
      circle.setRadius(newRadius);
   %>
   <p>�޸İ뾶Ϊ<%=newRadius%>
   <br><b>ĿǰԲ�İ뾶�ǣ�<%=circle.getRadius()%>
   <br><b>Բ���ܳ���<%=circle.circleLength()%>
   <br><b>Բ�������<%=circle.circleArea()%>
</font></body></HTML>