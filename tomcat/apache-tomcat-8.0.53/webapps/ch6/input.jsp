<%@page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="bean"  class="mybean.data.Tixing" scope="session"/>
<html><body bgcolor=cyan size=4>
<font size=4 color=blue>
     <form action="rumeng" method="post" >梯形:
          <br>请输入上底:<input type=text name="a" >
          <br>请输入下底:<input type=text name="b">
          <br>请输入其高:<input type=text name="h">
          <br><input type=submit value="提交">
     </form>
     <br><jsp:getProperty name="bean" property="mess"/>
     <br>上底:<jsp:getProperty name="bean" property="a"/>
     <br>下底:<jsp:getProperty name="bean" property="b"/>
     <br>高:<jsp:getProperty name="bean" property="h"/>
     <br>面积:<jsp:getProperty name="bean" property="area"/>
</font></body></html>