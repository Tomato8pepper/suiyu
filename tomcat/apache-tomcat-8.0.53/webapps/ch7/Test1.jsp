<%@page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="rumeng" class="mybean.data.Rumeng" scope="session"/>
<html><body bgcolor=yellow><font size=3>
<form action="mingguo" method=post>
     <b>���ݿ���:<input type="text" name="dataBase" size=22 value=warehouse>
     <br>���ݿ��:<input type="text" name="tableName" size=23 value=product>
     <br>�û�����:<input type="text" name="user" size=10 value=root>(Ĭ��root)   
     <br>�û�����:<input type="text" name="password" size=20 value=2798645458>
     <br><input type=submit value="�ύ" name="submit">
</form>
  <table border=1>
    <%
        String[][]table=rumeng.getTableRecord();
        if(table==null){
            out.print("û�м�¼");
            return;
        }
        String[] columnName=rumeng.getColumnName();
        if(columnName!=null){
            out.print("<tr>");
            for(int i=0;i<columnName.length;i++){
                out.print("<th>"+columnName[i]+"</th>");
            }
            out.print("</tr>");
        }
        out.println("ȫ����¼��"+table.length);
        for(int i=0;i<table.length;i++){
            out.print("<tr>");
            for(int j=0;j<columnName.length;j++){
                   out.print("<td>"+table[i][j]+"</td>");
            }
            out.print("</tr>");
        }
     %>
   </table>
</font></body></html>