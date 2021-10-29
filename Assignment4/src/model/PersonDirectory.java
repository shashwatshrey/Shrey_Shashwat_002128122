/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shashwatshrey
 */

public class PersonDirectory {
    ArrayList<Person> Persons;

    public PersonDirectory(){
        Persons = new ArrayList<Person>();
    }
    
    public ArrayList<Person> getPersons() {
        return Persons;
    }

    public void setPersons(ArrayList<Person> Persons) {
        this.Persons = Persons;
    }
    
    public Person addPerson(Person person){
        Persons.add(person);
        return person;
    }
}
