package com.rajesh;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContextServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		ServletContext con=getServletContext();
		res.setContentType("text/html");
		
		PrintWriter out=res.getWriter();
		out.println("Hi <br/>");
		
		String str=con.getInitParameter("name");
		out.println(str);
		
	}
}
