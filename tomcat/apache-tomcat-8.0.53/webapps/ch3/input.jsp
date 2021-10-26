<%@page contentType="text/html;charset=gb2312"%>
<HTML><body bgcolor=yellow>
   <form action="result.jsp" method=post name=form>
   <br>请输入计算：
        <input type=text name="n1" name=form>
        <!--size 变滚轮-->
        <select name="oper" >
           <Option value="+">加
           <Option value="-">减
           <Option value="*">加
           <Option value="/">减
        </select>
        <input type=text name="n2" name=form>
        <br><input type=submit value="提交">
   </form>
</font></body></HTML>
           