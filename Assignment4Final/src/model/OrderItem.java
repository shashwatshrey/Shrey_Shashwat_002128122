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
public class OrderItem {
    CarDetails cardetail;
    int quantity;

    public OrderItem(CarDetails car , int quantity){
        this.cardetail = car;
        this.quantity = quantity;
    }
    
    public CarDetails getCardetail() {
        return cardetail;
    }

    public void setCardetail(CarDetails cardetail) {
        this.cardetail = cardetail;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
