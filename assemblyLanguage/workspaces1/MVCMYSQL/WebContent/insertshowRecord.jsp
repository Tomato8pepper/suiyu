<%@page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="mingguo"
       class="mybean.data.Mingguo" scope="request"/>
<HTML><body bgcolor=green><font size=2>
     <table border=1>
<% String []columnName=mingguo.getColumnName();
%>
        <tr>
<%  for(String s:columnName){
     %> <th><%=s%></th>
     <%  }
%></th>
<% String [][]record=mingguo.getTableRecord();
        for(int i=0;i<record.length; i++){
      %> <tr>
   <%       for(int j=0;j<record[i].length;j++){
         %>      <td><%=record[i][j]%></td>
         <% }
   %></tr>
      <% }
%>
</table>
</font></body></HTML>