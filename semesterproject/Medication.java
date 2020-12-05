/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

/**
 *
 * @author dante
 */
public class Medication {
    private int id,
            patient_id;
    private String name;
    private double dosage;
    
    public Medication(){
        
    }
    
    public Medication(int ID){
        this.id = ID;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }
    
    
    public String toString(){
        return
                "ID: " + id
                + "\nPrescription: " + name
                + "\nDosage: " + dosage;
    }
}
