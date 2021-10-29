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
public class Order {
    ArrayList<OrderItem> orderItemList;

    public Order(OrderItem orderItemList) {
        this.orderItemList = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    public void addNewOrderItem(CarDetails car , int quantity){
        OrderItem orderItem = new OrderItem(car , 0);
        orderItemList.add(orderItem);
        
    }
    public OrderItem findCar(CarDetails car){
        for(OrderItem oi : this.getOrderItemList()){
            if(oi.getCardetail().equals(car)){
                return oi;
            }
        }
        return null;
    }
    
}
