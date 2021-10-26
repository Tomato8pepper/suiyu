<%@page contentType="text/html;charset=GB2312"%>
<HTML>
<BODY bgcolor=green>
<font size=3>
<br>с╒ндвжд╦╠Мё╨<br>
      <% char c='A';
         for(c='A';c<='Z';c++){
            out.print(" "+c);
            if(c=='M')
               out.print("<br>");
         }
       %>
</font></BODY></HTML>