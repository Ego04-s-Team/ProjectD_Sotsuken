package com.ProjectD.demo.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/TopPage")
public class IndexServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		//response.setContentType("");
		//response.getWriter().write("");
		RequestDispatcher dispacher = request.getRequestDispatcher("/index.html");
		dispacher.forward(request, response);
	}
	
}
