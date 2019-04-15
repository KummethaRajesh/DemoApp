package com.rajesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class SquareServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		PrintWriter out=res.getWriter();
		out.print("Correct Password");
		
		out.close();
	}
}
