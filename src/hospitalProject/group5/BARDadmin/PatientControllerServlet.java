package hospitalProject.group5.BARDadmin;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class PatientControllerServlet
 */
@WebServlet("/PatientControllerServlet")
public class PatientControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PatientDbUtil patientDbUtil;
	
	@Resource(name="jdbc/web_patient_tracker")
	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		// create our student db util ... and pass in the conn pool / datasource
		try {
			patientDbUtil = new PatientDbUtil(dataSource);
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

		// list the students ... in mvc fashion
		try {
			listPatients(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		
	}

	private void listPatients(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		// get students from db util
		List<Patient> patients = patientDbUtil.getPatients();
		
		// add students to the request
		request.setAttribute("PATIENT_LIST", patients);
				
		// send to JSP page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/list-patients.jsp");
		dispatcher.forward(request, response);
	}

}













