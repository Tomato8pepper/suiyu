<%@page contentType="text/html;charset=gb2312"%>
<HTML><body bgcolor=pink><font Size=2>
<jsp:useBean id="girl" class="tom.jiafei.Circle" scope="session"/>
   <i><br>������examle4_2_b.jspҳ��
   <br>��ǰԲ�İ뾶�ǣ�<%=girl.getRadius()%>
   <%girl.setRadius(99);%>
   <br>�޸ĺ�Բ�İ뾶�ǣ�<%=girl.getRadius()%></i>
   <a href="example4_2_a.jsp"><br>example4_2_a.jsp</a>
</font></body></HTML>
   