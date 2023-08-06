/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package referred_oop_cw;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class WestminsterSkinConsultationManager implements SkinConsultationManager {

    private ArrayList<Doctor> doctors;//declare arraylist
       

    public WestminsterSkinConsultationManager() {//constructor
        doctors = new ArrayList<>(10);//initialize array 
    }
     

    public void displayMenu() {//method for display menu
        Scanner input = new Scanner(System.in);
        int choice;

        do {  //do while loop with menu choices
            System.out.println("Welcome to Westminster Skin Consult Center!");
            System.out.println("----------MENU----------");
            System.out.println("Press 1 to add a new doctor");
            System.out.println("Press 2 to remove a doctor");
            System.out.println("Press 3 to display doctors");
            System.out.println("Press 4 to save data to a file");
            System.out.println("Press 5 to exit");
            System.out.println("Enter your choice:");

            choice = input.nextInt();//store user choice as int data
            input.nextLine(); // Consume the newline character

            switch (choice) {   //switch case for implement method 
                case 1:
                    addDoctor();
                    break;

                case 2:
                    deleteDoctor();
                    break;

                case 3:
                    displayDoctors();
                    break;

                case 4:
                    saveDataToFile();
                    break;

                case 5:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter the right choice.");
            }
            System.out.println();
        } while (choice != 5);
    }

    public void addDoctor() {  //add doctor method
        final int maximumDoctors = 10;
        if (doctors.size() < maximumDoctors) { 
            Scanner x = new Scanner(System.in);
            System.out.println("-----Enter doctor details to add-----");
            
            System.out.println("Name:");    
            String name = x.nextLine();

            System.out.println("Surname:");        
            String surname = x.nextLine();

            System.out.println("Date of birth:");
            String dob = x.nextLine();                             //get doctor details

            System.out.println("Medical license no:");
            int medicalLicenceNo = x.nextInt();
            x.nextLine();
            
            System.out.println("Mobile no:");
            int mobileNo =x.nextInt();
            x.nextLine();
             

            System.out.println("Specialization:");
            String specialization = x.nextLine();
            
            
            

            Doctor newDoctor = new Doctor(name, surname, dob, mobileNo, specialization, medicalLicenceNo);//create new doctor object and parse values
            doctors.add(newDoctor);//add parsed value to array list
            System.out.println("Doctor added successfully!");
        } else {
            System.out.println("Maximum number of doctors reached! Cannot add new doctors.");
        }
    }

    public void deleteDoctor() {  //method to delete doctor from list
        if (!doctors.isEmpty()) {   
            System.out.println("------DELETE DOCTOR-----");
            System.out.println("Enter the medical license number to delete:");
            Scanner in = new Scanner(System.in);
            int getMedNo = in.nextInt();
            in.nextLine(); // Consume the newline character

            boolean doctorFound = false;
            Doctor deleteDoctor = null;

            for (Doctor doctor : doctors) { //for loop for check whether user entered medical licence no exist in doctor list
                if (doctor.getMedicalLicenceNo() == getMedNo) {
                    doctorFound = true;
                    deleteDoctor = doctor;
                    break;
                }
            }

            if (doctorFound) {
                doctors.remove(deleteDoctor);//remove doctor with related medical licence no
                System.out.println("Doctor with medical license number " + getMedNo + " deleted successfully!");
                System.out.println(" ");
                System.out.println("-----Removed doctor details------");  //print removed doctor details
                System.out.println(" ");
                System.out.println("Name: "+deleteDoctor.getName());
                System.out.println("surname: "+deleteDoctor.getSurname());
                System.out.println("Date of birth: "+deleteDoctor.getDob());
                System.out.println("Mobile no: "+deleteDoctor.getMobileNo());
                System.out.println("Medical Licence No: "+deleteDoctor.getMedicalLicenceNo());
                System.out.println("specialization: "+deleteDoctor.getSpecialization());
                System.out.println(" ");
                
                System.out.println("Total numbers of doctor remaining " + doctors.size());
            } else {
                System.out.println("Doctor with medical license number " + getMedNo + " not found!");
            }
        } else {
            System.out.println("No doctors available to delete.");
        }
    }

    public void displayDoctors() {//method for display doctor details on console
        if (doctors.isEmpty()) { //check whether doctor list is empty
            System.out.println("No doctors available");
        } else {
            doctors.sort(Comparator.comparing(Doctor::getSurname));//sort surname alphabetic order

            System.out.println("---------List of doctors---------");
            System.out.println("");

            for (Doctor doctor : doctors) {//for loop to print doctor details
                System.out.println("Name: " + doctor.getName());
                System.out.println("Surname: " + doctor.getSurname());
                System.out.println("Date of Birth: " + doctor.getDob());
                System.out.println("Mobile Number: " + doctor.getMobileNo());
                System.out.println("Medical license no: " + doctor.getMedicalLicenceNo());
                System.out.println("Specialization: " + doctor.getSpecialization());
                System.out.println();
            }
        }
    }

    public void saveDataToFile() {//create method for save data to text file
        try (PrintWriter writer = new PrintWriter(new FileWriter("doctors.txt"))) {
            for (Doctor doctor : doctors) { //for loop for print doctor details on text file
                writer.println("Name: " + doctor.getName());
                writer.println("Surname: " + doctor.getSurname());
                writer.println("Date of Birth: " + doctor.getDob());
                writer.println("Mobile Number: " + doctor.getMobileNo());
                writer.println("Medical license no: " + doctor.getMedicalLicenceNo());
                writer.println("Specialization: " + doctor.getSpecialization());
                writer.println(); // Add an empty line between each doctor's information
            }
            System.out.println("Data saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data to file: " + e.getMessage());
        }
    }

    @Override
    public void displayDoctor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
