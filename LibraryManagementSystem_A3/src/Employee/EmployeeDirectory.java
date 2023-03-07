/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

import Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author narot
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;
    
    public EmployeeDirectory(){
        this.employeeList = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployees() {
        return employeeList;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employeeList = employees;
    }
    
    public Employee findByID(String ID) {
        for (Employee e: this.employeeList){
            if(e.getPersonID().equals(ID)){
                return e;
            }
        }
        return null;
    }
    
    public Employee createEmployee(String ID, String name, Integer Exprience, String Designation){
        Employee employee = new Employee();
        employee.setPersonID(ID);
        employee.setName(name);
        employee.setExprience(Exprience);
        employee.setDesignation(Designation);
        this.employeeList.add(employee);
        return employee;
    }
}
