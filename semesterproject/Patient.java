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
            age = 0;
    
    private long  phone_number;
            
    
    public double
            height = 0.0,
            weight = 0.0,
            temp = 0.0;
           
    private String first_name = "",
            last_name = "",
            gender = "",
            email = "",
            bp = "";
    
    
    public Patient(){
        
    }
    
    public Patient(int id, int age, String firstName, String lastName, String gender, String email){
        this.id = id;
        this.age = age;
        this.first_name = firstName;
        this.last_name = lastName;
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

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
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
    
    
    public String toString(){
        return "Patient Data\n"+
               "ID:" + id + 
               "\nFirst Name: " + first_name + 
               "\nLast Name: " + last_name + 
               "\nAge: " + age + 
               "\nGender: " + gender + 
               "\nEmail: " + email;
    }
}
