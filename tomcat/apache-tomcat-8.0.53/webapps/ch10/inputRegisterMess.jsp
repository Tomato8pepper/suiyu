<%@page contentType="text/html;charset=GB2312"%>
<jsp:useBean id="userBean" class="mybean.data.Register" scope="request"/>
<HEAD><%@include file="head.txt" %></HEAD>
<title>ע��ҳ��</title>
<HTML><body background=image/2.jpg><font size=2>
<div align="center">
<form action="registerServlet" method="post" name=form>
<table>
         �û��������֡���ĸ���»��߹���
         <tr>
             <td>*�û�����:</td>   <td><input type=text name="logname"></td>
             <td>*�û�����:</td>   <td><input type=password name="password"></td>
         </tr>
         <tr>
             <td>*�����ظ�:</td>
             <td><input type=password name="again_password"></td>
             <td>��ϵ�绰:</td><td><input type=text name="phone"></td>
         </tr> 
         <tr> 
             <td>�ʼĵ�ַ:</td><td><input type=text name="address"></td>
             <td>��ʵ����:</td><td><input type=text name="realname"></td> 
             <td><input type=submit name="g"  value="�ύ"></td> 
         </tr>   
</table></form></div>
<div align="center">
<p>ע�ᷴ��:
<jsp:getProperty name="userBean"   property="backNews"/>
<table border=3>
    <tr><td>��Ա����:</td>
        <td><jsp:getProperty name="userBean"   property="logname"/></td>
    <tr><td>������</td>
        <td><jsp:getProperty name="userBean"   property="realname"/></td>
    <tr><td>��ַ</td>
        <td><jsp:getProperty name="userBean"   property="address"/></td>
    <tr><td>�绰</td>
        <td><jsp:getProperty name="userBean"   property="phone"/></td>        
</table>
</div>
</font>
</HTML>
