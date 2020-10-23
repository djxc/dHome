package com.djxc.dhome.service.impl;

import com.djxc.dhome.entity.User;
import com.djxc.dhome.mapper.UserMapper;
import com.djxc.dhome.service.AuthUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthUserServiceImpl implements AuthUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByName(String name) {
        return userMapper.selectByName(name);
    }
}
