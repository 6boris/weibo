package com.weibo.dao;


import com.weibo.bean.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Anonycurse
 * Date-Time: 2017-12-05-16:00-
 */

public interface UserInfoDao  extends JpaRepository<UserInfo,Integer>{


    @Query(nativeQuery = true, value = "select count(*) from weibo_userinfo where username=?1")
    Integer countByName(String name);
}
