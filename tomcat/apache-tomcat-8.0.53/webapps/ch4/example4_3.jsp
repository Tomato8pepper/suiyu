<%@page contentType="text/html;charset=gb2312"%>
<HTML><body bgcolor=pink><font Size=2>
<jsp:useBean id="boy" class="tom.jiafei.Circle" scope="application"/>
    Ԫ�ĳ�ʼ�뾶�ǣ�<%=boy.getRadius()%>
    <% boy.setRadius(10000);%>
    <br><b>�޸ĺ�Բ�İ뾶�ǣ�<%=boy.getRadius()%>
</font></body></HTML>