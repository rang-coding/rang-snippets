package com.rang.snippets.fixtures;

import java.time.LocalDate;

public class HockeyPlayer {

    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;
    private final String birthCity;
    private final String birthCountry;
    private final HockeyPlayerPosition position;
    private final Integer jerseyNumber;

    /** ***** ***** All args constructor ***** ***** */
    public HockeyPlayer(String firstName, String lastName, LocalDate dateOfBirth, String birthCity, String birthCountry,
            HockeyPlayerPosition position, Integer jerseyNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.birthCity = birthCity;
        this.birthCountry = birthCountry;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    /** ***** ***** Getter ***** ***** */

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public HockeyPlayerPosition getPosition() {
        return position;
    }

    public Integer getJerseyNumber() {
        return jerseyNumber;
    }

    /** ***** ***** toString ***** ***** */
    // @formatter:off
    @Override
    public String toString() {
        return "HockeyPlayer [firstName=" + firstName 
                + ", lastName=" + lastName 
                + ", dateOfBirth=" + dateOfBirth
                + ", birthCity=" + birthCity 
                + ", birthCountry=" + birthCountry 
                + ", position=" + position
                + ", jerseyNumber=" + jerseyNumber + "]";
    }
    // @formatter:on

}
