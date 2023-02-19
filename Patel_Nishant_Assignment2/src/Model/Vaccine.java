/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author shalomdaniel
 */
public class Vaccine {

    String vaccine_name;
    String isCourseCompleted;
    
    public Vaccine(){
        
    }
    
    public String getVaccine_name() {
        return vaccine_name;
    }

    public void setVaccine_name(String vaccine_name) {
        this.vaccine_name = vaccine_name;
    }

    public String getIsCourseCompleted() {
        return isCourseCompleted;
    }

    public void setIsCourseCompleted(String isCourseCompleted) {
        this.isCourseCompleted = isCourseCompleted;
    }

}
