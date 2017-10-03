/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.DrugOrders.DrugItems;

/**
 *
 * @author vivekshetye
 */
public class PatientDrugRequest extends WorkRequest{
    
    private DrugItems drugItems;
    private int quantity;
    
    public PatientDrugRequest() {
        super();
    }

    public DrugItems getDrugItems() {
        return drugItems;
    }

    public void setDrugItems(DrugItems drugItems) {
        this.drugItems = drugItems;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String toString() {
        return drugItems.toString();
    }
    
}
