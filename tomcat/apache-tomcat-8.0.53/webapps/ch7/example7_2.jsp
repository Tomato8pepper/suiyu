<%@page contentType="text/html;charset=gb2312"%>
<HTML><body bgcolor=cyan><font size=2>
<form action="queryByConditionServlet?dataBase=warehouse&tableName=product"method="get">
        查询 warehouse数据库product表中
        <br>price值大于<input type=text name="price" value=-1 size=6>的记录
        <br>输入用户名<input type=text name="user" value=root size=6>(默认root)
        <br>输入密码<input type="password"  name="password" value=2798645458 size=20>(默认2798645458)
       <br><input type="submit" name="sub" value="发送">
</form>
</font></body></HTML>
