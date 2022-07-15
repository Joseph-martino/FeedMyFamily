package com.project.feedmyfamily.model;

import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.entity.User;
import com.project.feedmyfamily.entity.UserGroup;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<Long> groupsId;
    private List<Long> recipesId;


    public UserModel() {
    }


    public UserModel(User user) {
        this.setId(user.getId());
        this.setFirstName(user.getFirstName());
        this.setLastName(user.getLastName());
        this.setEmail(user.getEmail());
        List<Long> groupsId = new ArrayList<>();
        if (user.getUserGroups()!= null) {
            for (UserGroup userGroup : user.getUserGroups()
            ) {
                if (userGroup.getTeam() != null) {
                    groupsId.add(userGroup.getTeam().getId());
                }
            }
        }
        this.setGroupsId(groupsId);

        List<Long> recipesId = new ArrayList<>();
        if (user.getRecipes()!= null) {
            for (Recipe recipe : user.getRecipes()
            ) {
                if (recipe.getUser() != null) {
                    recipesId.add(recipe.getId());
                }
            }
        }
        this.setRecipesId(recipesId);

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getGroupsId() {
        return groupsId;
    }

    public void setGroupsId(List<Long> groupsId) {
        this.groupsId = groupsId;
    }

    public List<Long> getRecipesId() {
        return recipesId;
    }

    public void setRecipesId(List<Long> recipesId) {
        this.recipesId = recipesId;
    }
}
