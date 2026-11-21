package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		pw.write("<h1>Servlet 1</h1>");
		
		
		ServletContext cx = req.getServletContext();
		String url =  cx.getInitParameter("url");
		String driver = cx.getInitParameter("driver");
		pw.write("<h2>"+url+"</h2>");
		pw.write("<h2>"+driver+"</h2>");
		
		
		ServletConfig cf = getServletConfig();
		String path = cf.getInitParameter("path");
		pw.write("<h2>"+path+"</h2>");
		
	}
}
