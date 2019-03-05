<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@page language="java"%>
	<%
		String val1 = request.getParameter("num1");
		String val2 = request.getParameter("num2");

		int v1 = Integer.parseInt(val1);
		int v2 = Integer.parseInt(val2);
		String oper = request.getParameter("operation");

		if (oper.equals("add")) {
			int result = v1 + v2;

			out.println("Result is: " + result);
		}
		if (oper.equals("subtract")) {
			int result = v1 - v2;
			out.println("Result is: " + result);
		}
		if (oper.equals("multiply")) {
			int result = v1 * v2;
			out.println("Result is: " + result);
		}
		if (oper.equals("division")) {
			int result = v1 / v2;
			out.println("Result is: " + result);
		}
	%>


</body>
</html>