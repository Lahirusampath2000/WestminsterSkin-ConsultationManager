/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package referred_oop_cw;

/**
 *
 * @author Dell
 */
public class Doctor extends Person{
    private String specialization;  //declare variables
    private  int medicalLicenceNo;

    

    public Doctor(String name, String surname, String dob, int mobileNo, String specialization, int medicalLicenceNo ) { //constructor
        super(name, surname, dob, mobileNo);
        this.specialization=specialization;
        this.medicalLicenceNo=medicalLicenceNo;
    }

    public String getSpecialization() {
        return specialization;                   //getters and setters
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getMedicalLicenceNo() {
        return medicalLicenceNo;
    }

    public void setMedicalLicenceNo(int medicalLicenceNo) {
        this.medicalLicenceNo = medicalLicenceNo;
    }
    
    

    

    
    
    
}
