/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CompoundSupplierRole;

import Business.Drug.Compound;
import Business.Enterprise.DrugManufacturingEnterprise;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Mihir
 */
public class UpdateCompoundJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Compound compound;
    DrugManufacturingEnterprise drugManufacturingEnterprise;

    /**
     * Creates new form UpdateCompundJPanel
     */
    public UpdateCompoundJPanel(JPanel userProcessContainer, DrugManufacturingEnterprise drugManufacturingEnterprise, Compound compound) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.compound = compound;
        this.drugManufacturingEnterprise = drugManufacturingEnterprise;
        populateCompoundDetails();
    }

    public void populateCompoundDetails() {
        txtId.setText(String.valueOf(compound.getId()));
        txtName.setText(compound.getCompoundName());
        txtFormula.setText(compound.getMolecularFormula());
        txtQuantity.setText(String.valueOf(compound.getQuantity()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFormula = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        lblFormula = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        txtFormula.setEnabled(false);

        txtName.setEnabled(false);

        txtId.setEnabled(false);

        lblQuantity.setText("Quantity:");

        lblFormula.setText("Formula:");

        lblName.setText("Name:");

        lblId.setText("ID:");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(102, 102, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("UPDATE COMPOUND");

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtQuantity.setEnabled(false);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFormula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtQuantity)
                        .addComponent(txtFormula)
                        .addComponent(txtName)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)))
                .addGap(192, 192, 192))
            .addGroup(layout.createSequentialGroup()
                .addGap(534, 534, 534)
                .addComponent(lblTitle)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnBack))
                .addGap(154, 154, 154))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (validateData()) {
            compound.setCompoundName(txtName.getText());
            compound.setMolecularFormula(txtFormula.getText());
            compound.setQuantity(Integer.parseInt(txtQuantity.getText()));
            txtName.setEnabled(false);
            txtQuantity.setEnabled(false);
            txtFormula.setEnabled(false);
            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

     private boolean validateData() {
        if (txtName.getText().trim().equals("") || txtFormula.getText().trim().equals("")
                || txtQuantity.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory.", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!txtName.getText().trim().matches("^[a-zA-Z ]*$")) {
            JOptionPane.showMessageDialog(null, "Please enter valid Product Name.", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!txtFormula.getText().trim().matches("^[a-zA-Z0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Please enter valid Model Number.", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!txtQuantity.getText().trim().matches("^\\d+$")) {
            JOptionPane.showMessageDialog(null, "Please enter valid Base Price", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (drugManufacturingEnterprise.getMasterCompoundCatalog().checkDuplicateCompoundEntry(txtName.getText().trim(), txtFormula.getText().trim())) {
            JOptionPane.showMessageDialog(null, "Please enter unique compound.", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
     
    private void resetFields() {
        for (Component C : this.getComponents()) {
            if (C instanceof JTextField) {
                ((JTextComponent) C).setText("");
            }
        }
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtName.setEnabled(true);
        txtFormula.setEnabled(true);
        txtQuantity.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageInventoryJPanel panel = (ManageInventoryJPanel) component;
        panel.populateCompoundCatalog();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblFormula;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtFormula;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
