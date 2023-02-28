/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

import java.util.ArrayList;

/**
 *
 * @author narot
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employees;
    
    public EmployeeDirectory(){
        this.employees = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
    public Employee findByID(String ID) {
        for (Employee e: this.employees){
            if(e.getPersonID().equals(ID)){
                return e;
            }
        }
        return null;
    }
    
    public Employee createEmployee(String ID, String name, String Exprience, String Designation){
        Employee employee = new Employee();
        employee.setPersonID(ID);
        employee.setName(name);
        employee.setExprience(Exprience);
        employee.setDesignation(Designation);
        this.employees.add(employee);
        return employee;
    }
}
