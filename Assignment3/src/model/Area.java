
package model;

public class Area {

    private String areaName;
    private CarDetailsRecords cardetailrecord;

    public Area() {
        cardetailrecord = new CarDetailsRecords();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public CarDetailsRecords getCarDetailsRecords() {
        return cardetailrecord;
    }

    public void setCarDetailsRecords(CarDetailsRecords cardetailrecord) {
        this.cardetailrecord = cardetailrecord;
    }

    @Override
    public String toString() {
        return areaName; 
    }

}
