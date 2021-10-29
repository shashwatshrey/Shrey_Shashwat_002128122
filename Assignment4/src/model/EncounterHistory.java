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
public class EncounterHistory {
    ArrayList<Encounter> EncounterHistory;

    public EncounterHistory(){
        EncounterHistory = new ArrayList<Encounter>();
    }
    
    public ArrayList<Encounter> getEncounterHistory() {
        return EncounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> EncounterHistory) {
        this.EncounterHistory = EncounterHistory;
    }
    
    public Encounter addEncounter(Encounter encounter){
        this.EncounterHistory.add(encounter);
        return encounter;
    }
}
