package com.cap.listener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public MyListener() {

	}

	public void contextDestroyed(ServletContextEvent arg0) 
	{

	}

	public void contextInitialized(ServletContextEvent servlet) 
	{
		ServletContext context = servlet.getServletContext();
		try {
				String driverName = context.getInitParameter("driver-name");
				String url = context.getInitParameter("url");
				String user = context.getInitParameter("user");
				String password = context.getInitParameter("password");
				Class.forName(driverName);
				Connection con = DriverManager.getConnection(url, user, password);
				context.setAttribute("connection", con);
			} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}

	}

}
