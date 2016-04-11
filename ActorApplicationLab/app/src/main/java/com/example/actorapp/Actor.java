package com.example.actorapp;

/**
 * Created by hollis on 4/11/16.
 */
public class Actor {
    private String name;
    private int oscars;
    private String dateOfBirth;

    public Actor(String name, int oscars, String dateOfBirth){
        this.name = name;
        this.oscars = oscars;
        this.dateOfBirth = dateOfBirth;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOscars() {
        return oscars;
    }

    public void setOscars(int oscars) {
        this.oscars = oscars;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
