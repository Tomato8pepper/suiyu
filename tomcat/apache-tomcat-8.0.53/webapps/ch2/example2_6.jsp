<%@page contentType="text/html;charset=gb2312"%>>
<HTML><body bgcolor=blue><font size=3>
<% int x=12,y=9;
%>
������ʽx+y+x%y,��<%=x%>+<%=y%>+<%=x%>%<%=y%>��ֵ:
<%=x+y+x%y%>
<br>������ʽx>y��<%=x%>><%=y%>��ֵ:
<%=x>y%>
<br>������ʽsin(<%=Math.PI%>/2)��ֵ:
<%=Math.sin(Math.PI/2)%>
<br>
<% if(x-y>=0){
%> ���<%=x%>����<%=y%>����<%=x%>��<%=y%>
   �Ĳ�:<%=x-y%>��ƽ����:
   <%=Math.sqrt(x-y)%>
<%}
%>
</font></body></HTML>