<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<%@ page import="com.testenglish.demo.model.user.User"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Test English | HGANY</title>
</head>
<body>
	<h1>Test English | HGANY</h1>
	<%
		HttpSession httpSession = request.getSession();
		User user = (User)httpSession.getAttribute("user");
		
		if (user != null) {
			String userName = user.getName();
			out.println(userName + " | <a href=\"/HGANY_TestEnglish/s.logout\">Logout</a>");
		}
		else {
			out.println("<a href=\"/HGANY_TestEnglish/login.jsp\">Login</a> | <a href=\"/HGANY_TestEnglish/signup.jsp\">Sign up</a>");
		}
	%>
</body>
</html>