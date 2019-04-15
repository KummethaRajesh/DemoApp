package com.rajesh;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConfigServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		out.print("This is Servlet Config<br/>");
		
		ServletConfig config=getServletConfig();
		String str=config.getInitParameter("name");
		
		out.println("Hi "+str);
		
		
	}
}
