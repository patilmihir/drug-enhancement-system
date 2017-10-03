/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital.Organization;

import Business.Drug.PharmacyInventory;
import Business.Organization.Organization;
import Business.Role.LocalPharmacyRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */



public class LocalPharmacyOrganization extends Organization {
    private PharmacyInventory pharmacyInventory;
      public LocalPharmacyOrganization() {
        super(Organization.Type.LocalPharmacy.getValue());
        pharmacyInventory = new PharmacyInventory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LocalPharmacyRole());
        return roles;
    }

    /**
     * @return the pharmacyInventory
     */
    public PharmacyInventory getPharmacyInventory() {
        return pharmacyInventory;
    }

    /**
     * @param pharmacyInventory the pharmacyInventory to set
     */
    public void setPharmacyInventory(PharmacyInventory pharmacyInventory) {
        this.pharmacyInventory = pharmacyInventory;
    }
}
