package com.capg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo
 */
@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		String name = request.getParameter("num1");
		String name1 = request.getParameter("num2");
		
		int n1 = Integer.parseInt(name);
		int n2 = Integer.parseInt(name1);
		String op = request.getParameter("operation");
		if(op.equals("add"))
		{
			int result = n1+n2;
			PrintWriter out = response.getWriter();
			out.println("Result is " +result);
		}
		
		if(op.equals("subtract"))
		{

			int result = n1-n2;
			PrintWriter out = response.getWriter();
			out.println("Result is " +result);
				
		}
		
		if(op.equals("multiply"))
		{

			int result = n1*n2;
			PrintWriter out = response.getWriter();
			out.println("Result is " +result);
				
		}
		
		if(op.equals("division"))
		{

			int result = n1/n2;
			PrintWriter out = response.getWriter();
			out.println("Result is " +result);
			
				
		}
		
		
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
