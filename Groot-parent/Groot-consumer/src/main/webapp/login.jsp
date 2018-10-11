<%@ page language="java" contentType="text/html"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${msg }</br>
<% String appPath = request.getContextPath(); %>
	<form action="<%=appPath%>/user/login" method="post">	
		<input type="text" name="name">
		<br>
		<input type="text" name="password">	
		<input type="submit" value="登录">
	</form>
</body>
</html>