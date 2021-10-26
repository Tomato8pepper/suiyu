<%@page contentType="text/html;charset=gb2312"%>
<HTML><body bgcolor=pink><font Size=2>
<jsp:useBean id="boy" class="tom.jiafei.Circle" scope="application"/>
    元的初始半径是：<%=boy.getRadius()%>
    <% boy.setRadius(10000);%>
    <br><b>修改后圆的半径是：<%=boy.getRadius()%>
</font></body></HTML>