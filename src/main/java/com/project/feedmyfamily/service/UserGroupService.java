package com.project.feedmyfamily.service;

import com.project.feedmyfamily.entity.UserGroup;
import com.project.feedmyfamily.repository.UserGroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;


@Service
public class UserGroupService {

    @Autowired
    private UserGroupRepo userGroupRepo;


    public UserGroup findById(Long id) {
        Optional<UserGroup> optionalUserGroup = this.userGroupRepo.findById(id);
        if (optionalUserGroup.isPresent()){
            return optionalUserGroup.get();
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
