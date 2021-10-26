<%@page contentType="text/html;charset=gb2312"%>
<html><body background="image/5.jpg"><font size=5 color=blue face="楷体">
<form action="minglong?dataBase=warehouse&tableName=product" method="post">
添加新纪录:<br>
<table border=1>
<tr><td>产品号:</td><td><input type="text" name="number"></td></tr>
<tr><td>产品名称:</td><td><input type="text" name="name"></td></tr>
<tr><td>产品生产日期:</td><td><input type="text" name="madeTime"></td></tr>
<tr><td>产品价格:</td><td><input type="text" name="price"></td></tr>
</table>
<input type=submit name="提交" name="提交">
</form>
</font></body></html>