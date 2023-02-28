/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSys.Business;
import Branch.Branch;
import Branch.UserAccount;
import Ui.Login.MainJFrame;
import javax.swing.JFrame;

/**
 *
 * @author narot
 */
public class BranchSelection {
    
    public BranchSelection(){
        
    }
    
    public JFrame getWorkArea(Business business, UserAccount user) {
        
        System.out.println("HEREee 2");
        return new MainJFrame(business, user );
    }
}
