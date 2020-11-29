/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import java.time.*;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author dante
 */
public class Appointment {
    private int id;
    private Doctor doctorInfo;
    private Patient patientInfo;
    private LocalDateTime date,
            checkInTime;
    private boolean checked;
    
    public Appointment(){
        
    }
    
    public Appointment(int ID){
        this.id = ID;        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Doctor getDoctorInfo() {
        return doctorInfo;
    }

    public void setDoctorInfo(Doctor doctorInfo) {
        this.doctorInfo = doctorInfo;
    }

    public Patient getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(Patient patientInfo) {
        this.patientInfo = patientInfo;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public LocalDateTime getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(LocalDateTime checkInTime) {
        this.checkInTime = checkInTime;
    }    
    
    public String toString(){
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String currentTime = date.format(myFormatObj);
        
        return
                "ID: " + id
                +"\nPatient: " +patientInfo.getFirstName() + " " + patientInfo.getLastName()
                +"\nDoctor: " + doctorInfo.getFirstName() + " " + doctorInfo.getLastName()
                +"\nAppointment date: " + currentTime;
    }
}
