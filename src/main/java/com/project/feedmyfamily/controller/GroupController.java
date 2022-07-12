package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.entity.Group;
import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.entity.User;
import com.project.feedmyfamily.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Group findById(@PathVariable Long id){
        return this.groupService.findById(id);
    }
    @GetMapping("/name")
    @ResponseStatus(code = HttpStatus.OK)
    List<Group> findByName(String name) {

        return this.groupService.findByName(name);
    }
    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<User> findUserByGroup(@PathVariable Group group) {
        return this.groupService.findByGroup(group);
    }

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<User> findAdminByGroup(@PathVariable Group group) {
        return this.groupService.findByAdminByGroup(group);
    }

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findRecipesByGroup(@PathVariable Group group) {

        return this.groupService.findRecipesByGroup(group);
    }

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    List<User> findModeratorByGroup(@PathVariable Group group) {

        return this.groupService.findModeratorByGroup(group);
    }
}
