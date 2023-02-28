/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
/**
 *
 * @author narot
 */
public class RentRequest {
    Customer customer;
    private static int count = 0;
    String orderId;
    String status;
    
    public RentRequest() {
        this.customer = new Customer();
        this.status = "Rented";
        this.count++;
        
        this.orderId = "Rental_NO"+this.count;
    }
    
    public RentRequest(Customer customer) {
        this.customer = customer;
        this.status = "Rented";
        this.count++;
        
        this.orderId = "Rental_NO"+this.count;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    @Override
    public String toString() {
       return this.orderId;
    }    
    
}
