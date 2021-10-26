<%@page contentType="text/html;charset=gb2312"%>
<HTML><body bgcolor=pink><font Size=2>
<jsp:useBean id="girl" class="tom.jiafei.Circle" scope="session"/>
   <i><br>这里是examle4_2_b.jsp页面
   <br>当前圆的半径是：<%=girl.getRadius()%>
   <%girl.setRadius(99);%>
   <br>修改后圆的半径是：<%=girl.getRadius()%></i>
   <a href="example4_2_a.jsp"><br>example4_2_a.jsp</a>
</font></body></HTML>
   