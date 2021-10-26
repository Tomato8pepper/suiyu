<%@ page contentType="text/html;charset=gb2312"%>
<%@ page import="java.util.*" %>
<HTML><body bgcolor=#EEEEFF><font size=3 color=green >
<p>现在的时间是：<br>
<% out.println(""+new Date());
   response.setHeader("Refresh","3");
 %>
</body></HTML>