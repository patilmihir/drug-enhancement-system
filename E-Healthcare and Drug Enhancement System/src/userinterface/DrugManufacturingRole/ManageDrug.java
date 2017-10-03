/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DrugManufacturingRole;

import Business.Disease.Disease;
import Business.Disease.DiseaseDirectory;
import Business.Drug.Drugs;
import Business.DrugManufacturing.Organization.DrugManufacturingOrganization;
import Business.Enterprise.DrugManufacturingEnterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.DrugTrialRole.DrugTrialWorkAreaJPanel;

/**
 *
 * @author Mihir
 */
public class ManageDrug extends javax.swing.JPanel {

    /**
     * Creates new form ManageDrug
     */
    JPanel userProcessContainer;
    DrugManufacturingOrganization drugManufacturingOrganization;
    DrugManufacturingEnterprise drugManufacturingEnterprise;
    DiseaseDirectory diseaseDirectory;
    UserAccount account;

    public ManageDrug(JPanel userProcessContainer, UserAccount account, DrugManufacturingOrganization drugManufacturingOrganization, DrugManufacturingEnterprise drugManufacturingEnterprise, DiseaseDirectory diseaseDirectory) {
        initComponents();
        this.drugManufacturingEnterprise = drugManufacturingEnterprise;
        this.userProcessContainer = userProcessContainer;
        this.drugManufacturingOrganization = drugManufacturingOrganization;
        this.diseaseDirectory = diseaseDirectory;
        this.account = account;
        populateDrugTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageDrug = new javax.swing.JTable();
        btnEnhanceDrug = new javax.swing.JButton();
        btnViewHistory = new javax.swing.JButton();
        btnViewDiseases = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(102, 102, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("MANAGE DRUG");

        tblManageDrug.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Name", "Route", "Description", "Use", "Disease Treated", "Formula"
            }
        ));
        jScrollPane1.setViewportView(tblManageDrug);

        btnEnhanceDrug.setText("Enhance Drug");
        btnEnhanceDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnhanceDrugActionPerformed(evt);
            }
        });

        btnViewHistory.setText("View History");
        btnViewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHistoryActionPerformed(evt);
            }
        });

        btnViewDiseases.setText("View Diseases");
        btnViewDiseases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDiseasesActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton1)
                        .addGap(62, 62, 62)
                        .addComponent(btnEnhanceDrug)
                        .addGap(76, 76, 76)
                        .addComponent(btnViewHistory)
                        .addGap(62, 62, 62)
                        .addComponent(btnViewDiseases)
                        .addContainerGap(253, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(397, 397, 397))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnhanceDrug)
                    .addComponent(btnViewHistory)
                    .addComponent(btnViewDiseases)
                    .addComponent(jButton1))
                .addGap(221, 221, 221))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDiseasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDiseasesActionPerformed
        ViewDiseases vd = new ViewDiseases(userProcessContainer, account, drugManufacturingOrganization, drugManufacturingEnterprise, diseaseDirectory);
        userProcessContainer.add("ViewDiseases", vd);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewDiseasesActionPerformed

    private void btnEnhanceDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnhanceDrugActionPerformed
        Disease dis = null;
        int selectedRow = (Integer) tblManageDrug.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Drugs drug = (Drugs) tblManageDrug.getValueAt(selectedRow, 1);
            for (Disease d : diseaseDirectory.getDiseaseList()) {
                if (drug.getDisease().equals(d.getName())) {
                    dis = d;
                    break;

                }
            }
            EnhanceDrug ed = new EnhanceDrug(userProcessContainer, account,drugManufacturingOrganization, drugManufacturingEnterprise, drug,dis);
            userProcessContainer.add("EnhanceDrug", ed);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnEnhanceDrugActionPerformed

    private void btnViewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHistoryActionPerformed
        // TODO add your handling code here:
        int selectedRow = (Integer) tblManageDrug.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Drugs drug = (Drugs) tblManageDrug.getValueAt(selectedRow, 1);
            ViewHistory vh = new ViewHistory(userProcessContainer, drug);
            userProcessContainer.add("ViewHistory", vh);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewHistoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DrugManufacturingWorkAreaJPanel panel = (DrugManufacturingWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnhanceDrug;
    private javax.swing.JButton btnViewDiseases;
    private javax.swing.JButton btnViewHistory;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblManageDrug;
    // End of variables declaration//GEN-END:variables

    public void populateDrugTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblManageDrug.getModel();
        dtm.setRowCount(0);
        for (Drugs drug : drugManufacturingEnterprise.getDrugDirectory().getDrugList()) {
            Object row[] = new Object[7];

            row[0] = drug.getNumber();
            row[1] = drug;
            row[2] = drug.getType();
            row[3] = drug.getDescription();
            row[4] = drug.getUses();
            row[5] = drug.getDisease();
            row[6] = drug.getFormula();

            dtm.addRow(row);
        }
    }
}