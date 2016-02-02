package br.com.hm.sample.model;

import java.util.Date;

/**
 * Created by helmutmigge on 01/02/2016.
 */
public class Person {

    private String firstName;
    private String lastName;
    private Date dateOfBrith;

    public Person() {
    }

    public Person(String firstName, String lastName, Date dateOfBrith) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBrith = dateOfBrith;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(Date dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }
}
