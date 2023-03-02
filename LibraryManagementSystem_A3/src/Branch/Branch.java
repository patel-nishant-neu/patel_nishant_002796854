/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Branch;

import AppSys.Business;
import Customer.CustomerDirectory;
import Library.Library;
import Role.BranchSelection;
import Role.SystemAdminRole;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author narot
 */
public class Branch {
    
    private ArrayList<Library> branches;
    
    Library library;
    Business business;
    UserAccountDirectory branchuseraccountDirectory;
    CustomerDirectory branchcustomerdirectory;
    // library object 
    
    public Branch() {
        this.library = new Library();
        this.branches = new ArrayList<Library>();
        this.branchuseraccountDirectory = new UserAccountDirectory();
        this.branchcustomerdirectory = new CustomerDirectory();
        
        UserAccount user = this.branchuseraccountDirectory.createUserAccount("admin", "admin", "System Admin", null);
    }

    public ArrayList<Library> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Library> branches) {
        this.branches = branches;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public UserAccountDirectory getBranchuseraccountDirectory() {
        return branchuseraccountDirectory;
    }

    public void setBranchuseraccountDirectory(UserAccountDirectory branchuseraccountDirectory) {
        this.branchuseraccountDirectory = branchuseraccountDirectory;
    }

    public CustomerDirectory getBranchcustomerdirectory() {
        return branchcustomerdirectory;
    }

    public void setBranchcustomerdirectory(CustomerDirectory branchcustomerdirectory) {
        this.branchcustomerdirectory = branchcustomerdirectory;
    }
    
    
    public Library createLibrary(String branchName){
        Library library = new Library();
        
        library.setBranchName(branchName);

        this.branches.add(library);
        
        System.out.println(branches.size());
        
        return library;
    }
    
    public void displaybranches(){
        Library library = new Library();
        
        for(Library lib: this.branches) {
            System.out.println(lib.getBranchName());           
        }

    }
    
    public Boolean deleteLibrary(Branch branchName) {
        for(Library b: this.branches) {
            if(b.getBranchName().equals(branchName)) {
                this.branches.remove(b);
                break;
            }
        }
        return false;
    }
    
    
    public Boolean branchExists(String branch) {
        for(Library lib: this.branches) {
            if(lib.getBranchName().equals(branch)) {
                return true;
            }
        }
        return false;
    }
    
    public JFrame getWorkArea(Business business, UserAccount user) {
        
        System.out.println("Branch");
        
            return new BranchSelection().getWorkArea(business, user);
    }

}
