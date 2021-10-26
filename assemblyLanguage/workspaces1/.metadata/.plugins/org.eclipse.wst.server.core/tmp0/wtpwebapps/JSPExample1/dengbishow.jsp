<%@page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="dengbi" class="mybean.data.Dengbi" scope="request"/>
<HTML><body bgcolor=#FFBBFF>
<font size=2>
<table border=1>
     <tr>
       <th>数列的首项</th>
       <th>公比</th>
       <th>所求项数</th>
       <th>所求结果</th>
     </tr>
       <td><jsp:getProperty name="dengbi" property="firstItem"/></td>
       <td><jsp:getProperty name="dengbi" property="var"/></td>
       <td><jsp:getProperty name="dengbi" property="number"/></td>
       <td><jsp:getProperty name="dengbi" property="sum"/></td>
     </tr>
     </table>
</font></body></HTML>