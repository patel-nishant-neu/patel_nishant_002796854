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
public class ApplicantDirectory {
    
    ArrayList<Applicant> Applicantlist;
    
    public ApplicantDirectory(){
        this.Applicantlist = new ArrayList<Applicant>();
    }

    public ArrayList<Applicant> getApplicantlist() {
        return Applicantlist;
    }

    public void setApplicantlist(ArrayList<Applicant> Applicantlist) {
        this.Applicantlist = Applicantlist;
    }
        
    public Applicant createApplicant (String id, String FName, String LName, String ApplicationDate){
        Applicant a = new Applicant();
        a.setApplicationID(id);
        a.setOwnerFirstName(FName);
        a.setOwnerLastName(LName);
        a.setApplicationDate(ApplicationDate);
        
        this.Applicantlist.add(a);
        return a;
    }
        
    public Applicant findApplicantByID(String id){
        for(Applicant a: this.Applicantlist){
            if(a.getApplicationID() == id){
                return a;
            }
        }
        return null;
    }
    
    public Applicant findApplicantByName(String name){
        for(Applicant a: this.Applicantlist){
            if(a.getOwnerFirstName() == name | a.getOwnerLastName() == name
                |(a.getOwnerFirstName()+" "+a.getOwnerLastName()) == name
                    | (a.getOwnerLastName()+" "+a.getOwnerFirstName() == name)){
                
                return a;
            }
        }
        return null;
    }
    
    public void removeApplicant (String Id) {
        for(Applicant a : this.Applicantlist){
            if(a.getApplicationID().equals(Id)){
                this.Applicantlist.remove(a);
                break;
            }
        }
    }
    
}
