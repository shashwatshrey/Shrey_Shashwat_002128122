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
public class Bookings {
    MasterOrderList masterOrderList;
    AreaDirectory areaDirectory;
    
    public Bookings() {
        masterOrderList = new MasterOrderList();
        areaDirectory = new AreaDirectory();
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(MasterOrderList masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    public AreaDirectory getAreaDirectory() {
        return areaDirectory;
    }

    public void setAreaDirectory(AreaDirectory areaDirectory) {
        this.areaDirectory = areaDirectory;
    }
    
}
