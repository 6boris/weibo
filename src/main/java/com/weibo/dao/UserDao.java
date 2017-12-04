package com.weibo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.weibo.bean.User;

public interface UserDao  extends JpaRepository<User,Integer> {

}
