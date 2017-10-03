/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Drug.DrugVersions;
import Business.DrugOrders.DrugItems;

/**
 *
 * @author vivekshetye
 */
public class MassProductionWorkRequest extends WorkRequest {

    private DrugItems drugItems;
    private DrugVersions drugVersions;

    public MassProductionWorkRequest() {
        super();
    }

    public DrugVersions getDrugVersions() {
        return drugVersions;
    }

    public void setDrugVersions(DrugVersions drugVersions) {
        this.drugVersions = drugVersions;
    }

    /**
     * @return the drugItems
     */
    public DrugItems getDrugItems() {
        return drugItems;
    }

    /**
     * @param drugItems the drugItems to set
     */
    public void setDrugItems(DrugItems drugItems) {
        this.drugItems = drugItems;
    }

    @Override
    public String toString() {
        return drugItems.getDrug().toString();
    }
}
