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
    GenreDirectory genres;
    EmployeeDirectory ed;
    String branchName;
    String material;
    MagazineCollection magazineCollection;
    Material materialDir;
    private float totalRevenue;

    RentRequestDirectory rentRequestDirectory;

    public Library(){
        this.books = new BookCollection();
        this.authors = new AuthorDirectory();
        this.genres = new GenreDirectory();
        this.ed = new EmployeeDirectory();
        this.branchName = branchName;
        this.rentRequestDirectory = new RentRequestDirectory();
        this.material = material;
        this.magazineCollection = new MagazineCollection();
        this.materialDir = new Material();
        this.totalRevenue = 0;
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

    public GenreDirectory getGenres() {
        return genres;
    }

    public void setGenres(GenreDirectory genres) {
        this.genres = genres;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public MagazineCollection getMd() {
        return magazineCollection;
    }

    public void setMd(MagazineCollection magazineCollection) {
        this.magazineCollection = magazineCollection;
    }

    public Material getMat() {
        return materialDir;
    }

    public void setMat(Material materialDir) {
        this.materialDir = materialDir;
    }

    public float getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(float totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public RentRequestDirectory getRentRequestDirectory() {
        return rentRequestDirectory;
    }

    public void setRentRequestDirectory(RentRequestDirectory rentRequestDirectory) {
        this.rentRequestDirectory = rentRequestDirectory;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.branchName);
    }

    
}
