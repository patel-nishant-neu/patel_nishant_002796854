/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nishn 
 */
public class ApplicantCatalog {

    private ArrayList<Applicant> applicants ; 

    public ApplicantCatalog(){
        this.applicants = new ArrayList<Applicant>();
    }
    
    public ArrayList<Applicant> getApplicants() {
        return applicants;
    }

    public void setApplicants(ArrayList<Applicant> applicants) {
        this.applicants = applicants;
    }
    
    public Applicant createApplicant(String firstname, String lastname, Integer appID, String petName, String petType, String Breed, String petGender, Integer petAge, String vaccine, String vaccineStatus, String app_date ){
        Applicant applicant = new Applicant();
        applicant.setOwner_firstname(firstname);
        applicant.setOwner_lastname(lastname);
        applicant.setApp_id(appID); 
        applicant.setApplication_date(app_date); 
        
        applicant.getPet().setPet_name(petName);
        applicant.getPet().setPet_type(petType);
        applicant.getPet().setBreed(Breed);
        applicant.getPet().setPet_age(petAge);
        applicant.getPet().setPet_gender(petGender);
        applicant.getPetVaccine().setVaccine_name(vaccine);
        applicant.getPetVaccine().setIsCourseCompleted(vaccineStatus);
        
        this.applicants.add(applicant);
        
        return applicant;
        
    }
    
    public boolean checkApplicationIDUnique(Integer ID){
        for(Applicant m : this.applicants){
            if(m.getApp_id() == ID){
                return false;
            }
        }
        return true;
    }
    
    public void removeApplicant(Integer ID){
          for(Applicant app: this.applicants){
              if(app.getApp_id() == ID){
                  this.applicants.remove(app);
                  break;
              }
          }
    }
    
    public Applicant searchApplicantByID(Integer ID){
          for(Applicant app: this.applicants){
              if(app.getApp_id() == ID) {
                  return app;
              }
          }
          return null;
    }
    
    public Applicant searchApplicantByName(String name){
          for(Applicant app: this.applicants){
              if(app.getOwner_firstname().equals(name)){
                  return app;
              }
          }
          return null;
    } 
 
}
