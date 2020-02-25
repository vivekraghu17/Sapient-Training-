package com.company;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() {
		System.out.println("Hi, I'm in init()");
	}
	
	public void destroy() {
		System.out.println("Hi, I'm in destroy()");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>Welcome to Servlets</title></head>");
		out.println("<body><h2>First program with servlets</h2></body>");
		out.println("</html>");
	}

}
