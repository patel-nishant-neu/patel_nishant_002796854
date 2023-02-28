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
public class Genre {
    
    String genre;
    
    ArrayList<Genre> genreList;
    
    public Genre(){
        this.genreList = new ArrayList<Genre>();
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<Genre> getGenreList() {
        return genreList;
    }

    public void setGenreList(ArrayList<Genre> genreList) {
        this.genreList = genreList;
    }
    
    public Genre createGenre(String genre){
        Genre g = new Genre();
        g.setGenre(genre);
        g.genreList.add(g);
        
        return g;
    }
    
}
