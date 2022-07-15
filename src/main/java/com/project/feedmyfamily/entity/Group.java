package com.project.feedmyfamily.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teams")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "team")
    private List<UserGroup> userGroups;

    public Group(){

    }

    public Group(String name) {
        this.name = name;
    }

    public Group(long id, String name, List<UserGroup> userGroups) {
        this.id = id;
        this.name = name;
        this.userGroups = userGroups;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public List<UserGroup> getUserGroups() {

        return this.userGroups;
    }

    public void setUserGroups(List<UserGroup> usergroups) {

        this.userGroups = userGroups;
    }
}
