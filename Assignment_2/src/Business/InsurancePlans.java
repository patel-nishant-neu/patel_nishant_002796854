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
public class InsurancePlans {
    
    ArrayList<PlanDetail> InsurancePlans;

    public InsurancePlans(){
        this.InsurancePlans = new ArrayList<PlanDetail>();
    }
    
    public ArrayList<PlanDetail> getInsurancePlans() {
        return InsurancePlans;
    }

    public void setInsurancePlans(ArrayList<PlanDetail> InsurancePlans) {
        this.InsurancePlans = InsurancePlans;
    }
    
    public PlanDetail createInsurance(String PlanID, String PlanName, String Cost){
        
        PlanDetail p = new PlanDetail();
        p.setPlanID(PlanID);
        p.setPlanName(PlanName);
        p.setCostPerMonth(0);
        
        this.InsurancePlans.add(p);
        
        return p;
    }
     
    public Boolean checkIfPlanUnique(String PlanId){
        for (PlanDetail p : this.InsurancePlans){
            if(p.getPlanID().equals(PlanId)){
                return false;
            }
        }
        return true;
    }
    
    public void removeInsurance(String PlanId) {
        for(PlanDetail p : this.InsurancePlans){
            if(p.getPlanID().equals(PlanId)){
                this.InsurancePlans.remove(p);
                break;
            }
        }
    }
}
