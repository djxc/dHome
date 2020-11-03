package com.djxc.dhome.service.impl;

import com.djxc.dhome.dao.DJDataBase;
import com.djxc.dhome.entity.AuthUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private DJDataBase dataBase;

    public AuthUser getUserByName(String name){
        return dataBase.getDatabase().get(name);
    }
}
