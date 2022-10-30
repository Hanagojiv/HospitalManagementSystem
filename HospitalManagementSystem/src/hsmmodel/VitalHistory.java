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
public class VitalHistory {
    
    private ArrayList<Vital> vitalHistory;
    
    
        public VitalHistory() {
        this.vitalHistory = new ArrayList<>();
    }

    public ArrayList<Vital> getVitalsHistory() {
        return vitalHistory;
    }

    public void setVitalsHistory(ArrayList<Vital> vitalsHistory) {
        this.vitalHistory = vitalsHistory;
    }

    
      public Vital addVitals() {

        Vital v = new Vital();
        vitalHistory.add(v);

        return v;

    }
    
    
    
}
