
package model;


public class CarDetails {

    private String carName;
    private int price;
    private int modelNumber;
    private boolean available;
    private String SerialNumber;
    private String Category;
    private int makeYear;
    private String manufacturer;
    private int seats;
    

    private static int count = 0;

    @Override
    public String toString() {
        return carName; //To change body of generated methods, choose Tools | Templates.
    }

    public CarDetails() {
        count++;
        modelNumber = count;
    }
    
    

    public String getcarName() {
        return carName;
    }

    public void setcarName(String carName) {
        this.carName = carName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }
    
    public void setSerialNumber(String serialNumber){
        this.SerialNumber = serialNumber;
    }

    public String getCategory() {
        return Category;
    }
    
    public void setCategory(String category){
        this.Category = category;
    }

    public int getMakeYear() {
        return makeYear;
    }
    public void setMakeYear(int makeyear){
        this.makeYear = makeyear;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats){
        this.seats = seats;
    }

}
