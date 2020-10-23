package com.djxc.dhome.service.impl;

import com.djxc.dhome.entity.UserAction;
import com.djxc.dhome.mapper.UserActionMapper;
import com.djxc.dhome.service.IUserActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 实现用户操作记录服务的接口
 * 1、获取用户操作记录
 * 2、添加用户操作记录
 */
@Service
public class UserActionServiceImpl implements IUserActionService {

    @Autowired
    private UserActionMapper userActionMapper;

    @Override
    public List<UserAction> getUserAction() {
        List<UserAction> userActions = userActionMapper.selectAllActions();
        return userActions;
    }

    @Override
    public List<UserAction> getUserAction(int page, int pageNum) {
        List<UserAction> userActions = userActionMapper.selectAllActions();
        return userActions;
    }

    @Override
    public boolean addUserAction(UserAction userAction) {
        return false;
    }
}
