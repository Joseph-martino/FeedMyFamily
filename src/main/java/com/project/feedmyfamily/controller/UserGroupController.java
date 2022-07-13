package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.entity.UserGroup;
import com.project.feedmyfamily.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usergroups")
public class UserGroupController {

    @Autowired
    private UserGroupService userGroupService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserGroup findById(@PathVariable Long id){
        return this.userGroupService.findById(id);
    }


}
