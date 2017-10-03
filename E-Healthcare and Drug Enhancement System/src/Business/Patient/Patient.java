/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Person.Person;

/**
 *
 * @author vivekshetye
 */
public class Patient extends Person {

    private int age;
    private genderType gender;
    private String contactNo;
    private maritalStatusType status;
    private PatientHistory patientHistory;
    private String email;

    public Patient(String name, int age, genderType gender, String contactNo, maritalStatusType status) {
        super(name);
        this.age = age;
        this.gender = gender;
        this.contactNo = contactNo;
        this.status = status;
        patientHistory = new PatientHistory();

    }

    /**
     * @return the status
     */
    public maritalStatusType getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(maritalStatusType status) {
        this.status = status;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the gender
     */
    public enum maritalStatusType {
        Single, Married, Divorced, Widowed;
    }

    public genderType getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(genderType gender) {
        this.gender = gender;
    }

    public enum genderType {
        Male, Female;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PatientHistory getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(PatientHistory patientHistory) {
        this.patientHistory = patientHistory;
    }

    public String toString() {
        return getName();
    }
}
