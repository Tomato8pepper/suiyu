<%@page contentType="text/html;charest=gb2312%>
<jsp:useBean id="equation" type="mybean.data.Example6_3_Bean" scope="request"/>
<HTML><body><font size=2>
      һԪ���η��̵�ϵ���ǣ�
      <br>������ϵ����<jsp:getProperty   name="equation" property="a"/>
          һ����ϵ����<jsp:getProperty   name="equation" property="b"/>
          �����<jsp:getProperty    name="equation"  property="c"/>
      <br>��һԪ���η�����<jsp:getProperty name="equation" property="isSquareEquation"/>
      <br>���̵��������ǣ�<jsp:getProperty name="equation" property="rootOne"/>
                          <jsp:getProperty name="equation" property="rootTwo"/>
</font></body></HTML>