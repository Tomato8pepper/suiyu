<%@page contentType="text/html;charset=gb2312"%>
<%@page import="tom.jiafei.Car1"%>
<jsp:useBean id="c" class="tom.jiafei.Car1" scope="session"  />
<html><body bgcolor=yellow>
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