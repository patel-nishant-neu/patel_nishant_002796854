/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.util.ArrayList;

/**
 *
 * @author narot
 */
public class BookCollection {
    
        private ArrayList<Book> books ; 

    public BookCollection() {
        this.books = new ArrayList<Book>();
    }
    
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    
    public Book addBooks(String bookId, String bookName, String author, String genre){
        Book book = new Book();
        
        book.setId(bookId);
        book.setBookName(bookName);
        book.setAuthorName(author);
        book.setGenreName(genre);
        
        this.books.add(book);
        
        return book;
        
    }
    
}
