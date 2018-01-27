package com.koti.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Simpleservlet")
public class Simpleservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Simpleservlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("hello from get method");
		PrintWriter writer=response.getWriter();
		
		writer.println("<h3>hello html</h3>");
	}

	

}
