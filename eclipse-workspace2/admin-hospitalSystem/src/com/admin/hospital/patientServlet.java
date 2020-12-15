package com.admin.hospital;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.admin.hospital.dao.PatientDAO;
import com.admin.hospital.domain.Patient;
import com.mysql.jdbc.log.Log;




/**
 * Servlet implementation class patientServlet
 */
@WebServlet("/patientServlet")
public class patientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PatientDAO patientdao;
	
	@Resource(name="jdbc/patient_tracker")
	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		//use init method to do work you normally do in a constructor
		super.init();
		
		//create our patient dao and pass in the coon pool/ datasource
		
		try {
			patientdao = new PatientDAO(dataSource);
		}
		catch(Exception e) {
			throw new ServletException(e);
		}
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//list the patients in MVC fashion
		try {
			
			log("doGet in servlet");
			//read the "command" parameter
			String theCommand = request.getParameter("command");
			
			//if the command is missing, then default to list patients
			if(theCommand == null) {
				theCommand = "LIST";
			}
			log(theCommand+ " ");
			
			//route to the appropriate method
			switch(theCommand) {
			
			case "LIST":
				listPatients(request, response);
				break;
				
			case "REGISTER":
				registerPatients(request, response);
				break;
			case "LOAD":
				loadPatients(request,response);
				break;
			case "UPDATE":
				updatePatients(request,response);
				break;
			case "DELETE":
				deletePatient(request, response);
				break;
			case "SEARCH":
				searchPatient(request, response);
				break;
			default:
				listPatients(request,response);		
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}


	private void searchPatient(HttpServletRequest request, HttpServletResponse response) throws Exception {
			List<Patient> patients = patientdao.getPatients();
			
			///getting the contact name from the form
			String patientName= request.getParameter("patientName");
			List<Patient> foundPatients = new ArrayList<>();
			for(Patient c : patients){
				
				if(c.getFirst_name().equals(patientName)){
					foundPatients.add(c);
				}
			}
			
			request.setAttribute("PATIENT_LIST", foundPatients.iterator()); 
			//send to jsp file
			RequestDispatcher dispatcher = request.getRequestDispatcher("/list-patients.jsp");
			dispatcher.forward(request, response);
			
		}


	private void updatePatients(HttpServletRequest request, HttpServletResponse response) 
	throws Exception{
		
		//read patient info from updatePatient.jsp form
		int id = Integer.parseInt(request.getParameter("ID"));
		
		log("+++++++++++++++++++++++I AM RECEIVING UPDATEPATIENT.JSP +_++++++++++++++--id number:" + id);
		
		System.err.println("++++++++++++++++++++++++++++++++++++++++++++ID update patient before jsp");
		
	    String firstName = request.getParameter("firstName");
	    String lastName = request.getParameter("lastName");
	    int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String phone_number = request.getParameter("phone_number");
		double height = Double.parseDouble(request.getParameter("height"));
		double weight = Double.parseDouble(request.getParameter("weight"));
		double temperature = Double.parseDouble(request.getParameter("temp"));
		String bp = request.getParameter("bp");
		

		//create new patient object
		Patient thePatient= new Patient(id,age,height,weight,temperature,firstName,lastName,gender,email,phone_number,bp);
		
		System.err.println("++++++++++++++++++++++++== patient servlet" + thePatient.toString());
		
		//perform update on patientdao-update()
		patientdao.updatePatient(thePatient);
		
		//log("<-----the patient has DATA:" + thePatient);
		
		//send the updates value back to the list-patients.jso page
		listPatients(request,response);
	}
	
	private void deletePatient(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

			// read student id from form data
			String thePatientId = request.getParameter("patientID");
			
			// delete student from database
			patientdao.deleteStudent(thePatientId);
			
			// send them back to "list students" page
			listPatients(request, response);
	 }


	private void listPatients(HttpServletRequest request, HttpServletResponse response) 
	throws Exception{
		//get patient from dao 
		List<Patient> patients = patientdao.getPatients();
		
		//add patients to the request
		request.setAttribute("PATIENT_LIST", patients);
		
		//send to jsp page( view poage)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-patients.jsp");
		dispatcher.forward(request, response);	
	}
	
	//loads patients data from form and passes it to dao
	
	private void loadPatients(HttpServletRequest request, HttpServletResponse response) throws Exception{
	//read [atient id from form data
	String thepatientId = request.getParameter("patientID");
	//-at 7:55 i chnaged it to "patientID" --MAYBE SWITCH IT BACK TO patientId
	
	//get patient from db-patientdao
	Patient thePatient = patientdao.getPatient(thepatientId); // get from the database
	
	//place patient in the request attribute
	request.setAttribute("THE_PATIENT", thePatient);
	
	//send to jsp page: to updatePatient.jspo
	RequestDispatcher dispatcher = request.getRequestDispatcher("/updatePatient.jsp");
	dispatcher.forward(request, response);	
	
	}
	
	private void registerPatients(HttpServletRequest request, HttpServletResponse response) 
			throws Exception{
				
				log("hello from registerPatients servlet");
				//read patient info from form data
				String firstName = request.getParameter("firstName");
				String lastName = request.getParameter("lastName");
				int age = Integer.parseInt(request.getParameter("age"));
				String gender = request.getParameter("gender");
				String email = request.getParameter("email");
				String phone_number = request.getParameter("phone_number");
				double height = Double.parseDouble(request.getParameter("height"));
				double weight = Double.parseDouble(request.getParameter("weight"));
				double temperature = Double.parseDouble(request.getParameter("temp"));
				String bp = request.getParameter("bp");
				
				 
				//create a new patient object
				Patient thePatient= new Patient(age,height,weight,temperature,firstName,lastName,gender,email,phone_number,bp);
				
				
				//add patient to the database
				patientdao.registerPatient(thePatient);
				
				//send back to the main page(list-patient.jsp--the list)	
				listPatients(request,response);
			}

}
