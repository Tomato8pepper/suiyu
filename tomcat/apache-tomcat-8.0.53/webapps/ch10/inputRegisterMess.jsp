<%@page contentType="text/html;charset=GB2312"%>
<jsp:useBean id="userBean" class="mybean.data.Register" scope="request"/>
<HEAD><%@include file="head.txt" %></HEAD>
<title>注册页面</title>
<HTML><body background=image/2.jpg><font size=2>
<div align="center">
<form action="registerServlet" method="post" name=form>
<table>
         用户名由数字、字母、下划线构成
         <tr>
             <td>*用户名称:</td>   <td><input type=text name="logname"></td>
             <td>*用户密码:</td>   <td><input type=password name="password"></td>
         </tr>
         <tr>
             <td>*密码重复:</td>
             <td><input type=password name="again_password"></td>
             <td>联系电话:</td><td><input type=text name="phone"></td>
         </tr> 
         <tr> 
             <td>邮寄地址:</td><td><input type=text name="address"></td>
             <td>真实姓名:</td><td><input type=text name="realname"></td> 
             <td><input type=submit name="g"  value="提交"></td> 
         </tr>   
</table></form></div>
<div align="center">
<p>注册反馈:
<jsp:getProperty name="userBean"   property="backNews"/>
<table border=3>
    <tr><td>会员名称:</td>
        <td><jsp:getProperty name="userBean"   property="logname"/></td>
    <tr><td>姓名：</td>
        <td><jsp:getProperty name="userBean"   property="realname"/></td>
    <tr><td>地址</td>
        <td><jsp:getProperty name="userBean"   property="address"/></td>
    <tr><td>电话</td>
        <td><jsp:getProperty name="userBean"   property="phone"/></td>        
</table>
</div>
</font>
</HTML>
