/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Disease.DiseaseDirectory;
import Business.DrugManufacturing.Organization.MassProductionOrganization;
import Business.EcoSystem;
import Business.Enterprise.DrugManufacturingEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.HospitalEnterprise;
import Business.Hospital.Organization.DoctorOrganization;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, DiseaseDirectory diseaseDirectory,Network network) {
        Enterprise ent = null;
        Organization massDrugOrg = null;
        for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            
            if(e instanceof DrugManufacturingEnterprise) {
                ent = e;
                break;
            }
        }
        // try catch may give exception if drug enterprise is not created
        for(Organization o : ent.getOrganizationDirectory().getOrganizationList()) {
            
            if(o instanceof MassProductionOrganization) {
                massDrugOrg = o;
                break;
            }
        }
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization)organization,(HospitalEnterprise) enterprise,diseaseDirectory,((MassProductionOrganization) massDrugOrg).getApprovedDrugsDirectory());
    }
    
    
}
