<%@page contentType="text/html;charset=gb2312"%>
<head><font color=blue size=8 face="����"><center>С�����С��</center></font></head>
<HTML><body background=image/2.jpg>
<bgsound src="sound/1.mp3" loop="1"></bgsound><!--embed-->
<font color=yellow size=5>
<br><table  align="center" cellSpacing="6" cellPadding="60">
      <tr  width="25%">
         <th><a href=fruit.jsp ><font size=5 color=green>�����ٳ�</font></a></th>
         <td><a href=lushan.jsp ><font size=5 color=green>®ɽ�羰��</font></a></td>
         <td><a href=xiufeng.jsp ><font size=5 color=green>��徰��</font></a></td>
         <th><a href=guanyinqiao.jsp ><font size=5 color=green>�����ž���</font></a></th>
      </tr>
    </table>
<form action="" method=post >
    <br>ˮ��:<input type=text name="n">
    <br>���:<input type=text name="m">
    <br><input type=submit value="�ύ" name=submit> 
</form>
<%   double sum=0.0;
    try{
     request.setCharacterEncoding("iso-8859-1");   
     double a=Double.parseDouble(request.getParameter("n"));
     double b=Double.parseDouble(request.getParameter("m"));    
     sum=a+b;
    }
    catch(Exception e){out.print("����������");}
%>
<br><H2>�ܹ��ļ۸��ǣ�<%=sum%>
</font></body></HTML>
