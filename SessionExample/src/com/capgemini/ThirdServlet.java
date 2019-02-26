package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThirdServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession(false);
		String qual = request.getParameter("qual");
		session.setAttribute("Qualification", qual);
		pw.print("<html>");
		pw.print("<body>");
		pw.print("First Name:");
		pw.println(session.getAttribute("firstName"));
		pw.print("<br>");
		pw.print("Last Name:");
		pw.println(session.getAttribute("lastName"));
		pw.print("<br>");
		pw.print("Qualification:");
		pw.println(qual);
		pw.print("<br>");
		pw.print("<form action = FourthServlet>");
		pw.print("marks:");
		pw.print("<input type = number name = marks placeholder = marks>");
		pw.print("<input type = submit>");
		pw.print("</form>");
		pw.print("</body>");
		pw.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
