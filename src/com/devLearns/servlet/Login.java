package com.devLearns.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		String authData = "Admin-admin,Root-root,AD123=ad123";
		String data[] = authData.split(",");
		
		
		
		
		String userId = req.getParameter("UserId");
		String pass =  req.getParameter("password");
		
		for (String data1 : data) {
			String userdata[] = data1.split("-");
			if (userId.equals(userdata[0]) && pass.equals(userdata[1])) {
				
				out.print("User found");
				break;
				
			}
			out.print("not found");
		}
		
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
