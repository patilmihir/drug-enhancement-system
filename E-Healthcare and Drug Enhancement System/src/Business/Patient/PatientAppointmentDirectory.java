/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author Pushkar
 */
public class PatientAppointmentDirectory {

    private ArrayList<Patient> patientList;

    public PatientAppointmentDirectory() {
        patientList = new ArrayList<>();
    }

    /**
     * @return the patientList
     */
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    /**
     * @param patientList the patientList to set
     */
    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
}
