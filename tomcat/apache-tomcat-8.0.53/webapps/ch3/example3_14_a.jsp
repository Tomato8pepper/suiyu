<%@ page contentType="text/html;charset=gb2312"%>
<HTML><body  bgcolor=cyan>
     您好！帅哥，这里是example3-14-A.jsp的界面<br>请您输入您的姓名连接到example3-14-B.jsp的界面
  <% String id=session.getId();
     out.println("<br>您的session对象的ID是：<br>"+id);
  %>
 <form action="example3_14_b.jsp" method=post name=form>
     <input type="text" name="boy">
     <input type="submit" valut="送出" name="submit">
 </form>
</body></HTML> 