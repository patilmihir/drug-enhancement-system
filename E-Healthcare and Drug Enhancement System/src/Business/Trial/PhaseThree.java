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
public class PhaseThree extends Trial{
    
   boolean isSafe;
   String recommendation;
   private int safety;

    public boolean isIsSafe() {
        return isSafe;
    }

    public void setIsSafe(boolean isSafe) {
        this.isSafe = isSafe;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * @return the safety
     */
    public int getSafety() {
        return safety;
    }

    /**
     * @param safety the safety to set
     */
    public void setSafety(int safety) {
        this.safety = safety;
    }
   
    
   
}
