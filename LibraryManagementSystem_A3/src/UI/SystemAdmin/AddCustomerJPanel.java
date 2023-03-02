/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import AppSys.Business;
import Branch.Branch;
import Branch.UserAccount;
import Branch.UserAccountDirectory;
import Customer.Customer;
import Library.Library;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author narot
 */
public class AddCustomerJPanel extends javax.swing.JPanel {

    public Business business;
    public Branch branch;
    public UserAccount usersccount;
    DefaultTableModel tableModel;
    /**
     * Creates new form AddCustomerJPanel
     */
    public AddCustomerJPanel() {
        initComponents();
    }

    AddCustomerJPanel(Business business, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        
        this.business = business;
        this.usersccount = useraccount;
        this.tableModel = (DefaultTableModel) jCustomerTable.getModel();
        
        showBranches();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldname1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldusername1 = new javax.swing.JTextField();
        fieldPassword1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        showBranches = new javax.swing.JComboBox<>();
        addCustomerBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jCustomerTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Customers");

        jLabel5.setText("Enter Customer Username : ");

        jLabel2.setText("Enter Customer Password : ");

        jLabel3.setText("Enter Customer Name : ");

        jLabel6.setText("Select Customer Branch : ");

        addCustomerBtn.setText("Add Customer");
        addCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerBtnActionPerformed(evt);
            }
        });

        jCustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Name", "Username", "Password", "Branch"
            }
        ));
        jScrollPane2.setViewportView(jCustomerTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fieldname1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldusername1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldPassword1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showBranches, 0, 138, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(addCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fieldname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldusername1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(showBranches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(addCustomerBtn)
                .addGap(83, 83, 83)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerBtnActionPerformed
        // TODO add your handling code here:
        UserAccountDirectory ua = this.business.getBranch().getBranchuseraccountDirectory();
        String branch = (String) showBranches.getSelectedItem();
        String branchValue = showBranches.getSelectedItem().toString();
        
        if(ua.authenticateUser(fieldusername1.getText(), fieldPassword1.getText(), "Customer") == null) {
            // save the customer obj for user and useraccount credentials
            UserAccount user = this.business.getBranch().getBranchuseraccountDirectory().createUserAccount(fieldusername1.getText(), fieldPassword1.getText(), "Customer", branchValue);
            this.business.getBranch().getBranchcustomerdirectory().createCustomer(user.getAccountId(), fieldname1.getText());
            populateTable();
        }
        else {
            JOptionPane.showMessageDialog(null, "Sorry credentials are taken.");
        }
    }//GEN-LAST:event_addCustomerBtnActionPerformed

        private void showBranches() {
            showBranches.removeAllItems();

            for (Library lib : this.business.getBranch().getBranches()){
                showBranches.addItem(String.valueOf(lib));
            }
        }
        
        private void populateTable() {
            tableModel.setRowCount(0);
        
            for(Customer c: this.business.getBranch().getBranchcustomerdirectory().getCustomerlist()) {
                UserAccount u = this.business.getBranch().getBranchuseraccountDirectory().findById(c.getPersonID());
                Object[] row = new Object[5];

                row[0] = c.getPersonID();
                row[1] = c.getName();
                row[2] = u.getUsername();
                row[3] = u.getPassword();
                row[4] = u.getBranch();

                tableModel.addRow(row);
            }
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerBtn;
    private javax.swing.JTextField fieldPassword1;
    private javax.swing.JTextField fieldname1;
    private javax.swing.JTextField fieldusername1;
    private javax.swing.JTable jCustomerTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> showBranches;
    // End of variables declaration//GEN-END:variables


}
