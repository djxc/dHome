package com.djxc.dhome.service;

import com.djxc.dhome.entity.User;

public interface AuthUserService {
    User getUserByName(String name);
}
