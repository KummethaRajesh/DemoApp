package com.rajesh;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Newly")
public class Newly extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		
		PrintWriter out=res.getWriter();
		Enumeration<String> enume=req.getAttributeNames();
		
		while(enume.hasMoreElements()) {
			String val=(String)enume.nextElement();
			out.println(val+"<br/>");
			
		}
	}
}
