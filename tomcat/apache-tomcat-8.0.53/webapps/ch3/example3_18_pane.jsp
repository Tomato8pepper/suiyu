<%@page contentType="text/html;charset=gb2312"%>
<%@page import="java.util.*"%>
<HTML><body>
<%!  Vector v=new Vector();
     int i=0;
     ServletContext application;
     synchronized void leaveWord(String s){
       application=getServletContext();;
       i++;
       v.add("No."+i+","+s);
       application.setAttribute("Mess",v);
     }
%>
<%   String name=request.getParameter("peopleName");
     String title=request.getParameter("Title");
     String messages=request.getParameter("messages");
        if(name==null)
          name="guest"+(int)(Math.random()*10000);
        if(messages==null)
          messages="无信息";
        if(title==null)
          title="无标题";
        String s=name+"#"+title+"#"+messages;
        leaveWord(s);
        out.print("您的信息已经提交！");
%>
<a href="example3_18_input.jsp">返回留言页面
</body></HTML>