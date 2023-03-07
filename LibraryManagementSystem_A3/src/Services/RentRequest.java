/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Library.Book;
import Library.Magazine;
/**
 *
 * @author narot
 */
public class RentRequest {
    Customer customer;
    private static int count = 0;
    String orderId;
    String status;
    Book book;
    Magazine magazine;

    int duration_of_days;
    float rentalRequestPrice;
    String material;
    
    public RentRequest() {
        this.customer = new Customer();
        this.status = "Rented";
        this.count++;
        
        this.orderId = "Rental_NO"+this.count;
        this.book = new Book();
        this.magazine = new Magazine();
        this.material = material;
    }
    
    public RentRequest(Customer customer, Book book, int duration_of_days, String material) {
        this.customer = customer;
        this.status = "Rented";
        this.count++;
        
        this.orderId = "Rental_NO"+this.count;
        this.book = book;
        this.duration_of_days = duration_of_days;
        this.material = material;
    }
    
        public RentRequest(Customer customer, Magazine magazine, int duration_of_days, String material) {
        this.customer = customer;
        this.status = "Available";
        this.count++;
        
        this.orderId = "Rental_NO"+this.count;
        this.magazine = magazine;
        this.duration_of_days = duration_of_days;
        this.material = material;
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        RentRequest.count = count;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public int getDuration_of_days() {
        return duration_of_days;
    }

    public void setDuration_of_days(int duration_of_days) {
        this.duration_of_days = duration_of_days;
    }

    public float getRentalRequestPrice() {
        return rentalRequestPrice;
    }

    public void setRentalRequestPrice(float rentalRequestPrice) {
        this.rentalRequestPrice = rentalRequestPrice;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    @Override
    public String toString() {
       return this.orderId;
    }    
    
}
