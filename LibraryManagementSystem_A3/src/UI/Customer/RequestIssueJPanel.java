/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Customer;

import AppSys.Business;
import Branch.Branch;
import Branch.UserAccount;
import Customer.Customer;
import Library.Book;
import Library.BookCollection;
import Library.Library;
import Library.Magazine;
import Library.MagazineCollection;
import Library.Material;
import Services.RentRequest;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author narot
 */
public class RequestIssueJPanel extends javax.swing.JPanel {

    Business business;
    UserAccount useraccount;
    Branch branch;
    DefaultTableModel tableModel1;
    DefaultTableModel tableModel2;
    Book selectedBook;
    Magazine selectedMag;
    Material selectedMaterial; 
    String selectedBook_branch;
    String selectedBook_branch_mag;
    /**
     * Creates new form RequestIssueJPanel
     */
    public RequestIssueJPanel() {
        initComponents();
    }
    
    public RequestIssueJPanel(Business business, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.business = business;
        this.useraccount = useraccount;
        
        this.tableModel1 = (DefaultTableModel) jTable1.getModel();
        this.tableModel2 = (DefaultTableModel) jTable2.getModel();
        
        populateBooks();
        populateMags();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBookRentBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBookReturnBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jNoDaysBook = new javax.swing.JTextField();
        jReturnMagBtn = new javax.swing.JButton();
        jRentMagBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jNoDaysMag = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rent Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 163, -1));

        jBookRentBtn.setText("Rent Book");
        jBookRentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBookRentBtnActionPerformed(evt);
            }
        });
        add(jBookRentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 120, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial No.", "Material Type", "Publication", "Genre", "Language", "Issue Type", "Registered Date", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 850, 240));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial No.", "Material Type", "Name", "Author", "Genre", "Language", "Pages", "Registered Date", "Binding", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 850, 240));

        jBookReturnBtn.setText("Return Book");
        jBookReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBookReturnBtnActionPerformed(evt);
            }
        });
        add(jBookReturnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 120, -1));

        jLabel3.setText("Book rent duration");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));
        add(jNoDaysBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 80, -1));

        jReturnMagBtn.setText("Return Magazine");
        jReturnMagBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReturnMagBtnActionPerformed(evt);
            }
        });
        add(jReturnMagBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 120, -1));

        jRentMagBtn.setText("Rent Magazine");
        jRentMagBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRentMagBtnActionPerformed(evt);
            }
        });
        add(jRentMagBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 120, -1));

        jLabel4.setText("Book rent duration");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));
        add(jNoDaysMag, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 80, -1));

        jLabel5.setText("Book rent duration");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    public void populateBooks() {
        
        tableModel1.setRowCount(0);
        
        BookCollection books = this.business.getBranch().getLibrary().getBooks();
        
        
        for(Library lib : this.business.getBranch().getBranches()) {
            for(Book a : lib.getBooks().getBooks()){
                
                Object row[] = new Object[12];
                row[0] = a;
                row[1] = a.getMaterialType();
                row[2] = a.getBookName();
                row[3] = a.getAuthorName();
                row[4] = a.getGenreName();
                row[5] = a.getNo_of_pages();
                row[6] = a.getLanguage();
                row[7] = a.getRegisteredDate();
                row[8] = a.getBindingType();
                row[9] = lib.getBranchName();
                row[10] = a.getStatus();
                row[11] = a.getPrice();

                tableModel1.addRow(row);
            }

        }
        
        Customer c = this.business.getBranch().getBranchcustomerdirectory().findById(useraccount.getAccountId());
        
        if(c.getCustomerRentalList().size() > 0){
            for(RentRequest r : c.getCustomerRentalList()){
                System.out.println("\nRental ID : " + r.getOrderId());
            }
        }
        
    }
    
    public void populateMags(){
        
        MagazineCollection md = this.business.getBranch().getLibrary().getMd();
       
        if(md.getMagazines().size() > 0){
            
            tableModel2.setRowCount(0);
            for(Library lib : this.business.getBranch().getBranches()) {
                for(Magazine m : md.getMagazines()){

                    Object row[] = new Object[10];
                    row[0] = m;
                    row[1] = m.getMaterialType();
                    row[2] = m.getComapany_name();
                    row[3] = m.getGenre();
                    row[4] = m.getLanguage();
                    row[5] = m.getIssue_type();
                    row[6] = m.getRegisteredDate();
                    row[7] = lib.getBranchName();
                    row[8] = m.getStatus();
                    row[9] = m.getPrice();
                    
                    tableModel2.addRow(row);
                    System.out.println(m.getStatus());
                }
            }
        }
        else{
            System.out.println("Empty List");
        }   
    }
    private void jRentMagBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRentMagBtnActionPerformed
        // TODO add your handling code here:
        int duration_of_days = Integer.parseInt(jNoDaysMag.getText());
        int selectedRowMag = jTable2.getSelectedRow();
        String materialType = "Magazine";

        this.selectedMag = (Magazine) jTable2.getValueAt(selectedRowMag, 0);
        
        this.selectedBook_branch_mag = (String) jTable2.getValueAt(selectedRowMag, 8);

        for(Library lib : this.business.getBranch().getBranches()){
            if(lib.getBranchName().equals(selectedBook_branch_mag)){
                System.out.println("THIS BRANCH NAME IS " + lib.getBranchName());
                this.business.getBranch().setLibrary(lib);
                break;
            }
        }

        System.out.println("\nBOOOK BRANHC " + this.business.getBranch().getLibrary().getBranchName());

        System.out.println(useraccount.getAccountId());
        System.out.println(this.business.getBranch().getBranchcustomerdirectory().getCustomerlist().size());

        //        System.out.println(c.getName());
        Customer c = this.business.getBranch().getBranchcustomerdirectory().findById(useraccount.getAccountId());
        // create order
