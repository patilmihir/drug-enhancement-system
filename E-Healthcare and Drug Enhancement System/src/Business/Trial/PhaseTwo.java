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
public class PhaseTwo extends Trial {

    int successPercent;

    private int specimenUsed;
    private int effectivenessThreshold;
    private int specimenAbvThreshold;
    private int specimenBelowThreshold;

    public int getSuccessPercent() {
        return successPercent;
    }

    public void setSuccessPercent(int successPercent) {
        this.successPercent = successPercent;
    }

    /**
     * @return the specimenUsed
     */
    public int getSpecimenUsed() {
        return specimenUsed;
    }

    /**
     * @param specimenUsed the specimenUsed to set
     */
    public void setSpecimenUsed(int specimenUsed) {
        this.specimenUsed = specimenUsed;
    }

    /**
     * @return the effectivenessThreshold
     */
    public int getEffectivenessThreshold() {
        return effectivenessThreshold;
    }

    /**
     * @param effectivenessThreshold the effectivenessThreshold to set
     */
    public void setEffectivenessThreshold(int effectivenessThreshold) {
        this.effectivenessThreshold = effectivenessThreshold;
    }

    /**
     * @return the specimenAbvThreshold
     */
    public int getSpecimenAbvThreshold() {
        return specimenAbvThreshold;
    }

    /**
     * @param specimenAbvThreshold the specimenAbvThreshold to set
     */
    public void setSpecimenAbvThreshold(int specimenAbvThreshold) {
        this.specimenAbvThreshold = specimenAbvThreshold;
    }

    /**
     * @return the specimenBelowThreshold
     */
    public int getSpecimenBelowThreshold() {
        return specimenBelowThreshold;
    }

    /**
     * @param specimenBelowThreshold the specimenBelowThreshold to set
     */
    public void setSpecimenBelowThreshold(int specimenBelowThreshold) {
        this.specimenBelowThreshold = specimenBelowThreshold;
    }

}
