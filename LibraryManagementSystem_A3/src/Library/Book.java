/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author narot
 */
public class Book {
    
    String id;
    Genre genre;
    Author author;
    String bookName;
    String genreName;
    String authorName;
    String status;
    float price;
    String language;
    String bindingType;
    Integer no_of_pages;
    String registeredDate;
    String materialType;
    
    public Book(){
        this.id = id;
        this.bookName = bookName;
        this.genreName = genreName;
        this.authorName = authorName;
        this.status = "Available";
        this.bindingType = bindingType;
        this.language = language;
        this.no_of_pages = no_of_pages;
        this.registeredDate = registeredDate;
        this.materialType = "Book";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public Integer getNo_of_pages() {
        return no_of_pages;
    }

    public void setNo_of_pages(Integer no_of_pages) {
        this.no_of_pages = no_of_pages;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }
    
    
    
    @Override
    public String toString(){
        return String.valueOf(this.id);
    }
    
}
