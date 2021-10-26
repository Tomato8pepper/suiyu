<%@ page contentType="text/html;charset=gb2312"%>
<%@ page import="java.util.*"%>
<MHTL><body bgcolor=cyan><font size=2>
     <% String path=request.getServletPath();
        String webDir=request.getContextPath();
        webDir=webDir.substring(1);
        String clientIP=request.getRemoteAddr();
        int serverPort=request.getServerPort();
      %>
    用户请求的页面：<%=path%>
    <br>Web服务目录的名字：<%=webDir%>
    <br>用户的ip地址：<%=clientIP%>
    <br>服务器的端口号：<%=serverPort%>
</font></body></HTML>