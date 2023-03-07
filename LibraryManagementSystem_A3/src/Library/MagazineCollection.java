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
public class MagazineCollection {

   private ArrayList<Magazine> magazines ; 

    public MagazineCollection() {
        this.magazines = new ArrayList<Magazine>();
    }
    
    public ArrayList<Magazine> getMagazines() {
        return magazines;
    }

    public void setMagazines(ArrayList<Magazine> books) {
        this.magazines = books;
    }
    
    public Magazine addMagazines(String id, String comapny_name, String genre, String language, String issueType, String regDate, Float price){
        Magazine magazine = new Magazine();
        
        magazine.setId(id);
        magazine.setComapany_name(comapny_name);
        magazine.setGenre(genre);
        magazine.setLanguage(language);
        magazine.setIssue_type(issueType);
        magazine.setRegisteredDate(regDate);
        magazine.setPrice(price);
        
        this.magazines.add(magazine);
        
        return magazine;
        
    }    
}

