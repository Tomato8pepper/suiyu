<%@page contentType="text/html;charset=gb2312"%>
<HTML><BODY>
  <%! int count=0;
      synchronized void setCount(){
        count++;
      }
  %>
  <% setCount();
     out.println("���ǵ�"+count+"�����ʱ�վ���û�");
  %>
</BODY></HTML>