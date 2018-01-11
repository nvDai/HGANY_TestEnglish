window.onload = function() {
	var username = "";
	var password = "";
	var getFormRecovery = document.getElementById("FormRecovery");
	var getFormLogin = document.getElementById("FormLogin");

	getFormRecovery.style.setProperty("display", "none");

	function signup() {
	var getUsername = document.getElementById("identify");
	var getPassword = document.getElementById("password");	
	var getBtnSignup = document.getElementById("btnSignup");
	var getNotice = document.getElementById("notice");

	console.log("" + getUsername.value);
	console.log("" + getPassword.value);
	if (getUsername.value === "" || getPassword.value === "") {
		alert("Bạn phải nhập dữ liệu!");
		getNotice.innerHTML = "Thông tin tài khoản hoặc mật khẩu không hợp lệ.";
		getNotice.setAttribute("class", "notice");
	}
	}

	function forgotPassword() {
	var styleFormLogin = getFormLogin.style;
	styleFormLogin.setProperty("display", "none");
	getFormRecovery.style.removeProperty("display");
	}

	function returnSignup() {
	getFormRecovery.style.setProperty("display", "none");
	getFormLogin.style.removeProperty("display");
	}
}