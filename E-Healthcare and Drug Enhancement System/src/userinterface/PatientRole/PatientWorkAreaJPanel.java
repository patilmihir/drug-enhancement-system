/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.Enterprise.HospitalEnterprise;
import Business.Hospital.Organization.PatientOrganization;
import Business.Hospital.Organization.ReceptionistOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientRegistrationWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.DrugManufacturingRole.ManageDrug;

/**
 *
 * @author Pushkar
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkArea
     */
    JPanel userProcessContainer;
    UserAccount account;
    PatientOrganization patientOrganization;
    HospitalEnterprise hospitalEnterprise;

    public PatientWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PatientOrganization patientOrganization, HospitalEnterprise hospitalEnterprise) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.account= account;
        this.patientOrganization= patientOrganization;
        this.hospitalEnterprise= hospitalEnterprise;
        jLabel1.setText(account.getPerson().getName());
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnScheduleApp = new javax.swing.JButton();
        btnReqPreDrug = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 102, 102));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(102, 102, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("PATIENT DASHBOARD");

        btnScheduleApp.setText("Schedule an Appointment");
        btnScheduleApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleAppActionPerformed(evt);
            }
        });

        btnReqPreDrug.setText("Request Prescribed Drugs");
        btnReqPreDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqPreDrugActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReqPreDrug)
                            .addComponent(btnScheduleApp))
                        .addGap(181, 181, 181))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnScheduleApp)
                .addGap(29, 29, 29)
                .addComponent(btnReqPreDrug)
                .addGap(259, 259, 259))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnScheduleAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleAppActionPerformed
        // TODO add your handling code here:
        
        PatientRegistrationWorkRequest request = new PatientRegistrationWorkRequest();
        
        request.setSender(account);
        request.setStatus("Sent");
        request.setMessage("Please schedule my appointment");
        Organization organization = null;
        for(Organization org : hospitalEnterprise.getOrganizationDirectory().getOrganizationList()) {
            
            if(org instanceof ReceptionistOrganization)
            {
                organization = org;
                break;
            }
            
        }
        organization.getWorkQueue().getWorkRequestList().add(request);
        account.getWorkQueue().getWorkRequestList().add(request);
    }//GEN-LAST:event_btnScheduleAppActionPerformed

    private void btnReqPreDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqPreDrugActionPerformed
        // TODO add your handling code here:
        RequestPrescribedDrugs rpd = new RequestPrescribedDrugs(userProcessContainer, account, patientOrganization, hospitalEnterprise);
        userProcessContainer.add("RequestPrescribedDrugs", rpd);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnReqPreDrugActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReqPreDrug;
    private javax.swing.JButton btnScheduleApp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}