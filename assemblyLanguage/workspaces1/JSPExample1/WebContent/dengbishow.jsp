<%@page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="dengbi" class="mybean.data.Dengbi" scope="request"/>
<HTML><body bgcolor=#FFBBFF>
<font size=2>
<table border=1>
     <tr>
       <th>���е�����</th>
       <th>����</th>
       <th>��������</th>
       <th>������</th>
     </tr>
       <td><jsp:getProperty name="dengbi" property="firstItem"/></td>
       <td><jsp:getProperty name="dengbi" property="var"/></td>
       <td><jsp:getProperty name="dengbi" property="number"/></td>
       <td><jsp:getProperty name="dengbi" property="sum"/></td>
     </tr>
     </table>
</font></body></HTML>