/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


public class OrderWorkRequest extends WorkRequest{
    private String OrderStatus;
    private String OrderItem;

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    public String getOrderItem() {
        return OrderItem;
    }

    public void setOrderItem(String OrderItem) {
        this.OrderItem = OrderItem;
    }

    
    
   
    
}
