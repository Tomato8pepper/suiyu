<%@page contentType="text/html;charset=gb2312"%>
<%@page import="tom.jiafei.Car"%>
<jsp:useBean id="c" class="tom.jiafei.Car" scope="request"  />
<html><body bgcolor=yellow>
<font size=2>
      <form  action="" method="post">
          �����ƺ�:<input   type=text name="number">
          <br>��������:<input type=text name="name">
          <br>������������:<input type=text name="madeTime">
          <input type=submit value="�ύ" name="submit">
      </form>
<jsp:setProperty name="c" property="*"/>
      <table border=1>
        <tr><th>�����ƺ�
            <th>��������
            <th>������������
        </tr>
        <tr>
            <td><jsp:getProperty name="c" property="number"/></td>
            <td><jsp:getProperty name="c" property="name"/></td>
            <td><jsp:getProperty name="c" property="madeTime"/></td>
        </tr>
</font></body></html>