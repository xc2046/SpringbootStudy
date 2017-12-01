package com.xc.dao;

import com.xc.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by xc on 2017/8/9.
 */

@Repository
public interface UserRepositoty extends JpaRepository<User,Long> {
    @Query(value = "select t from User t where t.name = :name")
    User findByUserName(@Param("name") String name);
}
