<%@page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="dengcha" class="mybean.data.Dengcha" scope="request"/>
<HTML><body bgcolor=#FFBBFF>
<font size=2>
<table border=1>
     <tr>
       <th>���е�����</th>
       <th>����</th>
       <th>��������</th>
       <th>������</th>
     </tr>
       <td><jsp:getProperty name="dengcha" property="firstItem"/></td>
       <td><jsp:getProperty name="dengcha" property="var"/></td>
       <td><jsp:getProperty name="dengcha" property="number"/></td>
       <td><jsp:getProperty name="dengcha" property="sum"/></td>
     </tr>
     </table>
</font></body></HTML>