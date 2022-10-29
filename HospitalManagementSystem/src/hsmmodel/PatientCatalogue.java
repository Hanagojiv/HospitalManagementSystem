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
public class PatientCatalogue {
    
    private ArrayList<Patient> patient;

    public PatientCatalogue() {
        this.patient = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatient() {
        return patient;
    }

    public void setPatient(ArrayList<Patient> patient) {
        this.patient = patient;
    }
    
    public Patient addNewPateint(){
        Patient pt = new Patient();
        patient.add(pt);
        return pt;
        
        
    }     
}
