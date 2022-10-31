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
public class EncounterHistory {
   private ArrayList <Encounter> encounterHistory;

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> EncounterHistory) {
        this.encounterHistory = EncounterHistory;
    }

    public EncounterHistory(){
        this.encounterHistory = new ArrayList();
    }
    
    public Encounter addNewEncounter() {
    Encounter emp = new Encounter();
        encounterHistory.add(emp); 
        return emp;
    }

    public void deleteEncounter(Encounter selectedEncounter) {
        encounterHistory.remove(selectedEncounter);
    }  
}
