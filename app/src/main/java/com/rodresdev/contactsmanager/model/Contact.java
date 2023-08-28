package com.rodresdev.contactsmanager.model;

import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;;
    private String genre;
    private String fbLink;
    private String igLink;
    private List<String> phoneNumber;

    public Contact(
            String firstName, String lastName, String genre,
            String fbLink, String igLink, List<String> phoneNumber
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
        this.fbLink = fbLink;
        this.igLink = igLink;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGenre() {
        return genre;
    }

    public String getFbLink() {
        return fbLink;
    }

    public String getIgLink() {
        return igLink;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setFbLink(String fbLink) {
        this.fbLink = fbLink;
    }

    public void setIgLink(String igLink) {
        this.igLink = igLink;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
