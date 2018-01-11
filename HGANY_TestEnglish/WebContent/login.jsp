<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Login | Test English | HGANY</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/login.js"></script>
</head>
<body>
	<div class="bg__page" id="page">
		<div class="login">
			<h1>Test English</h1>
			
			<div class="login__form">
				<span id="notice"></span>
				<form id="FormLogin" name="login-form" action="/HGANY_TestEnglish/s.login" method="post" style="">
					<%
						String error = (String)request.getAttribute("error");
						if (error != null)
							out.println("<p>" + error + "</p>");
					%>
					<div class="login__form--input">
						<label for="indentify">Tài khoản</label>
						<input type="text" name="email" id="identify" placeholder="Nhập email/tên đăng nhập của bạn" value="">
					</div>
					<div class="login__form--input">
						<label for="password">Mật khẩu</label>
						<input type="password" name="password" id="password" placeholder="Mật khẩu của bạn" value="">
					</div>
					<div class="login__form--redirect">
						<div class="checkbox">
							<label for="remember_me">
								Ghi nhớ đăng nhập
								<input type="checkbox" name="remembeMe" id="remember_me">
								<span class="checkmark"></span>
							</label>
						</div>
						<a href="#Formrecovery" class="recovery changeform" onclick="forgotPassword();">Quên mật khẩu?</a>
					</div>
					<div class="login__form--action">
						<button type="submit" class="btn-submit" onclick="signup();" id="btnSignup">Đăng nhập</button>
					</div>
				</form>
				<form action="" name="recorvery-form" id="FormRecovery">
					<div class="login__form--input">
						<label for="indentify">Tài khoản</label>
						<input type="text" name="identify" id="identify" placeholder="Nhập email của bạn" value="">
					</div>
					<div class="login__form--redirect">
						<a href="#Formrecovery" class="recovery changeform" onclick="returnSignup();">Đăng nhập</a>
					</div>
					<div class="login__form--action">
						<button type="submit" class="btn-submit" onclick="" id="btnSignup">Gửi</button>
					</div>
					
				</form>
			</div>
			<div class="login__partner">
				<div class="login__partner--title">
					<span>Hoặc đăng nhập qua đối tác</span>
				</div>
				<div class="login__partner--list">
					<a href="#" title="Đăng nhập qua Facebook">
						<img src="css/images/icon-facebook.png" alt="Đăng nhập qua Facebook">
					</a>
					<a href="#" title="Đăng nhập qua Google+">
						<img src="css/images/icon-google-plus.png" alt="Đăng nhập qua Google+">
					</a>
				</div>
			</div>
			<div class="login__register">
				Bạn chưa có tài khoản?
				<a href="/HGANY_TestEnglish/signup.jsp" class="btn-signin">Đăng ký</a>
			</div>
		</div>
	</div>
</body>
</html>