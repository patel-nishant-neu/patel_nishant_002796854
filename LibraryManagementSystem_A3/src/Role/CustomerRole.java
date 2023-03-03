/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSys.Business;
import Branch.UserAccount;
import UI.Customer.CustomerJFrame;
import javax.swing.JFrame;

/**
 *
 * @author narot
 */
public class CustomerRole extends Role{

    public CustomerRole(){
        
    }
    
    @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount, String branch) {
        return new CustomerJFrame(business, useraccount, branch);
    }
    
}
