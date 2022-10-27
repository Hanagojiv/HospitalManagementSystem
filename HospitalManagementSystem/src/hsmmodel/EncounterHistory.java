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
public class EncounterHistory {
    
    private ArrayList<Encounter> encounter;

    public EncounterHistory() {
        this.encounter = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounter() {
        return encounter;
    }

    public void setEncounter(ArrayList<Encounter> encounter) {
        this.encounter = encounter;
    }
    
    public Encounter addNewEncounter(){
        
        Encounter newEnc = new Encounter();
        encounter.add(newEnc);
        return newEnc;
    }
    
   
    
}
