package com.project.feedmyfamily.entity;

import javax.persistence.*;

@Entity
@Table(name = "userGroup")
public class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "teams_id")
    private Group team;

    @Column
    private boolean isAdmin;

    @Column
    private boolean isModerator;

    public UserGroup(){

    }

    public UserGroup(User user, Group team) {
        this.user = user;
        this.team = team;
        this.isAdmin = false;
        this.isModerator = false;
    }

    public UserGroup(long id, User user, Group group, boolean isAdmin, boolean isModerator){
        this.id = id;
        this.user = user;
        this.team = group;
        this.isAdmin = isAdmin;
        this.isModerator = isModerator;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public User getUser() {

        return this.user;
    }

    public void setUser(User user) {

        this.user = user;
    }

    public Group getTeam() {

        return this.team;
    }

    public void setTeam(Group group) {

        this.team = group;
    }

    public boolean getIsAdmin() {

        return this.isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {

        this.isAdmin = isAdmin;
    }

    public boolean getIsModerator() {

        return isModerator;
    }

    public void setIsModerator(boolean isModerator) {

        this.isModerator = isModerator;
    }
}
