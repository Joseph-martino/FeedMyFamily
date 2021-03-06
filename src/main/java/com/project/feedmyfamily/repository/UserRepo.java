package com.project.feedmyfamily.repository;

import com.project.feedmyfamily.entity.Group;
import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.entity.User;
import com.project.feedmyfamily.entity.Visibility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository <User, Long> {

    List<User> findAll();

    @Query("select g from Group g left join g.userGroups ug where ug.user.id=:iduser")
    List<Group> findAllGroupByUser(@Param("iduser")Long iduser);

    List<User> findByFirstNameAndLastName(String firstname, String lastname);

    User findByEmail(String email);

    @Query("select r from Recipe r where r.user.id=:id")
    List<Recipe> findAllUserRecipes(@Param("id")Long id);

}
