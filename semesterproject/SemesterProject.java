/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dante
 */
public class SemesterProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day,month,year;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
        String formatedDate;
        LocalTime time = LocalTime.now();
        
        
        System.out.print("Enter the day: ");
        day = input.nextInt();
        if(day < 0 || day > 31){
            day = 1;
        }
        
        System.out.print("\nEnter the month (numeral form): ");
        month = input.nextInt();
        if(month < 0 || month > 12){
            month = 1;
        }
        
        System.out.print("\nEnter the year: ");
        year = input.nextInt();
        if(Integer.toString(year).length() > 4){
            year = 2020;
        }
        LocalDate date = LocalDate.of(year,month,day);
        LocalDateTime patientDate = LocalDateTime.of(date, time);
        
        formatedDate = patientDate.format(formatter);
        System.out.println();
        System.out.println("The date is: " + formatedDate);
        
        
        
    }
    
}
