<%@page contentType="text/html;charset=gb2312"%>
<html><body><font size=4>
<form action="guanxin?dataBase=warehouse&tableName=product" method="post">
<b>添加新记录:<br></b>
产品号:<input type="text" name="number" >
<br>产品名:<input type="text" name="name"></b>
<br>生产日期(用-或/格式):
<br><input type="text" name="madeTime">
<br>产品价格:<input type="text" name="price">
<br><input type=submit value="提交">
</form>
</font></body></html>