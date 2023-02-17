/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author nishn
 */
public class Pet {
    
    String PetName;
    String PetAge;
    String PetGender;
    String PetType;
    String Breed;
    
    ArrayList <Pet> petlist;

    public String getPetName() {
        return PetName;
    }

    public void setPetName(String PetName) {
        this.PetName = PetName;
    }

    public String getPetAge() {
        return PetAge;
    }

    public void setPetAge(String PetAge) {
        this.PetAge = PetAge;
    }

    public String getPetGender() {
        return PetGender;
    }

    public void setPetGender(String PetGender) {
        this.PetGender = PetGender;
    }

    public String getPetType() {
        return PetType;
    }

    public void setPetType(String PetType) {
        this.PetType = PetType;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String Breed) {
        this.Breed = Breed;
    }

    public ArrayList<Pet> getPetlist() {
        return petlist;
    }

    public void setPetlist(ArrayList<Pet> petlist) {
        this.petlist = petlist;
    }
    
    
    public Pet createPet(String PetName, String PetAge, String PetGender, String PetType, String Breed){
        Pet p = new Pet();
        p.setPetName(PetName);
        p.setPetAge(PetAge);
        p.setPetGender(PetGender);
        p.setPetType(PetType);
        p.setBreed(Breed);
        
        this.petlist.add(p);
        return p;
        
    }
    
}
