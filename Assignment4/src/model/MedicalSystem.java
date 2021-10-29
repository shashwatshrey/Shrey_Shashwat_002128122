/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author shashwatshrey
 */
public class MedicalSystem {
    HashMap<String , City>Cities;
    HashMap<String ,Patient>PatientDirectory;
    HashMap<String ,Person> PersonDirectory;
    
    public MedicalSystem(){
        this.Cities = new HashMap<String ,City>();
        this.PatientDirectory = new HashMap<String ,Patient>();
        this.PersonDirectory = new HashMap<String,Person>();
        
    }
    

    public HashMap<String ,City> getCities() {
        return Cities;
    }

    public void setCities(HashMap<String ,City> Cities) {
        this.Cities = Cities;
    }

    public HashMap<String ,Patient> getPatientDirectory() {
        return PatientDirectory;
    }

    public void setPatientDirectory(HashMap<String ,Patient> PatientDirectory) {
        this.PatientDirectory = PatientDirectory;
    }

    public HashMap<String ,Person> getPersonDirectory() {
        return PersonDirectory;
    }

    public void setPersonDirectory(HashMap<String ,Person> PersonDirectory) {
        this.PersonDirectory = PersonDirectory;
    }
    
    
    
}
