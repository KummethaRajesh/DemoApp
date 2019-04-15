package com.rajesh;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class HttpSessions extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		HttpSession session=req.getSession();
		String pass=(String) session.getAttribute("pass");
		
		PrintWriter out=res.getWriter();
		out.println(pass);
		
	}
}
