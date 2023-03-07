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
public class GenreDirectory {
    ArrayList<Genre> genreList;
        
    public GenreDirectory(){
        this.genreList = new ArrayList<Genre>();
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
        this.genreList.add(g);
        
        return g;
    }
    
    public Genre findGenre(String genre) {
        for(Genre g : this.genreList){
            if(g.getGenre().equals(genre)){
                return g;
            }
        }
        return null;
    }
}
