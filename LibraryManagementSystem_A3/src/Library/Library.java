/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Employee.EmployeeDirectory;
import Services.RentRequest;
import Services.RentRequestDirectory;

/**
 *
 * @author narot
 */
public class Library {
    
    BookCollection books;
    AuthorDirectory authors;
    Genre genres;
    EmployeeDirectory ed;
    String branchName;

    RentRequestDirectory rentRequestDirectory;

    public Library(){
        this.books = new BookCollection();
        this.authors = new AuthorDirectory();
        this.genres = new Genre();
        this.ed = new EmployeeDirectory();
        this.branchName = branchName;
        this.rentRequestDirectory = new RentRequestDirectory();
        
    }

    
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    
    public RentRequestDirectory getRentalRequestDirectory() {
        return rentRequestDirectory;
    }

    public void setRentalRequestDirectory(RentRequestDirectory rentRequestDirectory) {
        this.rentRequestDirectory = rentRequestDirectory;
    }
    
    public EmployeeDirectory getEd() {
        return ed;
    }

    public void setEd(EmployeeDirectory ed) {
        this.ed = ed;
    }
    
    public BookCollection getBooks() {
        return books;
    }

    public void setBooks(BookCollection books) {
        this.books = books;
    }

    public AuthorDirectory getAuthors() {
        return authors;
    }

    public void setAuthors(AuthorDirectory authors) {
        this.authors = authors;
    }

    public Genre getGenres() {
        return genres;
    }

    public void setGenres(Genre genres) {
        this.genres = genres;
    }
    
    
    @Override
    public String toString(){
        return String.valueOf(this.branchName);
    }

    
}
