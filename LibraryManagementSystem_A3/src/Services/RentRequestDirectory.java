/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Library.Book;
import Library.Magazine;
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
    public RentRequest createOrder(Customer customer, Book  book, int duration, String material) {
        RentRequest o = new RentRequest(customer, book, duration,material);
        this.rentalList.add(o);
        return o;
    }
    
    public RentRequest createOrderMag(Customer customer, Magazine magazine, int duration, String material) {
        RentRequest o = new RentRequest(customer, magazine, duration, material);
        this.rentalList.add(o);
        return o;
    }
    
    public RentRequest requestOrder(Customer customer, Book  book, int duration, String material) {
        
        RentRequest o = new RentRequest();
        o.setCustomer(customer);
        o.setBook(book);
        o.setDuration_of_days(duration);
        o.setMaterial(material);
        
        this.rentalList.add(o);
        return o;
    }
    
        public RentRequest requestOrderMag(Customer customer, Magazine  magazine, int duration, String material) {
        
        RentRequest o = new RentRequest();
        o.setCustomer(customer);
        o.setMagazine(magazine);
        o.setDuration_of_days(duration);
        o.setMaterial(material);
        
        this.rentalList.add(o);
//                System.out.println("Here");
        return o;
    }
}
