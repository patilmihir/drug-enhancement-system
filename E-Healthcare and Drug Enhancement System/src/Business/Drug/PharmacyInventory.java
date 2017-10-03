/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import Business.DrugOrders.DrugItems;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class PharmacyInventory {
    
    private ArrayList<DrugItems> pharmacyDrugInventory;
    
    public PharmacyInventory() {
        pharmacyDrugInventory = new ArrayList<>();
    }

    public ArrayList<DrugItems> getPharmacyDrugInventory() {
        return pharmacyDrugInventory;
    }

    public void setPharmacyDrugInventory(ArrayList<DrugItems> pharmacyDrugInventory) {
        this.pharmacyDrugInventory = pharmacyDrugInventory;
    }
    
    
}
