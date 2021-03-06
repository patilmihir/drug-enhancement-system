/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LocalPharmacyRole;

import Business.DrugOrders.DrugItems;
import Business.Enterprise.HospitalEnterprise;
import Business.Hospital.Organization.LocalPharmacyOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientDrugRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.DrugTrialRole.ManageDrugTrial;

/**
 *
 * @author vivekshetye
 */
public class PrescribedOrder extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    HospitalEnterprise hospitalEnterprise;
    LocalPharmacyOrganization localPharmacyOrganization;
    /**
     * Creates new form PrescribedOrder
     */
    

    public PrescribedOrder(JPanel userProcessContainer, UserAccount account, HospitalEnterprise hospitalEnterprise, LocalPharmacyOrganization localPharmacyOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.hospitalEnterprise = hospitalEnterprise;
        this.localPharmacyOrganization = localPharmacyOrganization;
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
        tblPrescOrders = new javax.swing.JTable();
        btnSupply = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Prescribed Order");

        tblPrescOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Drug Name", "Quantity", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPrescOrders.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblPrescOrders);
        if (tblPrescOrders.getColumnModel().getColumnCount() > 0) {
            tblPrescOrders.getColumnModel().getColumn(0).setResizable(false);
            tblPrescOrders.getColumnModel().getColumn(1).setResizable(false);
            tblPrescOrders.getColumnModel().getColumn(2).setResizable(false);
            tblPrescOrders.getColumnModel().getColumn(3).setResizable(false);
            tblPrescOrders.getColumnModel().getColumn(4).setResizable(false);
        }

        btnSupply.setText("Supply");
        btnSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplyActionPerformed(evt);
            }
        });

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(436, 436, 436)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(316, 316, 316)
                        .addComponent(btnSupply))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(217, 217, 217))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSupply)
                    .addComponent(jButton1))
                .addGap(237, 237, 237))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplyActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblPrescOrders.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Select a row.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            DrugItems di = (DrugItems) tblPrescOrders.getValueAt(selectedRow, 1);
            
            PatientDrugRequest request = (PatientDrugRequest) tblPrescOrders.getValueAt(selectedRow, 0);
            request.setStatus("Sent");
            
            for(DrugItems drugItems : localPharmacyOrganization.getPharmacyInventory().getPharmacyDrugInventory())
            {
                if(drugItems == di) {
                    drugItems.setAvailableQuantity(drugItems.getAvailableQuantity() - di.getRequestedQuantity());
                }
            }
        }
    }//GEN-LAST:event_btnSupplyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblPrescOrders.getModel();
        dtm.setRowCount(0);
        
        Organization organization = null;
        for(Organization org : hospitalEnterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof LocalPharmacyOrganization) {
             organization = org;
             break;
            }
        }
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
         
            Object[] row = new Object[5];
            
            row[0] = ((PatientDrugRequest) request).getSender();
            row[1] = ((PatientDrugRequest) request);
            row[2] = ((PatientDrugRequest) request).getQuantity();
            row[3] = ((PatientDrugRequest) request).getDrugItems().getSellingPrice();
            row[4] = ((PatientDrugRequest) request).getStatus();
            
            dtm.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSupply;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPrescOrders;
    // End of variables declaration//GEN-END:variables
}
