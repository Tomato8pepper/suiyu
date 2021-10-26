<%@page contentType="text/html;charest=gb2312%>
<jsp:useBean id="equation" type="mybean.data.Example6_3_Bean" scope="request"/>
<HTML><body><font size=2>
      一元二次方程的系数是：
      <br>二次项系数：<jsp:getProperty   name="equation" property="a"/>
          一次项系数：<jsp:getProperty   name="equation" property="b"/>
          常数项：<jsp:getProperty    name="equation"  property="c"/>
      <br>是一元二次方程吗：<jsp:getProperty name="equation" property="isSquareEquation"/>
      <br>方程的两个根是：<jsp:getProperty name="equation" property="rootOne"/>
                          <jsp:getProperty name="equation" property="rootTwo"/>
</font></body></HTML>