package com.project.feedmyfamily.service;

import com.project.feedmyfamily.entity.Group;
import com.project.feedmyfamily.entity.User;
import com.project.feedmyfamily.entity.UserGroup;
import com.project.feedmyfamily.repository.GroupRepo;
import com.project.feedmyfamily.repository.UserGroupRepo;
import com.project.feedmyfamily.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;


@Service
public class UserGroupService {

    @Autowired
    private UserGroupRepo userGroupRepo;

    @Autowired
    private GroupRepo groupRepo;

    @Autowired
    private UserRepo userRepo;

    public UserGroup findById(Long id) {
        Optional<UserGroup> optionalUserGroup = this.userGroupRepo.findById(id);
        if (optionalUserGroup.isPresent()){
            return optionalUserGroup.get();
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public void create(String idgroup, String iduser) {
        Optional<User> user = this.userRepo.findById(Long.parseLong(iduser));
        Optional<Group> group = this.groupRepo.findById(Long.parseLong(idgroup));
        UserGroup userGroup = new UserGroup(user.get(),group.get());
        this.userGroupRepo.save(userGroup);
    }
}
