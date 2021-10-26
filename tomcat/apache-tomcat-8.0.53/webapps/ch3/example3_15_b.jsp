<%@page contentType="text/html;charset=gb2312"%>
<head>明远书城
      <br>输入姓名：<a href="example3_15_a.jsp">确定姓名页面</a>
    <br>选择图书：<a href="example3_15_b.jsp">选择图书页面</a>
    <br>结账：<a href="example3_15_c.jsp">结账页面</a>
</head>
<HTML><body bgcolor=cyan><font size=4>
  <p>选择购买的书籍：
      <form action="" method=post name=form>
        <input type="checkbox" name="choice" value="Java教程32.5元">Java教程32.5元
        <input type="checkbox" name="choice" value="数据库原理23元">数据库原理23元
        <br><input type="checkbox" name="choice" value="操作系统35元">操作系统35元
        <input type="checkbox" name="choice" value="c语言教程28.6元">c语言教程28.6元
        <br><input type="submit" value="提交" name=submit>
      </form>
      <%  String book[]=request.getParameterValues("choice");
          if(book!=null){
            StringBuffer str=new StringBuffer();
            for(int k=0;k<book.length;k++){
               str.append(book[k]+"<br>");
             }
             session.setAttribute("book",str);
          }
%>
</font></body></HTML>