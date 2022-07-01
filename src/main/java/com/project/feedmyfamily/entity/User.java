package com.project.feedmyfamily.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

public class User {

    private long id;

    private String lastName;

    private String firstName;

    private String email;

    private List<Group> groups;

    @OneToMany
    private List<Recipe> recipes;

    public User(){

    }

    public User(long id, String lastName, String firstName, String email, List<Group> groups){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.groups = groups;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
