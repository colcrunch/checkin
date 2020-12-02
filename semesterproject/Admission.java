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
            patient,
            appointment,
            room,
            bed,
            discharge;
    private String adm_notes;
    private LocalDateTime adm_date;
    private boolean discharged;
    
    public Admission(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatient() {
        return patient;
    }

    public void setPatient(int patient) {
        this.patient = patient;
    }

    public int getAppointment() {
        return appointment;
    }

    public void setAppointment(int appointment) {
        this.appointment = appointment;
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

    public int getDischarge() {
        return discharge;
    }

    public void setDischarge(int discharge) {
        this.discharge = discharge;
    }

    public String getAdm_notes() {
        return adm_notes;
    }

    public void setAdm_notes(String adm_notes) {
        this.adm_notes = adm_notes;
    }

    public LocalDateTime getAdm_date() {
        return adm_date;
    }

    public void setAdm_date(LocalDateTime adm_date) {
        this.adm_date = adm_date;
    }

    public boolean isDischarged() {
        return discharged;
    }

    public void setDischarged(boolean discharged) {
        this.discharged = discharged;
    }
    
    
}
