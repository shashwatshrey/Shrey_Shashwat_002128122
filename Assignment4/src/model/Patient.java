/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author shashwatshrey
 */
public class Patient
{
    int communityName;
    Person Person;
    //String DoctorAssigned;
    EncounterHistory EncounterHistory;

    public Patient(int communityName){
        this.communityName = communityName;
        Person = new Person();
        EncounterHistory = new EncounterHistory();
    }
    
    public int getcommunityName(){
        return communityName;
    }
    
    public void setcommunityName(int communityName){
        this.communityName = communityName;
    }
    
    
    public Person getPerson() {
        return Person;
    }

    public void setPerson(Person Person) {
        this.Person = Person;
    }
   

    public EncounterHistory getEncounterHistory() {
        return EncounterHistory;
    }

    public void setEncounterHistory(EncounterHistory EncounterHistory) {
        this.EncounterHistory = EncounterHistory;
    }
    
    @Override
    public String toString(){
        return this.Person.Name;
    }
    
    
}
