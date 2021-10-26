<%@page contentType="text/html;charset=gb2312"%>
<%@page import="java.util.*"%>
<HTML><body bgcolor=pink><font Size=2>
<%  session.setMaxInactiveInterval(5);
    boolean boo=session.isNew();
    out.println("<br>如果你是第一次访问当前web服务目录，你的会话会是新的");
    out.println("<br>如果您不是第一次访问当前web服务目录的话，您的会话不是新的");
    out.println("<br>会话是新的吗？："+boo);
    out.println("<br>欢迎来到本页面，您的session允许的最长发呆时间为"+session.getMaxInactiveInterval()+"秒");
    out.println("<br>您的session的创建时间是"+new Date(session.getCreationTime()));
    out.println("<br>您的session的ID是"+session.getId());
    Long lastTime=(Long)session.getAttribute("lastTime");
    if(lastTime==null){
          long n=session.getLastAccessedTime();
          session.setAttribute("lastTime",new Long(n));
    }
    else{
          long m=session.getLastAccessedTime();
          long n=((Long)session.getAttribute("lastTime")).longValue();
          out.println("<br>您的发呆时间大约是"+(m-n)+"毫秒，大约"+(m-n)/1000+"秒");
          session.setAttribute("lastTime",new Long(m));
     }
%>
</body></HTML>