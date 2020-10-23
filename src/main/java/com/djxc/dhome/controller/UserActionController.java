package com.djxc.dhome.controller;

import com.djxc.dhome.entity.UserAction;
import com.djxc.dhome.service.IUserActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/userAction")
public class UserActionController {

    @Autowired
    private IUserActionService userActionService;

    @RequestMapping(value = "/queryUserAction")
    public List<UserAction> queryUserAction() {
        List<UserAction> userActions = userActionService.getUserAction();
        return userActions;
    }

}
