/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author nishn
 */
public class PlanDetail {
    
    String PlanID;
    String PlanName;
    int CostPerMonth;
    int CostPerAnnum = CostPerMonth * 12;

    public String getPlanID() {
        return PlanID;
    }

    public void setPlanID(String PlanID) {
        this.PlanID = PlanID;
    }

    public String getPlanName() {
        return PlanName;
    }

    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    public int getCostPerMonth() {
        return CostPerMonth;
    }

    public void setCostPerMonth(int CostPerMonth) {
        this.CostPerMonth = CostPerMonth;
    }

    public int getCostPerAnnum() {
        return CostPerAnnum;
    }

    public void setCostPerAnnum(int CostPerAnnum) {
        this.CostPerAnnum = CostPerAnnum;
    }
    
    
    
}
