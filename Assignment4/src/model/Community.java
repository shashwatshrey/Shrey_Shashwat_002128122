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
public class Community {
    int CommunityName;
    HashMap<String, House> Houses;
    
    //Constructor
    public Community(int communityName){
        this.CommunityName = communityName;
        Houses = new HashMap<String , House>();
    }

    public int getCommunityName(){
        return CommunityName;
    }
    
    public void setCommunityName(int CommunityName){
        this.CommunityName = CommunityName;
    }
    
    public HashMap<String ,House> getHouses() {
        return Houses;
    }

    public void setHouses(HashMap<String , House> Houses) {
        this.Houses = Houses;
    }
    
    
}
