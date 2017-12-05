package com.weibo.service;

import com.weibo.bean.User;
import com.weibo.dao.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    @Transactional
    public void save(User user){
        userDao.save(user);
    }

    @Transactional
    public void delete(User user){
        userDao.delete(user);
    }

    @Transactional
    public User findById(Integer id){
        return userDao.findOne(id);
    }

    public List<User> getAll(){
        return userDao.findAll();
    }

    public boolean exits(Integer id){
        return userDao.exists(id);
    }
    public List<User> findAll(){
        return userDao.findAll();
    }

    public List<User> findByName(String name){
        return userDao.findByName(name);
    }

    public Integer countByName(String name){
        return userDao.countByName(name);
    }
}
