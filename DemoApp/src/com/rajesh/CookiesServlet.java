package com.rajesh;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookiesServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		PrintWriter out=res.getWriter();
		Cookie cookie[]=req.getCookies();
		
		for(Cookie cook:cookie) {
			if(cook.getName().equals("pass")) {
				out.println(cook.getValue());
			}
		}
		
		out.close();
	}
}
