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
public class Patient {
    private int id = 0,
            age = 0,
            bpSys = 0,
            bpDia =0;
    
    public double
            height = 0.0,
            weight = 0.0,
            temp = 0.0,
            pulse = 0.0,
            sats = 0.0;
           
    private String firstName = "",
            lastName = "",
            gender = "",
            email = "";
    
    
    public Patient(){
        
    }
    
    public Patient(int id, int age, String firstName, String lastName, String gender, String email){
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public int getID(){
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getBpSys() {
        return bpSys;
    }

    public void setBpSys(int bpSys) {
        this.bpSys = bpSys;
    }

    public int getBpDia() {
        return bpDia;
    }

    public void setBpDia(int bpDia) {
        this.bpDia = bpDia;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getPulse() {
        return pulse;
    }

    public void setPulse(double pulse) {
        this.pulse = pulse;
    }

    public double getSats() {
        return sats;
    }

    public void setSats(double sats) {
        this.sats = sats;
    }
    
    public String toString(){
        return "Patient Data\n"+
               "ID:" + id + 
               "\nFirst Name: " + firstName + 
               "\nLast Name: " + lastName + 
               "\nAge: " + age + 
               "\nGender: " + gender + 
               "\nEmail: " + email;
    }
}
