package com.rajesh;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.annotation.WebServlet;

@WebServlet("/multi")
public class MultipleServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String[] names=req.getParameterValues("name");
		
		Enumeration<String> keys=req.getParameterNames();
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		out.print("The values are<br/>");
		
		for(String str:names)
			out.print(str+"<br/>");
		
		out.print("The keys are<br/>");
		
		while(keys.hasMoreElements()) {
			String val=(String)keys.nextElement();
			out.println(val+"<br/>");
			
		}
		
		Enumeration<String> key=req.getAttributeNames();
		out.println("test");
		while(key.hasMoreElements()) {
			String val=(String)key.nextElement();
			out.println(val+"<br/>");
			
		}
		
		RequestDispatcher rd=req.getRequestDispatcher("/Newly");
		req.setAttribute("hi", "hi");
		rd.forward(req, res);
		
		out.close();
			
		
	}
}
