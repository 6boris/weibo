package com.weibo.service;

import com.weibo.dao.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Anonycurse
 * Date-Time: 2017-12-05-16:02-
 */
@Service
public class UserInfoService {
    @Resource
    private UserDao userDao;

    @Transactional
    public void save(){
        return;
    }


}
