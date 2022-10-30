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
public class HospitalCatalogue {
    
    private ArrayList<Hospital> hospitals;

    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }
    
        public Hospital addNewHospital(){
        Hospital hos = new Hospital();
        hospitals.add(hos);
        return hos;
        
        }
        
           public HospitalCatalogue() {
        this.hospitals = new ArrayList();
    }
        
        public void deleteHospital(Hospital em ){
        hospitals.remove(em);
    }

//    public HospitalCatalogue(ArrayList<Hospital> hospitals) {
//        this.hospitals = hospitals;
//    }
    
    
}
