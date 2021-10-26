<%@page contentType="text/html;charset=gb2312"%>
<HTML><body bgcolor=pink><font Size=2>
<jsp:useBean id="girl" class="tom.jiafei.Circle" scope="session"/>
      <br>这里是example4_2_a.jsp页面
      <br>圆的半径是：<%=girl.getRadius()%>
      <a href="example4_2_b.jsp"><br>example4_2_b.jsp</a>
</font></body></HTML>