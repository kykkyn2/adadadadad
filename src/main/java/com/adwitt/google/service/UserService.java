package com.adwitt.google.service;

import com.adwitt.google.domain.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by PJH on 2016-03-02.
 */
public interface UserService {

    User getUserByName(String name);

}
