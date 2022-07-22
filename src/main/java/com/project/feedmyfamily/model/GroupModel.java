package com.project.feedmyfamily.model;

import com.project.feedmyfamily.entity.Group;
import com.project.feedmyfamily.entity.UserGroup;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class GroupModel {

    private long id;
    private String name;
    private List<Long> usersId;

    public GroupModel() {
    }

    public GroupModel(Group group) {
        this.setId(group.getId());
        this.setName(group.getName());
        List<Long> usersId = new ArrayList<>();
        if (group.getUserGroups()!= null) {
            for (UserGroup userGroup : group.getUserGroups()
            ) {
                if (userGroup.getUser() != null) {
                    usersId.add(userGroup.getUser().getId());
                }
            }
        }
        this.setUsersId(usersId);
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

    public List<Long> getUsersId() {
        return usersId;
    }

    public void setUsersId(List<Long> usersId) {
        this.usersId = usersId;
    }
}
