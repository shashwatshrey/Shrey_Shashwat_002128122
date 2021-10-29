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
public class PatientDirectory {
    
    ArrayList<Patient> Patients;

    public PatientDirectory(){
        Patients = new ArrayList<Patient>();
    }
    
    public ArrayList<Patient> getPatients() {
        return Patients;
    }

    public void setPatients(ArrayList<Patient> Patients) {
        this.Patients = Patients;
    }
    
    public Patient addPatient(Patient patient){
        Patients.add(patient);
        return patient;
    }
    
}
