<%@ page contentType="text/html;charset=gb2312"%>
<HTML><body  bgcolor=cyan>
     ���ã�˧�磬������example3-14-A.jsp�Ľ���<br>�������������������ӵ�example3-14-B.jsp�Ľ���
  <% String id=session.getId();
     out.println("<br>����session�����ID�ǣ�<br>"+id);
  %>
 <form action="example3_14_b.jsp" method=post name=form>
     <input type="text" name="boy">
     <input type="submit" valut="�ͳ�" name="submit">
 </form>
</body></HTML> 