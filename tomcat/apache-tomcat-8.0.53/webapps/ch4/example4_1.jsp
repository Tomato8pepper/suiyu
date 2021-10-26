<%@page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="circle" class="tom.jiafei.Circle" scope="page"/>
<HTML><body bgcolor=pink><font Size=3>
   <p>元的初始半径是：<%=circle.getRadius()%>
   <% double newRadius=100;
      circle.setRadius(newRadius);
   %>
   <p>修改半径为<%=newRadius%>
   <br><b>目前圆的半径是：<%=circle.getRadius()%>
   <br><b>圆的周长：<%=circle.circleLength()%>
   <br><b>圆的面积：<%=circle.circleArea()%>
</font></body></HTML>