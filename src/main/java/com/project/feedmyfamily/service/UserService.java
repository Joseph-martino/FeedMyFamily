package com.project.feedmyfamily.service;

import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.entity.User;
import com.project.feedmyfamily.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> findAll(){
        return this.userRepo.findAll();
    }

    public User findById(Long id){
        Optional<User> optionalUser = this.userRepo.findById(id);
        if(optionalUser.isPresent()){
            return optionalUser.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "L'utilisateur n'existe pas");
        }
    }

    public User findByEmail(String email){
        return this.userRepo.findByEmail(email);
    }

    public List<Recipe> findAllUserRecipes(Long id){
        return this.userRepo.findAllUserRecipes(id);
    }




}
