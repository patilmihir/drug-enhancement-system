/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Drug.DrugVersions;
import Business.Drug.Drugs;

/**
 *
 * @author vivekshetye
 */
public class DrugEvaluationWorkRequest extends WorkRequest {

    private Drugs drug;
    private DrugVersions drugVersions;

    public DrugEvaluationWorkRequest() {
        super();
    }

    public Drugs getDrug() {
        return drug;
    }

    public void setDrug(Drugs drug) {
        this.drug = drug;
    }

    /**
     * @return the drugVersions
     */
    public DrugVersions getDrugVersions() {
        return drugVersions;
    }

    /**
     * @param drugVersions the drugVersions to set
     */
    public void setDrugVersions(DrugVersions drugVersions) {
        this.drugVersions = drugVersions;
    }
    
    @Override
    public String toString(){
        return this.getDrug().toString();
    }

}
