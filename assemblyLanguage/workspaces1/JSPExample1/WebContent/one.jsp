<%@page contentType="text/html;charset=gb2312"%>
<head>
<jsp:include page="head1.txt" /></head>
<HTML>
<body bgcolor=cyan>
	<form action="" method=post name=form>
		<br>请输入一个数字：<input type=text name=num> <input type=submit
			value=提交 name=submit>
	</form>
	<%
		String a = request.getParameter("num");
		if (a == null)
			a = "0";
		try {
			int n = Integer.parseInt(a);
			if (n > 0 && n < 50) {
	%>
	<jsp:forward page="two.jsp">
		<jsp:param name="mess" value=<%=n%> />
	</jsp:forward>
	<%
		} else if (n >= 50 && n < 100) {
	%>
	<jsp:forward page="three.jsp">
		<jsp:param name=c value=<%=n%> />
	</jsp:forward>
	<%
		} else if (n >= 100) {
	%>
	<jsp:forward page="error.jsp">
		<jsp:param name=e value=<%=n%> />
	</jsp:forward>
	<%
		}
		} catch (Exception e) {
	%>
	<jsp:forward page="error.jsp">
		<jsp:param name=d value=<%=e.toString()%> />
	</jsp:forward>
	<%
		}
	%>
	</body></HTML>