<%@page contentType="text/html;charset=gb2312"%>
<HTML><body bgcolor=pink><font Size=2>
<jsp:useBean id="iPhone" class="tom.jiafei.Goods" scope="request"/>
       <form action="" Method="post">
         �ֻ����ƣ�<input type="text" name="name">
         <br>�ֻ��۸�<input type="" name="price">
         <br><input type="submit" value="�ύ����ҳ��">
       </form>   
       <form action="example4_5_b.jsp" Method="post">
         �ֻ����ƣ�<input type="text" name="name">
         <br>�ֻ��۸�<input type="" name="price">
         <br><input type="submit" value="�ύ��example4_5_b.jspҳ��">
       </form>
       <jsp:setProperty name="iPhone"  property="name"  param="name"/>  
       <jsp:setProperty name="iPhone"  property="price"  param="price"/>  
       <br><b>���ƣ�<jsp:getProperty name="iPhone"  property="name"/>
       <br><b>�۸�<jsp:getProperty name="iPhone"  property="price"/>
</font></body></HTML>
