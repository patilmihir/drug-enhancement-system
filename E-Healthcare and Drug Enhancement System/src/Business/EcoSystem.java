/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Disease.Disease;
import Business.Disease.DiseaseDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Patient.PatientVisit;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private DiseaseDirectory diseaseDirectory;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
        diseaseDirectory = new DiseaseDirectory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public boolean checkIfUserIsUnique(String userName) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        for (Network network : networkList) {

        }
        return true;
    }

    /**
     * @return the diseaseDirectory
     */
    public DiseaseDirectory getDiseaseDirectory() {
        return diseaseDirectory;
    }

    /**
     * @param diseaseDirectory the diseaseDirectory to set
     */
    public void setDiseaseDirectory(DiseaseDirectory diseaseDirectory) {
        this.diseaseDirectory = diseaseDirectory;
    }
    
    public void mostCommonDiseaseInANetwork() {
        int diseaseCounter=0;
        int count=0;
        Disease disease = null;
        //    DefaultTableModel dtm = (DefaultTableModel) tblMostCommonDisease.getModel();
//            dtm.setRowCount(0);
        for(Disease d : business.getDiseaseDirectory().getDiseaseList()) {
        for(Network n : business.getNetworkList()) {
            

            
            for(Enterprise ent : n.getEnterpriseDirectory().getEnterpriseList()) {
                if(ent instanceof HospitalEnterprise){
                for( Patient p : ((HospitalEnterprise)ent).getPatientAppointmentDirectory().getPatientList()) {
                    
                    for(PatientVisit pv : p.getPatientHistory().getPatientHistory()) {
                        
                        if(pv.getDisease() == d) {
                            count++;
                            break;
                        }
                    }
                    break;
                    
                    
                }
                if(count > diseaseCounter) {
                    diseaseCounter = count;
                    disease = d;
                }
            }
            }
            
//            Object[] row = new row[3];
//            row[0] = n.getName();
//            row[1] = disease.getName();
//            row[2] = diseaseCounter;
//            
//            dtm.addRow(row);
        }
        }
    }

}
