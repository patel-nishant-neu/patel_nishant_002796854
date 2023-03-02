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
public class AuthorDirectory {
    
    private ArrayList<Author> authors ; 

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }
        
    public Author AddBook(String author){
        Author a = new Author();
        a.setAuthor(author);
        this.authors.add(a);
        return a;
    }
    
    public Author findAuthor(String author){
        for(Author a : this.authors){
            if(a.getAuthor().equals(author)){
                return a;
            }
        }
        return null;
    }
}
