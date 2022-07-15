package com.project.feedmyfamily.entity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "lastName", length = 255, nullable = false)
    private String lastName;

    @Column(name = "firstName", length = 255, nullable = false)
    private String firstName;

    @Column(name = "email", length = 255, nullable = false)
    private String email;

    @OneToMany(mappedBy = "user")
    private List<UserGroup> userGroups;

    @OneToMany(mappedBy = "user")
    private List<Recipe> recipes;

    public User(){

    }

    public User(String lastName, String firstName, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }



    public User(long id, String lastName, String firstName, String email, List<UserGroup> userGroups){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.userGroups = userGroups;
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

    public List<UserGroup> getUserGroups() {
        return this.userGroups;
    }

    public void setUserGroups(List<UserGroup> userGroups) {
        this.userGroups = userGroups;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }
}
