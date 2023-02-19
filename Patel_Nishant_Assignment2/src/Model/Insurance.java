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
public class Insurance {

    String plan_name;
    Integer plan_id;
    Double plan_cost_per_month;
    Double plan_cost_per_annum;
    
    public Insurance(){
        this.plan_name = "" ;
//        this.plan_id = null;
//        this.plan_cost_per_month = null;
//        this.plan_cost_per_annum = null;
    }
    
    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    public Integer getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(Integer plan_id) {
        this.plan_id = plan_id;
    }

    public Double getPlan_cost_per_month() {
        return plan_cost_per_month;
    }

    public void setPlan_cost_per_month(Double plan_cost_per_month) {
        this.plan_cost_per_month = plan_cost_per_month;
    }

    public Double getPlan_cost_per_annum() {
        return plan_cost_per_annum;
    }

    public void setPlan_cost_per_annum(Double plan_cost_per_annum) {
        this.plan_cost_per_annum = plan_cost_per_annum;
    }
    
    public Double calulatePlanCostPerAnnum(Double plan_cost_per_month){
        plan_cost_per_annum = plan_cost_per_month*12;
        return plan_cost_per_annum;
    }
    
    
    @Override
    public String toString() {
        return String.valueOf(this.plan_name);
    }
    
}
