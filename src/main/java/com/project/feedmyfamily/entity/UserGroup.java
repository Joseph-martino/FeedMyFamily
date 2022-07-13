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
    private Group group;

    @Column
    private boolean isAdmin;

    @Column
    private boolean isModerator;

    public UserGroup(){

    }



    public UserGroup(long id, User user, Group group, boolean isAdmin, boolean isModerator){
        this.id = id;
        this.user = user;
        this.group = group;
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

    public Group getGroup() {

        return this.group;
    }

    public void setGroup(Group group) {

        this.group = group;
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
