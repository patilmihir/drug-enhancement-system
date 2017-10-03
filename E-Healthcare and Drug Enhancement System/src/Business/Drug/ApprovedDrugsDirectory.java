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
 * @author Pushkar
 */
public class ApprovedDrugsDirectory {
    private ArrayList<DrugItems> approvedDrugs;
    
    public ApprovedDrugsDirectory() {
        approvedDrugs = new ArrayList<>();
    }

    /**
     * @return the approvedDrugs
     */
    public ArrayList<DrugItems> getApprovedDrugs() {
        return approvedDrugs;
    }

    /**
     * @param approvedDrugs the approvedDrugs to set
     */
    public void setApprovedDrugs(ArrayList<DrugItems> approvedDrugs) {
        this.approvedDrugs = approvedDrugs;
    }
    
    
}
