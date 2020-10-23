package com.djxc.dhome.service.impl;

import com.djxc.dhome.entity.User;
import com.djxc.dhome.mapper.UserMapper;
import com.djxc.dhome.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户服务借口的实现
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUsers() {
        return userMapper.selectAllUsers();
    }

    @Override
    public User selectById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public User selectByName(String name) {
        return userMapper.selectByName(name);
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        return false;
    }

    @Override
    public boolean deleteUser(String name) {
        return false;
    }


}
