<%@page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="mingguo" class="mybean.data.Tixing" scope="request"/>
<html><body bgcolor=cyan background="image/5.jpg"><font size=4 color=blue face="楷体">
      <form action="" method=post>
          <font color=red>输入前请思考您输入的值是否合理:<br></font>
          <br>请输入梯形的上底:<input type=text name="a">
          <br>请输入梯形的下底:<input type=text name="b">
          <br>请输入梯形的身高:<input type=text name="h">
          <br><input type=submit value="提交" name=submit>
      </form>
      <jsp:setProperty name="mingguo" property="*"/>
      <br> 梯形的上底是:<jsp:getProperty name="mingguo" property="a"/>
      <br> 梯形的下底是:<jsp:getProperty name="mingguo" property="b"/>
      <br> 梯形的身高是:<jsp:getProperty name="mingguo" property="h"/>
      <br> 最后您得到的面积是:<jsp:getProperty name="mingguo" property="area"/>
</font></body></html>