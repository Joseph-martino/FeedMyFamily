package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.entity.Group;
import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.entity.User;
import com.project.feedmyfamily.entity.UserGroup;
import com.project.feedmyfamily.model.GroupModel;
import com.project.feedmyfamily.model.UserModel;
import com.project.feedmyfamily.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<GroupModel>findAll(){
        List<Group> groups = this.groupService.findAll();
        List<GroupModel> resultat = new ArrayList<>();
        for (Group group: groups
             ) {
            resultat.add(new GroupModel(group));
        }
        return resultat;
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public GroupModel findById(@PathVariable Long id){
        Group g = this.groupService.findById(id);
        GroupModel resultat = new GroupModel(g);
        return resultat;
    }

    @GetMapping("/name/{name}")
    @ResponseStatus(code = HttpStatus.OK)
    public GroupModel findByName(@PathVariable String name) {
        Group g = this.groupService.findByName(name);
        GroupModel resultat = new GroupModel(g);
        return resultat;
    }
    @GetMapping("/user/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<UserModel> findUserByGroup(@PathVariable Long id) {
        List<User> u = this.groupService.findByGroup(id);
        List<UserModel> resultat = new ArrayList<>();
        for (User user: u
             ) {
            resultat.add(new UserModel(user));
        }
        return resultat;
    }

    @GetMapping("/admin/{group}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<User> findAdminByGroup(@PathVariable Group group) {
        return this.groupService.findByAdminByGroup(group);
    }

    @GetMapping("/recipes/{group}")
    @ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findRecipesByGroup(@PathVariable Group group) {

        return this.groupService.findRecipesByGroup(group);
    }
    @GetMapping("/moderators/{group}")
    @ResponseStatus(code = HttpStatus.OK)
    List<User> findModeratorByGroup(@PathVariable Group group) {
        return this.groupService.findModeratorByGroup(group);
    }
}
