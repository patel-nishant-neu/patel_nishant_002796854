/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSys.Business;
import Branch.UserAccount;
import UI.BranchManager.BranchManagerJFrame;
import javax.swing.JFrame;

/**
 *
 * @author narot
 */
public class BranchmanagerRole extends Role{

    public BranchmanagerRole(){
        
    }
    @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount, String branch) {
        return new BranchManagerJFrame(business, useraccount, branch);
    }
    
}
