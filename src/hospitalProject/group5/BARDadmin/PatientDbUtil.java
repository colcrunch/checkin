package hospitalProject.group5.BARDadmin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class PatientDbUtil {
	//reference to the data source-swl
		private DataSource dataSource;
	
	//constructor to 
	public PatientDbUtil(DataSource ds) {
	dataSource = ds;   //the servlet will handle sending the reference to this ds object
	}
	
	public List<Patient> getPatients() throws Exception{
		
		List<Patient> patients = new ArrayList<>();
		
		//jdbc objects- set up database here
		Connection myConn = null;
		Statement myStatement = null;
		ResultSet myResult = null;
		
		try {
			//get a connectuon to db
			myConn = dataSource.getConnection();
			
			// create sql stetemtn 
			String sql = "select * from _patient order by last_name";
			
			myStatement = myConn.createStatement();
			
			//execute query
			myResult = myStatement.executeQuery(sql);
			
			//process result set
			while(myResult.next()) {
				//retrieve data
				
				String firstName = myResult.getString("first_name");
				String emailAddress = myResult.getString("email");
				int id = myResult.getInt("id");
				String lastName = myResult.getString("last_name");

				//new patient object
				Patient tempPatient = new Patient(id, firstName, lastName, emailAddress);
				//add it to the list of patients
				patients.add(tempPatient);
			}
			
			return patients;
		}
		finally {
			//close JDBC objects
			close(myConn,myStatement,myResult);	
		}
	}

	private void close(Connection myConn, Statement myStatement, ResultSet myResult) {
		
		try {
			if(myResult != null) {
				myResult.close();
			}
			
			if(myStatement != null) {
				myStatement.close();
			}
			
			if(myConn != null) {
				myConn.close();
			}
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
			
		}
	}
}



