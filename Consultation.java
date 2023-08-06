/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package referred_oop_cw;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class Consultation {  
    private String doctorName;
    private String patientName;
    private Date date;
    private int consultationNo;   //declare variables
    private LocalTime time;
    private double cost;
    private String notes;

    public String getDoctorName() { //default constructor
        return doctorName;
    }

    public void setDoctorName(String doctorName) {  //constructor
        this.doctorName = doctorName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {                         //getters and setters
        this.date = date;
    }

    public int getConsultationNo() {
        return consultationNo;
    }

    public void setConsultationNo(int consultationNo) {
        this.consultationNo = consultationNo;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
   
    
    
}
