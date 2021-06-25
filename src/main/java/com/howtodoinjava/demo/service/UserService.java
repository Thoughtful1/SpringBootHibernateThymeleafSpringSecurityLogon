package com.howtodoinjava.demo.service;

import com.howtodoinjava.demo.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
