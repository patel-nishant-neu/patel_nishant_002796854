/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSys.Business;
import Branch.UserAccount;
import UI.Librarian.LibrarianJFrame;
import UI.SystemAdmin.SysAdminJFrame;
import javax.swing.JFrame;

/**
 *
 * @author narot
 */
public class LibrarianRole extends Role{
    
    public LibrarianRole(){
        
    }

    @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount) {
        return new LibrarianJFrame(business, useraccount);
    }
}
