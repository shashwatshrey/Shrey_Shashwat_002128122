/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author shashwatshrey
 */
public class House {
    String HouseName;
    HashMap<String , Person> Persons;

    public House(String name){
        this.HouseName = name;
        Persons = new HashMap<String , Person>();
    }
    
    public HashMap<String , Person> getPersons() {
        return Persons;
    }
    public String getHouseName(){
        return HouseName;
    }

    public void setPersons(HashMap<String , Person> Persons) {
        this.Persons = Persons;
    }
    
    public void setHouseName(String HouseName){
        this.HouseName = HouseName;
    }
}
