<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
</head>
<body>		
	   <form action="<%= request.getContextPath() %>/loginServlet" method="post">
		username:<input type="text" name="username" /><br/>
		password:<input type="password" name="password" /><br/>
		<input type="submit" value="login" />
		<input type="reset" value="reset" />
</body>
</html>