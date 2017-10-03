/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FDA.Organization;

import Business.Organization.Organization;
import Business.Role.DrugEvaluationRole;
import Business.Role.Role;
import Business.Volunteer.DrugSurveyDirectory;
import java.util.ArrayList;

/**
 *
 * @author Pushkar
 */
public class DrugEvaluationOrganization extends Organization {
private DrugSurveyDirectory drugSurveyDirectory;
    public DrugEvaluationOrganization() {
        super(Organization.Type.DrugEvaluation.getValue());
        drugSurveyDirectory = new DrugSurveyDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DrugEvaluationRole());
        return roles;
    }

    /**
     * @return the drugSurveyDirectory
     */
    public DrugSurveyDirectory getDrugSurveyDirectory() {
        return drugSurveyDirectory;
    }

    /**
     * @param drugSurveyDirectory the drugSurveyDirectory to set
     */
    public void setDrugSurveyDirectory(DrugSurveyDirectory drugSurveyDirectory) {
        this.drugSurveyDirectory = drugSurveyDirectory;
    }

}
