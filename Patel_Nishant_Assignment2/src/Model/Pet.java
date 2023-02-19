/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author nishn
 */
public class Pet {

    String pet_name;
    String pet_type;
    String breed;
    Integer pet_age;
    String pet_gender;

    
    public Pet(){
        
    }
    
    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public String getPet_gender() {
        return pet_gender;
    }

    public void setPet_gender(String pet_gender) {
        this.pet_gender = pet_gender;
    }

    public String getPet_type() {
        return pet_type;
    }

    public void setPet_type(String pet_type) {
        this.pet_type = pet_type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getPet_age() {
        return pet_age;
    }

    public void setPet_age(Integer pet_age) {
        this.pet_age = pet_age;
    }
    

}
