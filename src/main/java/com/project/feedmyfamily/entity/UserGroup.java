package com.project.feedmyfamily.entity;

public class UserGroup {
    private long id;
    private long idGroup;
    private long idUser;
    private int isAdmin;
    private int isModerator;

    public UserGroup(long id, long idGroup, long idUser, int isAdmin, int isModerator){
        this.id = id;
        this.idGroup = idGroup;
        this.idUser = idUser;
        this.isAdmin = isAdmin;
        this.isModerator = isModerator;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(long idGroup) {
        this.idGroup = idGroup;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getIsModerator() {
        return isModerator;
    }

    public void setIsModerator(int isModerator) {
        this.isModerator = isModerator;
    }
}
