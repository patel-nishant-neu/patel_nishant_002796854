/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author narot
 */
public class Magazine {
    
    String id;
    String genre;
    String comapany_name;
    String status;
    float price;
    String language, issue_type;
    String registeredDate;
    String materialType ;


    public Magazine() {
        this.id = id;
        this.status = "Available";
        this.comapany_name = comapany_name;
        this.language = language;
        this.issue_type = issue_type;
        this.registeredDate = registeredDate;
        this.materialType = "Magazine";
    }
    
    public String getComapany_name() {
        return comapany_name;
    }

    public void setComapany_name(String comapany_name) {
        this.comapany_name = comapany_name;
    }

    public String getIssue_type() {
        return issue_type;
    }

    public void setIssue_type(String issue_type) {
        this.issue_type = issue_type;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
        
    @Override
    public String toString(){
        return String.valueOf(this.id);
    }    
}
