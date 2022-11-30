package com.study.servlet.form;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormApi1
 */
@WebServlet("/api/form/1")
public class FormApi1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get 요청옴!!!");
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("phone"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("address"));
		System.out.println(request.getParameter("pw"));
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post 요청옴!!!");
		
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String pw = request.getParameter("pw");
		
		response.setCharacterEncoding("UTF-8");
        response.setContentType("text/plain; charset=utf-8");
        response.getWriter().print("\n name: " + name 
        		+"\n phone: " + phone
        		+"\n email: " + email
        		+"\n address: " + address
        		+"\n pw: " + pw);
        
		
	}

}
