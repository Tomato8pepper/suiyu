<%@page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="bean"  class="mybean.data.Tixing" scope="session"/>
<html><body bgcolor=cyan size=4>
<font size=4 color=blue>
     <form action="rumeng" method="post" >����:
          <br>�������ϵ�:<input type=text name="a" >
          <br>�������µ�:<input type=text name="b">
          <br>���������:<input type=text name="h">
          <br><input type=submit value="�ύ">
     </form>
     <br><jsp:getProperty name="bean" property="mess"/>
     <br>�ϵ�:<jsp:getProperty name="bean" property="a"/>
     <br>�µ�:<jsp:getProperty name="bean" property="b"/>
     <br>��:<jsp:getProperty name="bean" property="h"/>
     <br>���:<jsp:getProperty name="bean" property="area"/>
</font></body></html>