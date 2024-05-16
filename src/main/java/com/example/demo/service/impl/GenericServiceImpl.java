package com.example.demo.service.impl;

import com.example.demo.domain.RandomCity;
import com.example.demo.domain.User;
import com.example.demo.repository.RandomCityRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities() {
        return randomCityRepository.findAll();
    }
}
