/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Personnel.Person;
import Services.RentRequest;
import java.util.ArrayList;

/**
 *
 * @author narot
 */
public class Customer extends Person{
    
    private int rentalsTotal;
    
    private ArrayList<RentRequest> customerRentalList;
    
    public Customer(){
        super();
        this.customerRentalList = new ArrayList<RentRequest>();
    }

    public int getRentalsTotal() {
        return rentalsTotal;
    }

    public void setRentalsTotal(int rentalsTotal) {
        this.rentalsTotal = rentalsTotal;
    }

    public ArrayList<RentRequest> getCustomerRentalList() {
        return customerRentalList;
    }

    public void setCustomerRentalList(ArrayList<RentRequest> customerRentalList) {
        this.customerRentalList = customerRentalList;
    }
    
    public void addOrder(RentRequest rentrequest){
        this.customerRentalList.add(rentrequest);
    }
    
}
