package com.hebo.service;

import com.hebo.entity.User;
import com.hebo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hebo on 2018/4/2.
 */
@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    public User findUserById(long userId){
        return userMapper.findUserById(userId);
    }
}
