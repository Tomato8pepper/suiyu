<%@page contentType="text/html; charset=gb2312"%><!--jspָ����-->
<%@page import="java.util.Date"%><!--jspָ����-->
<%! Date date;
    public int continueSum(int start,int end){
      int sum=0;
      for(int i=start;i<=end;i++)
        sum=sum+i;
      return sum;
    }
%>
<HTML><title>example2_1.jsp</title>
 <body background="image/123.jpg">
<font size=4 color=white><p>����Ƭ����Data����:
<% date=new Date();  
   out.println("<BR>"+date);
   int start=1;
   int end=100;
   int sum=continueSum(start,end);
%>
<br>��<%=start%>��<%=end%>����������:<%=sum%>
</font></body></HTML>

