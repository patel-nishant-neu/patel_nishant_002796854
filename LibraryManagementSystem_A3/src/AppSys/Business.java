/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppSys;

import Branch.Branch;
import Role.SystemAdminRole;
import Branch.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author narot
 */
public class Business {

    private Branch branch;
    UserAccountDirectory topLevelUserAccountDirectory;
    
    public Business() {
        this.branch = new Branch();
        this.topLevelUserAccountDirectory = new UserAccountDirectory();
        
        // CREATING ADMIN
       // this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public UserAccountDirectory getTopLevelUserAccountDirectory() {
        return topLevelUserAccountDirectory;
    }

    public void setTopLevelUserAccountDirectory(UserAccountDirectory topLevelUserAccountDirectory) {
        this.topLevelUserAccountDirectory = topLevelUserAccountDirectory;
    }

    
    public static Business getInstance() {
        return new Business();
    }
}
