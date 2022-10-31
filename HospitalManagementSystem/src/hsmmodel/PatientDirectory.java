/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hsmmodel;

import java.util.ArrayList;

/**
 *
 * @author prathamesh
 */
public class PatientDirectory {
   private ArrayList <Patient> patientDirectory;

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> directory) {
        this.patientDirectory = new ArrayList<Patient>();
    }
    
    public PatientDirectory(){
        this.patientDirectory = new ArrayList();
    }
    
    public Patient addNewPatient() {
    Patient emp = new Patient();
        patientDirectory.add(emp); 
        return emp;
    }

    public void deletePatient(Patient selectedPatient) {
        patientDirectory.remove(selectedPatient);
    } 
}
