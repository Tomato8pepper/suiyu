<%@page contentType="text/html; charset=gb2312"%><!--jsp指令标记-->
<%@page import="java.util.Date"%><!--jsp指令标记-->
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
<font size=4 color=white><p>程序片创建Data对象:
<% date=new Date();  
   out.println("<BR>"+date);
   int start=1;
   int end=100;
   int sum=continueSum(start,end);
%>
<br>从<%=start%>至<%=end%>的连续和是:<%=sum%>
</font></body></HTML>

