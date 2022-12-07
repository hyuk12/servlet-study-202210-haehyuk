package com.study.servlet.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.study.util.DTO;



@WebServlet("/api/ajax3")
public class Ajax3Api extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();		
		String jsonData = request.getParameter("jsonData");
		
		
		Map<String, Object> phoneMap = gson.fromJson(jsonData, Map.class);
//		List<String> phoneNumbers = new ArrayList<>();
//		
//		phoneMap.forEach((key, value) -> {
//			if(value.getClass() == String.class) {
//				phoneNumbers.add((String)value);
//			}
//		});
		
		response.setContentType("application/json; charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		
		
		StringBuilder sb = new StringBuilder();
		
		phoneMap.forEach((key, value) -> {
			sb.append(value);
			sb.append("-");
		});
		sb.delete(sb.length() - 1, sb.length());
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("responseData", sb.toString());
		
		out.print(jsonObject.toString());
	}

}
