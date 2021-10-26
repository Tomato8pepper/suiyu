<%@page contentType="text/html;charset=gb2312"%>
<head><font color=blue size=8 face="楷体"><center>小碎雨的小屋</center></font></head>
<HTML><body background=image/2.jpg>
<bgsound src="sound/1.mp3" loop="1"></bgsound><!--embed-->
<font color=yellow size=5>
<br><table  align="center" cellSpacing="6" cellPadding="60">
      <tr  width="25%">
         <th><a href=fruit.jsp ><font size=5 color=green>赣湘橘橙</font></a></th>
         <td><a href=lushan.jsp ><font size=5 color=green>庐山风景区</font></a></td>
         <td><a href=xiufeng.jsp ><font size=5 color=green>秀峰景区</font></a></td>
         <th><a href=guanyinqiao.jsp ><font size=5 color=green>观音桥景区</font></a></th>
      </tr>
    </table>
<form action="" method=post >
    <br>水果:<input type=text name="n">
    <br>甜点:<input type=text name="m">
    <br><input type=submit value="提交" name=submit> 
</form>
<%   double sum=0.0;
    try{
     request.setCharacterEncoding("iso-8859-1");   
     double a=Double.parseDouble(request.getParameter("n"));
     double b=Double.parseDouble(request.getParameter("m"));    
     sum=a+b;
    }
    catch(Exception e){out.print("请输入数字");}
%>
<br><H2>总共的价格是：<%=sum%>
</font></body></HTML>
