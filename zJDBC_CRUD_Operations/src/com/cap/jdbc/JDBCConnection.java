package com.cap.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {
	public static void main(String[] args) throws SQLException 
	{
		Connection conn = null;
		Statement stmt = null;

		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
			// System.out.println("Class");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Class Not Found");
		}
		
		

		try 
		{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Capgemini123");
			stmt = conn.createStatement();
			
			/*-------------------------DROP TABLE-------------------------
			 	String dropTable="drop table studentz";
				stmt.executeUpdate(dropTable);
				System.out.println("Table Dropped");
			 */
			
			/* -------------------------CREATE TABLE-------------------------
			 	String sql = "create table Studentz(id int not null,name varchar2(20),course varchar2(20))";
				stmt.executeUpdate(sql);
				System.out.println("Table Created");
			 */
			
			/*-------------------------INSERT DATA-------------------------
			 	String insert="insert into Studentz values(1001, 'Suraj', 'B.Tech')";
				stmt.executeQuery(insert);
				insert="insert into Studentz values(1002, 'Sushil', 'B.Tech')";
				stmt.executeQuery(insert);
				insert="insert into Studentz values(1003, 'Deep', 'B.Com')";
				stmt.executeQuery(insert);
				insert="insert into Studentz values(1004, 'Vansh', 'BBA')";
				stmt.executeQuery(insert);
				insert="insert into Studentz values(1005, 'Chirag', 'B.Tech')";
				stmt.executeQuery(insert);
				System.out.println("Values inserted successfully");
			 */
			
			/*-------------------------RETRIEVING DATA-------------------------
			  	ResultSet rs = stmt.executeQuery("select * from Studentz");
			 	while (rs.next()) 
			 	{
			 	System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +rs.getString(3));
			 	}
			 	System.out.println("Values Retrieved");
			*/
			
			
			/*-------------------------DELETING DATA-------------------------
			 	String delete=("delete from Studentz where name='Deep'");
				stmt.executeQuery(delete);
				System.out.println("----Row deleted----");
			
				ResultSet rs=stmt.executeQuery("select * from Studentz");
				while(rs.next())
				{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}			 
			*/
			
			
			/*-------------------------UPDATE DATA-------------------------
		 		String update="update Studentz set course='B.Tech' where id=1005";
				stmt.executeUpdate(update);
			
				String retrieve=("select * from Studentz");
				ResultSet rs=stmt.executeQuery(retrieve);
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
			*/			
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
	}
}
