/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import java.time.*;


/**
 *
 * @author dante
 */
public class Discharge {
    private int id;
    private LocalDateTime dsc_date;
    private Notes dsc_notes = new Notes();
    private Doctor doc;
    private Patient patient;
    
    public Discharge(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDsc_date() {
        return dsc_date;
    }

    public void setDsc_date(LocalDateTime dsc_date) {
        this.dsc_date = dsc_date;
    }

    public Notes getDsc_notes() {
        return dsc_notes;
    }

    public void setDsc_notes(String notes) {
        this.dsc_notes.setContent(notes);
    }

    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
    
}
