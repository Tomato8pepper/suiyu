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
  out.println("调用multi方法计算"+x+"与"+y+"之积;<br>");
  out.println(multi(x,y));
  out.println("<BR>调用div计算方法"+y+"除以"+x+"的商:<br>");
  String s=String.format("小数点保留三位:%10.3f",div(y,x));
  out.println(s);
%>
</body></HTML>