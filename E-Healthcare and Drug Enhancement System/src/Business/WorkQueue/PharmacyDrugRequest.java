/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.DrugOrders.DrugOrders;

/**
 *
 * @author Pushkar
 */
public class PharmacyDrugRequest extends WorkRequest{
    
    private DrugOrders drugOrder;
    
    public PharmacyDrugRequest() {
        super();
    }

    /**
     * @return the drugOrder
     */
    public DrugOrders getDrugOrder() {
        return drugOrder;
    }

    /**
     * @param drugOrder the drugOrder to set
     */
    public void setDrugOrder(DrugOrders drugOrder) {
        this.drugOrder = drugOrder;
    }
    
    
    
}
