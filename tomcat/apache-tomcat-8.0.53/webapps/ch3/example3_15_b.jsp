<%@page contentType="text/html;charset=gb2312"%>
<head>��Զ���
      <br>����������<a href="example3_15_a.jsp">ȷ������ҳ��</a>
    <br>ѡ��ͼ�飺<a href="example3_15_b.jsp">ѡ��ͼ��ҳ��</a>
    <br>���ˣ�<a href="example3_15_c.jsp">����ҳ��</a>
</head>
<HTML><body bgcolor=cyan><font size=4>
  <p>ѡ������鼮��
      <form action="" method=post name=form>
        <input type="checkbox" name="choice" value="Java�̳�32.5Ԫ">Java�̳�32.5Ԫ
        <input type="checkbox" name="choice" value="���ݿ�ԭ��23Ԫ">���ݿ�ԭ��23Ԫ
        <br><input type="checkbox" name="choice" value="����ϵͳ35Ԫ">����ϵͳ35Ԫ
        <input type="checkbox" name="choice" value="c���Խ̳�28.6Ԫ">c���Խ̳�28.6Ԫ
        <br><input type="submit" value="�ύ" name=submit>
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