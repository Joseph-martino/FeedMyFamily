package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usergroups")
public class UserGroupController {

    @Autowired
    private UserGroupService userGroupService;
}
