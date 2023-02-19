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
public class Business {

    ApplicantCatalog applicantCatalog;
    PlanDetail insuranceDetail;
    
    public Business(){
        this.applicantCatalog = new ApplicantCatalog();
        this.insuranceDetail = new PlanDetail();
    }

    public static Business getBusinessInstance(){
        return new Business();
    }
    
    public ApplicantCatalog getApplicantCatalog() {
        return applicantCatalog;
    }

    public void setApplicantCatalog(ApplicantCatalog applicantCatalog) {
        this.applicantCatalog = applicantCatalog;
    }

    public PlanDetail getInsuranceDetail() {
        return insuranceDetail;
    }

    public void setInsuranceDetail(PlanDetail insuranceDetail) {
        this.insuranceDetail = insuranceDetail;
    }
    
}
