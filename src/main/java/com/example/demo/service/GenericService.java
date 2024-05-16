package com.example.demo.service;

import com.example.demo.domain.RandomCity;
import com.example.demo.domain.User;

import java.util.List;


public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
