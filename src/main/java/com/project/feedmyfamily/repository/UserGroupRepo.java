package com.project.feedmyfamily.repository;

import com.project.feedmyfamily.entity.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupRepo extends JpaRepository<UserGroup,Long> {

}
