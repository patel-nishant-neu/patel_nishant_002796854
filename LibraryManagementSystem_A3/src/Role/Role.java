/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSys.Business;
import Branch.Branch;
import Branch.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author narot
 */
public abstract class Role {
        
    static String[] roles = {"Branch Manager", "System Admin", "Customer", "Librarian"};
    
    public static String[] getAllRoles() {
        return roles;
    }
    
    public abstract JFrame createWorkArea(Business library, UserAccount useraccount);
}
