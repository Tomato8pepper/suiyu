<%@ page contentType="text/html;charset=gb2312"%>
<%@ page import="java.util.*"%>
<MHTL><body bgcolor=cyan><font size=2>
     <% String path=request.getServletPath();
        String webDir=request.getContextPath();
        webDir=webDir.substring(1);
        String clientIP=request.getRemoteAddr();
        int serverPort=request.getServerPort();
      %>
    �û������ҳ�棺<%=path%>
    <br>Web����Ŀ¼�����֣�<%=webDir%>
    <br>�û���ip��ַ��<%=clientIP%>
    <br>�������Ķ˿ںţ�<%=serverPort%>
</font></body></HTML>