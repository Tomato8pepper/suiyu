<%@page contentType="text/html;charset=gb2312"%>
<html><body bgcolor=green>
<%
       String n1=request.getParameter("n1");
       String n2=request.getParameter("n2");
       String oper=request.getParameter("oper");
       if(n1==null){
          n1="0";
       }
       if(n2==null){
          n2="0";
       }
       try{
                double a=Double.parseDouble(n1);
                double b=Double.parseDouble(n2);
                double r=0;
                if(oper.equals("+"))
                     r=a+b;
                else if(oper.equals("-"))
                     r=a-b;
                else if(oper.equals("*"))
                     r=a*b;                
                else if(oper.equals("/"))
                     r=a/b;
                out.println(a+""+oper+b+"="+r);
       }
       catch(Exception e){
               out.println("ÇëÊäÈëÊý×Ö");
       }
%>
</body></html>
                