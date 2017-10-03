/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Patient.PatientAppointmentDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class HospitalEnterprise extends Enterprise {

    private PatientAppointmentDirectory patientAppointmentDirectory;
    
    public HospitalEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Hospital);
        patientAppointmentDirectory = new PatientAppointmentDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    /**
     * @return the patientAppointmentDirectory
     */
    public PatientAppointmentDirectory getPatientAppointmentDirectory() {
        return patientAppointmentDirectory;
    }

    /**
     * @param patientAppointmentDirectory the patientAppointmentDirectory to set
     */
    public void setPatientAppointmentDirectory(PatientAppointmentDirectory patientAppointmentDirectory) {
        this.patientAppointmentDirectory = patientAppointmentDirectory;
    }

}
