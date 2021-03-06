<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Signup</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/login.js"></script>
</head>
<body>
	<div class="bg__page" id="page">
		<div class="register">
			<h1>Signup Form</h1>
			
			<div class="register__form">
				<span id="notice"></span>
				<form id="FormLogin" name="login-form" action="#" method="#" style="">
					<%
						String error = (String)request.getAttribute("error");
						if (error != null)
							out.println("<p>" + error + "</p>");
					%>
					<div class="register__form--input">
						<label for="name">Họ và tên</label>
						<input type="text" name="identify" id="name" placeholder="Nhập họ và tên của bạn" value="">
					</div>
					<div class="register__form--input">
						<label for="email">Email</label>
						<input type="password" name="email" id="email" placeholder="Nhập email của bạn" value="">
					</div>
					<div class="register__form--input">
						<label for="password">Mật khẩu</label>
						<input type="password" name="password" id="password" placeholder="Mật khẩu tối thiểu 6 ký tự" value="">
					</div>
					<div class="register__form--input">
						<label for="password">Nhập lại mật khẩu</label>
						<input type="password" name="password" id="password" placeholder="Mật khẩu tối thiểu 6 ký tự" value="">
					</div>

					<div class="register__form--gender">
						<label>Giới tính:</label>
						<select name="gender">
							<option value="Female">Nữ</option>
							<option value="Male">Nam</option>
						</select>
					</div>

					<div class="register__form--dateOfBirth">
						<label>Ngày tháng năm sinh:</label>
						<div>
							<select name="birthDay">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
								<option value="13">13</option>
								<option value="14">14</option>
								<option value="15">15</option>
								<option value="16">16</option>
								<option value="17">17</option>
								<option value="18">18</option>
								<option value="19">19</option>
								<option value="20">20</option>
								<option value="21">21</option>
								<option value="22">22</option>
								<option value="23">23</option>
								<option value="24">24</option>
								<option value="25">25</option>
								<option value="26">26</option>
								<option value="27">27</option>
								<option value="28">28</option>
								<option value="29">29</option>
								<option value="30">30</option>
								<option value="31">31</option>
							</select>
							<select name="birthMonth">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
							</select>
							<select name="birthYear">
								<option value="1970">1970</option>
								<option value="1971">1971</option>
								<option value="1972">1972</option>
								<option value="1973">1973</option>
								<option value="1974">1974</option>
								<option value="1975">1975</option>
								<option value="1976">1976</option>
								<option value="1977">1977</option>
								<option value="1978">1978</option>
								<option value="1979">1979</option>
								<option value="1980">1980</option>
								<option value="1981">1981</option>
								<option value="1982">1982</option>
								<option value="1983">1983</option>
								<option value="1984">1984</option>
								<option value="1985">1985</option>
								<option value="1986">1986</option>
								<option value="1987">1987</option>
								<option value="1988">1988</option>
								<option value="1989">1989</option>
								<option value="1990">1990</option>
								<option value="1991">1991</option>
								<option value="1992">1992</option>
								<option value="1993">1993</option>
								<option value="1994">1994</option>
								<option value="1995">1995</option>
								<option value="1996">1996</option>
								<option value="1997">1997</option>
								<option value="1998">1998</option>
								<option value="1999">1999</option>
								<option value="2000">2000</option>
								<option value="2001">2001</option>
								<option value="2002">2002</option>
								<option value="2003">2003</option>
								<option value="2004">2004</option>
								<option value="2005">2005</option>
								<option value="2006">2006</option>
								<option value="2007">2007</option>
								<option value="2008">2008</option>
								<option value="2009">2009</option>
								<option value="2010">2010</option>
								<option value="2011">2011</option>
								<option value="2012">2012</option>
								<option value="2013">2013</option>
								<option value="2014">2014</option>
								<option value="2015">2015</option>
								<option value="2016">2016</option>
								<option value="2017">2017</option>
								<option value="2018">2018</option>
							</select>
						</div>
					</div>
					
					<div class="register__form--action">
						<button type="submit" class="btn-submit" onclick="signup();" id="btnSignup">Đăng ký</button>
					</div>
				</form>
			</div>
			<div class="login__register">
				Bạn đã có tài khoản?
				<a href="/HGANY_TestEnglish/login.jsp" class="btn-signin">Đăng nhập</a>
			</div>
		</div>
	</div>
</body>
</html>