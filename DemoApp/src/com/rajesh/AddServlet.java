package com.rajesh;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		String pass=req.getParameter("pass");
		
		PrintWriter out=res.getWriter();
//		
//		if(pass.equals("rajesh")) {
//			RequestDispatcher rd=req.getRequestDispatcher("square");
//			rd.forward(req, res);
//		}
//		else {
//			out.println("Wrong password!");
//		}
//		
//		out.close();
//		
//		System.out.println(Thread.currentThread().getName());
		
//		HttpSession session=req.getSession();
//		session.setAttribute("pass", pass);
		
//		Cookie cookie=new Cookie("pass",pass); 
//		res.addCookie(cookie);
//		
//		res.sendRedirect("cook");
		
		
		out.print(req.getParameter("name"));
		out.print(req.getAttributeNames());
		
	}
	
}
