/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import java.util.ArrayList;

/**
 *
 * @author narot
 */
public class CustomerDirectory {
    
    ArrayList<Customer> customerlist;
    
    public CustomerDirectory() {
        this.customerlist = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(ArrayList<Customer> customerlist) {
        this.customerlist = customerlist;
    }
    
    public Customer findById(String id) {
        for(Customer c: this.customerlist) {
            if(c.getPersonID().equals(id)) {
                System.out.println(c.getName());
                return c;
            }
        }
        
        return null;
    }
    
    public Customer createCustomer(String id, String name) {
        Customer c = new Customer();
        c.setPersonID(id);
        c.setName(name);
        
        this.customerlist.add(c);
        return c;
    }    
     
}
