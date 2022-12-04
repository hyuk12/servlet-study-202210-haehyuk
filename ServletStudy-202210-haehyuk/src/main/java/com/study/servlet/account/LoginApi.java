package com.study.servlet.account;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.util.DTO;

/**
 * Servlet implementation class LoginService
 */
@WebServlet("/auth/login")
public class LoginApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		System.out.println(DTO.getParams(request));
		
//		
//		response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/plain; charset=utf-8");
//        response.getWriter().print("\n username: " + username 
//        		+"\n password: " + password
//        		);
	}

}
