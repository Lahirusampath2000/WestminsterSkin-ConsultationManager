/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package referred_oop_cw;

/**
 *
 * @author Dell
 */
public class Person {
    private String name;
    private String surname;   //declare variables
    private String dob;
    private int mobileNo;

    public Person() {//default constructer
    }

    public Person(String name, String surname, String dob, int mobileNo) { //constructor 
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;                                   //getters and setters
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    
    
    
}
