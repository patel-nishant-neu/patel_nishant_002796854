/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Branch;

import Branch.UserAccount;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author narot
 */
public class UserAccountDirectory {
        private ArrayList<UserAccount> useraccountlist;
    
    public UserAccountDirectory() {
        this.useraccountlist = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUseraccountList() {
        return useraccountlist;
    }

    public void setUseraccountList(ArrayList<UserAccount> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public UserAccount createUserAccount(String name, String password, String role, String Branch) {
        UserAccount user = new UserAccount(name, password, role, Branch);
        this.useraccountlist.add(user);
        return user;
    }
    
    public UserAccount authenticateUser(String name, String password, String role) {
        for(UserAccount ua: this.useraccountlist) {
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password) && ua.getRole().equals(role)) {
                return ua;
            }
        }
        return null;
    }
    
//    public UserAccount authenticateEmployeeUnique(String role, String Branch) {
//            for(UserAccount ua: this.useraccountlist) {
                /// Here it should be business branch and not the branch from user Account (Need check)
//            if(ua.getBranch().equals(Branch) && ua.getRole().equals(role)) {
//                return ua;
//            }
//        }
//        return null;
//    }
    
    public UserAccount getUserAccount(String username, String password, String role) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return u;
            }
        }
        
        return null;
    }
    
    public UserAccount findById(String id) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getAccountId().equals(id)) {
                return u;
            }
        }
        
        return null;
    }
}
