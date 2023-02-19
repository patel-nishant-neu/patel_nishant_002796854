/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Applicant;
import Model.ApplicantCatalog;
import Model.Business;
import Model.Insurance;
import javax.swing.JOptionPane;

/**
 *
 * @author shalomdaniel
 */
public class SearchPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchPanel
     */
    private Business business;
    
    public SearchPanel() {
        initComponents();
    }
    
    SearchPanel(Business business) {
        initComponents();
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fieldAppID = new javax.swing.JTextField();
        fieldOwnerFirstname = new javax.swing.JTextField();
        fieldPetAge = new javax.swing.JTextField();
        fieldPetGender = new javax.swing.JTextField();
        fieldAppDate = new javax.swing.JTextField();
        fieldPetBreed = new javax.swing.JTextField();
        fieldOwnerLastName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fieldPetType = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldPetName = new javax.swing.JTextField();
        searchByNameBtn = new javax.swing.JButton();
        fieldSearchByName = new javax.swing.JTextField();
        fieldSearchAppID = new javax.swing.JTextField();
        searchByIDBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        fieldPetVAccine = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        fieldPlanOpted = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fieldPetNoOfVax = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setText("Application Date");

        jLabel4.setText("Owner First Name");

        jLabel8.setText("Pet Gender");

        jLabel5.setText("Owner Last Name");

        jLabel9.setText("Pet Type");

        fieldAppID.setEnabled(false);
        fieldAppID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAppIDActionPerformed(evt);
            }
        });

        fieldOwnerFirstname.setEnabled(false);
        fieldOwnerFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldOwnerFirstnameActionPerformed(evt);
            }
        });

        fieldPetAge.setEnabled(false);
        fieldPetAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPetAgeActionPerformed(evt);
            }
        });

        fieldPetGender.setEnabled(false);
        fieldPetGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPetGenderActionPerformed(evt);
            }
        });

        fieldAppDate.setEnabled(false);
        fieldAppDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAppDateActionPerformed(evt);
            }
        });

        fieldPetBreed.setEnabled(false);
        fieldPetBreed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPetBreedActionPerformed(evt);
            }
        });

        fieldOwnerLastName.setEnabled(false);
        fieldOwnerLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldOwnerLastNameActionPerformed(evt);
            }
        });

        jLabel6.setText("Pet Age");

        jLabel10.setText("Pet Breed");

        jLabel7.setText("Pet Name");

        fieldPetType.setEnabled(false);
        fieldPetType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPetTypeActionPerformed(evt);
            }
        });

        jLabel2.setText("Applicant ID");

        fieldPetName.setEnabled(false);
        fieldPetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPetNameActionPerformed(evt);
            }
        });

        searchByNameBtn.setText("SEARCH BY PET NAME");
        searchByNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByNameBtnActionPerformed(evt);
            }
        });

        searchByIDBtn.setText("SEARCH BY APP ID");
        searchByIDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByIDBtnActionPerformed(evt);
            }
        });

        jLabel11.setText("Pet Vaccine Course Status");

        fieldPetVAccine.setEnabled(false);
        fieldPetVAccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPetVAccineActionPerformed(evt);
            }
        });

        jLabel12.setText("Pet Vaccine Name");

        resetBtn.setText("Reset Search");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jCheckBox1.setEnabled(false);

        fieldPlanOpted.setEnabled(false);
        fieldPlanOpted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPlanOptedActionPerformed(evt);
            }
        });

        jLabel13.setText("Insurance Plan Opted");

        fieldPetNoOfVax.setEnabled(false);
        fieldPetNoOfVax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPetNoOfVaxActionPerformed(evt);
            }
        });

        jLabel14.setText("Number of Vaccines ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchByIDBtn)
                    .addComponent(searchByNameBtn)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldPetAge, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldPetBreed, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldPetName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldPetType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldPetGender, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldOwnerLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldOwnerFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldAppID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldAppDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldSearchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldSearchAppID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fieldPetNoOfVax, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldPetVAccine, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldPlanOpted, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(639, Short.MAX_VALUE)
                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldSearchAppID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByIDBtn))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldSearchByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByNameBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldAppID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldOwnerFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(fieldOwnerLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldAppDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldPetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldPetType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldPlanOpted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldPetAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldPetVAccine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldPetBreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldPetNoOfVax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldPetGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void DisplayDetailsOnSearch(Applicant applicant){
        String id = String.valueOf(applicant.getApp_id());
        fieldAppID.setText(id);
        
        String firstname = applicant.getOwner_firstname();
        fieldOwnerFirstname.setText(firstname);
        
        String lastname = applicant.getOwner_lastname();
        fieldOwnerLastName.setText(lastname);
        
        String petname = applicant.getPet().getPet_name();
        fieldPetName.setText(petname); 
        
        String petType = applicant.getPet().getPet_type();
        fieldPetType.setText(petType);   
        
        String appDate = applicant.getApplication_date();
        fieldAppDate.setText(appDate);         
        
        String petBreed = applicant.getPet().getBreed();
        fieldPetBreed.setText(petBreed); 
        
        String petGender = applicant.getPet().getPet_gender();
        fieldPetGender.setText(petGender); 
         
        String petAge = String.valueOf(applicant.getPet().getPet_age());
        fieldPetAge.setText(petAge);      
        
        String petVaccine = applicant.getPetVaccine().getVaccine_name();
        fieldPetVAccine.setText(petVaccine);
        
        String petInsurancePlan = applicant.getInsurancePlan_assignment().getPlan_name();
        fieldPlanOpted.setText(petInsurancePlan);        
    
                    
        String no_of_vaccines = fieldPetVAccine.getText();
        if(petVaccine.isEmpty()){
            fieldPetNoOfVax.setText(String.valueOf(0));
        }else{
            String[] values = petVaccine.split(",");
            fieldPetNoOfVax.setText(String.valueOf(values.length));      
        }
        
        String petVaccineCourse = String.valueOf(applicant.getPetVaccine().getIsCourseCompleted());
        if(petVaccineCourse == "Yes"){
            jCheckBox1.setSelected(true);
        }else{
            jCheckBox1.setSelected(false);
        }  
    }
    
    
    private void fieldAppIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAppIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAppIDActionPerformed

    private void fieldOwnerFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldOwnerFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldOwnerFirstnameActionPerformed

    private void fieldPetAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPetAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPetAgeActionPerformed

    private void fieldPetGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPetGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPetGenderActionPerformed

    private void fieldAppDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAppDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAppDateActionPerformed

    private void fieldPetBreedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPetBreedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPetBreedActionPerformed

    private void fieldOwnerLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldOwnerLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldOwnerLastNameActionPerformed

    private void fieldPetTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPetTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPetTypeActionPerformed

    private void fieldPetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPetNameActionPerformed

    private void searchByIDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByIDBtnActionPerformed
        // TODO add your handling code here:
        
        ApplicantCatalog appCatalog = this.business.getApplicantCatalog();
        Applicant app = appCatalog.searchApplicantByID(Integer.valueOf(fieldSearchAppID.getText()));
        
        if(app == null){
            JOptionPane.showMessageDialog(null, "Applicant ID not found!");
        }
        else{
            DisplayDetailsOnSearch(app);
        }       
        
    }//GEN-LAST:event_searchByIDBtnActionPerformed

    private void searchByNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByNameBtnActionPerformed
        // TODO add your handling code here:
        
        ApplicantCatalog appCatalog = this.business.getApplicantCatalog();
        Applicant app2 = appCatalog.searchApplicantByName(fieldSearchByName.getText());
        
        if(app2 == null){
            JOptionPane.showMessageDialog(null, "Applicant Pet Name not found!");
        }
        else{
            DisplayDetailsOnSearch(app2);
        }
    }//GEN-LAST:event_searchByNameBtnActionPerformed

    private void fieldPetVAccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPetVAccineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPetVAccineActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        
        fieldAppID.setText("");
        fieldOwnerFirstname.setText("");
        fieldOwnerLastName.setText("");
        
        fieldPetType.setText("");
        fieldPetName.setText("");
        fieldPetBreed.setText("");
        fieldPetGender.setText("");
        fieldPetAge.setText("");
        fieldAppDate.setText("");
        
        fieldPetVAccine.setText("");
        jCheckBox1.setSelected(false);
        
        fieldSearchAppID.setText("");
        fieldSearchByName.setText("");
       
        
    }//GEN-LAST:event_resetBtnActionPerformed

    private void fieldPlanOptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPlanOptedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPlanOptedActionPerformed

    private void fieldPetNoOfVaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPetNoOfVaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPetNoOfVaxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldAppDate;
    private javax.swing.JTextField fieldAppID;
    private javax.swing.JTextField fieldOwnerFirstname;
    private javax.swing.JTextField fieldOwnerLastName;
    private javax.swing.JTextField fieldPetAge;
    private javax.swing.JTextField fieldPetBreed;
    private javax.swing.JTextField fieldPetGender;
    private javax.swing.JTextField fieldPetName;
    private javax.swing.JTextField fieldPetNoOfVax;
    private javax.swing.JTextField fieldPetType;
    private javax.swing.JTextField fieldPetVAccine;
    private javax.swing.JTextField fieldPlanOpted;
    private javax.swing.JTextField fieldSearchAppID;
    private javax.swing.JTextField fieldSearchByName;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchByIDBtn;
    private javax.swing.JButton searchByNameBtn;
    // End of variables declaration//GEN-END:variables
}
