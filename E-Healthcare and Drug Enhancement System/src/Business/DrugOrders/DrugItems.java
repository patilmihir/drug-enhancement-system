/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugOrders;

import Business.Drug.Drugs;
import java.util.Random;

/**
 *
 * @author Pushkar
 */
public class DrugItems {

    private Drugs drug;
    private int requestedQuantity;
    private int mrp;
    private int sellingPrice;
    private int availableQuantity;

    /**
     * @return the drug
     */
    
    public DrugItems() {
        setSellingPrice();
    }
    public Drugs getDrug() {
        return drug;
        
    }

    /**
     * @param drug the drug to set
     */
    public void setDrug(Drugs drug) {
        this.drug = drug;
    }

    /**
     * @return the requestedQuantity
     */
    public int getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * @param requestedQuantity the requestedQuantity to set
     */
    public void setRequestedQuantity(int requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public void setSellingPrice() {
        Random rn = new Random();
        int randomNum =  (rn.nextInt(5) + 1);
        sellingPrice = mrp + (mrp/randomNum);
    }
    
    
    
    /**
     * @return the mrp
     */
    public int getMrp() {
        return mrp;
    }

    /**
     * @param mrp the mrp to set
     */
    public void setMrp(int mrp) {
        this.mrp = mrp;
    }

    /**
     * @return the sellingPrice
     */
    public int getSellingPrice() {
        return sellingPrice;
    }

    /**
     * @return the availableQuantity
     */
    public int getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * @param availableQuantity the availableQuantity to set
     */
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public String toString() {
        return drug.getName();
    }
    
}
