/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author nishn 
 */
public class PlanDetail {

    private ArrayList<Insurance> planDetails ; 
    
    public PlanDetail(){
        this.planDetails = new ArrayList<Insurance>();
    }
    
        public Insurance createInsurancePlan(Integer planID, String planName, Double planCostpm){
        
        Double planCostpa = planCostpm*12;
        
        Insurance insurance = new Insurance();
        insurance.setPlan_id(planID);
        insurance.setPlan_name(planName);
        insurance.setPlan_cost_per_month(planCostpm);
        
        insurance.setPlan_cost_per_annum(planCostpa);
        
        this.planDetails.add(insurance);
        
        return insurance;
        
    }
    
    public boolean checkInsuranceIDUnique(Integer ID){
        for(Insurance in : this.planDetails){
            if(in.getPlan_id() == ID){
                return false;
            }
        }
        return true;
    }
    
    public void removeInsurancePlan(Integer ID){
          for(Insurance in: this.planDetails){
              if(in.getPlan_id() == ID){
                  this.planDetails.remove(in);
                  break;
              }
          }
    }
    
    public Insurance searchInsuranceByID(Integer ID){
          for(Insurance in: this.planDetails){
              if(in.getPlan_id() == ID){
                  return in;
              }
          }
          return null;
    }
    
    public Insurance searchInsurancePLanByName(String planName){
          for(Insurance in: this.planDetails){
              if(in.plan_name.equals(planName)){
                  return in;
              }
          }
          return null;
    }

    
    public ArrayList<Insurance> getPlanDetails() {
        return planDetails;
    }

    public void setPlanDetails(ArrayList<Insurance> planDetails) {
        this.planDetails = planDetails;
    }
    
}
