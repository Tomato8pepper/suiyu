<%@page contentType="text/html;charset=gb2312"%>
<HTML><body bgcolor=#FFAAEE>
<%!double multi(double x,double y){
        return x*y;
   }
   double div(double x,double y){
        return x/y;
   }
%>
<%double x=3.56;
  double y=18;
  out.println("����multi��������"+x+"��"+y+"֮��;<br>");
  out.println(multi(x,y));
  out.println("<BR>����div���㷽��"+y+"����"+x+"����:<br>");
  String s=String.format("С���㱣����λ:%10.3f",div(y,x));
  out.println(s);
%>
</body></HTML>