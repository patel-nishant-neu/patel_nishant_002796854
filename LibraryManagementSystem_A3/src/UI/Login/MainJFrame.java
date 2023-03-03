package Ui.Login;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import Branch.Branch;
import AppSys.Business;
import Role.Role;
import Branch.UserAccount;
import Branch.UserAccountDirectory;
import javax.swing.JOptionPane;

/**
 *
 * @author Nidhi Raghavendra
 */
public class MainJFrame extends javax.swing.JFrame {

    private Business business;
    private Branch branch;
    private UserAccountDirectory useraccountDirectory;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        this.business = Business.getInstance();
        this.useraccountDirectory = business.getBranch().getBranchuseraccountDirectory();
        this.branch = business.getBranch();
        
        populateDropdown();
    }

    public MainJFrame(Business business, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        
        this.business = business;
        this.useraccountDirectory = business.getBranch().getBranchuseraccountDirectory();
        this.branch = business.getBranch();
        
        populateDropdown();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxRole = new javax.swing.JComboBox<>();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to NEU Library");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Username)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String username = Username.getText();
        String password = Password.getText();
        String role = (String) comboBoxRole.getSelectedItem();

//        UserAccountDirectory ua = this.applicationSystem.getBranch().getUserAccountDirectory();

        if (this.useraccountDirectory.authenticateUser(username, password, role) != null) {
            
            UserAccount user = this.useraccountDirectory.getUserAccount(username, password, role);
            String branch = user.getBranch();
            this.setVisible(false);
            user.getWorkArea(role, business, user, branch);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
        }
        
//        Boolean foundUser = false;
//        
//        if(this.business.getTopLevelUserAccountDirectory().authenticateUser(Username.getText(), Username.getText()) != null) {
//            UserAccount user = this.business.getTopLevelUserAccountDirectory().authenticateUser(Username.getText(), Username.getText());
//            foundUser = true;
//            user.getRole().createWorkArea(business, branch, useraccount);
//            this.setVisible(false);
//        } else {
//            for(Branch branch: this.business.getBranches()) {
//                if(branch.getBranchuseraccountDirectory().authenticateUser(Password.getText(), Password.getText()) != null) {
//                    UserAccount branchUser = branch.getBranchuseraccountDirectory().authenticateUser(Password.getText(), Password.getText());
//                    foundUser = true;
//                    branchUser.getRole().createWorkArea(business, branch, useraccount);
//                    this.setVisible(false);
//                }
//            }
//        }
//        // if user not found
//        if(!foundUser) {
//            JOptionPane.showMessageDialog(null, "Invalid Credentials");
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

        public void populateDropdown() {
        comboBoxRole.removeAllItems();
        
        for(String rolename: Role.getAllRoles()) {
            comboBoxRole.addItem(rolename);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JComboBox<String> comboBoxRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}