/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class PersonDirectory {
    private ArrayList <Person> personDirectory;
   

    public ArrayList<Person> getpersonDirectory() {
        return personDirectory;
    }

    public void setpersonDirectory(ArrayList<Person> directory) {
        this.personDirectory = new ArrayList<Person>();
    }
    
    public PersonDirectory(){
        this.personDirectory = new ArrayList();
    }
    
    public Person addNewPerson() {
    Person prsn = new Person();
        personDirectory.add(prsn); 
        return prsn;
    }

    public void deletePerson(Person selectedPerson) {
        personDirectory.remove(selectedPerson);
    } 

}
