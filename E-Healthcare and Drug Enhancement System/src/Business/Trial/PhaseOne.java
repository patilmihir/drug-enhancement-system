/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Trial;

import Business.Drug.Trial;

/**
 *
 * @author Mihir
 */
public class PhaseOne extends Trial {

    private float minDosage;
    private float maximumDosage;
    private int  ld50;
    
    private String sideEffects;

    public PhaseOne() {
       super();
    }

    public float getMinDosage() {
        return minDosage;
    }

    public void setMinDosage(float minDosage) {
        this.minDosage = minDosage;
    }

    public float getMaximumDosage() {
        return maximumDosage;
    }

    public void setMaximumDosage(float maximumDosage) {
        this.maximumDosage = maximumDosage;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    /**
     * @return the ld50
     */
    public int getLd50() {
        return ld50;
    }

    /**
     * @param ld50 the ld50 to set
     */
    public void setLd50(int ld50) {
        this.ld50 = ld50;
    }

}
