<%@page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="mingguo" class="mybean.data.Tixing" scope="request"/>
<html><body bgcolor=cyan background="image/5.jpg"><font size=4 color=blue face="����">
      <form action="" method=post>
          <font color=red>����ǰ��˼���������ֵ�Ƿ����:<br></font>
          <br>���������ε��ϵ�:<input type=text name="a">
          <br>���������ε��µ�:<input type=text name="b">
          <br>���������ε�����:<input type=text name="h">
          <br><input type=submit value="�ύ" name=submit>
      </form>
      <jsp:setProperty name="mingguo" property="*"/>
      <br> ���ε��ϵ���:<jsp:getProperty name="mingguo" property="a"/>
      <br> ���ε��µ���:<jsp:getProperty name="mingguo" property="b"/>
      <br> ���ε�������:<jsp:getProperty name="mingguo" property="h"/>
      <br> ������õ��������:<jsp:getProperty name="mingguo" property="area"/>
</font></body></html>