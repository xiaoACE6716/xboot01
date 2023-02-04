package com.neu.service;

import com.neu.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    User getUserById(String id);

    List<User> getAllUser();

    User getUserByUserName(String username);

    int insert(User user);

    int updateUserById(User user);

    int deleteUserById(String id);

}
