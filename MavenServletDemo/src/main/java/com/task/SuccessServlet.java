package com.task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("Login is Success ");
		pw.println("We are successfully completed one more servlet");
		

	}
}
