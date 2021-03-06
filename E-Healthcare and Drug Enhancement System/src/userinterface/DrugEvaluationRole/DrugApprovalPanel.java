/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DrugEvaluationRole;

import Business.Drug.DrugVersions;
import Business.Drug.Drugs;
import Business.DrugManufacturing.Organization.MassProductionOrganization;
import Business.DrugOrders.DrugItems;
import Business.Enterprise.DrugManufacturingEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FDAEnterprise;
import Business.FDA.Organization.DrugEvaluationOrganization;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MassProductionWorkRequest;
import Business.WorkQueue.DrugEvaluationWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.DrugTrialRole.ManageDrugTrial;

/**
 *
 * @author vivekshetye
 */
public class DrugApprovalPanel extends javax.swing.JPanel {

    /**
     * Creates new form DrugApprovalPanel
     */
    private JPanel userProcesscontainer;
    private UserAccount account;
    private FDAEnterprise fDAEnterprise;
    private Network network;
    private DrugEvaluationOrganization drugEvaluationOrganization;

    public DrugApprovalPanel(JPanel userProcessContainer, UserAccount account, DrugEvaluationOrganization drugEvaluationOrganization, FDAEnterprise fdaEnterprise, Network network) {
        initComponents();

        this.userProcesscontainer = userProcessContainer;
        this.account = account;
        this.drugEvaluationOrganization = drugEvaluationOrganization;
        this.fDAEnterprise = fdaEnterprise;
        this.network = network;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblApprovedDrugs = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Drug Approval Panel");

        tblApprovedDrugs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Drug Name", "Drug Version", "Formula", "Request Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblApprovedDrugs);
        if (tblApprovedDrugs.getColumnModel().getColumnCount() > 0) {
            tblApprovedDrugs.getColumnModel().getColumn(0).setResizable(false);
            tblApprovedDrugs.getColumnModel().getColumn(1).setResizable(false);
            tblApprovedDrugs.getColumnModel().getColumn(2).setResizable(false);
            tblApprovedDrugs.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setText("Notify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(554, 554, 554)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(299, 299, 299))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(282, 282, 282))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selected = tblApprovedDrugs.getSelectedRow();
        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Select a row.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            MassProductionWorkRequest dar = new MassProductionWorkRequest();
            DrugItems di = new DrugItems();
            di.setDrug((Drugs) tblApprovedDrugs.getValueAt(selected, 0));

            dar.setDrugItems(di);
            dar.setDrugVersions((DrugVersions) tblApprovedDrugs.getValueAt(selected, 1));
            dar.setSender(account);
            dar.setRequestDate(new Date());
            dar.setStatus("Sent");

            Organization org = null;
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof DrugManufacturingEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof MassProductionOrganization) {
                            org = organization;
                            break;
                        }
                    }
                    break;
                }
            }

            org.getWorkQueue().getWorkRequestList().add(dar);
            account.getWorkQueue().getWorkRequestList().add(dar);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
userProcesscontainer.remove(this);
        
        CardLayout layout = (CardLayout) userProcesscontainer.getLayout();
        layout.previous(userProcesscontainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblApprovedDrugs.getModel();

        dtm.setRowCount(0);

        for (WorkRequest request : drugEvaluationOrganization.getWorkQueue().getWorkRequestList()) {

            if (((DrugEvaluationWorkRequest) request).getDrugVersions().isFdaApproved()) {

                Object[] row = new Object[4];
                row[0] = ((DrugEvaluationWorkRequest) request).getDrug();
                row[1] = ((DrugEvaluationWorkRequest) request).getDrugVersions();
                row[2] = ((DrugEvaluationWorkRequest) request).getDrugVersions().getFormula();
                row[3] = checkRequestStatus(((DrugEvaluationWorkRequest) request).getDrug(), ((DrugEvaluationWorkRequest) request).getDrugVersions());
                dtm.addRow(row);
            }
        }
    }

    public String checkRequestStatus(Drugs drug, DrugVersions drugVersions) {

        Organization organization = null;

        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (ent instanceof DrugManufacturingEnterprise) {

                for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {

                    if (org instanceof MassProductionOrganization) {
                        organization = org;
                        break;
                    }
                }
                break;
            }
        }

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if (request instanceof MassProductionWorkRequest) {
                if ((((MassProductionWorkRequest) request).getDrugItems().getDrug() == drug) && (((MassProductionWorkRequest) request).getDrugVersions() == drugVersions)) {
                    return "Sent";
                }
            }
        }
        return "Not yet";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblApprovedDrugs;
    // End of variables declaration//GEN-END:variables
}
