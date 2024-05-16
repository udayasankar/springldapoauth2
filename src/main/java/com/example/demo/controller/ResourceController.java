package com.example.demo.controller;

import com.example.demo.domain.RandomCity;
import com.example.demo.domain.User;
import com.example.demo.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/jwttest")
public class ResourceController {
    @Autowired
    private GenericService userService;

    @RequestMapping(value ="/cities")
    //@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public List<RandomCity> getUser(){
        return userService.findAllRandomCities();
    }

    @RequestMapping(value ="/users", method = RequestMethod.GET)
    //@PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<User> getUsers(){
        return userService.findAllUsers();
    }

}
