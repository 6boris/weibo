package com.weibo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.weibo.bean.User;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao  extends JpaRepository<User,Integer> {

    @Query(value = "select * from user  where username=?1", nativeQuery = true)
    List<User> findByName(String name);

}
