package com.project.feedmyfamily.repository;

import com.project.feedmyfamily.entity.Group;
import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GroupRepo extends JpaRepository<Group,Long> {

    List<Group> findByName();

    @Query("select u from User u left join UserGroup ug where ug.group.id =: id")
    List<User> findUserByGroup(@Param("id")Long id);

    @Query("select u from User u left join UserGroup ug where ug.group.id =: idgroup and ug.isAdmin = true")
    List<User> findAdminByGroup(@Param("idgroup")Long idgroup);

    @Query("select u from User u left join UserGroup ug where ug.group.id =: idgroup and ug.isModerator = true")
    List<User> findModeratorByGroup(@Param("idgroup")Long idgroup);

    @Query("select r from Recipe r left join User u left join UserGroup ug where ug.group.id =: idgroup and (r.visibility = 'SHAREDGROUP' or r.visibility = 'SHAREDGLOBAL') ")
    List<Recipe> findRecipesByGroup(@Param("idgroup")Long idgroup);



}
