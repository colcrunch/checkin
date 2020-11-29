package hospitalProject.group5.BARDadmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PatientDb {

	
	public ArrayList<Patient> getPatientsList()
			throws SQLException, ClassNotFoundException {
			
			ArrayList<Patient> patientsList= new ArrayList<>();
			
			// Get Db connection
			Connection connection = getConnection();
			
			// Create statement
			Statement statement = connection.createStatement();
			
			// Execute statement
			ResultSet resultSet = statement.executeQuery("select * from student");
	
	
	//How to establish conection to the database
	private Connection getConnection() 
			throws SQLException, ClassNotFoundException {
		
		Class.forName("");
		
		// Connect to the database
		Connection connection = DriverManager
				.getConnection("");
		
		return connection;
	}
}
