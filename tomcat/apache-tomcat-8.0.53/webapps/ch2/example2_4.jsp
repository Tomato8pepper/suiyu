<%@page contentType="text/html;charset=gb2312"%>
<HTML><BODY>
  <%! int count=0;
      synchronized void setCount(){
        count++;
      }
  %>
  <% setCount();
     out.println("您是第"+count+"个访问本站的用户");
  %>
</BODY></HTML>