//        selectedMaterial.setBook(selectedBook);
        
        RentRequest r_mag =  this.business.getBranch().getLibrary().getRentalRequestDirectory().requestOrderMag(c, selectedMag, duration_of_days, materialType);

        System.out.println(duration_of_days);
        
        selectedMag.setStatus("PENDING RENTAL APPROVAL");
        
        System.out.println("Size" + this.business.getBranch().getLibrary().getRentalRequestDirectory().getOrderlist().size());

        
//        populateBooks();
        populateMags();
    }//GEN-LAST:event_jRentMagBtnActionPerformed

    private void jBookRentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBookRentBtnActionPerformed
        // TODO add your handling code here:
        int duration_of_days = Integer.parseInt(jNoDaysBook.getText());
        int selectedRow = jTable1.getSelectedRow();
        String materialType = "Book";

        this.selectedBook = (Book) jTable1.getValueAt(selectedRow, 0);
        
        this.selectedBook_branch = (String) jTable1.getValueAt(selectedRow, 9);

        for(Library lib : this.business.getBranch().getBranches()){
            if(lib.getBranchName().equals(selectedBook_branch)){
                System.out.println("THIS BRANCH NAME IS " + lib.getBranchName());
                this.business.getBranch().setLibrary(lib);
                break;
            }
        }
//
//        System.out.println("\nBOOOK BRANHC " + this.business.getBranch().getLibrary().getBranchName());
//
//        System.out.println(useraccount.getAccountId());
//        System.out.println(this.business.getCustomerDirectory().getCustomerlist().size());

        //        System.out.println(c.getName());
        Customer c = this.business.getBranch().getBranchcustomerdirectory().findById(useraccount.getAccountId());
        // create order
//        selectedMaterial.setBook(selectedBook);
        RentRequest r =  this.business.getBranch().getLibrary().getRentalRequestDirectory().requestOrder(c, selectedBook, duration_of_days, materialType);
        
        selectedBook.setStatus("PENDING RENTAL APPROVAL");
        
        populateBooks();
    }//GEN-LAST:event_jBookRentBtnActionPerformed

    private void jBookReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBookReturnBtnActionPerformed
        // TODO add your handling code here:
        Customer c = this.business.getBranch().getBranchcustomerdirectory().findById(useraccount.getAccountId());
        int selectedRow = jTable1.getSelectedRow();

        this.selectedBook = (Book) jTable1.getValueAt(selectedRow, 0);
        this.selectedBook_branch = (String) jTable1.getValueAt(selectedRow, 4);

        for(Library lib : this.business.getBranch().getBranches()){
            if(lib.getBranchName().equals(selectedBook_branch)){
                System.out.println("THIS BRANCH NAME IS " + lib.getBranchName());
                this.business.getBranch().setLibrary(lib);
                break;
            }
        }

        this.selectedBook.setStatus("AVAILABLE");
        populateBooks();
    }//GEN-LAST:event_jBookReturnBtnActionPerformed

    private void jReturnMagBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReturnMagBtnActionPerformed
        // TODO add your handling code here:
        Customer c = this.business.getBranch().getBranchcustomerdirectory().findById(useraccount.getAccountId());
        int selectedRow = jTable2.getSelectedRow();

        this.selectedMag = (Magazine) jTable2.getValueAt(selectedRow, 0);
        this.selectedBook_branch = (String) jTable2.getValueAt(selectedRow, 4);

        for(Library lib : this.business.getBranch().getBranches()){
            if(lib.getBranchName().equals(selectedBook_branch)){
                System.out.println("THIS BRANCH NAME IS " + lib.getBranchName());
                this.business.getBranch().setLibrary(lib);
                break;
            }
        }

        this.selectedMag.setStatus("AVAILABLE");
        populateMags(); 
    }//GEN-LAST:event_jReturnMagBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBookRentBtn;
    private javax.swing.JButton jBookReturnBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jNoDaysBook;
    private javax.swing.JTextField jNoDaysMag;
    private javax.swing.JButton jRentMagBtn;
    private javax.swing.JButton jReturnMagBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
