package com.admin.hospital;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/patient_tracker")
	private DataSource dataSource;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Step 1 : set up the printWriter
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		
		//Step2: get a connection to the database
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
		myConn = dataSource.getConnection();
		
		//step 3: create a sql statement
		String sql = "select * from patient";
		myStmt = myConn.createStatement();
		
		//step 4: execute SQL query
		myRs = myStmt.executeQuery(sql);
		
		//step 5: process the result set
		while(myRs.next()) {
			String email = myRs.getString("email"); //gets email from sql
			out.println(email); //out.println prints it to the web browser
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
