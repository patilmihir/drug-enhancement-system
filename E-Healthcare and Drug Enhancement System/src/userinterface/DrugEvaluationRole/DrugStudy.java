/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DrugEvaluationRole;

import Business.Disease.Disease;
import Business.Drug.DrugVersions;
import Business.Enterprise.FDAEnterprise;
import Business.FDA.Organization.DrugEvaluationOrganization;
import Business.Patient.Patient;
import Business.Patient.PatientVisit;
import Business.Person.Person;
import Business.Vitals.VitalSigns;
import Business.Volunteer.DrugSurvey;
import Business.Volunteer.DrugSurveyDirectory;
import Business.Volunteer.VolunteerDirectory;
import Business.WorkQueue.DrugEvaluationWorkRequest;
import com.orsoncharts.Chart3DFactory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Pushkar
 */
public class DrugStudy extends javax.swing.JPanel {

    /**
     * Creates new form DrugStudy
     */
    JPanel userProcessContainer;
    FDAEnterprise fdaEnterprise;
    DrugEvaluationOrganization drugEvaluationOrganization;
    Disease d;
    DrugEvaluationWorkRequest drw;
    DrugSurveyDirectory drugSurveyDirectory;
    VolunteerDirectory volunteerDirectory;
    Random random;

    public DrugStudy(JPanel userProcessContainer, FDAEnterprise fdaEnterprise, DrugEvaluationOrganization drugEvaluationOrganization, Disease d, DrugEvaluationWorkRequest drw) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.fdaEnterprise = fdaEnterprise;
        this.drugEvaluationOrganization = drugEvaluationOrganization;
        drugSurveyDirectory = drugEvaluationOrganization.getDrugSurveyDirectory();
        volunteerDirectory = new VolunteerDirectory();
        this.d = d;
        this.drw = drw;
        populateCombo();
        populatecmbVital();
        txtDrug.setText(drw.getDrug().toString());
        txtVersion.setText(drw.getDrugVersions().toString());

        random = new Random();
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

        lblDrugStudy = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSizebyAge = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbAge = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTotalSize = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudy = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtDrug = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtVersion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSuccessRate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtApproval = new javax.swing.JTextField();
        btnAnalyse = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cmbVital = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        lblDrugStudy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDrugStudy.setForeground(new java.awt.Color(102, 102, 102));
        lblDrugStudy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDrugStudy.setText("DRUG STUDY");

        jLabel1.setText("Volunteers Used:");

        txtSizebyAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizebyAgeActionPerformed(evt);
            }
        });

        jLabel2.setText("Age Group :");

        cmbAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Total Volunteers");

        txtTotalSize.setEnabled(false);
        txtTotalSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalSizeActionPerformed(evt);
            }
        });

        tblStudy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Volunteer Name", "Age", "Gender", "Antibodies Present", " Change in Vitals"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudy);
        if (tblStudy.getColumnModel().getColumnCount() > 0) {
            tblStudy.getColumnModel().getColumn(0).setResizable(false);
            tblStudy.getColumnModel().getColumn(1).setResizable(false);
            tblStudy.getColumnModel().getColumn(2).setResizable(false);
            tblStudy.getColumnModel().getColumn(3).setResizable(false);
            tblStudy.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel5.setText("Drug :");

        txtDrug.setEnabled(false);
        txtDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrugActionPerformed(evt);
            }
        });

        jLabel6.setText("Version No:");

        txtVersion.setEnabled(false);
        txtVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVersionActionPerformed(evt);
            }
        });

        jLabel7.setText("Success Rate:");

        txtSuccessRate.setEnabled(false);
        txtSuccessRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuccessRateActionPerformed(evt);
            }
        });

        jLabel8.setText("Approval Status");

        txtApproval.setEnabled(false);
        txtApproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApprovalActionPerformed(evt);
            }
        });

        btnAnalyse.setText("Analyze");
        btnAnalyse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyseActionPerformed(evt);
            }
        });

        jButton4.setText("Generate");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cmbVital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotalSize, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDrugStudy, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSuccessRate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSizebyAge, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)
                                        .addGap(0, 0, 0))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbAge, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(622, 622, 622)
                                        .addComponent(btnAnalyse, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbVital, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDrugStudy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnAnalyse))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cmbAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSizebyAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTotalSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDrug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSuccessRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtApproval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(cmbVital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSizebyAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSizebyAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSizebyAgeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ReviewApplictions panel = (ReviewApplictions) component;
        panel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTotalSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalSizeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Person p = null;
        PatientVisit pv1 = null;
        PatientVisit pv2 = null;
        VitalSigns vs1 = null;
        VitalSigns vs2 = null;
        for (int i = 0; i < Integer.parseInt(txtSizebyAge.getText()); i++) {
            if (cmbAge.getSelectedItem().equals("5-18")) {
                p = new Patient(generateString(random, 6), randomInRange(random, 5, 18), toggle(random), contactNo(random), Patient.maritalStatusType.Single);

            } else if (cmbAge.getSelectedItem().equals("19-40")) {
                p = new Patient(generateString(random, 6), randomInRange(random, 19, 40), toggle(random), contactNo(random), toggleStatus(random));
            } else if (cmbAge.getSelectedItem().equals("41-65")) {
                p = new Patient(generateString(random, 6), randomInRange(random, 41, 65), toggle(random), contactNo(random), toggleStatus(random));
            } else if (cmbAge.getSelectedItem().equals("65-90")) {
                p = new Patient(generateString(random, 6), randomInRange(random, 66, 85), toggle(random), contactNo(random), toggleStatus(random));
            }
            volunteerDirectory.getVolunteerList().add(p);
            vs1 = new VitalSigns(randomInRangeF(random, 95, 102), randomInRange(random, 50, 110), randomInRange(random, 85, 135), randomInRange(random, 10, 23));
            pv1 = new PatientVisit();
            pv1.setVitalSigns(vs1);
            ((Patient) p).getPatientHistory().getPatientHistory().add(pv1);

            vs2 = new VitalSigns(randomInRangeF(random, (vs1.getBodyTemperature() - 2), (vs1.getBodyTemperature() + 2)), randomInRange(random, (int) (vs1.getPulseRate() - 7), (int) (vs1.getPulseRate() + 7)), randomInRange(random, (int) (vs1.getBloodPressure() - 10), (int) (vs1.getBloodPressure() + 10)), randomInRange(random, (int) (vs1.getRespirationRate() - 3), (int) (vs1.getRespirationRate() + 3)));
            pv2 = new PatientVisit();
            pv2.setVitalSigns(vs2);
            ((Patient) p).getPatientHistory().getPatientHistory().add(pv2);
        }

        populateTable();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrugActionPerformed

    private void txtVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVersionActionPerformed

    }//GEN-LAST:event_txtVersionActionPerformed

    private void txtSuccessRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuccessRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuccessRateActionPerformed

    private void txtApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApprovalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApprovalActionPerformed

    private void btnAnalyseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyseActionPerformed
        int rate = successCheck();
        drw.getDrugVersions().setSuccessRate(rate);
        if (drw.getDrug().getDrugHistory().getDrugVersions().isEmpty()) {
            rate = successCheck();
            if (rate >= 85) {
                drw.getDrugVersions().setFdaApproved(true);

            } else {
                drw.getDrugVersions().setFdaApproved(false);
            }
        } else {

            for (DrugVersions drugVersion : drw.getDrug().getDrugHistory().getDrugVersions()) {
                if (rate > 85 && rate >= drugVersion.getSuccessRate()) {
                    drw.getDrugVersions().setFdaApproved(true);
                } else {
                    drw.getDrugVersions().setFdaApproved(false);
                }

            }
        }

        txtSuccessRate.setText(String.valueOf(rate));
        if (drw.getDrugVersions().isFdaApproved()) {
            txtApproval.setText("Approved");
        } else {
            txtApproval.setText("Not Approved");
        }
        drw.setStatus("Completed");
        jButton3.setEnabled(false);
        cmbAge.setEnabled(false);
        txtSizebyAge.setEnabled(false);

        DrugSurvey dr = new DrugSurvey();
        dr.setDrug(drw.getDrug());
        dr.setDrugVersions(drw.getDrugVersions());
        dr.setVolunteerDirectory(volunteerDirectory);
        drugSurveyDirectory.getDrugsurveyList().add(dr);

    }//GEN-LAST:event_btnAnalyseActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int selected = tblStudy.getSelectedRow();
        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Person p = (Person) tblStudy.getValueAt(selected, 0);
            JFreeChart chart = null;
            DefaultCategoryDataset dcs = new DefaultCategoryDataset();
            if (cmbVital.getSelectedItem().equals("Temperature")) {

                dcs.setValue(((Patient) p).getPatientHistory().getPatientHistory().get(0).getVitalSigns().getBodyTemperature(), "Temperature", "Before");
                dcs.setValue(98.5, "Temperature", "Optimum");
                dcs.setValue(((Patient) p).getPatientHistory().getPatientHistory().get(1).getVitalSigns().getBodyTemperature(), "Temperature", "After");
                chart = ChartFactory.createBarChart(p.getName() + "'s Temperature", "Drug Consumption", "Temperature", dcs, PlotOrientation.VERTICAL, false, true, false);
            } else if (cmbVital.getSelectedItem().equals("Pulse Rate")) {
                dcs.setValue(((Patient) p).getPatientHistory().getPatientHistory().get(0).getVitalSigns().getPulseRate(), "Pulse Rate", "Before");
                dcs.setValue(80, "Pulse Rate", "Optimum");
                dcs.setValue(((Patient) p).getPatientHistory().getPatientHistory().get(1).getVitalSigns().getPulseRate(), "Pulse Rate", "After");
                chart = ChartFactory.createBarChart(p.getName() + "'s Pulse Rate", "Drug Consumption", "Pulse Rate", dcs, PlotOrientation.VERTICAL, false, true, false);
            } else if (cmbVital.getSelectedItem().equals("Blood Pressure")) {
                dcs.setValue(((Patient) p).getPatientHistory().getPatientHistory().get(0).getVitalSigns().getBloodPressure(), "Blood Pressure", "Before");
                dcs.setValue(110, "Blood Pressure", "Optimum");
                dcs.setValue(((Patient) p).getPatientHistory().getPatientHistory().get(1).getVitalSigns().getBloodPressure(), "Blood Pressure", "After");
                chart = ChartFactory.createBarChart(p.getName() + "'s Blood Pressure", "Drug Consumption", "Blood Pressure", dcs, PlotOrientation.VERTICAL, false, true, false);
            } else if (cmbVital.getSelectedItem().equals("Pulse Rate")) {
                dcs.setValue(((Patient) p).getPatientHistory().getPatientHistory().get(0).getVitalSigns().getRespirationRate(), "Respiratory Rate", "Before");
                dcs.setValue(16.5, "Respiratory Rate", "Optimum");
                dcs.setValue(((Patient) p).getPatientHistory().getPatientHistory().get(1).getVitalSigns().getRespirationRate(), "Respiratory Rate", "After");
                chart = ChartFactory.createBarChart(p.getName() + "'s Respiratory Rate", "Drug Consumption", "Respiratory Rate", dcs, PlotOrientation.VERTICAL, false, true, false);
            }
            CategoryPlot p1 = chart.getCategoryPlot();
            p1.setRangeGridlinePaint(Color.BLACK);
            ChartFrame c = new ChartFrame("Displaying " + p + " Vitals", chart);

            c.setVisible(true);
            c.setSize(1024, 768);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalyse;
    private javax.swing.JComboBox<String> cmbAge;
    private javax.swing.JComboBox<String> cmbVital;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDrugStudy;
    private javax.swing.JTable tblStudy;
    private javax.swing.JTextField txtApproval;
    private javax.swing.JTextField txtDrug;
    private javax.swing.JTextField txtSizebyAge;
    private javax.swing.JTextField txtSuccessRate;
    private javax.swing.JTextField txtTotalSize;
    private javax.swing.JTextField txtVersion;
    // End of variables declaration//GEN-END:variables

    public void populateCombo() {
        cmbAge.removeAllItems();
        cmbAge.addItem("Select");
        cmbAge.addItem("5-18");
        cmbAge.addItem("19-40");
        cmbAge.addItem("41-65");
        cmbAge.addItem("65-90");

    }

    public static String generateString(Random rng, int length) {
        String characters = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }

    public static int randomInRange(Random random, int min, int max) {
        int val = random.nextInt(max - min) + min;
        return val;
    }

    public Patient.genderType toggle(Random random) {
        Patient.genderType type = random.nextInt(10) > 5 ? Patient.genderType.Male : Patient.genderType.Female;
        return type;
    }

    public static String contactNo(Random rand) {
        String contact = "8";
        for (int i = 0; i < 9; i++) {
            contact += rand.nextInt(10);
        }
        String con = contact;
        return con;
    }

    public Patient.maritalStatusType toggleStatus(Random random) {
        Patient.maritalStatusType type = null;
        int a = random.nextInt(10);
        if (a < 3 && a > 0) {
            type = Patient.maritalStatusType.Single;
        } else if (a >= 3 && a <= 6) {
            type = Patient.maritalStatusType.Married;
        } else if (a >= 7 && a <= 8) {
            type = Patient.maritalStatusType.Divorced;
        } else if (a == 9) {
            type = Patient.maritalStatusType.Widowed;
        }
        return type;
    }

    public static double randomInRangeF(Random random, double min, double max) {
        double range = max - min;
        double scale = random.nextFloat() * range;
        double shift = scale + min;
        return shift;
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblStudy.getModel();
        dtm.setRowCount(0);
        for (Person person : volunteerDirectory.getVolunteerList()) {
            Object row[] = new Object[5];
            row[0] = ((Patient) person);
            row[1] = ((Patient) person).getAge();
            row[2] = ((Patient) person).getGender();
            row[3] = ""; // logic part
            row[4] = check(((Patient) person));
            dtm.addRow(row);
        }
        txtTotalSize.setText(String.valueOf(volunteerDirectory.getVolunteerList().size()));
    }

    public String check(Patient patient) {
        String val = "";
        PatientVisit p1 = patient.getPatientHistory().getPatientHistory().get(0);
        PatientVisit p2 = patient.getPatientHistory().getPatientHistory().get(1);

        double pts = calculatePoints(p1.getVitalSigns(), p2.getVitalSigns());
        if (pts >= 0) {
            val = "Positive change";
        } else if (pts < 0) {
            val = "Negative/Negligible change";
        }
        return val;
    }

    public double calculatePoints(VitalSigns vs1, VitalSigns vs2) {
        double points = 0;
        double bt1 = Math.abs(vs1.getBodyTemperature() - 98.5);
        double bt2 = Math.abs(vs2.getBodyTemperature() - 98.5);

        double pr1 = Math.abs(vs1.getPulseRate() - 80);
        double pr2 = Math.abs(vs2.getPulseRate() - 80);

        double bp1 = Math.abs(vs1.getBloodPressure() - 110);
        double bp2 = Math.abs(vs2.getBodyTemperature() - 110);

        double rr1 = Math.abs(vs1.getRespirationRate() - 16.5);
        double rr2 = Math.abs(vs2.getBodyTemperature() - 16.5);

        points += bt1 > bt2 ? 3.2 : -1;
        points += pr1 > pr2 ? 3.2 : -1;
        points += bp1 > bp2 ? 3.2 : -1;
        points += rr1 > rr2 ? 3.2 : -1;
        return points;

    }

    public int successCheck() {

        double success = 0;
        double total = 0;
        DefaultTableModel dtm = (DefaultTableModel) tblStudy.getModel();
        int size = dtm.getRowCount();
        for (int i = 0; i < size; i++) {
            if (String.valueOf(tblStudy.getValueAt(i, 4)).equalsIgnoreCase("Positive change")) {
                success += 1;
            } else if (String.valueOf(tblStudy.getValueAt(i, 4)).equalsIgnoreCase("Negative/Negligible change")) {
            }
            total += 1;
        }
        success = (success / total) * 100;
        return (int) success;
    }

//    
//      public void populatecmbAge() {
//        cmbAgeGrp.removeAllItems();
//        cmbAgeGrp.addItem("Select");
//        cmbAgeGrp.addItem("5-18");
//        cmbAgeGrp.addItem("19-40");
//        cmbAgeGrp.addItem("41-65");
//        cmbAgeGrp.addItem("65-90");
//
//    }
    private void plotGraph(int i, int i0) {

    }

    private void populatecmbVital() {
        cmbVital.removeAllItems();
        cmbVital.addItem("Temperature");
        cmbVital.addItem("Pulse Rate");
        cmbVital.addItem("Blood Pressure");
        cmbVital.addItem("Respiratory Rate");

    }
}
