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
public class DoctorDirectory {
    private ArrayList <Doctor> doctorDirectory;

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> directory) {
        this.doctorDirectory = new ArrayList<Doctor>();
    }
    
    public DoctorDirectory(){
        this.doctorDirectory = new ArrayList();
    }
    
    public Doctor addNewDoctor() {
    Doctor emp = new Doctor();
        doctorDirectory.add(emp); 
        return emp;
    }

    public void deleteEmployee(Doctor selectedDoctor) {
        doctorDirectory.remove(selectedDoctor);
    }
}
