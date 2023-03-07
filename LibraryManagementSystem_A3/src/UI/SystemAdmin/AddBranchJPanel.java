/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import AppSys.Business;
import Branch.Branch;
import Branch.UserAccount;
import Library.Library;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author narot
 */
public class AddBranchJPanel extends javax.swing.JPanel {

    public Business business;
    public UserAccount useraccount;
    public Branch branch;
    DefaultTableModel tablemodel;
    /**
     * Creates new form AddBranchJPanel
     */
    public AddBranchJPanel() {
        initComponents();

    }
    public AddBranchJPanel(Business business, UserAccount useraccount){
        initComponents();
        this.setVisible(true);
        
        this.business = business;
        this.useraccount = useraccount;
        this.tablemodel = (DefaultTableModel) jShowBranchTable.getModel();
        
        populateTable();
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        addBranchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jShowBranchTable = new javax.swing.JTable();
        deleteBranchBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Branch");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 32, 163, -1));

        jLabel2.setText("Enter Branch Name: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 124, -1, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 121, 162, -1));

        addBranchBtn.setText("Add Branch");
        addBranchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBranchBtnActionPerformed(evt);
            }
        });
        add(addBranchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 121, 107, -1));

        jShowBranchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Branch"
            }
        ));
        jScrollPane1.setViewportView(jShowBranchTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 209, 280, 172));

        deleteBranchBtn.setText("Delete Branch");
        deleteBranchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBranchBtnActionPerformed(evt);
            }
        });
        add(deleteBranchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 421, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addBranchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBranchBtnActionPerformed
        // TODO add your handling code here:
        String branchName = jTextField1.getText();

        //        this.applicationSystem.getBranch().displaybranches();

        if(this.business.getBranch().branchExists(branchName)){
            JOptionPane.showMessageDialog(null, "This branch already exists. Please create new Branch!");
        }else{
            this.business.getBranch().createLibrary(branchName);
        }

        jTextField1.setText("");
        populateTable();
    }//GEN-LAST:event_addBranchBtnActionPerformed

    private void deleteBranchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBranchBtnActionPerformed
        // TODO add your handling code here:
        
        Branch branch = this.business.getBranch();
        int selectedRow = jShowBranchTable.getSelectedRow();
        
        if(selectedRow >=0 ){
            
            Branch selectedBranch = new Branch();
            selectedBranch = (Branch) jShowBranchTable.getValueAt(selectedRow, 0);
            business.getBranch().deleteLibrary(selectedBranch);
        }
        
        populateTable();
        
    }//GEN-LAST:event_deleteBranchBtnActionPerformed

    public void populateTable(){
        tablemodel.setRowCount(0);
        for (Library b: this.business.getBranch().getBranches()){
            Object[] row = new Object[1];
            row[0] = b;
            tablemodel.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBranchBtn;
    private javax.swing.JButton deleteBranchBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jShowBranchTable;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
