<%@ page contentType="text/html;charset=gb2312"%>
<HTML><body bgcolor=#DDEEFF><font size=3 color=green >
 <% String name=request.getParameter("name");
    if(name==null||name.length()==0){
        response.sendRedirect("example3_12.jsp");
    }
    byte [] b=name.getBytes("iso-8859-1");
    name=new String(b);
 %>
    <b>欢迎<%=name%>来到此界面。<br>
    <p>response重定向
</body></HTML>