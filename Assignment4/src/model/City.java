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
public class City {
    String Name;
    HashMap<Integer , Community> Community;
    
    
    public City(String name){
        this.Name = name;
        Community = new HashMap<Integer,Community>();
        
    }
    
    public HashMap<Integer, Community> getCommunity() {
        return Community;
    }

    public void setCommunity(HashMap<Integer, Community> Community) {
        this.Community = Community;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
   
    
}
