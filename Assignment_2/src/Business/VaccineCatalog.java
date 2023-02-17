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
public class VaccineCatalog {
        ArrayList<Vaccine> VaccineList;

    public VaccineCatalog(){
        this.VaccineList = new ArrayList<Vaccine>();
    }
    
        public ArrayList<Vaccine> getVaccineList() {
        return VaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> VaccineList) {
        this.VaccineList = VaccineList;
    }
    
    public Vaccine createVaccine(String name, boolean Status){
        Vaccine Vaccine = new Vaccine();
        Vaccine.setVaccineName(name);
        Vaccine.setCourseCompleted(Status);
        
        this.VaccineList.add(Vaccine);
        return Vaccine;                
    }
    
    public Boolean checkIfVaccineUnique(String name){
        for(Vaccine med : this.VaccineList){
            if(med.getVaccineName().equals(name)){
                return false;
            }
        }
        return true;
    }
    
    public void removeVaccine(String name){
        for (Vaccine med: this.VaccineList){
            if(med.getVaccineName().equals(name)){
                this.VaccineList.remove(med);
                break;
            }
        }
    }
    
}
