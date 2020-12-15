package com.admin.hospital.dao;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.log.Log;

import javax.sql.DataSource;

import com.admin.hospital.domain.Db;
import com.admin.hospital.domain.Patient;

public class PatientDAO {

	private DataSource dataSource;
	
	public PatientDAO(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	public List<Patient> getPatients() throws Exception {
		
		List<Patient> patients = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
	try {
		//get a connection 
			myConn = dataSource.getConnection();
		
		//create sql statement
			String sql = "select * from patient order by id";
			
			myStmt = myConn.createStatement();
		
		//execute query
			myRs = myStmt.executeQuery(sql);
		
		//process result set
		while(myRs.next()) {	
			int id = myRs.getInt("id");
			String firstName = myRs.getString("first_name");
			String last_name = myRs.getString("last_name");
			String gender = myRs.getString("gender");
			int age = myRs.getInt("age");
			String email = myRs.getString("email");
			String phone_number = myRs.getString("phone_number");
			double height = myRs.getDouble("height");
			double weight = myRs.getDouble("weight");
			double temp = myRs.getDouble("temp");
			String bp = myRs.getString("bp");
			
			//create new patient object
			Patient tempPatient = new Patient(id, age,height,weight,temp,firstName,last_name,gender,email,phone_number,bp);
			
			patients.add(tempPatient);	
		}
		
		return patients;
	}
	finally {
			close(myConn,myStmt,myRs);		
	}
	}
	
	private void close(Connection myConn, Statement myStmt, ResultSet myRs) throws Exception {

			
			try{
				if(myConn!=null)
					myConn.close();
				if(myStmt!=null)
					myStmt.close();
				if(myRs!=null)
					myRs.close();	
			}
			catch(Exception ex){
				throw new Exception();
		}
		
	}

	public void registerPatient(Patient thePatient) throws Exception{
		
		Connection myConn= null;
		PreparedStatement myStmt= null;
		
		try {
            // Make the connection to the db.
            myConn = dataSource.getConnection(); 
            
            // Build string to represent prepared statement.
            String sql = "insert into patient" 
            		+ "(first_name,last_name,gender,age,email,phone_number,height,weight,temp,bp)"
            		+ "values(?,?,?,?,?,?,?,?,?,?)";
            
            myStmt = myConn.prepareStatement(sql);
            //param values are 1 based so they start at 1
            //SET PARAM VALUES FOR PATIENT
            //myStmt.setInt(1, thePatient.getID());
            myStmt.setString(1, thePatient.getFirst_name());
            myStmt.setString(2, thePatient.getLast_name());
            myStmt.setString(3, thePatient.getGender());
            myStmt.setInt(4,thePatient.getAge());
            myStmt.setString(5, thePatient.getEmail());
            myStmt.setString(6, thePatient.getPhone_number());
            myStmt.setDouble(7,thePatient.getHeight());
            myStmt.setDouble(8,thePatient.getWeight());
            myStmt.setDouble(9,thePatient.getTemp());
            myStmt.setString(10,thePatient.getBp());

           myStmt.execute();
		}
		catch(Exception e) {
			System.out.println("ERROR----> registerPatient()IS NOT WORKING");
		}
		finally {
			close(myConn,myStmt,null);
		}
	}
		

	public Patient getPatient(String thePatientId) throws Exception {
		
		Patient thePatient= null;
		
		Connection myConn= null;
		PreparedStatement myStmt= null;
		ResultSet myRs= null;
		int patientId;
		
		try {
			//convert patient id to int
			patientId = Integer.parseInt(thePatientId);
			
			System.err.println("WOOOORKS ++++++++++++++++++++++++++++++++++++++++ getPatient in DAO:::::" + patientId);
			
			//get connectiomn to db
			myConn = dataSource.getConnection();
			
			//create swl to get selected patient
			String sql="SELECT * FROM patient where id=?";
			
			//create preparedstatemt
			myStmt= myConn.prepareStatement(sql);			
			
			//set params
			myStmt.setInt(1, patientId);
			
			// execute statement
			myRs = myStmt.executeQuery();
			
			//retirve data from resultset row
			if(myRs.next()) {
				String firstName = myRs.getString("first_name"); 
				String last_name = myRs.getString("last_name");
				String gender = myRs.getString("gender");
				int age = myRs.getInt("age");
				String email = myRs.getString("email");
				String phone_number = myRs.getString("phone_number");
				double height = myRs.getDouble("height");
				double weight = myRs.getDouble("weight");
				double temp = myRs.getDouble("temp");
				String bp = myRs.getString("bp");
				
				System.err.println("teseting the retrive data:::" + firstName + "last: " + last_name);
				
			 thePatient = new Patient(patientId,age,height,weight,temp,firstName,last_name,gender,email,phone_number,bp);
			 
			 System.err.println("\nthe patient toString in getPatient().....");
			 thePatient.toString();
			 System.err.println("....+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++>>>>>>\n");
			 
			}
			else {
				throw new Exception("COULD NOT FIND ID: " + patientId);
			}
			
			return thePatient;
		}
		finally {
			close(myConn, myStmt, myRs);
		}	
	}

	public void updatePatient(Patient thePatient)throws Exception {
		
		Connection myConn= null;
		PreparedStatement myStmt= null;
		
		
		
		System.err.println("++++++++++++++++++++++++++++++ DAO PART");
		
		System.err.println(thePatient);
		
		System.err.println("++++++++++++++++++++++++++++++");
		
		try {
			//get conn
			myConn= dataSource.getConnection();
			
			//create sql stmt
			 String sql = "update patient " 
	      	+ "set first_name=?, last_name=?, gender=?, age=?, email=?, phone_number=?, height=?, weight=?, temp=?, bp=? "
			      + "where id= ? ";
			 
			 //prepare stmt
			
			 myStmt = myConn.prepareStatement(sql);
//	        param values are 1 based so they start at 1
//	        SET PARAM VALUES FOR PATIENT
			myStmt.setInt(1,thePatient.getId());
			myStmt.setString(1, thePatient.getFirst_name());
			myStmt.setString(2, thePatient.getLast_name());
			myStmt.setString(3, thePatient.getGender());
			myStmt.setInt(4,thePatient.getAge());
			myStmt.setString(5, thePatient.getEmail());
			myStmt.setString(6, thePatient.getPhone_number());
			myStmt.setDouble(7,thePatient.getHeight());
			myStmt.setDouble(8,thePatient.getWeight());
			myStmt.setDouble(9,thePatient.getTemp());
			myStmt.setString(10,thePatient.getBp());
			myStmt.setInt(11,thePatient.getID());
//			--might have to check our whats wrong here with the ID maybe?         
//	     	execute sql
	        myStmt.execute();
	        
		}catch(Exception e) {
			System.out.println("ERROR---->updatePatient() IS NOT WORKIng");
		}
		finally {
			close(myConn, myStmt, null);
		}
		
	}

	
		public void deleteStudent(String thePatientId) throws Exception {
			Connection myConn = null;
			PreparedStatement myStmt = null;
			
			try {
				// convert student id to int
				int patientId = Integer.parseInt(thePatientId);
				
				// get connection to database
				myConn = dataSource.getConnection();
				
				// create sql to delete student
				String sql = "delete from patient where id=?";
				
				// prepare statement
				myStmt = myConn.prepareStatement(sql);
				
				// set params
				myStmt.setInt(1, patientId);
				
				// execute sql statement
				myStmt.execute();
			}
			finally {
				// clean up JDBC code
				close(myConn, myStmt, null);
			}	
		}
	}	  



