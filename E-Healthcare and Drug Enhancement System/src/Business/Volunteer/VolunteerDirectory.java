/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class VolunteerDirectory {

    private ArrayList<Person> volunteerList;

    public VolunteerDirectory() {
        volunteerList = new ArrayList<>();
    }

    /**
     * @return the volunteerList
     */
    public ArrayList<Person> getVolunteerList() {
        return volunteerList;
    }

    /**
     * @param volunteerList the volunteerList to set
     */
    public void setVolunteerList(ArrayList<Person> volunteerList) {
        this.volunteerList = volunteerList;
    }

}
