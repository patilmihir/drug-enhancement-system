/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugManufacturing.Organization;

import Business.Drug.ApprovedDrugsDirectory;
import Business.Drug.Drugs;
import Business.DrugOrders.DrugItems;
import Business.Organization.Organization;
import Business.Role.MassProductionRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class MassProductionOrganization extends Organization {
    
    private ApprovedDrugsDirectory approvedDrugsDirectory;
     public MassProductionOrganization() {
        super(Organization.Type.MassProduction.getValue());
        approvedDrugsDirectory = new ApprovedDrugsDirectory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MassProductionRole());
        return roles;
    }

    /**
     * @return the approvedDrugsDirectory
     */
    public ApprovedDrugsDirectory getApprovedDrugsDirectory() {
        return approvedDrugsDirectory;
    }

    /**
     * @param approvedDrugsDirectory the approvedDrugsDirectory to set
     */
    public void setApprovedDrugsDirectory(ApprovedDrugsDirectory approvedDrugsDirectory) {
        this.approvedDrugsDirectory = approvedDrugsDirectory;
    }

    
    public void mostProfitableDrug() {
        
        DrugItems profitableDI = null;
        int profitCount= 0 ;
        
        for(DrugItems di : approvedDrugsDirectory.getApprovedDrugs()) {
            
            int profit = di.getSellingPrice() - di.getMrp();
            
            if(profit > profitCount) {
                profitableDI = di;
                profitCount = profit;
            }
        }
    }
    
     
}
