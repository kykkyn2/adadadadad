package com.adwitt.google.service;

import com.adwitt.google.domain.User;
import com.adwitt.google.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by PJH on 2016-03-02.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public User getUserByName(String name){
        return userRepository.findOneByName(name);
    }

}
