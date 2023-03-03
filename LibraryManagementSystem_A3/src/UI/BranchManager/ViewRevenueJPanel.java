/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.BranchManager;

import AppSys.Business;
import Branch.Branch;
import Branch.UserAccount;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author narot
 */
public class ViewRevenueJPanel extends javax.swing.JPanel {

    Business business;
    UserAccount useraccount;
    Branch branch;
    DefaultTableModel tableModel1;
    /**
     * Creates new form ViewRevenueJPanel
     */
    public ViewRevenueJPanel() {
        initComponents();
    }
    
    public ViewRevenueJPanel(Business business, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        
        this.business = business;
        this.useraccount = useraccount;
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
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("jLable1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 170, -1));

        jLabel2.setText("Total revenue of the year is: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("View Total Revenue");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 250, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
