/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hsmmodel;

import java.util.ArrayList;

/**
 *
 * @author vivekhanagoji
 */
public class DoctorCatalogue {
    
    private ArrayList<Doctor> doctor;

    public DoctorCatalogue() {
        this.doctor = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(ArrayList<Doctor> doctor) {
        this.doctor = doctor;
    }
        public Doctor addNewDoctor(){
        
        Doctor newDoc = new Doctor();
        doctor.add(newDoc);
        return newDoc;
    }
        
  
   
    
}
