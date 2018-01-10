package com.testenglish.demo.controller.auth;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testenglish.demo.model.auth.LoginValidator;
import com.testenglish.demo.model.user.User;
import com.testenglish.demo.model.user.UsersManager;
import com.testenglish.demo.util.Conventions;
import com.testenglish.demo.util.UIStrings.AuthUIStrings;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private LoginValidator validator;
	private UsersManager usersManager;
	
    public Login() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		validator = new LoginValidator();
		usersManager = new UsersManager();
	}

	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String email = request.getParameter("email");
    	String password = request.getParameter("password");
    	
    	if (validator.isValid(email, password)) {
    		User user = usersManager.getUserFromDB(email, password);
    		
    		HttpSession httpSession = request.getSession();
    		httpSession.setAttribute("user", user);
    		
    		response.sendRedirect(Conventions.URL_INDEX);
    	}
    	else {
    		request.setAttribute("error", AuthUIStrings.ERROR_EMAIL_PASSWORD_INCORRECT);
			
    		RequestDispatcher login = request.getRequestDispatcher(Conventions.URL_LOGIN);
			login.forward(request, response);
    	}
    	
	}

}