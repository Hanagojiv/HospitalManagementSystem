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
public class HospitalDirectory {
    private ArrayList <Hospital> hospitalDirectory;

    public ArrayList<Hospital> getpatientDirectory() {
        return hospitalDirectory;
    }

    public void setpatientDirectory(ArrayList<Hospital> directory) {
        this.hospitalDirectory = new ArrayList<Hospital>();
    }

    public HospitalDirectory(){
        this.hospitalDirectory = new ArrayList();
    }
    
    public Hospital addNewHospital() {
    Hospital emp = new Hospital();
        hospitalDirectory.add(emp); 
        return emp;
    }

    public void deleteHospital(Hospital selectedHospital) {
        hospitalDirectory.remove(selectedHospital);
    } 
}
