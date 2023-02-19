package com.mq.cal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	String num1=req.getParameter("num1");
	String num2=req.getParameter("num1");
	String op=req.getParameter("op");
	int n1=Integer.parseInt(num1);
	int n2=Integer.parseInt(num2);
	if(op.equalsIgnoreCase("add"))
	{
		int value=n1+n2;
		 pw.println("<h1 style='color:green;'>Add Opretion value of:"+value+"</h1>");
		 pw.println("<h1 style='color:green;'><a href='index.html'>Calculator</a></h1>");
	}
	else if(op.equalsIgnoreCase("sub"))
	{
		int value=n1-n2;
		 pw.println("<h1 style='color:green;'>Sub Opretion value of:"+value+"</h1>");
		 pw.println("<h1 style='color:green;'><a href='index.html'>Calculator</a></h1>");
	}
	else if(op.equalsIgnoreCase("div"))
	{
		int value=n1/n2;
		 pw.println("<h1 style='color:green;'>Div Opretion value of:"+value+"</h1>");
		 pw.println("<h1 style='color:green;'><a href='index.html'>Calculator</a></h1>");
	}
	else if(op.equalsIgnoreCase("mul"))
	{
		int value=n1*n2;
		 pw.println("<h1 style='color:green;'>Mul Opretion value of:"+value+"</h1>");
		 pw.println("<h1 style='color:green;'><a href='index.html'>Calculator</a></h1>");
		 
	}
	else
	{
		
		 pw.println("<h1 style='color:red;'>No Opretion value of:</h1>");
		 pw.println("<h1 style='color:green;'><a href='index.html'>Calculator</a></h1>");
	}
}
}
