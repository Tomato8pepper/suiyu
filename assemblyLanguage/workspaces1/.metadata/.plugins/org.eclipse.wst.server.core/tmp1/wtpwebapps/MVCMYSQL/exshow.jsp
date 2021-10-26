<%@page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="minglong" class="mybean.data.Minglong" scope="request"/>
<HTML><body bgcolor=green><font size=2>
     <table border=1>
<% String []columnName=minglong.getColumnName();
%>
        <tr>
<%  for(String s:columnName){
     %> <th><%=s%></th>
     <%  }
%></th>
<% String [][]record=minglong.getTableRecord();
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