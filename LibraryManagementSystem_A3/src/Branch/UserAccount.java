/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Branch;

import AppSys.Business;
import Role.LibrarianRole;
import Role.Role;
import Role.SystemAdminRole;
import UI.Librarian.LibrarianJFrame;
import javax.swing.JFrame;

/**
 *
 * @author narot
 */
public class UserAccount {
    
    private static int count = 0;
    private String accountId;
    private String username;
    private String password;
    private String role;
    private String branch;
    Role role1;
    
    public UserAccount() {
        this.accountId = "ACC" + count++;
        this.username = username;
        this.password = password;
        this.role = role;
        this.branch = branch;
    }
    public UserAccount(String username, String password, String role, String branch) {
        this.accountId = "user" + count++;
        this.username = username;
        this.password = password;
        this.role = role;
        this.branch = branch;
    }
    
//    UserAccount(String username, String password, Role role) {
//        this.accountId = "user" + this.count++;
//        this.username = username;
//        this.password = password;
//        this.role = role;
//    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    
    public JFrame getWorkArea(String role, Business business, UserAccount useraccount, String branch) {
        // the abstract class way
        if (role.equals("System Admin")) {
            return new SystemAdminRole().createWorkArea(business, useraccount);
        }
        if (role.equals("Librarian")) {
            return new LibrarianRole().createWorkArea(business, useraccount);
        }
        return null;
    }
    
}
