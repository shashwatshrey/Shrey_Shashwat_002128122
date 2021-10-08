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
public class CarDetailsRecords {
    private ArrayList<CarDetails> records;
    
    public CarDetailsRecords(){
        this.records = new ArrayList<CarDetails>();
    }

    public ArrayList<CarDetails> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<CarDetails> records) {
        this.records = records;
    }
    
    public CarDetails addNewRecord(){
        CarDetails cardetail = new CarDetails();
        records.add(cardetail);
        return cardetail;
    }

    public void deleteRecord(CarDetails selectedRecord) {
        records.remove(selectedRecord);
    }
}
