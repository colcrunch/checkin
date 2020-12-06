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
public class Doctor {

    private int id;
    private String firstName = "";
    private String lastName = "";
    private String specialty;

    public Doctor() {

    }

    public Doctor(int ID, String firstName, String lastName, String specialty) {
        this.id = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String toString() {
        return "Doctor ID: " + id
                + "\nFirst name: " + firstName
                + "\nLast name: " + lastName
                + "\nSpecialty: " + specialty;
    }
}
