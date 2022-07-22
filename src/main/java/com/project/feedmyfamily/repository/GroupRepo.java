package com.project.feedmyfamily.repository;

import com.project.feedmyfamily.entity.Group;
import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface GroupRepo extends JpaRepository<Group,Long> {

    @Query("select g from Group g where g.name=:name")
    Group findByName(@Param("name") String name);

    @Query("select u from User u left join u.userGroups ug where ug.team.id=:idgroup")
    List<User> findUserByGroup(@Param("idgroup")Long idgroup);

    @Query("select u from User u left join u.userGroups ug where ug.team.id=:idgroup and ug.isAdmin=true")
    List<User> findAdminByGroup(@Param("idgroup")Long idgroup);

    @Query("select u from User u left join u.userGroups ug where ug.team.id=:idgroup and ug.isModerator = true")
    List<User> findModeratorByGroup(@Param("idgroup")Long idgroup);

    @Query("select r from Recipe r left join r.user u left join u.userGroups ug where ug.team.id=:idgroup and (r.visibility = 'SHAREDGROUP' or r.visibility = 'SHAREDGLOBAL') ")
    List<Recipe> findRecipesByGroup(@Param("idgroup")Long idgroup);

}
