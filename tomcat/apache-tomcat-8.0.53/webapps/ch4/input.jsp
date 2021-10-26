<%@page contentType="text/html;charset=gb2312"%>
<%@page import="tom.jiafei.Car"%>
<jsp:useBean id="c" class="tom.jiafei.Car" scope="request"  />
<html><body bgcolor=yellow>
<font size=2>
      <form  action="" method="post">
          汽车牌号:<input   type=text name="number">
          <br>汽车名字:<input type=text name="name">
          <br>汽车生产日期:<input type=text name="madeTime">
          <input type=submit value="提交" name="submit">
      </form>
<jsp:setProperty name="c" property="*"/>
      <table border=1>
        <tr><th>汽车牌号
            <th>汽车名字
            <th>汽车生产日期
        </tr>
        <tr>
            <td><jsp:getProperty name="c" property="number"/></td>
            <td><jsp:getProperty name="c" property="name"/></td>
            <td><jsp:getProperty name="c" property="madeTime"/></td>
        </tr>
</font></body></html>