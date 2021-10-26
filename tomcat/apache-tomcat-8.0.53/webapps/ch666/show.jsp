<%@page contentType="text/html;charset=gb2312"%>
<html><body bgcolor=cyan><font size=5 face="¿¬Ìå" color=blue>
<%       String str=request.getParameter("ra");
         if(str==null||str.length()==0){
             return;
         }
         else if(str.equals("yes")){
             response.sendRedirect("pi.jsp");
         }
         else{
             response.sendRedirect("zhenpi.jsp");
         }
       %>

</font></body></html>