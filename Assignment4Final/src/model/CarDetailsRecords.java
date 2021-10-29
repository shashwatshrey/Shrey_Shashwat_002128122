
package model;

import java.util.ArrayList;
import java.util.List;


public class CarDetailsRecords {

    private List<CarDetails> cardetailsrecords;

    public CarDetailsRecords() {
        cardetailsrecords = new ArrayList<CarDetails>();
    }

    public List<CarDetails> getCarDetailsRecords() {
        return cardetailsrecords;
    }

    public CarDetails addcarDetails() {
        CarDetails p = new CarDetails();
        cardetailsrecords.add(p);
        return p;
    }

    public void removecarDetails(CarDetails p) {
        cardetailsrecords.remove(p);
    }

    public CarDetails searchcarDetails(int id) {
        for (CarDetails cardetail : cardetailsrecords) {
            if (cardetail.getModelNumber() == id) {
                return cardetail;
            }
        }
        return null;
    }

    
}
