/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Branch.Branch;
import AppSys.Business;
import UI.SystemAdmin.SysAdminJFrame;
import Branch.UserAccount;
import javax.swing.JFrame;
/**
 *
 * @author narot
 */
public class SystemAdminRole extends Role {
    
    public SystemAdminRole(){
        
    }


    @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount, String branch) {
        return new SysAdminJFrame(business, useraccount, branch);
    }
}
