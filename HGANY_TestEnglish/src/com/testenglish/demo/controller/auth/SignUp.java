package com.testenglish.demo.controller.auth;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testenglish.demo.model.auth.SignUpValidator;
import com.testenglish.demo.model.user.User;
import com.testenglish.demo.model.user.UsersManager;
import com.testenglish.demo.util.Conventions;
import com.testenglish.demo.util.UIStrings.AuthUIStrings;

public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SignUpValidator validator;
	private UsersManager usersManager;
	
    public SignUp() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		validator = new SignUpValidator();
		usersManager = new UsersManager();
	}

	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	
    	String email = request.getParameter("email");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String birthDay = request.getParameter("birthDay");
		String birthMonth = request.getParameter("birthMonth");
		String birthYear = request.getParameter("birthYear");
		String dateOfBirth = birthDay + "/" + birthMonth + "/" + birthYear;
		
		if (validator.isEmailValid(email)) {
			User user = new User(email, password, name, gender, dateOfBirth);
			usersManager.saveUserToDB(user);
			
			HttpSession httpSession = request.getSession();
    		httpSession.setAttribute("user", user);
    		
    		response.sendRedirect(Conventions.URL_INDEX);
		}
		else {
			request.setAttribute("error", AuthUIStrings.ERROR_EMAIL_EXISTS);
			
			RequestDispatcher signUp = request.getRequestDispatcher(Conventions.URL_SIGN_UP);
			signUp.forward(request, response);
		}
		
	}

}