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
public class Admission {
    private int
            id,
            patient_id,
            appointment_id,
            room,
            bed;
    private String doctor,
            dsc_notes;
    private LocalDateTime adm_date,
            dsc_date;
    private boolean discharged;
    
    public Admission(){
        
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

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public LocalDateTime getAdm_date() {
        return adm_date;
    }

    public void setAdm_date(LocalDateTime adm_date) {
        this.adm_date = adm_date;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getDsc_notes() {
        return dsc_notes;
    }

    public void setDsc_notes(String dsc_notes) {
        this.dsc_notes = dsc_notes;
    }

    public LocalDateTime getDsc_date() {
        return dsc_date;
    }

    public void setDsc_date(LocalDateTime dsc_date) {
        this.dsc_date = dsc_date;
    }

    public boolean isDischarged() {
        return discharged;
    }

    public void setDischarged(boolean discharged) {
        this.discharged = discharged;
    }
    
    
}
