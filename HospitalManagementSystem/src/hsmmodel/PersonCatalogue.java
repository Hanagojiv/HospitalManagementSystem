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
public class PersonCatalogue {
    
    private ArrayList<Person> person;

    public PersonCatalogue() {
        this.person = person;
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }
    public Person addNewPerson(){
        Person per = new Person();
        person.add(per);
        return per;
    }
    
    
}
