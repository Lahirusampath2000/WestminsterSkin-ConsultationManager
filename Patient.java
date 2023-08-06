/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package referred_oop_cw;

/**
 *
 * @author Dell
 */
public class Patient extends Person{    
    private int patient_id;  //declare variables

    public Patient() {  //default constructor
    }

    public Patient(String name, String surname, String dob, int mobile_no,int patient_id) { //constructor
        super(name, surname, dob, mobile_no); 
        this.patient_id=patient_id;
    }

    public int getPatient_id() {
        return patient_id;                          //getters and setters
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }
    
    
    
    
}
