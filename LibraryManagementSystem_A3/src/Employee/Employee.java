/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

import Personnel.Person;

/**
 *
 * @author narot
 */
public class Employee extends Person{
    
    String Exprience;
    String Designation;
    
    public Employee(){
        super();
        this.Designation = Designation;
        this.Exprience = Exprience;
    }

    public String getExprience() {
        return Exprience;
    }

    public void setExprience(String Exprience) {
        this.Exprience = Exprience;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }
    
    
    
}
