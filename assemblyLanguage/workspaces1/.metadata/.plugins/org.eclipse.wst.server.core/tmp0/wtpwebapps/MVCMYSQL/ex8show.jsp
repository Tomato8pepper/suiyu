<%@page contentType="text/html; charset=gb2312"%>
<jsp:useBean id="ruru" class=mybean.data.Ruru scope="session"/>
<html><body bgcolor=cyan ><center>
<br>当前显示的内容是:
<jsp:setProperty name="ruru" property="pageSize" param="pageSize"/>
<jsp:setProperty name="ruru" property="currentPage" param="currentPage"/>
<table border=1>
<%
String[][]table=ruru.getTableRecord();
if(table==null){
	out.print("没有记录");
	return;
}
String []columnName=ruru.getColumnName();
if(columnName!=null){
	out.print("<tr>");
	for(int i=0;i<columnName.length;i++){
		out.print("<th>"+columnName[i]+"</th>");
		
	}
	out.print("</tr>");
}
int totalRecord=table.length;
out.print("全部记录数"+totalRecord);
int pageSize=ruru.getPageSize();
int totalPages=ruru.getTotalPages();
if(totalRecord%pageSize==0)
	totalPages=totalRecord/pageSize;
else
	totalPages=totalRecord/pageSize+1;
ruru.setPageSize(pageSize);
ruru.setTotalPages(totalPages);
if(totalPages>=1){
	if(ruru.getCurrentPage()<1)
		ruru.setCurrentPage(ruru.getTotalPages());
	if(ruru.getCurrentPage()>ruru.getTotalPages());
		ruru.setCurrentPage(1);
	int index=(ruru.getCurrentPage()-1)*pageSize;
	int start=index;
	for(int i=index;i<pageSize+index;i++){
		if(i==totalRecord)
			break;
		out.print("</tr>");
		for(int j=0;j<columnName.length;j++){
			out.print("<td>"+table[i][j]+"</td>");
			
		}
		out.print("</tr>");
	}
}
%>
</table>
<br>每页最多显示<jsp:getProperty name="ruru" property="pageSize"/>条信息
<br>当前显示第<font color=blue>
<jsp:getProperty name="ruru" property="currentPage"/>
</font>页，共有
<font color=blue><jsp:getProperty name="ruru" property="totalPages"/>
</font>页.
<table> 
<tr><td><form action="" method="post">
     <input type=hidden name="currentPage" value="<%=ruru.getCurrentPage()-1%>">
     <input type=submit name="g" value="上一页"></form></td>
     <td>form action="" method="post">
     <input type=hidden name="currentPage" value="<%=ruru.getCurrentPage()+1%>">
     <input type=submit name="g" value="下一页"></form></td></tr>
<tr><td><form action="" method=post>
     每页显示<input type=text name="pageSize" value=1 size=3>
     条记录<input type=submit name="g" value="确定">
</form>
<td><form action="" method="post">
输入页码:<input type="text" name="currentPage" size=3>
<input type=submit name="g" value="提交"></form></td></table>
</center>
</body></html>