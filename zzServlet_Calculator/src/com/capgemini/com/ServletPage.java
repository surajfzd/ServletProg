package com.capgemini.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPage
 */
@WebServlet("/ServletPage")
public class ServletPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String val1=request.getParameter("num1");
		String val2=request.getParameter("num2");
		
		int v1=Integer.parseInt(val1);
		int v2=Integer.parseInt(val2);
		String oper=request.getParameter("operation");
		
		if(oper.equals("add"))
		{
			int result=v1+v2;
			
			out.println("Result is: "+ result);
		}
		if(oper.equals("subtract"))
		{
			int result=v1-v2;
			out.println("Result is: "+ result);
		}
		if(oper.equals("multiply"))
		{
			int result=v1*v2;
			out.println("Result is: "+ result);
		}
		if(oper.equals("division"))
		{
			int result=v1/v2;
			out.println("Result is: "+ result);
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
