/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugOrders;

import java.util.ArrayList;

/**
 *
 * @author Pushkar
 */
public class DrugOrders {
    
    
    private ArrayList<DrugItems> drugOrderList;
    
    public DrugOrders(){
        drugOrderList = new ArrayList<>();
    }

    /**
     * @return the drugOrderList
     */
    public ArrayList<DrugItems> getDrugOrderList() {
        return drugOrderList;
    }

    /**
     * @param drugOrderList the drugOrderList to set
     */
    public void setDrugOrderList(ArrayList<DrugItems> drugOrderList) {
        this.drugOrderList = drugOrderList;
    }
}
