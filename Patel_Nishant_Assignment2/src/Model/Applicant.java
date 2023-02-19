/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author shalomdaniel
 */
public class Applicant {

    String owner_firstname;
    String owner_lastname;
    String application_date;
    Integer app_id;
    Pet pet;
    Vaccine petVaccine;
    Insurance insurancePlan_assignment;
    
    
    public Applicant(){
        this.owner_firstname = "";
        this.owner_lastname = "";
        this.application_date = "";
        this.pet = new Pet();
        this.petVaccine = new Vaccine();
        this.insurancePlan_assignment = new Insurance();
    }
    

    
    public Insurance getInsurancePlan_assignment() {
        return insurancePlan_assignment;
    }

    public void setInsurancePlan_assignment(Insurance insurancePlan_assignment) {
        this.insurancePlan_assignment = insurancePlan_assignment;
    }
    
    public Vaccine getPetVaccine() {
        return petVaccine;
    }

    public String getApplication_date() {
        return application_date;
    }

    public void setApplication_date(String application_date) {
        this.application_date = application_date;
    }

    public void setPetVaccine(Vaccine petVaccine) {
        this.petVaccine = petVaccine;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }    
    
    public String getOwner_firstname() {
        return owner_firstname;
    }

    public void setOwner_firstname(String owner_firstname) {
        this.owner_firstname = owner_firstname;
    }

    public String getOwner_lastname() {
        return owner_lastname;
    }

    public void setOwner_lastname(String owner_lastname) {
        this.owner_lastname = owner_lastname;
    }

    public Integer getApp_id() {
        return app_id;
    }

    public void setApp_id(Integer app_id) {
        this.app_id = app_id;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.app_id);
    }
    
}
