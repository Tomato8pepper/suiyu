<%@page contentType="text/html;charset=gb2312"%>
<%@page import="tom.jiafei.Car"%>
<jsp:useBean id="c" class="tom.jiafei.Car1" scope="session"  />
<html><body bgcolor=yellow>
<font size=2>
      <form  action="" method="post">
          �����ƺ�:<input   type=text name="number">
          <br>��������:<input type=text name="name">
          <br>������������:<input type=text name="madeTime">
          <input type=submit value="�ύ" name="submit">
      </form>
      <a href="show.jsp">����show.jsp�쿴�й���Ϣ��<br>
<jsp:setProperty name="c" property="*"/>