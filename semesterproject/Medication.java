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
    private int id;
    private Patient patient;
    private String prescriptionName;
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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getPrescriptionName() {
        return prescriptionName;
    }

    public void setPrescriptionName(String prescriptionName) {
        this.prescriptionName = prescriptionName;
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
                + "\nPatient: " + patient.getFirstName() + " " + patient.getLastName()
                + "\nPrescription: " + prescriptionName
                + "\nDosage: " + dosage;
    }
}
