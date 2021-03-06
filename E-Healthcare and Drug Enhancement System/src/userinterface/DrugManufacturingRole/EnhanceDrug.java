/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DrugManufacturingRole;

import Business.Disease.Disease;
import Business.Disease.DiseaseDirectory;
import Business.Drug.Compound;
import Business.Drug.DrugVersions;
import Business.Drug.Drugs;
import Business.DrugManufacturing.Organization.DrugManufacturingOrganization;
import Business.DrugManufacturing.Organization.DrugTrialOrganization;
import Business.Enterprise.DrugManufacturingEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DrugTrialWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pushkar
 */
public class EnhanceDrug extends javax.swing.JPanel {

    /**
     * Creates new form EnhanceDrug
     */
    JPanel userProcessContainer;
    DrugManufacturingOrganization drugManufacturingOrganization;
    DrugManufacturingEnterprise drugManufacturingEnterprise;
    DiseaseDirectory diseaseDirectory;
    Drugs drug;
    Disease disease;
    UserAccount account;

    public EnhanceDrug(JPanel userProcessContainer, UserAccount account, DrugManufacturingOrganization drugManufacturingOrganization, DrugManufacturingEnterprise drugManufacturingEnterprise, Drugs drug, Disease disease) {
        initComponents();
        this.drugManufacturingEnterprise = drugManufacturingEnterprise;
        this.drugManufacturingOrganization = drugManufacturingOrganization;
        this.userProcessContainer = userProcessContainer;
        this.drug = drug;
        this.disease = disease;
        this.account = account;
        display();
        populateCompoundList();
    }

    public void display() {
        txtDrugName.setText(drug.getName());
        txtDescription.setText(drug.getDescription());
        txtDiseaseCured.setText(drug.getDisease());
        txtFormula.setText(drug.getFormula());
        txtUses.setText(drug.getUses());
        txtRoute.setText(drug.getType().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUses = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltCompounds = new javax.swing.JList();
        txtDiseaseCured = new javax.swing.JTextField();
        txtBenefits = new javax.swing.JTextField();
        lblFormula = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUses1 = new javax.swing.JTextField();
        txtFormula = new javax.swing.JTextField();
        lblDrugName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblDescription = new javax.swing.JLabel();
        lblBenefits = new javax.swing.JLabel();
        lblUses = new javax.swing.JLabel();
        lblUses1 = new javax.swing.JLabel();
        lblRoute = new javax.swing.JLabel();
        lblCompoundUsed = new javax.swing.JLabel();
        lblDiseaseCured = new javax.swing.JLabel();
        txtDrugName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        txtDescription = new javax.swing.JTextField();
        txtRoute = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        txtUses.setEnabled(false);

        jScrollPane1.setViewportView(ltCompounds);

        txtDiseaseCured.setEnabled(false);

        lblFormula.setText("Formula");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENHANCE DRUG");

        txtFormula.setEnabled(false);

        lblDrugName.setText("Drug Name:");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblDescription.setText("Description:");

        lblBenefits.setText("Benefits:");

        lblUses.setText("Uses:");

        lblUses1.setText("Formula:");

        lblRoute.setText("Route:");

        lblCompoundUsed.setText("Compound Used:");

        lblDiseaseCured.setText("Related Disease");

        txtDrugName.setEnabled(false);

        btnCreate.setText("Enhance");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtDescription.setEnabled(false);
        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        txtRoute.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblUses)
                                .addComponent(lblRoute)
                                .addComponent(lblDrugName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDiseaseCured)
                            .addComponent(lblFormula))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFormula, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDrugName)
                                .addComponent(txtDescription)
                                .addComponent(txtUses)
                                .addComponent(txtRoute, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDiseaseCured, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblBenefits, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCompoundUsed)
                                    .addComponent(lblUses1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtUses1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBenefits, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBenefits)
                                    .addComponent(txtBenefits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUses1)
                                .addComponent(txtUses1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtUses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCompoundUsed))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDrugName)
                                .addGap(45, 45, 45)
                                .addComponent(lblDescription)
                                .addGap(36, 36, 36)
                                .addComponent(lblUses)
                                .addGap(38, 38, 38)
                                .addComponent(lblRoute)
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFormula)
                                    .addComponent(txtFormula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDiseaseCured)
                                    .addComponent(txtDiseaseCured, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(txtRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnBack))
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageDrug panel = (ManageDrug) component;
        panel.populateDrugTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        //String sideEffects = txtSideEffects.getText();
        if(validateForm()) {
        String benefits = txtBenefits.getText();
        String vformula = txtUses1.getText();
        DrugVersions drugVersions = drug.getDrugHistory().addDrugVersions("To be tested", benefits, vformula);
        for (Object object : ltCompounds.getSelectedValuesList()) {
            Compound c = (Compound) object;
            drugVersions.getCompoundsUsed().getCompoundsUsedList().add(c);
            drugManufacturingOrganization.getProcuredCompoundList().remove(c);
        }
        drug.setFormula(vformula);
        initiateRequest(drug, drugVersions, disease, account);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    public boolean validateForm() {
    
        if(txtDrugName.getText().equals("") || txtDescription.getText().equals("") || txtUses.getText().equals("")
                || txtBenefits.getText().equals("") || txtFormula.getText().equals("") ||  (ltCompounds.getSelectedIndex()<0)) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
        return true;
        }
    }
    
    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBenefits;
    private javax.swing.JLabel lblCompoundUsed;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDiseaseCured;
    private javax.swing.JLabel lblDrugName;
    private javax.swing.JLabel lblFormula;
    private javax.swing.JLabel lblRoute;
    private javax.swing.JLabel lblUses;
    private javax.swing.JLabel lblUses1;
    private javax.swing.JList ltCompounds;
    private javax.swing.JTextField txtBenefits;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtDiseaseCured;
    private javax.swing.JTextField txtDrugName;
    private javax.swing.JTextField txtFormula;
    private javax.swing.JTextField txtRoute;
    private javax.swing.JTextField txtUses;
    private javax.swing.JTextField txtUses1;
    // End of variables declaration//GEN-END:variables

    private void populateCompoundList() {
        DefaultListModel dlm = new DefaultListModel();
        dlm.clear();

        for (Compound compound : drugManufacturingOrganization.getProcuredCompoundList()) {
            dlm.addElement(compound);
            ltCompounds.setModel(dlm);
        }
    }

    private void initiateRequest(Drugs drug, DrugVersions drugVersions, Disease disease, UserAccount account) {
        DrugTrialWorkRequest request = new DrugTrialWorkRequest();
        request.setDisease(disease);
        request.setDrug(drug);
        request.setDrugVersions(drugVersions);
        request.setSender(account);
        request.setStatus("Sent");
        request.setResult("Drug sent for testing.");

        Organization org = null;
        for (Organization organization : drugManufacturingEnterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof DrugTrialOrganization) {
                org = organization;
                break;
            }
        }

        ((DrugTrialOrganization) org).getWorkQueue().getWorkRequestList().add(request);
        account.getWorkQueue().getWorkRequestList().add(request);
    }

}
