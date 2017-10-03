/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import Business.Drug.DrugVersions;
import Business.Drug.Drugs;

/**
 *
 * @author Mihir
 */
public class DrugSurvey{
    private VolunteerDirectory volunteerDirectory;
    private Drugs drug;
    private DrugVersions drugVersions;
    
    public DrugSurvey(){
        
    }

    /**
     * @return the volunteerDirectory
     */
    public VolunteerDirectory getVolunteerDirectory() {
        return volunteerDirectory;
    }

    /**
     * @param volunteerDirectory the volunteerDirectory to set
     */
    public void setVolunteerDirectory(VolunteerDirectory volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }

    /**
     * @return the drug
     */
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
}
