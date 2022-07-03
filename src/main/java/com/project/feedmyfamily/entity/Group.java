package com.project.feedmyfamily.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", length = 255)
    private String name;

    @OneToMany
    private List<UserGroup> userGroups;

    public Group(){

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
