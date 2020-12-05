/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import java.time.LocalDateTime;

/**
 *
 * @author dante
 */
class Appointment {
    private int id,
            patient_id;
    
    private String doctor,
            note;
    
    private LocalDateTime date_time,
            check_time;
    
    private boolean checked;
    
    
    public Appointment(){
        
    }
    
    public Appointment(int patientId){
        this.patient_id = patientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getDate_time() {
        return date_time;
    }

    public void setDate_time(LocalDateTime date_time) {
        this.date_time = date_time;
    }

    public LocalDateTime getCheck_time() {
        return check_time;
    }

    public void setCheck_time(LocalDateTime check_time) {
        this.check_time = check_time;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
    
    
}
