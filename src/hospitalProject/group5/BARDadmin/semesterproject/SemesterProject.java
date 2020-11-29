/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dante
 */
public class SemesterProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Patient test1 = new Patient();
        Doctor testdoc = new Doctor();
        LocalDateTime testTime = LocalDateTime.now();
        
        test1.setFirstName("Tom");
        test1.setID(4569);
        
        Appointment app = new Appointment(test1.getID());
        app.setPatientInfo(test1);
        app.setDoctorInfo(testdoc);
        app.setDate(testTime);
        app.setCheckInTime(testTime);
        System.out.println(app.toString());
       
    }
    
}
