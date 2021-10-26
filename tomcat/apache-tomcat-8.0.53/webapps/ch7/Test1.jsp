<%@page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="rumeng" class="mybean.data.Rumeng" scope="session"/>
<html><body bgcolor=yellow><font size=3>
<form action="mingguo" method=post>
     <b>数据库名:<input type="text" name="dataBase" size=22 value=warehouse>
     <br>数据库表:<input type="text" name="tableName" size=23 value=product>
     <br>用户名称:<input type="text" name="user" size=10 value=root>(默认root)   
     <br>用户密码:<input type="text" name="password" size=20 value=2798645458>
     <br><input type=submit value="提交" name="submit">
</form>
  <table border=1>
    <%
        String[][]table=rumeng.getTableRecord();
        if(table==null){
            out.print("没有记录");
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
        out.println("全部记录数"+table.length);
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