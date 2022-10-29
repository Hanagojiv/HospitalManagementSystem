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
    
    private ArrayList<Vital> vitalsHistory;

    public ArrayList<Vital> getVitalsHistory() {
        return vitalsHistory;
    }

    public void setVitalsHistory(ArrayList<Vital> vitalsHistory) {
        this.vitalsHistory = vitalsHistory;
    }

    
      public Vital addVitals() {

        Vital v = new Vital();
        vitalsHistory.add(v);

        return v;

    }
    
    
    
}
