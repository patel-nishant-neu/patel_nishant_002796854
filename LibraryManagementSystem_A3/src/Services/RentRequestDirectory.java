/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author narot
 */
public class RentRequestDirectory {
    ArrayList<RentRequest> rentalList;
    
    public RentRequestDirectory() {
        this.rentalList = new ArrayList<RentRequest>();
    }

    public ArrayList<RentRequest> getOrderlist() {
        return rentalList;
    }

    public void setOrderlist(ArrayList<RentRequest> orderlist) {
        this.rentalList = orderlist;
    }
    
    // create a new order
    public RentRequest createOrder(Customer customer) {
        RentRequest o = new RentRequest(customer);
        this.rentalList.add(o);
        return o;
    }
    
    public RentRequest requestOrder(Customer customer) {
        
        RentRequest o = new RentRequest();
        o.setCustomer(customer);
        
        this.rentalList.add(o);
                System.out.println("Here");
        return o;
    }
}
