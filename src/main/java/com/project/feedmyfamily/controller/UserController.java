package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.entity.Group;
import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.entity.User;
import com.project.feedmyfamily.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<User> findAll(){
        return this.userService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public User findById(@PathVariable Long id){
        return this.userService.findById(id);
    }

    @GetMapping("/email/{email}")
    @ResponseStatus(code = HttpStatus.OK)
    public User findByEmail(@PathVariable String email){
        return this.userService.findByEmail(email);
    }

    @GetMapping("/recipe/user/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Recipe> findAllUserRecipes(@PathVariable Long id){
        return this.userService.findAllUserRecipes(id);
    }

    @GetMapping("/groups")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Group> findAllGroupByUser(@RequestParam(name = "idUser") Long idUser, @RequestParam(name = "idGroup") Long idGroup){
        return this.userService.findAllGroupByUser(idUser,idGroup);
    }


}
