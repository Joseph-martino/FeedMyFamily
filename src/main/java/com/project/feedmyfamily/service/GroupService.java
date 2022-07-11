package com.project.feedmyfamily.service;

import com.project.feedmyfamily.entity.Group;
import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.entity.User;
import com.project.feedmyfamily.repository.GroupRepo;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class GroupService {
    public List<User> findByGroup;
    public List<User> findByAdminByGroup;

    private GroupRepo groupRepo;

    public List<User> findByGroup(Group group) {
        return this.groupRepo.findUserByGroup(group.getId());
    }

    public List<User> findByAdminByGroup(Group group) {
        return this.groupRepo.findModeratorByGroup(group.getId());
    }

    public List<Recipe> findRecipesByGroup(Group group) {
        return this.groupRepo.findRecipesByGroup(group.getId());
    }

    public List<User> findModeratorByGroup(Group group) {
        return this.groupRepo.findModeratorByGroup(group.getId());
    }

    public List<Group> findByName(String name) {
        return this.groupRepo.findByName(name);
    }

    public Group findById(Long id) {
            Optional<Group> optionalGroup = this.groupRepo.findById(id);
            if(optionalGroup.isPresent()){
                return optionalGroup.get();
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Le groupe n'existe pas");
            }
        }
    }

