package com.adwitt.google.controller;

import com.adwitt.google.domain.User;
import com.adwitt.google.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by PJH on 2016-03-02.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user")
    public User getUserName(){
        String name = "박정현";
        System.out.println(name);
        User uuu = userService.getUserByName(name);


        System.out.println(uuu);

        return uuu;
    }

    @RequestMapping(value = "/")
    public ModelAndView goToIndexPage(){
        return new ModelAndView("index");
    }

}
