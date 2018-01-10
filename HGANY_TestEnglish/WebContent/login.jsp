<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login | Test English | HGANY</title>
</head>
<body>
	<h1>Login | Test English | HGANY</h1>
	<form method="post" action="/HGANY_TestEnglish/s.login">
	<div>
		<%
			String error = (String)request.getAttribute("error");
			if (error != null)
				out.println("<p>" + error + "</p>");
		%>
		Email*: <input type="text" name="email"><br>
		Password*: <input type="password" name="password"><br>
		<input type="submit" value="Login">
	</div>
	</form>
	<a href="/HGANY_TestEnglish">Home</a> | <a href="/HGANY_TestEnglish/signup.jsp">Sign Up</a>
</body>
</html>