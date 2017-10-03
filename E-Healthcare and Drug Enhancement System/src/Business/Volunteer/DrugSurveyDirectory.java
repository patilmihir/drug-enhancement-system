/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class DrugSurveyDirectory {
    
    private ArrayList<DrugSurvey> drugsurveyList;
    
    public DrugSurveyDirectory(){
     drugsurveyList = new ArrayList<>();
}

    /**
     * @return the drugsurveyList
     */
    public ArrayList<DrugSurvey> getDrugsurveyList() {
        return drugsurveyList;
    }

    /**
     * @param drugsurveyList the drugsurveyList to set
     */
    public void setDrugsurveyList(ArrayList<DrugSurvey> drugsurveyList) {
        this.drugsurveyList = drugsurveyList;
    }
}
